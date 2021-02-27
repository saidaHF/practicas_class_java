package com.practicas.UF3;

import java.io.File;
import java.io.IOException;

public class PracticaClasse {
	
	public static void main(String[] args) {
		
		String directoriTreball = System.getProperty("user.dir");
		System.out.println(directoriTreball); // Mostra on estás -->  C:\Users\saida\eclipse-workspace\M03Programacio
		
		// Es pot canviar:
		// String nouDirectoriTreball = "....";
		// System.serProperty("user.dir", nouDirectoriTreball);
		
		File fitxer1 = new File("TestParaClase.txt"); // En la carpeta M03Programacio busca el fitxer, ja estem dintre
		
		if(fitxer1.exists()) System.out.println("El fitxer existeix");
		else System.out.println("El fitxer no existeix");
		
		// Creem un fitxer i sí no es pot per alguna cosa em dira el perqué:
		
		File fitxer2 = new File("Fitxer2.txt"); //si existeix crea el fitxer si no el troba, ex: Patata/Fitxer2.txt sortira el catch
		
		try {
			fitxer2.createNewFile();
			
		} catch(IOException e) {
			System.out.println(e.toString());
		}
		
		//Comprobem si el File creat apunta a un fitxer o directori
		File fitxer3 = new File("src"); 
		
		System.out.println(fitxer3.isFile()); //false no és fichero
		System.out.println(fitxer3.isDirectory()); //true és directorio
		
		//Esborra el fitxer2
		fitxer2.delete();
		
		File carpeta = new File ("C:/");
		File[] fitxers = carpeta.listFiles();
		for (File nom: fitxers)
			System.out.println(nom);

	}
	
	
}


