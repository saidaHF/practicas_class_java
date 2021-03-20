package com.practicas.UF3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;



public class Practica1_codificador_binario {
	
	public static void main(String[] args) {
		
		//Scanner entrada = new Scanner(System.in);
		
		
	// PROVES EXERCICI 1:
		
	//	System.out.println("Introduiex una cadena de Strings: ");
		
	//	String cadena = entrada.nextLine();
		
	//	System.out.println("La cadena en binari és: " + caracter_a_binari(cadena)); //BA (66 y 65) sería 1000010 01000001
	                                                                                                                      
	 System.out.println("\nLa cadena en decimal és: " + binari_a_caracter("01111001011001010110100001100001")); // 011100110110000101101001011001000110000100001010 és saida
	
	// EXERCICI 2: 
	/* 2. Fes un programa que, utilitzant les funcions abans creades, llegeixi el text emmagatzemat a un fitxer de text, el passi a binari (amb una longitud de
			paraula de 8 bits per a cada caràcter), i l'emmagatzemi en un altre fitxer. Els noms dels fitxers seran original.txt i codificat.txt.
			
			document = original.txt
			document2 = codificat.txt
	 */
		
		// Averigüem on estem: C:\Users\saida\eclipse-workspace\M03Programacio
		String directoriTreball = System.getProperty("user.dir");
		System.out.println(directoriTreball);	
		
		// pas 1: Llegir original.txt
		
		String docLlegit = llegir_text("original.txt");
	
		// pas 2: Transformar el text de original.txt a binari		
		String binari = caracter_a_binari(docLlegit);
		
		// pas 3: Escriure(i crear) en codificat.txt
		
		escriure_text("codificat.txt", binari);
		
		
	}
	// 1. Genera una biblioteca amb les següents funcions:
	 
	/*
		a. public static String caracter_a_binari(String text){...}
	
		Aquesta funció rep un String amb un text en català i retorna un String amb el mateix text escrit en binari. Per fer això, el programa obté el codi Ascii
		de cada caràcter (és un número decimal (entero)) i el passa a binari (amb una longitud fixa de 8 bits). L'String resultant s'escriurà tot seguit, sense deixar
		cap espai entre la codificació binària de cada caràcter. 
	*/
	public static String caracter_a_binari(String text) {
		String resultat = "";
	
		for (int i = 0; i < text.length(); i++) {	
			int codigo_ASCII = (char) text.charAt(i);  // Guarda el valor del caracter com numero en codi ASCII
			String binari_ASCII = decimal_a_binari(codigo_ASCII); // Utilitzem la funció d'abans per convertir el numero ASCII en codi binari
			resultat += binari_ASCII;
			
		} 
			
		return resultat;
	}
	
	/* c. public static String decimal_a_binari(int numero) {...}
	 *     Aquesta funció rep un número decimal(enter) i el retorna transformat en un número binari de 8 dígits de longitud.
	 */
	
	public static String decimal_a_binari(int numero) {
		String resultat = "";
		
		while (numero > 0) {
			int binari = numero % 2;
			numero /= 2; 
			resultat = binari + resultat; // Fem aquest ordre per tenir el binari en l'ordre correcte directament		
		}
		
		while (resultat.length() < 8) {  //si el resultat es més petit de 8, fem aquest while per omplir-lo amb 0 fins tenir 8 digits.
			String zeros = "0" + resultat;
			resultat = zeros;		
		} 
	
		return resultat;
	
	}
	
	/* d. public static int binari_a_decimal(String binari) {...}
		Aquesta funció rep un String format per una combinació de 0 i 1 de longitud 8 (número binari), i retorna el número decimal(enter) corresponent.
		
		Per fer el numero de binari a decimal(enter) hem de multiplicar * 2 per cada posició que hi ha i sumar només les posicións que son 1 (el primer es 1)
		Exemple: 101 -- > 4(2*2) + 2(1*2) + 1 = 5 (2 es posició del 0) fem desde la dreta
		
		1, 1*2=2, 2*2=4, 2*4=8, 2*8=16....  
		
		1,4,8,16,32,64,128,256,512,1024,2048,5096...
		
	*/
	
	public static int binari_a_decimal(String binari) { // yo tengo un binario por ejemplo: 00001101
		
		int decimal = 0;
		int digit = 1;
				
		for (int i = binari.length() -1; i >= 0; i--) { // començem pel final
			
			if (binari.charAt(i) == '1') { // sí és 0 no el sumarem, el seu valor será de 0
				decimal += digit;
			} 
			
			digit *= 2;		
		} 
		
		return decimal;
	};
	
	/* b. public static String binari_a_caracter(String text) {...}
			Fa el contrari de la funció anterior, és a dir, rep una String format per una successió de 0 i 1 i retorna un text escrit en català. 
	*/
	public static String binari_a_caracter(String text) {
		String resultat = "";
		
		
		for (int i = 0; i < text.length(); i += 8) { // Agafa de 8 en 8
			String grup_binari = "";
			for (int j = i; grup_binari.length() < 8; j++) {
				grup_binari += text.charAt(j);	
			}
			resultat += (char)binari_a_decimal(grup_binari) + ""; 	// (char) convierte en caracteres
		}		
			
		return resultat;
	}
	
	// EXERCICI 2
	
	// Aquesta funció llegeix el text emmagatzemat al fitxer situat a la ruta passada per paràmetre, i retorna un String amb aquest text.
	
	public static String llegir_text (String ruta) {
		String textFile = "";
		try {
			File docOriginal = new File(ruta);
			
			Scanner lector = new Scanner(docOriginal, "UTF-8");
			
			while (lector.hasNextLine()) { // sí es true segueix llegint cada línea del document
				textFile += lector.nextLine() +  '\n'; // guardem el text en un String
			}
			lector.close();			
				
		} catch(IOException e) {
			System.out.println(e);
		}
		return textFile;
	}
		
		// Aqueta funció rep un String amb la ruta cap al fitxer al que volem emmagatzemar un text, i el text que volem emmagatzemar. El resultat serà un
	    // fitxer de text amb el text passat.
	
	public static void escriure_text(String ruta, String text) {
		
		File docCodificat = new File(ruta);
		
		try {
			PrintStream escriure = new PrintStream(ruta); // escriu el text en el següent document
			escriure.print(text); 
			escriure.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}		
	}
	
	
	

	

			
	
	
	
	
}
