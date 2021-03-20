package com.practicas.UF3;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestPruebaPizza {
	
	public static void main(String[] args) {
		
		String directoriTreball = System.getProperty("user.dir");
		System.out.println(directoriTreball);
		// llegim text d'un doc
		File document = new File("pizza.txt");
		try {
			Scanner lector = new Scanner(document, "UTF-8");
			while (lector.hasNextLine()) {
				System.out.print(lector.nextLine() +  '\n');
			}
			
			lector.close();
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		/////////////////////////
		
		document = new File("document2.txt"); // si quiero ESCRIBIR un fichero si no existe lo crea
		
		try {
			PrintStream escriptor = new PrintStream(document);
			escriptor.print("¡Esto es todo amigos!"); // Cada vegada borra tot i omple amb l'info que li donem
			escriptor.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
		////////////////////////
		
		document = new File("Document3.txt"); // si estic LLEGINT te que existir
		// se puede separar por espacios los numeros
		try {
			Scanner lector = new Scanner(document);
			int suma = 0;
			int valor;
			int i = 0; //comptador
			
			while(lector.hasNext()) {
				suma += lector.nextInt();
				i += 1; //i++;
			}	
			lector.close();
			
			System.out.println("La suma dels valors del document és " + suma);
			System.out.println("La mitjana dels valors del document és " + suma/i);
			
		} catch(IOException e) {
			System.out.println(e);
		}
		
		/////////////////////////
		
		
	}
	
	
}
