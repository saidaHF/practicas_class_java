package com.practicas.UF3;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/*
 	1. Llegir el fitxer taquilles.csv i creï les taquilles allà indicades. Per fer això haureu de crear un nou constructor que accepti el codi de la taquilla, 
 		i no el generi de forma aleatòria com fins ara.	
	2. Llegir els fitxers xxxxx.csv i creï els calaixos allà indicats a les taquilles a les que pertanyen. Per llegir el fitxer corresponent a cada taquilla,
	    haurem de recórrer el directori fins trobar el fitxer que tingui el mateix nom que el codi de la taquilla.   
	3. Llegir el fitxer paquets.csv i assigni els paquets a les taquilles corresponents, procurant maximitzar l'eficiència del procés 
	   (assignar cada paquet al calaix més petit que el pot contenir).
	   
	4. Generar un fitxer csv amb els paquets que no es puguin assignar a la seva taquilla per trobar-se aquesta plena (o sense cap calaix lliure de mida suficient).
*/

public class GestioTaquilles {

	public static void main(String[] args) {
		// Coneixem el nostre directori de treball
		String directori = System.getProperty("user.dir");
		System.out.println("El directori de treball és " + directori);
		
		System.out.println("");

		// 1. FER TAQUILLES:
		
		// creem un fitxer
		Utils util = new Utils();
		// Guardem l'arxiu de taquilles en un objecte tipus File
		File arxiuTaquilla = new File("taquilles.csv");
		// Guardem els Strings llegits del fitxer en un ArrayList de Strings
		ArrayList<String> taquilles = util.llegirArxiu(arxiuTaquilla);
		// Agafem els Strings guardats en taquilles i utilitzem el metode "separarLinies()" per separar en posicions diferents cada part de cada String:
		// número id | direccio | ciutat | files | columnes
		ArrayList<String[]> taquillesSeparades = util.separarLinies(taquilles);
		// Creem un objecte ArrayList del tipus taquilla per guardar els objectes Taquilla creats
		ArrayList<Taquilla> taquillesCreades = new ArrayList<Taquilla>();
		// Recorrem els Strings de taquillesSeparades per poder crear totes les taquilles:
		for (String[] arrayTaquilla : taquillesSeparades) {	
			Taquilla taquilla = new Taquilla(arrayTaquilla[0], arrayTaquilla[1], arrayTaquilla[2], arrayTaquilla[3], arrayTaquilla[4]); // cada posició és un parametre del objecte Taquilla
			File arxiuTrobat = util.buscarArxiu((taquilla.getIdTaquilla() + ".csv"), Paths.get(directori).toFile());
			if (arxiuTrobat == null) { 
				System.out.println("Aquesta taquilla " + taquilla.getIdTaquilla() + " no té un arxiu associat");
			} else {
				// 2. CREAR CALAIXOS i SEPARAR
				ArrayList<String> calaixos = util.llegirArxiu(arxiuTrobat); // també és pot posar directament: = new Fitxer().llegirArxiu.....
				ArrayList<String[]> calaixosSeparats = util.separarLinies(calaixos);
				for (String[] arrayCalaix : calaixosSeparats) {
					Calaix calaix = new Calaix(arrayCalaix[0], arrayCalaix[1], arrayCalaix[2], arrayCalaix[3], arrayCalaix[4]);
					taquilla.agregarCalaix(calaix);
				} 
				taquillesCreades.add(taquilla); // Amb el metode add() podem introduïr les taquilles creades al objecte taquillesCreades per guardar-les
			}
		} 
		
		System.out.println("");
		
/*			PROVES:
 * 
 * 			for (Taquilla taquilla : taquillesCreades) {
			for (Calaix[] filaCalaix : taquilla.getCalaixos()) {
				for (Calaix calaix : filaCalaix) {
					System.out.println(calaix.toString());
				}
			} 
		}
*/		
		// ASIGNAR PAQUETS:
		File arxiuPaquets  = new File("paquets.csv");
		ArrayList<String> paquets = new Utils().llegirArxiu(arxiuPaquets);
		ArrayList<String[]> paquetsSeparats = util.separarLinies(paquets);
		ArrayList<Paquet> paquetsCreats = new ArrayList<Paquet>();
		
		for (String[] arrayPaquet : paquetsSeparats) {
			Paquet paquet = new Paquet(arrayPaquet[0], arrayPaquet[1], arrayPaquet[2], arrayPaquet[3], arrayPaquet[4], arrayPaquet[5]);	
			paquetsCreats.add(paquet);
			// Sí l'id de la Taquilla és igual al id taquilla del paquet el guardem
			for (Taquilla taquilla : taquillesCreades) {
				if (taquilla.getIdTaquilla() == paquet.getIdTaquilla()) {
					taquilla.guardarPaquetEficient(paquet);
				}	
			}
		}
	}
	
	

}
	
