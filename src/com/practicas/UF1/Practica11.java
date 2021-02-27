package com.practicas.UF1;
import java.util.Scanner;

public class Practica11 {
	
	public static void main(String[] args) {
		
		
		/* 1. Demanar per pantalla 5 notes i dir quina �s la nota dels alumnes suspesos. Susp�s ser� <5
		 */
			
		Scanner entrada = new Scanner(System.in);
		int[] notas = new int[5]; //array 5 posicions, del 0 al 4
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introdueix la nota " + (i + 1) + ": "); //i+1 pqe comen�a en 0. FOR que demana 5 vegades l'entrada al scanner
			notas[i] = entrada.nextInt(); //guardem la resposta(nota introdu�da) en cada posici�
		}
		
		for (int i = 0; i < notas.length; i++) { //recorreix les posicions de notas
			if (notas[i] < 5) {  //si la nota es m�s petita de 5 es susp�s
				System.out.println("La nota " + (i + 1) + " ha susp�s amb " + notas[i]);
			}
		} 
		
		/*2. Demanar per pantalla 5 notes i mostrar per pantalla la quantitat d�alumnes aprovats i la quantitat 
		 * d�alumnes suspesos.
		 */
		
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introdueix la nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		
		int quantitat_suspes = 0;
		int quantitat_aprovat = 0;
		
		for (int i = 0; i < notas.length; i++) { 
			if (notas[i] < 5) { 
				quantitat_suspes++;	//cada iteraci� es suma i guarda cada suspes que hi ha
			}		
			if (notas[i] >= 5) {
				quantitat_aprovat++;
			}
		}
		System.out.println("Han susp�s " + quantitat_suspes);
		quantitat_aprovat = notas.length - quantitat_suspes;
		System.out.println("Han aprovat " + quantitat_aprovat);     
		
		
		/* Es pot fer aix� tamb�, �s m�s curt, pero no guardo el valor de aprovats:
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introdueix la nota " + (i + 1) + ": ");
			notas[i] = entrada.nextInt();
		}
		
		quantitat_suspes = 0;

		for (int i = 0; i < notas.length; i++) { 
			if (notas[i] < 5) { 
				quantitat_suspes++;	
			}		
		}
		System.out.println("Han susp�s " + quantitat_suspes);
		System.out.println("Han aprovat " + (notas.length - quantitat_suspes)); */
		
		
		//- - - - - - - - - - - - - - - - -
		
		/* 3. Compteu quantes vocals hi ha a la frase �Desenvolupament d�Aplicacions multiplataforma� i mostreu el resultat per pantalla:
		 * 		a. Per comprovar el car�cter d�una posici� del String, utilitzeu la funci� string.charAt. (nombreString.charAt)
		 * 			i. D�aquesta forma, si tenim el missatge desat en una variable string anomenada frase,podem accedir a la primera posici� cridant 
		 * 			   a la funci� frase.charAt(0); (en aquest cas ens retornar� el valor D, ja que �s el primer car�cter de la frase)
		 */
		
		String frase = new String("Desenvolupament d�Aplicacions multiplataforma").toLowerCase();  //declaro la variable String amb el new String i metode per fer-lo tot minuscula
		
		// frase = frase.toUpperCase(); - - - converteix els caracters en MAYUSCULA
		// frase = frase.toLowerCase(); - - - converteix els caracters en MINUSCULA
		
		int vocals = 0; //variable que guarda la quantitat de vocals que sortiran, fora del for perque pogui accedir-hi el for, el if y el system.out.println()
		
		for (int i = 0; i < frase.length(); i++) {  //recorreix el String frase
			
			char caracter = frase.charAt(i);        //guarda cada caracter amb el metode .charAt()
			
			if ((caracter == 'a') || (caracter == 'e') || (caracter == 'i') || (caracter == 'o') || (caracter == 'u')) { //amb els OR s� es compleix algun cas sumem +1 a vocals	
				vocals++;
			}
		}
		
