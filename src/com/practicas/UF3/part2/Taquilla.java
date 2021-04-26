package com.practicas.UF3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;

public class Taquilla {
	/*
	 Crear una classe de nom Taquilla. Els objectes d'aquesta classe es correspondran amb cadas cuna de les diferents taquilles que la companyia 
	 tindrà repartides pel país. Aquestes taquilles hauran de tenir les següents propietats i mètodes:
	  
		a. Identificador de la taquilla (un codi numèric de 8 xifres). Aquest codi s'assignarà automàticament en el moment de crear un objecte de classe Taquilla. 
		b. Adreça de la taquilla (allà on està situada). 
		c. Població de la taquilla (ciutat a la que està situada la taquilla).
		d. Mida de la taquilla (array d'enters de dimensió 2 amb número de files i número de columnes  de la taquilla). - - - Una dimension 2 posiciones
		e. Calaixos (array de tipus Calaix per emmagatzemar (files x columnes) objectes de tipus Calaix). - - - 2 dimensiones		
		f. Un constructor dels objectes de la classe Taquilla: public Taquilla(String direccio, String ciutat, int[] mida) 
		g. Procediments per modificar (sets) i veure les propietats de la taquilla (gets). 	
		h. Procediment per generar tots els calaixos de la taquilla. Aquest mètode generarà tants calaixos com (files x columnes) de la Taquilla, 
			els assignarà la lletra i el número corresponent a cadascun (novament en funció de les files i les columnes de la Taquilla) i unes mides de  
			20x40x60cm a tots ells. 		
		i. Procediment per emmagatzemar un determinat paquet a un determinat calaix (identificat per  la seva fila i columna). 
			El procediment s'assegurarà de què el calaix està lliure (ocupat =  false) i, cas de ser així, canviarà el valor d'ocupat a true. 
		j. Procediment per veure l'estat de tots els calaixos d'una determinada Taquilla. 	 
	 */
	
	// PROPERTIES
	
	int idTaquilla;
	String direccio;
	String ciutat;
	int mida[]; 
	Calaix calaixos[][]; // files x columnes
	
	// CONSTRUCTORS:
		
	public Taquilla(String direccio, String ciutat, int[] mida) {
		this.idTaquilla = idTaquilla();
		this.direccio = direccio;
		this.ciutat = ciutat;
		this.mida = mida;
		this.calaixos = null;
	}

	// Nou constructor que accepti el codi de la taquilla, i no el generi de forma aleatòria com fins ara
	// codi, direccio, ciutat, files, columnes
	// Aqui canviem els tipus de cada variable:
	public Taquilla(String idTaquilla, String direccio, String ciutat, String files, String columnes) {
		this.idTaquilla = Integer.valueOf(idTaquilla);
		this.direccio = direccio;
		this.ciutat = ciutat;
		this.mida = new int[2];
		this.mida[0] = Integer.valueOf(files);
		this.mida[1] = Integer.valueOf(columnes);
		this.calaixos = new Calaix[this.mida[0]][this.mida[1]];
	}
	
	// METHODS:
	// id de la taquilla amb 8 numeros:
	private int idTaquilla() {
		return (int) (Math.random() * (99999999 + 1 - 10000000) + 10000000);
	}
	
	/* 
		Procediment per generar tots els calaixos de la taquilla. Aquest mètode generarà tants calaixos com (files x columnes) de la Taquilla, 
		els assignarà la lletra i el número corresponent a cadascun (novament en funció de les files i les columnes de la Taquilla) i unes mides de  
		20x40x60cm a tots ells. 
	*/
	public void generarCalaixos() {
		
		int[] dim = {20, 40, 60};
		
		this.calaixos = new Calaix[this.mida[0]][this.mida[1]]; // Fila i columna - array bidimensional del tipus Calaix
		char lletra = 65; // 65 en ASCII és la lletra 'A'
		
		for (int i = 0; i < this.calaixos.length; i++) {
			int columna = 1;	
			for (int j = 0; j < this.calaixos[i].length; j++) {	// La j recorreix l'array calaixos per cada posició i d'aquest		
				this.calaixos[i][j] = new Calaix(lletra, columna, dim);
				// Guardem a cada posició el calaix amb la fila i columna corresponent + dimensio que passem per parametre al metode
				columna++; 
			} 	
			lletra++; // Sumem +1 a la lletra després de fer el segon for
		}
	} 
	
