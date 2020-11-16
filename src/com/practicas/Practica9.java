package com.practicas;

public class Practica9 {
	
	public static void main(String[] args) {
		
		/* 1. Genereu un comptador mitjançant un bucle for que compti des de 1 fins a 20 i que mostri tots els resultats per pantalla 
		excepte el valor 10 (feu -ho sense la sentència continue). */
		for(int i = 1; i <= 20; i++) {
			if (i != 10) {  //mostrar per pantalla tots excepte el 10, dit d'altre manera: si no es 10 es mostra per pantalla fins que termini el for
				System.out.println("Ex1: " + i);			
			}
		}
				
		/* 2. Realitzeu el mateix procediment que a l’apartat anterior però amb la sentència continue. */
		for(int i = 1; i <= 20; i++) {
			if (i == 10) {
				continue;
			}
			System.out.println("Ex2: " + i);
		}
		
		/* 3. Realitzeu un comptador que compti des de 1 fins a 20 i que al valor 10 surti del bucle. */
		for(int i = 1; i <= 20; i++) {
			if (i == 10) { // quan arriva a 10 surt del bucle, al 9 no compta més
				break;	   
			}
			System.out.println("Ex3: " + i);
		} 
		
		/* 4. Realitzeu un comptador que compti des de 1 fins a 20 amb increments d’1 en 1 i que només mostri per pantalla els valors parells 
		 * (feu-ho amb la sentència continue).*/
		
		for(int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println("Ex4: " + i);
			}
		}
		
		/* 5. Genereu un comptador que vagi des d’1 fins a 20 amb el bucle while(true). Feu que el valor 15 no es mostri.
		 * 		a. Si no utilitzéssim els caràcters d’escapament break i continue, en quin cas finalitzaria l’execució d’aquest bucle 
		 * 			(tingueu en compte que hem posat la condició true)?
		 */
		int comptador = 0;
		
		// CONTINUE:
		
		while(true) {						// fem dos if, sí while es true i si comptador es < 21, comproven si comptador es igual a 15 per fer continue i saltar 
			if(comptador < 21) {			// la següen línea y continue per seguir contant fins arribar a 21, en tal cas es faria el else que es aturar el bucle.
				if(comptador == 15) {
					comptador++; continue;
					
					}  
				System.out.println("EX5: " + comptador); 
				comptador++; continue;
			} else {
				break;
		}
	}	
}
		// SIN CONTINUE NI BREAK: No es pot aturar aquest while(true) sense fer break, es crearia un bucle infinit. Podriem fer una variable boolean per quan sigui
		// false aturar el bucle en aquell cas.
	
		
		
					

}



