package com.UF5;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.IOException;
import org.xml.sax.SAXException;



public class Practica2 {
	
	public static void main(String[] args) {
		// Genereu un programa, correctament modulat, que prengui el fitxer de configuració anterior realitzi les següents tasques:
		
		/*
		  Versió difícil (fins a 10 punts de la pràctica)
		 
			i. Des del número especificat a l’etiqueta inicial, mostrar la quantitat de nombres primers següents especificat a l’etiqueta quantitat.
			
			ii. D’aquesta forma, si tenim el valor 1 a inicial i el valor 5 a quantitat, el programa ens haurà de mostrar:
				1. 1 2 3 5 7
				
			iii. Si tenim el valor 10 a inicial i el valor 3 a quantitat, el programa ens haurà de mostrar
				1. 11 13 17
				
			ATENCIÓ: Recordeu que, a Java, necessitem la doble contrabarra (\\) per tal que el programa llegeixi correctament el valor 
			de la ruta (a Windows).
		 */
		try {
			
			// Veiem en quin directori estem:
				String directori = System.getProperty("user.dir");
				System.out.println(directori);
				// Creem l'arxiu amb l'XML
				File xmlFile = new File("configuracio_p2_uf5.xml");
				// Per generar un document DOM d’un document XML
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder;
				dBuilder = dbFactory.newDocumentBuilder();
				Document doc = dBuilder.parse(xmlFile);
				
				NodeList inicial = doc.getElementsByTagName("inicial"); // inicial: nom del node que volem buscar
				NodeList quantitat = doc.getElementsByTagName("quantitat"); // quantitat: nom del node que volem buscar
				
					Node nodeInicial = inicial.item(0);
					Node nodeQuantitat = quantitat.item(0);
							
					 int numInicial = Integer.valueOf(nodeInicial.getTextContent()); // Convertir en integer 
					 int numQuantitat = Integer.valueOf(nodeQuantitat.getTextContent()); 
					 int encontrados = 0;
					 
					 for (int y = numInicial; encontrados < numQuantitat; y++) {   // encontrados comença en 0 i va augmentant cada vegada que trovem un primer.
						 boolean esPrimo = true;				   // suposem que tots els numeros son primers = true
						 for (int j = 2; j < y; j++) { 			   // el segon for amb el if funciona tal que, si un numero es pot fer modul 0 amb altre numero que no sigui
							 if (y % j == 0) {					   // ell mateix o la unitat aleshores NO es primer, per tant false. Comença en 2 perque tots es poden dividir entre 1
								 esPrimo = false;				   
								 break; //no cal comprobar-lo més vegades amb 1 es suficient i així fem menys voltes al bucle.
							 }
						 }
						 if (esPrimo) {  //=true  si es primer sumem a la variable encontrados +1 per arribar a la quantitat demanada per l'usuari
							 encontrados++;
							 System.out.println(y);  //retornem i que son numeros primers
						 }
					 }
						
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			}
			catch (SAXException e) { 
				e.printStackTrace();
			} 
			catch (IOException e) { 
				e.printStackTrace();
			}
	}
	
	
}
