package com.practicas.UF2;

import java.util.Scanner;

public class SimulacreExamen {
	
	public static void main(String[] args) {
		
		/* 2. Genereu un programa que, donat un número (demanat per pantalla amb les indicacions adients),mostri tots els nombres múltiples de 2 i de 3, 
		 * començant en 2. Recordeu realitzar el programa modulant el codi de la forma més eficient possible: (2 punts – 1 punt la funcionalitat i 1 punt la 
		 * modulació)
		 * 
		 * 1. Si introduïm el nombre 4, mostrarà: 2, 3, 4, 6
		 * 2. Si introduïm el nombre 2, mostrarà: 2, 3
		 * 3. Si introduïm el valor 8, mostrarà: 2, 3, 4, 6, 8, 9, 10, 12
		 * 
		 * - - - - - L'enunciat diu de 2 i 3, pero amb els exemples jo entenc que ha de ser multiple de 2 o 3, qualsevol dels dos.
		 */
		
		comprobarMultiple(); //funcio Ex 2.
			
	}
	
	public static void comprobarMultiple() {
			
		int numIntroduit = introNum(); //el numero numIntroduit será el que fiqui l'usuari
		int contador = 0; //el contador inicia a 0
			
		for (int i = 2; contador < numIntroduit; i++) { //comencem en 2 sempre, mentres contador sigui més petit que el numero introduit per l'usuari sumem 1 	
			if (i % 2 == 0 || i % 3 == 0) { //si el módul de i entre 2 o 3 dona 0 es que és multiple de 2 o 3 i sumem 1 al contador
				contador++;
				mostrar(i); //mostrem els valors de i amb la funció adient
			}
		}	
	} 
	
	// "sobrecarrega de funcions" mateix nom diferents parametres d'entrada
	public static void mostrar(int nums) { //per integers
		mostrar("" + nums); // la funció mostrar de Strings la convertim en una funció per integers "String + int"
	}
	public static void mostrar(String text) { //per Strings
		System.out.println(text);
	}
	
	public static int introNum() {
		Scanner entrada = new Scanner(System.in); //declaro el scanner aqui perquè no l'utilitzo només que en aquesta funció.
		mostrar("Introduieix la quantitat de multiples de 2 o 3 que voleu saber: ");
		return entrada.nextInt(); 
	}
}
