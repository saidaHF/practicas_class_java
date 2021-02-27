package com.practicas.UF2;

import java.util.Scanner;

public class SimulacreExamen {
	
	public static void main(String[] args) {
		
		/* 2. Genereu un programa que, donat un n�mero (demanat per pantalla amb les indicacions adients),mostri tots els nombres m�ltiples de 2 i de 3, 
		 * comen�ant en 2. Recordeu realitzar el programa modulant el codi de la forma m�s eficient possible: (2 punts � 1 punt la funcionalitat i 1 punt la 
		 * modulaci�)
		 * 
		 * 1. Si introdu�m el nombre 4, mostrar�: 2, 3, 4, 6
		 * 2. Si introdu�m el nombre 2, mostrar�: 2, 3
		 * 3. Si introdu�m el valor 8, mostrar�: 2, 3, 4, 6, 8, 9, 10, 12
		 * 
		 * - - - - - L'enunciat diu de 2 i 3, pero amb els exemples jo entenc que ha de ser multiple de 2 o 3, qualsevol dels dos.
		 */
		
		comprobarMultiple(); //funcio Ex 2.
			
	}
	
	public static void comprobarMultiple() {
			
		int numIntroduit = introNum(); //el numero numIntroduit ser� el que fiqui l'usuari
		int contador = 0; //el contador inicia a 0
			
		for (int i = 2; contador < numIntroduit; i++) { //comencem en 2 sempre, mentres contador sigui m�s petit que el numero introduit per l'usuari sumem 1 	
			if (i % 2 == 0 || i % 3 == 0) { //si el m�dul de i entre 2 o 3 dona 0 es que �s multiple de 2 o 3 i sumem 1 al contador
				contador++;
				mostrar(i); //mostrem els valors de i amb la funci� adient
			}
		}	
	} 
	
	// "sobrecarrega de funcions" mateix nom diferents parametres d'entrada
	public static void mostrar(int nums) { //per integers
		mostrar("" + nums); // la funci� mostrar de Strings la convertim en una funci� per integers "String + int"
	}
	public static void mostrar(String text) { //per Strings
		System.out.println(text);
	}
	
	public static int introNum() {
		Scanner entrada = new Scanner(System.in); //declaro el scanner aqui perqu� no l'utilitzo nom�s que en aquesta funci�.
		mostrar("Introduieix la quantitat de multiples de 2 o 3 que voleu saber: ");
		return entrada.nextInt(); 
	}
}
