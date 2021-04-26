package com.practicas.UF3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Utils {
	
	// Metode per llegir un arxiu i retornar el que hi ha dintre:	
	public ArrayList<String> llegirArxiu(File arxiu) { // ArrayList és un array dinámic perquè no sé quantes línies tindrá l'arxiu
		
		ArrayList<String> linies = new ArrayList<String>();
		BufferedReader bufferedReader = null;
		try {
			
			bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(arxiu), "UTF-8"));
			bufferedReader.readLine(); // Per ignorar la primera línea del titol
			
			String line = "";
			while ((line = bufferedReader.readLine()) != null) { // si la linia no és null
				linies.add(line);
	        }
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (null != bufferedReader) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return linies;
	}
	
	// Metode per separar per ;
	public ArrayList<String[]> separarLinies(ArrayList<String> linies) {
		// separarem amb split() amb el valor ;
		String separador = ";";
		// ArrayList d'arrays de String
		ArrayList<String[]> liniesSeparades = new ArrayList<String[]>();
		// recorrem linies 
		for (String linea : linies) {
			liniesSeparades.add(linea.split(separador));
		}
		return liniesSeparades;
	}
	
	// get del codi de la taquilla == nombre del archivo
	// Metode per buscar un arxiu en un directori i retornar-lo
	 public File buscarArxiu(String file, File directori) {
		
		    File[] arxius = directori.listFiles();
		    for (File arxiu : arxius) {
		    	// si el nom que busquem d'arxiu es igual a l'arxiu que busquem retornem l'arxiu correcte i deixem de buscar
		        if (arxiu.getName().equals(file)) {
		            return arxiu;
		        }
		        // Quan troba un directori has de fer recursivitat, i si aquesta retorna diferent de null retorna aquest valor 
		        // (ja que internament de la recursivitat va trobant els arxius), en cas contrari deixa d'inspeccionar
		        if (arxiu.isDirectory()) {
		            File resultat = buscarArxiu(file, arxiu);
		            if (resultat != null) {
		                return resultat; 
		            }
		        }
		    }
		    return null; // quan deixem de recorrer retornem null
		}
	
	 // Calcularem el volum del calaix i del paquet per saber on és millor guardar cada paquet 
	public static int calcularVolum(int[] dim) {
		return dim[0] * dim[1] * dim[2];
	}
}
