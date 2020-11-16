package com.practicas;
import java.util.Random;
import java.util.Scanner;
//import java.util.*; amb aquest podem importar tots

public class Practica5 {

	public static void main(String[] args) {
		
		//EXERCICI 1
		
		/* a. Genereu una variable anomenada nota. Especifiqueu el tipus de dada òptim que ha de ser si NO pot 
		contenir cap decimal i assigneu el nom adient a la variable. */
		
		byte nota = 0;
		
		//b. Assigneu una nota en aquesta variable. La nota ha d’estar compresa entre 0 i 10
		nota = 9;
		
		/* c. Genereu la estructura condicional per comprovar si la nota és més gran o igual que 5. En aquest cas, 
		cal que es mostri per pantalla «L’alumne ha aprovat». En cas contrari, cal mostrar per pantalla 
		«L’alumne ha suspès». */
		String aprovat = (nota >= 5)? "L’alumne ha aprovat" : "L’alumne ha suspès";
		System.out.println(aprovat);
		
		
		//EXERCICI 2 Generació de decisions per aprovar, suspendre o compensar la nota d’un alumne
		
		/* a. Preneu com a punt de partida l’exemple d’abans i especifiqueu una clàusula per que en el cas que la nota sigui 
		inferior a 5 i més gran o igual que 4 tregui per pantalla el literal «L’alumne pot compensar». */
		
		if (nota >= 5) {
			System.out.println("La nota es: " + nota  + " Ha aprovat");
		} else {
			if (nota >= 4) {
				System.out.println("La nota es: " + nota + " Pot compensar");
			} else {
				System.out.println("La nota es: " + nota + " Ha suspés");
			}
		} 

		/* 	IF TERNARIO:  
		 *	String aprovat2 = (nota >= 5)? "L’alumne ha aprovat" : (nota >= 4)? "L'alumne pot compensar" : "L’alumne ha suspès";
		 * 	System.out.println(aprovat2); */
		
		
		//EXERCICI 3 JOC DE CARTES: LA CARTA MÉS ALTA
		
		// a. Feu un vector bidimensional de cartes (semblant al de la pràctica 4) per les cartes de la baralla Espanyola (ha de ser de tipus string).
		
		//Vector 1 (pal-string): «or», «bastos», «espases», «copes»
		//Vector 2 (valors-int): 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 
		
		String pal[] =  {"or","bastos","espases","copes"};
		int valors[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
		
		/* b. Extraieu dues cartes, utilitzant la llibreria random. Haureu de fer un random pel pal de les cartes i un altre pel número. 
		 * D’aquesta forma, extreureu 4 números a l’atzar, un pal i un número per la carta del jugador A i un pal i un número per la carta del jugador B. 
		 * El funcionament de la llibreria random és el següent:
		 
		 - Afegiu la següent sentència a l’inici del codi, fora de la declaració de la classe (importa les funcions de Java per utilitzar funcions matemàtiques 
		 per generar números a l’atzar) 
		 
		 -- import java.util.Random; --
		 
		 Genereu una variable de la classe Random, que serà la que gestioni la generació de nombres a l’atzar */
		
		Random rand = new Random();
		
		//Genereu una variable short que desarà el valor a l’atzar generat per la màquina
		
		short maquina = (short) rand.nextInt(4); //tenemos 0 1 2 3 posiciones = posibilidades en el String pal, no cal canviar-lo
		
		String pal_jugadorA = pal[maquina];
		
		maquina = (short) rand.nextInt(10); //Ara són 10 posibilitats
		
		short valor_jugadorA = (short) valors[maquina];
		
		System.out.println("Carta jugador A: " + pal_jugadorA + " " + valor_jugadorA); //aixó retorna el pal + el numero de la carta
		
		
		maquina = (short) rand.nextInt(4); //posibilitats 4 dels pals
		
		String pal_jugadorB = pal[maquina];
		
		maquina = (short) rand.nextInt(10);
		
		short valor_jugadorB = (short) valors[maquina];
		
		System.out.println("Carta jugador B: " + pal_jugadorB + " " + valor_jugadorB); 
		
		/* Expliqueu com funciona i quin és el rang i el tipus de dada que retorna la funció nextInt(<número de possibilitats d’atzar>). 
		 * 
		 * RESPOSTA: nextInt() Retorna un pseudoaleatori de tipus int amb valors entre 0 i 232 produïts amb aproximadament la mateixa probabilitat. 
		 * Retorna un valor int i l'hem de convertir en short
		 */
		
		//c. Compareu els dos valors numèrics del vector de valors
		
		if (valor_jugadorA == valor_jugadorB) {
			
			System.out.println("Els dos valors són iguals i ningú guanya");
		}	
			else if(valor_jugadorA > valor_jugadorB) {
				
				System.out.println("El valor de la carta " + valor_jugadorA + " és més elevat i guanya");
			}
			else {
				
				System.out.println("El valor de la carta " + valor_jugadorB + " és més elevat i guanya");
			}
			
		//EXERCICI 4 - Joc pedra, paper i tissores
		
		/* a. Mostreu per pantalla el següent text:
			Escull una opció:
			1- Pedra
			2- Paper
			3- Tisora */
		
		System.out.println("Escull una opció:\n1-Pedra\n2-Paper\n3-Tisora"); //resposta: 1, 2 o 3
		
		//b. Genereu una variable per emmagatzemar un vector de Strings amb els següents valors i en el següent ordre: «Pedra», «Paper», «Tisora».
		
		String joc[] = {"Pedra", "Paper", "Tisora"};
				
		/*  c. Genereu una variable short que emmagatzemi la decisió de l’usuari
		 * 
		 * Afegiu la següent sentència a l’inici del codi, fora de la declaració de la classe (importa les funcions de Java per escanejar la pantalla) 
		 * 
		 * 							import java.util.Scanner - - - Per importar aquesta funció
		 * 
		 * Genereu una variable de la classe Scanner, que serà la que gestioni les entrades per teclat
		 * 
		 * 							Scanner o_Scanner = new Scanner (System.in);
		 * 
		 * Genereu una variable short que desarà el valor introduït per pantalla. Resteu un al valor que introdueixi.
		 * 
		 * 							short s_usuari = (short)(o_Scanner.nextShort() - 1);
		 * 
		 * Per què hem restat 1 unitat al valor introduït? 
		 * 
		 * Perquè quan posem 3 el programa no trobara aquesta posició, ja que només hi ha les posions 0, 1 i 2 */
		
		Scanner entrada = new Scanner(System.in);
		
		short mano1 = (short)(entrada.nextShort() -1); 
		
		
		/* d. Genereu una variable short que emmagatzemi la decisió de la màquina
		 * 
		 * Afegiu la següent sentència a l’inici del codi, fora de la declaració de la classe (importa les funcions de Java per utilitzar 
		 * funcions matemàtiques per generar números a l’atzar)
		 * 
		 * 							import java.util.Random;
		 * 
		 * Genereu una variable de la classe Random, que serà la que gestioni la generació de nombres a l’atzar
		 * 
		 * 							Random rand = new Random();
		 * 
		 * Genereu una variable short que desarà el valor a l’atzar generat per la màquina
		 * 
		 * 							short s_maquina = (short) rand.nextInt(3);
		 * 
		 * Expliqueu com funciona i quin és el rang i el tipus de dada que retorna la funció nextInt(). 
		 * 
		 * RESPOSTA: Retorna una posició a l'atzar entre 0, 1 i 2
		 * 
		 */
		
			Random rand1 = new Random();		
			
			short maquina3 = (short) rand1.nextInt(3);
			
		/* e. Comparació:
		 * 
		 * Realitzeu una estructura de selecció que realitzi les següents comprovacions:
		 * 
		 * Si la variable s_maquina és 0 i la variable s_usuari és 2, que mostri per pantalla: 
		 * 							
		 * 				«La màquina guanya amb pedra a la tisora de l’usuari» 
		 * 
		 * 2. Si la variable s_usuari és 0 i la variable s_maquina és 2, que mostri per pantalla:
		 * 
		 * 				«L’usuari guanya amb pedra a la tisora de la màquina»
		 * 
		 * 3. Si les dues variables són iguals, que mostri per pantalla: 
		 * 
		 * 				«Hi ha un empat a <l’objecte de l’empat>» > l’objecte de l’empat ha de ser posat al literal que es mostra segons 
		 * 
		 * la posició del vector que emmagatzema els valors. Recordeu com accedir als vectors al treball de les pràctiques anteriors.
		 * 
		 * 4. Si la variable s_usuari és més gran que la variable s_maquina
		 * 
		 * 				«L’usuari guanya amb <objecte usuari> al/la <objecte màquina> de la màquina» > els objectes han de ser introduïts 
		 * 				 segons la posició del vector dels objectes
		 * 
		 * 5. Si la variable s_maquina és més gran que la variable s_usuari
		 * 
		 * 				«La màquina guanya amb <objecte màquina> al/la <objecte usuari> de l’usuari» > els objectes han de ser introduïts segons 
		 * 				 la posició del vector dels objecte
		 * 
		 * 6. En qualsevol altre cas: «Hi ha hagut un error, torneu a executar el programa»
		 * 
		 */
			
		if  (maquina3 == 0 & mano1 == 2) {
			
			System.out.println("La màquina guanya amb pedra a la tisora de l’usuari");
			
		}
		
		else if (mano1 == 0 & maquina3 == 2) {
			
			System.out.println("L’usuari guanya amb pedra a la tisora de la màquina");
			
		}
		
		else if (mano1 == maquina3) {
			
			System.out.println("Hi ha un empat a " + joc[mano1]);
			
		}
		
		else if (mano1 > maquina3) {
		
			System.out.println("L’usuari guanya amb " + joc[mano1] + " al/la " + joc[maquina3] + " de la màquina");
		}
		
		else if(maquina3 > mano1) {
			
			System.out.println("La màquina guanya amb " + joc[maquina3] + " al/la " + joc[mano1] + " de l’usuari");
		}
		
		else {
			
			System.out.println("Hi ha hagut un error, torneu a executar el programa");
		}
	}
		/* f. Feu cinc execucions a veure qui guanya més partides i mostreu els resultats i els valors introduïts:
		 *  
		 * 1er cop: valor introduït 3, resultat: La màquina guanya amb pedra a la tisora de l’usuari
		 * 2nd cop: valor introduït 2, resultat: La màquina guanya amb Tisora al/la Paper de l’usuari
		 * 3er cop: valor introduït 1, resultat: Hi ha un empat a Pedra
		 * 4t cop: valor introduït 1, resultat: L’usuari guanya amb pedra a la tisora de la màquina
		 * 5t cop: valor introduït 3, resultat: L’usuari guanya amb Tisora al/la Paper de la màquina»
		 */
	
}
