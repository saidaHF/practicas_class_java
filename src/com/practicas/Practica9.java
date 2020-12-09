package com.practicas;
import java.util.Arrays;
import java.util.Random;

public class Practica9 {
	
	public static void main(String[] args) {
		
		/* 1. Genereu un comptador mitjançant un bucle for que compti des de 1 fins a 20 i que mostri tots els resultats per pantalla 
		excepte el valor 10 (feu -ho sense la sentència continue). */
		for (int i = 1; i <= 20; i++) {
			if (i != 10) {  //mostrar per pantalla tots excepte el 10, dit d'altre manera: si no es 10 es mostra per pantalla fins que termini el for
				System.out.println("Ex1: " + i);			
			}
		}
				
		/* 2. Realitzeu el mateix procediment que a l’apartat anterior però amb la sentència continue. */
		for (int i = 1; i <= 20; i++) {
			if (i == 10) {
				continue;
			}
			System.out.println("Ex2: " + i);
		}
		
		/* 3. Realitzeu un comptador que compti des de 1 fins a 20 i que al valor 10 surti del bucle. */
		for (int i = 1; i <= 20; i++) {
			if (i == 10) { // quan arriva a 10 surt del bucle, al 9 no compta més
				break;	   
			}
			System.out.println("Ex3: " + i);
		} 
		
		/* 4. Realitzeu un comptador que compti des de 1 fins a 20 amb increments d’1 en 1 i que només mostri per pantalla els valors parells 
		 * (feu-ho amb la sentència continue).*/
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				continue;	
			}
			System.out.println("Ex4: " + i);
		}
		
		/* 5. Genereu un comptador que vagi des d’1 fins a 20 amb el bucle while(true). Feu que el valor 15 no es mostri.
		 * 		a. Si no utilitzéssim els caràcters d’escapament break i continue, en quin cas finalitzaria l’execució d’aquest bucle 
		 * 			(tingueu en compte que hem posat la condició true)?
		 */
		int comptador = 0;
		
		// CONTINUE:
		
		while (true) {						// fem dos if, sí while es true i si comptador es < 21, comproven si comptador es igual a 15 per fer continue i saltar 
			if (comptador < 21) {			// la següent línea y continue per seguir contant fins arribar a 21, en tal cas es faria el else que es aturar el bucle.
				if (comptador == 15) {
					comptador++;
					continue;
				}  
				System.out.println("EX5: " + comptador); 
				comptador++; 
				continue;
			} else {
				break;
			}
		}	

		// SIN CONTINUE NI BREAK: No es pot aturar aquest while(true) sense fer break, es crearia un bucle infinit. Podriem fer una variable boolean per quan sigui
		// false aturar el bucle en aquell cas.
	
		
		/* 6. Genereu un programa que emmagatzemi la quantitat de vegades que surt un dau:
		 * 		a. Genereu un vector de 6 posicions, totes inicialitzades a 0
		 * 		b. Mitjançant una iteració que s’executi 10 vegades, genereu un número a l’atzar (la tirada de dau) en cada iteració. Aquest valor ha 
		 * 			de servir per saber a quina posició del vector hem d’incrementar en 1 el valor (per comptabilitzar les tirades).
		 * 		c. Un cop tenim el vector amb els resultats de les tirades, hem de mostrar els resultats mitjançant una iteració que revisi totes les 
		 * 			posicions del vector de resultats. S’han de complir les següents condicions: 
		 * 				i. 	 El literal ha de ser: «La tirada de dau <número de la tirada> ha sortit <numero de resultats> vegades» 
		 * 				ii.  Si una cara del dau no ha sortit (el vector està a 0 en aquella posició), no s’ha de mostrar literal. 
		 * 				iii. Si una cara del dau ha sortit 4 o més vegades, el literal haurà de ser:
		 * 						1. «La tirada <número de la tirada> ha trencat el joc»
		 * 						2. En aquest cas, s’haurà de deixar de realitzar iteracions i el programa haurà de finalitzar.
		 */
		
		Random rand = new Random();
		
		int[] posicions = {0,0,0,0,0,0}; // posicions 0, 1, 2, 3, 4, 5
		
		for (int i = 0; i < 10; i++) {
			int resultados = rand.nextInt(posicions.length); //posició a l'atzar, 6 posibilitats = el llarg del vector posicions	            
			posicions[resultados]++;		      			 //executa 10 vegades i suma +1 en cada iteració per cada posició
			//posicions[rand.nextInt(posicions.length)]++; altre manera de fer el mateix de d'alt
		} 
		System.out.println(Arrays.toString(posicions)); //clase que converteix en String un array per mostrar-lo
		for (int j = 0; j < posicions.length; j++) { //recorreix el vector posicions 	
			if (posicions[j] >= 4) {
				System.out.println("La tirada " + (j + 1) + " ha trencat el joc"); //fem primer aquesta línea, ja que; si passa aixó trenca el joc. j+1 pqe la j comença en 0
				break;
			} else if (posicions[j] != 0) { //continuem, si no es igual a 0
				System.out.println("La tirada de dau " + (j + 1) + " ha sortit " + posicions[j]+ " vegades");
			}
		} 	
			
	}
}


