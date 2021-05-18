package com.UF5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Opcional {
	
	// 1. Genereu un programa a Java que llegeixi mitjançant el fluxe de dades numèriques (byte) i
	// mitjançant el fluxe de Strings el fitxer p6_UF5_numeros.txt i el fitxer p6_UF5_text.txt. 
	
	// Hi ha alguna forma de llegir el fitxer de números com a text i que siguin caràcters llegibles? Justifiqueu la resposta mostrant els 
	// resultats per pantalla, tot mantenint els salts de línia dels fitxers. 
	
	public static void main(String[] args) {
		
		String directoriTreball = System.getProperty("user.dir");
		System.out.println(directoriTreball);	
		
		int docNumeros = llegir_num("p6_UF5_numeros.txt");
		System.out.println(docNumeros);
		
		String docText = llegir_text("p6_UF5_text.txt");
		System.out.println(docText);
	}
	
	// Funció per llegir un text
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
	
	public static byte llegir_num (String ruta) {
		
		byte numFile = 0;
		
		try {
			File docOriginal = new File(ruta);
			
			Scanner lector = new Scanner(docOriginal, "UTF-8");
			
			while (lector.hasNextLine()) { // sí es true segueix llegint cada línea del document
				numFile += lector.nextByte() +  '\n'; // guardem el text en un String
			}
			lector.close();			
				
		} catch(IOException e) {
			System.out.println(e);
		}
		return numFile;
	}	
}
