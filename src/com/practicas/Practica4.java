

package com.practicas;

import java.util.Arrays;

public class Practica4 {

	public static void main(String[] args) {
		
		//EXERCICI 1  (Quan l'exercici diu "posicio 3" ens referim a la posició 2 del programa)
		
		int numLost[] = {4, 8, 15, 16, 23, 42};
		
		//a. Mostreu els valors de les posicions 2 i 5 del vector.
		System.out.println("posició 2:" + " " + numLost [1] + " " + "posició 5:" + " " + numLost[4]);
		
		//b. Sumeu 5 al valor de la posició 4 del vector.
		System.out.println((numLost[3] + 5));
		
		/* c. Executeu la comparació per veure si el valor de la primera posició és més petit que el de l'última 
		 posició i el valor de la tercera és més gran o igual que el de la segona i emmagatzemeu el resultat en una variable. 
		 Quin valor tindrà aquesta variable? Mostreu el resultat per pantalla. 
		 
		 El resultat será TRUE ja que, posició 0 < posició 5 (4 < 42 = true) y poisció 2 >= posició 1 (15 >= 8 = true)
		 per tant, les dues son TRUE y resulta TRUE */
		
		boolean resultat = (numLost[0] < numLost[5] && numLost[2] >= numLost[1]);
		System.out.println(resultat);
		
		//EXERCICI 2
		
		int ten[] = new int[10];
		
		//a. Afegiu a la posició 1 el valor 1
		ten[0] = 1;
		//b. Afegiu a la posició 2 el valor 1
		ten[1] = 1;
		/*c. A cadascuna de les posicions posteriors (de les posicions 3 a la 10), 
		afegiu el resultat de la suma de les dues posicions anteriors. 
		Per exemple, afegiu a la posició 4 els valors sumats de les posicions 3 i 2. 
		Com s’anomena la sèrie matemàtica que esteu implementant? 
		
		R: És la serie de fibonacci: 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34 , 55 , 89 , 144 , 233... etc */
		
		ten[2] = ten[1] + ten[0];
		ten[3] = ten[2] + ten[1]; //posició 4 suma posicions 3 y 2
		ten[4] = ten[3] + ten[2]; 
		ten[5] = ten[4] + ten[3];
		ten[6] = ten[5] + ten[4];
		ten[7] = ten[6] + ten[5];
		ten[8] = ten[7] + ten[6];
		ten[9] = ten[8] + ten[7];
		
				
		//d.Mostreu els valors de tres posicions consecutives per mostrar que el resultat és correcte.
		System.out.println(ten[5] + " " + ten[6] + " " + ten[7]);
		
		//EXERCICI 3
		
		String poker[][] = 	{
				{"1","2","3","4","5","6","7","8","9","10","J","Q","K"}, //0 piques
				{"1","2","3","4","5","6","7","8","9","10","J","Q","K"}, //1 diamants
				{"1","2","3","4","5","6","7","8","9","10","J","Q","K"}, //2 cors
				{"1","2","3","4","5","6","7","8","9","10","J","Q","K"}	//3 trèbols
		};
		
		//EXERCICI 4
		
		//a. Genereu un vector de strings que emmagatzemi els llocs on esteu sentats

		String alumClasse[][] = {
				{"Raul","Ivan","Lucas","vacio","alex","vacio"},
				{"Jordi","Quique","vacio","vacio","Marc","Pepe"},
				{"Judith","David","vacio","Didier","Beatriz","Luis"},
				{"Saida","Rubens","Adrian","vacio","vacio","Alex"},
				{"Joel","vacio","Diego","Sergio","Borja","vacio"}
		};
		/*b. Genereu un vector de shorts que emmagatzemi, en les mateixes posicions d’on esteu sentats, la nota que 
		creieu que obtindrà en aquesta UF cada un dels alumnes */

		Short alumNota [][] = {
				{8,6,8,0,7,0},
				{5,5,0,0,9,9},
				{5,6,0,10,6,7},
				{8,9,6,0,0,6},
				{7,0,8,9,5,0}
		};
		
		//c. Copieu els dos vectors en dos vectors nous.
		
		String classeAlum[][] = alumClasse.clone();
		Short notaAlum [][] = alumNota.clone();
		
		/* d. Canvieu de lloc dos alumnes en aquest vector nou. Recordeu canviar les posicions al vector de notes 
		per que s’adaptin a les noves posicions. */
		System.out.println("Ara tenim en la posició 0 0 a: " + classeAlum[0][0] + " amb la nota " + notaAlum[0][0]);
		System.out.println("també tenim en la posició 0 4 a: " + classeAlum[0][4] + " amb la nota " + notaAlum[0][4]);
		
		String alumne_temp = classeAlum[0][0];
		classeAlum[0][0] = classeAlum [0][4];
		classeAlum [0][4] = alumne_temp;
		
		Short nota_temp = notaAlum[0][0];
		notaAlum[0][0] = notaAlum[0][4];
		notaAlum[0][4] = nota_temp;
			
		System.out.println("Després tenim en la posició 0 0 a: " + classeAlum[0][0] + " amb la nota " + notaAlum[0][0]);
		System.out.println("també tenim en la posició 0 4 a: " + classeAlum[0][4] + " amb la nota " + notaAlum[0][4]);
		
		//EXERCICI 5
		/* Genereu un vector de caràcters amb els valors {‘E’,’s’,’t’,’a’,’t’,’u’,’t’}. Busqueu com convertir aquest 
		vector a una única cadena de caràcters (emmagatzemant el resultat a una variable String i mostrant-la per pantalla). */
		
		/* He trovat dues formes: 
		La primera: */
		
		char estatut[] = {'E','s','t','a','t','u','t'};
		String cadena = String.valueOf(estatut);
		System.out.println(cadena);
		
		//La segona:
		String caracteres = new String(estatut);
		System.out.println(caracteres);

	}
	
}
