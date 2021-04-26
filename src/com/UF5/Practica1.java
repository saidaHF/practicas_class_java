package com.UF5;

import java.util.Arrays;
import java.util.Vector;

public class Practica1 {
	
	public static void main(String[] args) {
		/*
		 1. Generació d’estructures estàtiques:
			a. Vectors unidimensionals 
				i. Genereu un vector d’enters de longitud 10 i introduïu manualment, mitjançant un bucle for, 10 valors.
				ii. Mostreu cadascun d’aquests valors mitjançant un altre bucle for.
		 */
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		/*
		 b. Vectors unidimensionals – cadenes de caràcters (Strings) vs vectors de caràcters (char[])
			(1 punt)
			i. Genereu una variable de tipus String que contingui el text «Hola mon»
			ii. Convertiu aquesta variable a una vector de caràcters.
			iii. Mitjançant un bucle for, mostreu cadascun dels valors del vector en una sola línia.
			iv. Genereu un vector de caràcters que tingui, a cadascuna de les posicions, les lletres ‘A’ ‘d’ ‘e’ ‘u’ ‘ ‘ ‘m’ ‘o’ ‘n’
			v. Convertiu aquest vector de caràcters a una variable de tipus String
			vi. Mostreu aquesta variable String per pantalla 
		 */
		String salut = "Hola mon";
		char[] vectorSalut = new char[salut.length()];
		
		for (int i = 0; i < salut.length(); i++) {
			vectorSalut[i] = salut.charAt(i);
		}
		
		for (int i = 0; i < salut.length(); i++) {
			System.out.print(vectorSalut[i]);
		}
		
		System.out.println("");
		
		char[] comiat = {'A', 'd', 'e', 'u', ' ', 'm', 'o', 'n'};
		String stringComiat = String.valueOf(comiat);
		System.out.println(stringComiat);
		
		System.out.println("");
		
		/*
		 Vectors multidimensionals. (1 punt)
			i. Genereu un vector, de dues dimensions, on emmagatzemareu la suma de la fila i la columna. Feu-ho mitjançant un parell de bucles for.
				1. El resultat haurà de ser:
					a. [0 1 2]
					b. [1 2 3]
					c. [2 3 4]
						ii. Mostreu aquest vector bidimensional mitjançant uns altres dos bucles for, mantenint i respectant les files i les columnes 
						(aproximadament, s’ha de veure com es veu a l’exemple del punt anterior).
		 */
		int[][] suma = new int[3][3];
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j] = i + j;
			}
		}
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				System.out.print(suma[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		
		// És pot fet també amb un for each:
		for (int[] recorrer : suma) {
			System.out.println(Arrays.toString(recorrer));
		}
		
		System.out.println("");
		
		/*
		 2. Generació d’estructures dinàmiques.
			a. NOTA: Al codi, comenteu, de forma justificada en cada pas, quins valors es van introduïnt en cadascuna de les estructures. Justifiqueu el perquè i 
			comproveu que els valors queden informats a les estructures com heu justificat mostrant els resultats per pantalla.
			
			b. Vectors (2,5 punts)
				i. Genereu un objecte de tipus vector (Vector) que sigui d’enters i inicialitzeu-lo a 4 posicions.
		 */
		// Creem l'objecte Vector de tipus Integer i li donem una mida 4
			Vector<Integer> vectorEnters = new Vector<Integer>(4);	
		/*
		 ii. Afegir valors:
			1. Afegiu, al vector, el valor 4.
			2. Afegiu, al vector, el valor 8.
			3. Afegiu, al vector, el valor 15.
			4. Afegiu, al vector, el valor 16.
			5. Afegiu, al vector, el valor 23.
			6. Afegiu, al vector, el valor 42.
			
			Amb el metode add() afegim valors al vector
		 */
			vectorEnters.add(4);
			vectorEnters.add(8);
			vectorEnters.add(15);
			vectorEnters.add(16);
			vectorEnters.add(23);
			vectorEnters.add(43);
			
		// iii. Mostreu els resultats per pantalla i la longitud del vector.	
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			System.out.println("");
		// iv. Removeu, al vector, el valor de la tercera posició. 
			// El numero que esta en tercera posició és el valor 2
			vectorEnters.remove(2);
		// v. Mostreu els resultats per pantalla d’un en un i la longitud del vector.
			// Al haver esborrat la posició anterior ara la longitud és -1 
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			System.out.println("");
		// vi. Buideu el contingut del vector.
			vectorEnters.clear();
			System.out.println("");
		// vii. Mostreu tots els resultats per pantalla i la longitud del vector.
			// Ara la mida es 0 perquè hem buidat el vectorEnters
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			// Ara no mostrara res perquè no té valors que mostrar
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			
		/*
		 c. Piles (2,5 punts)
			i. Genereu un objecte de tipus vector (Vector) que sigui d’enters i inicialitzeu-lo a 4 posicions.
		 */
			Vector<Integer> piles = new Vector<Integer>(4);
		/*
		 ii. Afegir valors
			1. Afegiu, al vector, el valor 4.
			2. Afegiu, al vector, el valor 8.
			3. Afegiu, al vector, el valor 15.
			4. Afegiu, al vector, el valor 16.
			5. Afegiu, al vector, el valor 23.
			6. Afegiu, al vector, el valor 42.
		 */
			piles.add(4);
			piles.add(8);
			piles.add(15);
			piles.add(16);
			piles.add(23);
			piles.add(43);
		/*
		 iii. Mostreu tots els valors alhora de la pila i la seva longitud. Compareu els resultats que es veuen amb els resultats que heu vist per la classe Vector.
		 */	
			System.out.println("");
			for (Integer i : piles) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector Piles és: " + piles.size());
	}
}
