package com.practicas;

import java.util.*;

public class Practica6 {
	
	public static void main(String[] args) {
		
		/*
		 * Genereu una estructura if/else if/else que mostri el dia de la setmana que
		 * és:
		 * 
		 * Genereu una variable int que pugui emmagatzemar un valor de 1 a 7. Pregunteu
		 * per pantalla quin dia de la setmana és (amb la classe Scanner tal i com hem
		 * vist en pràctiques anteriors). Creeu el condicional: Si el valor és 1,
		 * mostreu per pantalla que és dilluns Si el valor és 2, mostreu per pantalla
		 * que és dimarts Si el valor és 3, mostreu per pantalla que és dimecres Si el
		 * valor és 4, mostreu per pantalla que és dijous Si el valor és 5, mostreu per
		 * pantalla que és divendres Si el valor és 6, mostreu per pantalla que és
		 * dissabte Si el valor és 7, mostreu per pantalla que és diumenge Qualsevol
		 * altre valor ha de mostrar que el dia no existeix.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quin dia de la setmana és? (de l'1 al 7): ");
		
		int diaSetmana = entrada.nextInt();
		
		if (diaSetmana == 1) {
			
			System.out.println("És Dilluns");
			
		} else if (diaSetmana == 2) {
			
			System.out.println("És Dimarts");
			
		} else if (diaSetmana == 3) {
			
			System.out.println("És Dimecres");
			
		} else if (diaSetmana == 4) {
			
			System.out.println("És Dijous");
			
		} else if (diaSetmana == 5) {
			
			System.out.println("És Divendres");
			
		} else if (diaSetmana == 6) {
			
			System.out.println("És Disabte");
		} else
			
			System.out.println("No existeix aquest dia");
		
		//terminar con else "cualquier otro caso"
		
		// EXERCICI 2 Realitzeu el mateix exercici de l’apartat anterior però amb la
		// estructura switch/case.
		
		System.out.println("Quin dia de la setmana és? (de l'1 al 7): ");
		
		int day = entrada.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("És Dilluns");
				break;
			case 2:
				System.out.println("És Dimarts");
				break;
			case 3:
				System.out.println("És Dimecres");
				break;
			case 4:
				System.out.println("És Dijous");
				break;
			case 5:
				System.out.println("És Divendres");
				break;
			case 6:
				System.out.println("És Disabte");
				break;
			case 7:
				System.out.println("És Diumenge");
				break;
			default:
				System.out.println("No existeix aquest dia");
		} //ultimo case poner default segun profe pero no es obligatorio
		
		/*
		 * EXERCICI 3 Genereu una aplicació d’un banc amb les estructures if/else
		 * if/else
		 * 
		 * a. Genereu una variable anomenada capital inicialitzada a un valor (el que
		 * volgueu).
		 * 
		 * b. Mostreu les següents opcions per pantalla
		 * 
		 * i. Escolliu una opció: 1- Introduir diners 2- Extreure diners
		 * 
		 * c. Genereu una variable que pugui llegir la opció per pantalla (amb la classe
		 * Scanner)
		 * 
		 * d. Si la opció és 1, ha de realitzar el següent: i. Mostrar per pantalla 1.
		 * «Introdueix la quantitat a ingressar ii. Sumeu a la variable capital el valor
		 * que s’introdueix per pantalla iii. Mostreu la variable capital per pantalla
		 * 
		 * e. Si la opció és 2, ha de realitzar el següent i. Mostrar per pantalla 1.
		 * «Introdueix la quantitat a extreure» ii. Guardeu en una variable la quantitat
		 * introduïda per pantalla iii. Si la quantitat introduïda és més petita o igual
		 * que el capital 1. Resteu a la variable capital el valor que s’introdueix per
		 * pantalla 2. Mostreu la variable capital per pantalla iv. En qualsevol altre
		 * cas 1. Mostreu per pantalla a. «No pots extreure més diners dels que tens» f.
		 * Qualsevol altre opció i. Mostrar per pantalla 1. «Opció incorrecta. Sortint
		 * del programa»
		 * 
		 */
		
		System.out.println("Escolliu una opció:\n1. Introduir diners\n2. Extreure diners");
		
		int capital = 10000;
		
		int introduit = entrada.nextInt();
		
		if (introduit == 1) {
			
			System.out.println("Introdueix la quantitat a ingressar");
			
			int ingressat = entrada.nextInt();
			
			capital = capital + ingressat;
			
			System.out.println("capital és " + capital + " €");
			
		} else if (introduit == 2) {
			
			System.out.println("Introdueix la quantitat a extreure");
			
			int extreure = entrada.nextInt();
				
			if (extreure <= capital) {
				
				capital = capital - extreure;
				
				System.out.println("Capital és: " + capital + " €");
				
			} else {
				
				System.out.println("No pots extreure més diners dels que tens");
			}
			
		} else {
			
			System.out.println("Opció incorrecta. Sortint del programa");
		}
		
		/*
		 * 4. Realitzeu l’exercici anterior amb l’estructura switch/case. Podeu
		 * substituir tots els if/else if/else per switch/case? Justifiqueu la resposta.
		 */
		
		System.out.println("Escolliu una opció:\n1. Introduir diners\n2. Extreure diners");
		
		capital = 10000;
		
		int insertar = entrada.nextInt();
		
		switch (insertar) { //valor
			
			
			case 1: //en caso de introducir 1
				
				System.out.println("Introdueix la quantitat a ingressar");
			
				int ingressat = entrada.nextInt();
			
				capital = capital + ingressat;
				
				System.out.println("capital és " + capital + " €");
				
				break;
			
			case 2: 
				
				System.out.println("Introdueix la quantitat a extreure");
				
				int extreure = entrada.nextInt();
				
				
				if (extreure <= capital) {
					
					capital = capital - extreure;
					
					System.out.println("Capital és: " + capital + " €");
					
				} else {
					
					System.out.println("No pots extreure més diners dels que tens");
				} 
				
				break;
				
				/*
				switch (extreure <= capital) {
					
					case true:
						
						System.out.println("Capital és: " + capital + " €"); 
					
						break;
					
					case false:
						
						System.out.println("No pots extreure més diners dels que tens");
						
						break;
						
				}
				RESPOSTA: No es poden posar condicions "booleanas" en un switch case.
				
				RESPOSTA PROFE: Al switch/case si que pots posar condicions booleanes (totes les condicions acaben sent booleanes), però només 
				d'igualtat a enters o Strings (en les noves versions de Java). Per exemple, avaluar si una variable és 1, 2, "x" i similar, no per 
				avaluar si "és més gran que".
				*/
				
				default: 
					
					System.out.println("Opció incorrecta. Sortint del programa");
			
			
		}
		
		entrada.close();
		
	}
	
}