	public void guardarPaquetEficient(Paquet paquet) {	
		ArrayList<Calaix> calaixosUtils = new ArrayList<Calaix>();
		// Agafar tots els calaixos on hi cap el paquet comparant amb el volum i que estigui buit recorrent tots els calaixos
		// Guardem els calaixos on hi podem guardar el paquet ( iguals o més petits que el paquet a guardar)
		// Recorrer tots els calaixos on hi cap i agafar el més petit
		for (int i = 0; i < this.calaixos.length; i ++) {
			for (int j = 0; j < this.calaixos[i].length; j++) {
				Calaix calaix = this.calaixos[i][j];
				if (paquet.getVolum() <= calaix.getVolum() && !calaix.isCalaixOcupat()) {
					calaixosUtils.add(this.calaixos[i][j]);
				} 
			}
		}
		if (calaixosUtils.size() == 0) {  // si no troba un calaix on guardarlo la mida será 0
			try {
				Files.write(Paths.get("PaquetsSenseLloc.csv"), paquet.retornaValorsArxiu().getBytes(), StandardOpenOption.APPEND);
				
			} catch(IOException e) {
				System.out.println(e);
			}
			
		} else {
			// Si suposem que el primer calaix és el més petit comparem amb la resta i si trobem un més petit el guardem i comparem amb la resta, fins trovar el més petit
			// Aixó només ho fa sí troba lloc per aixó va en el else:
			Calaix calaixMesPetit = calaixosUtils.get(0);
			// PROVA: System.out.println(this.idTaquilla);
			for (Calaix calaixUtil : calaixosUtils) {
				if (calaixMesPetit.getVolum() > calaixUtil.getVolum()) {
					calaixMesPetit = calaixUtil;
				} 
			}
			calaixMesPetit.setPaquet(paquet);
			calaixMesPetit.setCalaixOcupat(true);
		}
	}
		
	/*
	 	Procediment per emmagatzemar un determinat paquet a un determinat calaix (identificat per  la seva fila i columna). 
		El procediment s'assegurarà de què el calaix està lliure (ocupat = false) i, en cas de ser així, canviarà el valor d'ocupat a true. 
	 */
	public void guardarPaquet(Paquet paquet, char fila, int col) {	// Entrara un paquet, amb una fila i columna	
		Calaix calaix = this.getCalaix(fila, col); // Guardem un calaix en una variable del tipus Calaix 
		
		if (calaix.isCalaixOcupat()) {
			System.out.println("ERROR: Aquest calaix esta ocupat");
			
		} else {
			calaix.setPaquet(paquet); // guardem el paquet en la posició que volem
			calaix.setCalaixOcupat(true); // Canviem el valor booleá d'aquest objecte 	
		}
	}
	
	// Procediment per veure l'estat de tots els calaixos d'una determinada Taquilla
	public void mostrarCalaixos() {
		System.out.println("Informació de la taquilla: " + this.idTaquilla);
		System.out.println("Ciutat: " + this.ciutat);
		
		for (Calaix[] filaCalaix : this.calaixos) { // aqui recorreix tota la fila
			for (Calaix calaix : filaCalaix) { // aqui agafa cada calaix
				calaix.mostraEstat(); // mostrem l'estat de cada calaix
			}
		}
	}
	
	// Agregar un calaix (Exemple: A1 és posició 0 0)
	public void agregarCalaix(Calaix calaix) {
		this.calaixos[calaix.getFilaTaquilla()][calaix.getColTaquilla()] = calaix; 
	}
			
	// AUX:	
	
	// Per mostrar només un calaix
	public void mostrarUnCalaix(char fila, int col) {
		System.out.println(this.getCalaix(fila, col)); // si poso fila -65 agafa la posició 0 amb la A, si poso col -1 agafa la posició 0 si poso 1 per exemple.
	}
	
	//GETTERS & SETTERS:
	public int getIdTaquilla() {
		return this.idTaquilla;
	}

	public void setIdTaquilla(int idTaquilla) {
		this.idTaquilla = idTaquilla;
	}

	public String getDireccio() {
		return this.direccio;
	}

	public void setDireccio(String direccio) {
		this.direccio = direccio;
	}

	public String getCiutat() {
		return this.ciutat;
	}

	public void setCiutat(String ciutat) {
		this.ciutat = ciutat;
	}

	public int[] getMida() {
		return this.mida;
	}

	public void setMida(int[] mida) {
		this.mida = mida;
	}

	public Calaix[][] getCalaixos() {
		return this.calaixos;
	}

	public void setCalaixos(Calaix[][] calaixos) {
		this.calaixos = calaixos;
	}

	@Override
	public String toString() {
		return "Taquilla [idTaquilla=" + this.idTaquilla + ", direccio=" + this.direccio + ", ciutat=" + this.ciutat + ", mida="
				+ Arrays.toString(this.mida) + ", calaixos=" + Arrays.toString(this.calaixos) + "]";
	} 
	
	// get que retorna només un calaix
	private Calaix getCalaix(char fila, int col) {
		return this.calaixos[fila - 65][col - 1];
	}
	
	
}
