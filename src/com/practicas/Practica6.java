package com.practicas;

import java.util.*;

public class Practica6 {
	
	public static void main(String[] args) {
		
		/*
		 * Genereu una estructura if/else if/else que mostri el dia de la setmana que
		 * �s:
		 * 
		 * Genereu una variable int que pugui emmagatzemar un valor de 1 a 7. Pregunteu
		 * per pantalla quin dia de la setmana �s (amb la classe Scanner tal i com hem
		 * vist en pr�ctiques anteriors). Creeu el condicional: Si el valor �s 1,
		 * mostreu per pantalla que �s dilluns Si el valor �s 2, mostreu per pantalla
		 * que �s dimarts Si el valor �s 3, mostreu per pantalla que �s dimecres Si el
		 * valor �s 4, mostreu per pantalla que �s dijous Si el valor �s 5, mostreu per
		 * pantalla que �s divendres Si el valor �s 6, mostreu per pantalla que �s
		 * dissabte Si el valor �s 7, mostreu per pantalla que �s diumenge Qualsevol
		 * altre valor ha de mostrar que el dia no existeix.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quin dia de la setmana �s? (de l'1 al 7): ");
		
		int diaSetmana = entrada.nextInt();
		
		if (diaSetmana == 1) {
			
			System.out.println("�s Dilluns");
			
		} else if (diaSetmana == 2) {
			
			System.out.println("�s Dimarts");
			
		} else if (diaSetmana == 3) {
			
			System.out.println("�s Dimecres");
			
		} else if (diaSetmana == 4) {
			
			System.out.println("�s Dijous");
			
		} else if (diaSetmana == 5) {
			
			System.out.println("�s Divendres");
			
		} else if (diaSetmana == 6) {
			
			System.out.println("�s Disabte");
		} else
			
			System.out.println("No existeix aquest dia");
		
		//terminar con else "cualquier otro caso"
		
		// EXERCICI 2 Realitzeu el mateix exercici de l�apartat anterior per� amb la
		// estructura switch/case.
		
		System.out.println("Quin dia de la setmana �s? (de l'1 al 7): ");
		
		int day = entrada.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("�s Dilluns");
				break;
			case 2:
				System.out.println("�s Dimarts");
				break;
			case 3:
				System.out.println("�s Dimecres");
				break;
			case 4:
				System.out.println("�s Dijous");
				break;
			case 5:
				System.out.println("�s Divendres");
				break;
			case 6:
				System.out.println("�s Disabte");
				break;
			case 7:
				System.out.println("�s Diumenge");
				break;
			default:
				System.out.println("No existeix aquest dia");
		} //ultimo case poner default segun profe pero no es obligatorio
		
		/*
		 * EXERCICI 3 Genereu una aplicaci� d�un banc amb les estructures if/else
		 * if/else
		 * 
		 * a. Genereu una variable anomenada capital inicialitzada a un valor (el que
		 * volgueu).
		 * 
		 * b. Mostreu les seg�ents opcions per pantalla
		 * 
		 * i. Escolliu una opci�: 1- Introduir diners 2- Extreure diners
		 * 
		 * c. Genereu una variable que pugui llegir la opci� per pantalla (amb la classe
		 * Scanner)
		 * 
		 * d. Si la opci� �s 1, ha de realitzar el seg�ent: i. Mostrar per pantalla 1.
		 * �Introdueix la quantitat a ingressar ii. Sumeu a la variable capital el valor
		 * que s�introdueix per pantalla iii. Mostreu la variable capital per pantalla
		 * 
		 * e. Si la opci� �s 2, ha de realitzar el seg�ent i. Mostrar per pantalla 1.
		 * �Introdueix la quantitat a extreure� ii. Guardeu en una variable la quantitat
		 * introdu�da per pantalla iii. Si la quantitat introdu�da �s m�s petita o igual
		 * que el capital 1. Resteu a la variable capital el valor que s�introdueix per
		 * pantalla 2. Mostreu la variable capital per pantalla iv. En qualsevol altre
		 * cas 1. Mostreu per pantalla a. �No pots extreure m�s diners dels que tens� f.
		 * Qualsevol altre opci� i. Mostrar per pantalla 1. �Opci� incorrecta. Sortint
		 * del programa�
		 * 
		 */
		
		System.out.println("Escolliu una opci�:\n1. Introduir diners\n2. Extreure diners");
		
		int capital = 10000;
		
		int introduit = entrada.nextInt();
		
		if (introduit == 1) {
			
			System.out.println("Introdueix la quantitat a ingressar");
			
			int ingressat = entrada.nextInt();
			
			capital = capital + ingressat;
			
			System.out.println("capital �s " + capital + " �");
			
		} else if (introduit == 2) {
			
			System.out.println("Introdueix la quantitat a extreure");
			
			int extreure = entrada.nextInt();
				
			if (extreure <= capital) {
				
				capital = capital - extreure;
				
				System.out.println("Capital �s: " + capital + " �");
				
			} else {
				
				System.out.println("No pots extreure m�s diners dels que tens");
			}
			
		} else {
			
			System.out.println("Opci� incorrecta. Sortint del programa");
		}
		
		/*
		 * 4. Realitzeu l�exercici anterior amb l�estructura switch/case. Podeu
		 * substituir tots els if/else if/else per switch/case? Justifiqueu la resposta.
		 */
		
		System.out.println("Escolliu una opci�:\n1. Introduir diners\n2. Extreure diners");
		
		capital = 10000;
		
		int insertar = entrada.nextInt();
		
		switch (insertar) { //valor
			
			
			case 1: //en caso de introducir 1
				
				System.out.println("Introdueix la quantitat a ingressar");
			
				int ingressat = entrada.nextInt();
			
				capital = capital + ingressat;
				
				System.out.println("capital �s " + capital + " �");
				
				break;
			
			case 2: 
				
				System.out.println("Introdueix la quantitat a extreure");
				
				int extreure = entrada.nextInt();
				
				
				if (extreure <= capital) {
					
					capital = capital - extreure;
					
					System.out.println("Capital �s: " + capital + " �");
					
				} else {
					
					System.out.println("No pots extreure m�s diners dels que tens");
				} 
				
				break;
				
				/*
				switch (extreure <= capital) {
					
					case true:
						
						System.out.println("Capital �s: " + capital + " �"); 
					
						break;
					
					case false:
						
						System.out.println("No pots extreure m�s diners dels que tens");
						
						break;
						
				}
				RESPOSTA: No es poden posar condicions "booleanas" en un switch case.
				
				RESPOSTA PROFE: Al switch/case si que pots posar condicions booleanes (totes les condicions acaben sent booleanes), per� nom�s 
				d'igualtat a enters o Strings (en les noves versions de Java). Per exemple, avaluar si una variable �s 1, 2, "x" i similar, no per 
				avaluar si "�s m�s gran que".
				*/
				
				default: 
					
					System.out.println("Opci� incorrecta. Sortint del programa");
			
			
		}
		
		entrada.close();
		
	}
	
}
