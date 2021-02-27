package com.practicas.UF3;

import java.util.Scanner;


public class Practica1 {
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduiex una cadena de Strings: ");
		
		String cadena = entrada.nextLine();
		System.out.println("La cadena en binari és: " + caracter_a_binari("Taula")); //BA (66 y 65) sería 1000010 01000001
		
	}
	/* 1. Genera una biblioteca amb les següents funcions:
	 * 
			
			b. public static String binari_a_caracter(String text) {...}
			
				Fa el contrari de la funció anterior, és a dir, rep una String format per una successió de 0 i 1 i retorna un text escrit en català.
					
			d. public static int binari_a_decimal(String binari) {...}
			
				Aquesta funció rep un String format per una combinació de 0 i 1 de longitud 8 (número binari), i retorna el número decimal corresponent.
	*/
	
	
	/*
		a. public static String caracter_a_binari(String text){...}
	
		Aquesta funció rep un String amb un text en català i retorna un String amb el mateix text escrit en binari. Per fer això, el programa obté el codi Ascii
		de cada caràcter (és un número decimal (entero)) i el passa a binari (amb una longitud fixa de 8 bits). L'String resultant s'escriurà tot seguit, sense deixar
		cap espai entre la codificació binària de cada caràcter. 
	*/
	public static String caracter_a_binari(String text) {
		
		int codigo_ASCII = 0;
		String resultat = "";
	
		for (int i = 0; i < text.length(); i++) {	
			codigo_ASCII = (char) text.charAt(i);  // guarda el valor del caracter com numero en codi ASCII
			String binari_ASCII = decimal_a_binari(codigo_ASCII); //utilitzem la funció d'abans per convertir el numero ASCII en codi binari
			resultat += "" + binari_ASCII;
			
		} 
			
		return resultat;
	}
	
	/* c. public static String decimal_a_binari(int numero) {...}
	 *     Aquesta funció rep un número decimal(enter) i el retorna transformat en un número binari de 8 dígits de longitud.
	 */
	public static String decimal_a_binari(int cocient) {
		
		int resto = 0;
		String resultat = "";
		
		for (int i = 0; i < 8; i++) { // maxim 8 per calcular fins tenir 8 digits
			resto = cocient % 2;   	  // treiem el modul, residu que forma part del numero binari
			cocient = cocient / 2;    // dividim entre 2 per seguir treient la resta de residus (33/2 = 16 y 33%2 = 1, seguim 16/2 = 8 y 16%2 = 0.......)
			resultat = resto + resultat; // l'ordre de conquetenar es important per tenir el numero en l'ordre correcte
		}
		
		return resultat;
	};
	
}