		System.out.println("Hi ha " + vocals + " vocals en: \"" + frase + "\"");  // la variable vocals t� la quantitat total de vocals de la frase 
		
		System.out.println();
		
		/*4. Genereu una matriu anomenada marc de 8x6 posicions. Iniciar-la amb totes les posicions a 0 excepte el marc, que haur� de contenir 1. 
		 *   Mostreu el resultat per pantalla de tal forma que es respecti el marc
		 *   []filas --  []columnas |
		 */
		
		Short marc[][] = new Short[6][8];
	
		for (int i = 0; i < marc.length; i++) {	//la longitud de les files, marc.lenght; aqui �s 6
			
			for (int j = 0; j < marc[i].length; j++) {  //la longitud de les columnes, marc[i].length, aqui �s 8 pq� agafa el tamany de la primera dimensi�
				
				if (i == 0 || j == 0 || i == marc.length - 1 || j == marc[i].length - 1) { //si la fila o las columnas son 0 imprime 1 para poner la longitud de forma din�mica,
					marc[i][j] = 1;		   // utilitzem la posici� marc.length -1 (la posici� m�x �s lo llarg -1 (pqe si llarg �s 6, posicions van de la 0 a la 5)
				} else {				  
					marc[i][j] = 0;        // tot el que no entra al if surt al else, amb 0.
				}
				
				System.out.print(marc[i][j]); 		
				
			} 
			
			System.out.println(); //salt de l�nea	
		} 
		System.out.println();
		/* 5. Realitzeu un rellotge digital que mostri la hora sense parar (3 punts): 
		 * 		a. La hora l�ha de mostrar en format hh:mm:ss
		 * 			i. D�aquesta forma, si algun n�mero �s menor a 10 ha de mostrar el n�mero amb un 0 davant (01, 02, ... , 09).
		 * 		b. Els segons han de ser actualitzats cada segon:
		 * 			i. Per adormir el programa un segon haureu d�utilitzar la seg�ent l�nia: 
		 * 				1. Thread.sleep(1000);
		 */
		
			try {
			
			for (int horas = 0; horas < 24; horas++) {
				for (int minutos = 0; minutos < 60; minutos++) {
					for (int segundos = 0; segundos < 60; segundos++) {
						Thread.sleep(1000); //fa que la sortida del programa es faci cada 1 segons
						
				// Fem 3 for, per hores, minuts i segons, < 60 fa que pasi al segon o minut 59 aix� com a les hores acabem a la hora 23	
						
						String mensaje = ""; // amb aquest String i els 3 if seg�ents podem fer que quan sigui m�s petit de 10 afegeix-hi un 0 davant per 
											 // tenir el format 00:00:00, exemple: si hores es m�s petit que 10 mensaje+horas 0 + 9 = 09
						if (horas < 10) {
							mensaje += "0";
						}
						mensaje += horas + ":"; //afegeix-ho el String ":" per quan surti el codi estigui separat pels :
						
						if (minutos < 10) {
							mensaje += "0";
						}
						mensaje += minutos + ":";
						
						if (segundos < 10) {
							mensaje += "0";
						}
						mensaje += segundos;

						System.out.println(mensaje); //sortida de la suma: hores:minuts:segons 
						
						if (horas == 23 && minutos == 59 && segundos == 59) {  //com es un rellotge i el temps no s'atura mai segons la nostre percepci�, inicialitzem tot a 0, 
							segundos = 0;									   //si hores:minuts:segons �s igual a 23:59:59 pasem a 00:00:00 i tornem a fer els bucles for. 
							minutos = 0;									   //(�s un bucle infinit a proposit).
							horas = 0;
						}
					} 
				}
			}
		}
		
		catch (Exception e) {
			
		}
		
	
		//FOR ME: Quan fem un bucle molt llarg i la consola retorna molts valors esborra els primers valors retornats.

		entrada.close();
	}	
				
}	

	

