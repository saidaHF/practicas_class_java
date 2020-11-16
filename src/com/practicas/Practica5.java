package com.practicas;
import java.util.Random;
import java.util.Scanner;
//import java.util.*; amb aquest podem importar tots

public class Practica5 {

	public static void main(String[] args) {
		
		//EXERCICI 1
		
		/* a. Genereu una variable anomenada nota. Especifiqueu el tipus de dada �ptim que ha de ser si NO pot 
		contenir cap decimal i assigneu el nom adient a la variable. */
		
		byte nota = 0;
		
		//b. Assigneu una nota en aquesta variable. La nota ha d�estar compresa entre 0 i 10
		nota = 9;
		
		/* c. Genereu la estructura condicional per comprovar si la nota �s m�s gran o igual que 5. En aquest cas, 
		cal que es mostri per pantalla �L�alumne ha aprovat�. En cas contrari, cal mostrar per pantalla 
		�L�alumne ha susp�s�. */
		String aprovat = (nota >= 5)? "L�alumne ha aprovat" : "L�alumne ha susp�s";
		System.out.println(aprovat);
		
		
		//EXERCICI 2 Generaci� de decisions per aprovar, suspendre o compensar la nota d�un alumne
		
		/* a. Preneu com a punt de partida l�exemple d�abans i especifiqueu una cl�usula per que en el cas que la nota sigui 
		inferior a 5 i m�s gran o igual que 4 tregui per pantalla el literal �L�alumne pot compensar�. */
		
		if (nota >= 5) {
			System.out.println("La nota es: " + nota  + " Ha aprovat");
		} else {
			if (nota >= 4) {
				System.out.println("La nota es: " + nota + " Pot compensar");
			} else {
				System.out.println("La nota es: " + nota + " Ha susp�s");
			}
		} 

		/* 	IF TERNARIO:  
		 *	String aprovat2 = (nota >= 5)? "L�alumne ha aprovat" : (nota >= 4)? "L'alumne pot compensar" : "L�alumne ha susp�s";
		 * 	System.out.println(aprovat2); */
		
		
		//EXERCICI 3 JOC DE CARTES: LA CARTA M�S ALTA
		
		// a. Feu un vector bidimensional de cartes (semblant al de la pr�ctica 4) per les cartes de la baralla Espanyola (ha de ser de tipus string).
		
		//Vector 1 (pal-string): �or�, �bastos�, �espases�, �copes�
		//Vector 2 (valors-int): 1, 2, 3, 4, 5, 6, 7, 10, 11, 12 
		
		String pal[] =  {"or","bastos","espases","copes"};
		int valors[] = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
		
		/* b. Extraieu dues cartes, utilitzant la llibreria random. Haureu de fer un random pel pal de les cartes i un altre pel n�mero. 
		 * D�aquesta forma, extreureu 4 n�meros a l�atzar, un pal i un n�mero per la carta del jugador A i un pal i un n�mero per la carta del jugador B. 
		 * El funcionament de la llibreria random �s el seg�ent:
		 
		 - Afegiu la seg�ent sent�ncia a l�inici del codi, fora de la declaraci� de la classe (importa les funcions de Java per utilitzar funcions matem�tiques 
		 per generar n�meros a l�atzar) 
		 
		 -- import java.util.Random; --
		 
		 Genereu una variable de la classe Random, que ser� la que gestioni la generaci� de nombres a l�atzar */
		
		Random rand = new Random();
		
		//Genereu una variable short que desar� el valor a l�atzar generat per la m�quina
		
		short maquina = (short) rand.nextInt(4); //tenemos 0 1 2 3 posiciones = posibilidades en el String pal, no cal canviar-lo
		
		String pal_jugadorA = pal[maquina];
		
		maquina = (short) rand.nextInt(10); //Ara s�n 10 posibilitats
		
		short valor_jugadorA = (short) valors[maquina];
		
		System.out.println("Carta jugador A: " + pal_jugadorA + " " + valor_jugadorA); //aix� retorna el pal + el numero de la carta
		
		
		maquina = (short) rand.nextInt(4); //posibilitats 4 dels pals
		
		String pal_jugadorB = pal[maquina];
		
		maquina = (short) rand.nextInt(10);
		
		short valor_jugadorB = (short) valors[maquina];
		
		System.out.println("Carta jugador B: " + pal_jugadorB + " " + valor_jugadorB); 
		
		/* Expliqueu com funciona i quin �s el rang i el tipus de dada que retorna la funci� nextInt(<n�mero de possibilitats d�atzar>). 
		 * 
		 * RESPOSTA: nextInt() Retorna un pseudoaleatori de tipus int amb valors entre 0 i 232 produ�ts amb aproximadament la mateixa probabilitat. 
		 * Retorna un valor int i l'hem de convertir en short
		 */
		
		//c. Compareu els dos valors num�rics del vector de valors
		
		if (valor_jugadorA == valor_jugadorB) {
			
			System.out.println("Els dos valors s�n iguals i ning� guanya");
		}	
			else if(valor_jugadorA > valor_jugadorB) {
				
				System.out.println("El valor de la carta " + valor_jugadorA + " �s m�s elevat i guanya");
			}
			else {
				
				System.out.println("El valor de la carta " + valor_jugadorB + " �s m�s elevat i guanya");
			}
			
		//EXERCICI 4 - Joc pedra, paper i tissores
		
		/* a. Mostreu per pantalla el seg�ent text:
			Escull una opci�:
			1- Pedra
			2- Paper
			3- Tisora */
		
		System.out.println("Escull una opci�:\n1-Pedra\n2-Paper\n3-Tisora"); //resposta: 1, 2 o 3
		
		//b. Genereu una variable per emmagatzemar un vector de Strings amb els seg�ents valors i en el seg�ent ordre: �Pedra�, �Paper�, �Tisora�.
		
		String joc[] = {"Pedra", "Paper", "Tisora"};
				
		/*  c. Genereu una variable short que emmagatzemi la decisi� de l�usuari
		 * 
		 * Afegiu la seg�ent sent�ncia a l�inici del codi, fora de la declaraci� de la classe (importa les funcions de Java per escanejar la pantalla) 
		 * 
		 * 							import java.util.Scanner - - - Per importar aquesta funci�
		 * 
		 * Genereu una variable de la classe Scanner, que ser� la que gestioni les entrades per teclat
		 * 
		 * 							Scanner o_Scanner = new Scanner (System.in);
		 * 
		 * Genereu una variable short que desar� el valor introdu�t per pantalla. Resteu un al valor que introdueixi.
		 * 
		 * 							short s_usuari = (short)(o_Scanner.nextShort() - 1);
		 * 
		 * Per qu� hem restat 1 unitat al valor introdu�t? 
		 * 
		 * Perqu� quan posem 3 el programa no trobara aquesta posici�, ja que nom�s hi ha les posions 0, 1 i 2 */
		
		Scanner entrada = new Scanner(System.in);
		
		short mano1 = (short)(entrada.nextShort() -1); 
		
		
		/* d. Genereu una variable short que emmagatzemi la decisi� de la m�quina
		 * 
		 * Afegiu la seg�ent sent�ncia a l�inici del codi, fora de la declaraci� de la classe (importa les funcions de Java per utilitzar 
		 * funcions matem�tiques per generar n�meros a l�atzar)
		 * 
		 * 							import java.util.Random;
		 * 
		 * Genereu una variable de la classe Random, que ser� la que gestioni la generaci� de nombres a l�atzar
		 * 
		 * 							Random rand = new Random();
		 * 
		 * Genereu una variable short que desar� el valor a l�atzar generat per la m�quina
		 * 
		 * 							short s_maquina = (short) rand.nextInt(3);
		 * 
		 * Expliqueu com funciona i quin �s el rang i el tipus de dada que retorna la funci� nextInt(). 
		 * 
		 * RESPOSTA: Retorna una posici� a l'atzar entre 0, 1 i 2
		 * 
		 */
		
			Random rand1 = new Random();		
			
			short maquina3 = (short) rand1.nextInt(3);
			
		/* e. Comparaci�:
		 * 
		 * Realitzeu una estructura de selecci� que realitzi les seg�ents comprovacions:
		 * 
		 * Si la variable s_maquina �s 0 i la variable s_usuari �s 2, que mostri per pantalla: 
		 * 							
		 * 				�La m�quina guanya amb pedra a la tisora de l�usuari� 
		 * 
		 * 2. Si la variable s_usuari �s 0 i la variable s_maquina �s 2, que mostri per pantalla:
		 * 
		 * 				�L�usuari guanya amb pedra a la tisora de la m�quina�
		 * 
		 * 3. Si les dues variables s�n iguals, que mostri per pantalla: 
		 * 
		 * 				�Hi ha un empat a <l�objecte de l�empat>� > l�objecte de l�empat ha de ser posat al literal que es mostra segons 
		 * 
		 * la posici� del vector que emmagatzema els valors. Recordeu com accedir als vectors al treball de les pr�ctiques anteriors.
		 * 
		 * 4. Si la variable s_usuari �s m�s gran que la variable s_maquina
		 * 
		 * 				�L�usuari guanya amb <objecte usuari> al/la <objecte m�quina> de la m�quina� > els objectes han de ser introdu�ts 
		 * 				 segons la posici� del vector dels objectes
		 * 
		 * 5. Si la variable s_maquina �s m�s gran que la variable s_usuari
		 * 
		 * 				�La m�quina guanya amb <objecte m�quina> al/la <objecte usuari> de l�usuari� > els objectes han de ser introdu�ts segons 
		 * 				 la posici� del vector dels objecte
		 * 
		 * 6. En qualsevol altre cas: �Hi ha hagut un error, torneu a executar el programa�
		 * 
		 */
			
		if  (maquina3 == 0 & mano1 == 2) {
			
			System.out.println("La m�quina guanya amb pedra a la tisora de l�usuari");
			
		}
		
		else if (mano1 == 0 & maquina3 == 2) {
			
			System.out.println("L�usuari guanya amb pedra a la tisora de la m�quina");
			
		}
		
		else if (mano1 == maquina3) {
			
			System.out.println("Hi ha un empat a " + joc[mano1]);
			
		}
		
		else if (mano1 > maquina3) {
		
			System.out.println("L�usuari guanya amb " + joc[mano1] + " al/la " + joc[maquina3] + " de la m�quina");
		}
		
		else if(maquina3 > mano1) {
			
			System.out.println("La m�quina guanya amb " + joc[maquina3] + " al/la " + joc[mano1] + " de l�usuari");
		}
		
		else {
			
			System.out.println("Hi ha hagut un error, torneu a executar el programa");
		}
	}
		/* f. Feu cinc execucions a veure qui guanya m�s partides i mostreu els resultats i els valors introdu�ts:
		 *  
		 * 1er cop: valor introdu�t 3, resultat: La m�quina guanya amb pedra a la tisora de l�usuari
		 * 2nd cop: valor introdu�t 2, resultat: La m�quina guanya amb Tisora al/la Paper de l�usuari
		 * 3er cop: valor introdu�t 1, resultat: Hi ha un empat a Pedra
		 * 4t cop: valor introdu�t 1, resultat: L�usuari guanya amb pedra a la tisora de la m�quina
		 * 5t cop: valor introdu�t 3, resultat: L�usuari guanya amb Tisora al/la Paper de la m�quina�
		 */
	
}
