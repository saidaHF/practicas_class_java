package com.practicas.UF1;

public class Practica8 {
	
	public static void main(String[] args) {

		/* 1. Generació d’un comptador de 1 a 10 que compti d’1 en 1.
		 * 		a. Genereu un comptador amb el bucle for que mostri per pantalla els valors de 1 fins a 10.
		 * 1. Generació d’un comptador de 1 a 10 que compti de 2 en 2.
		 * 		a. Genereu un comptador amb el bucle for que compti de 2 en 2 des del valor 1 fins a menor de 10
		 * 		   Haurà de mostrar els valors 1, 3, 5, 7, 9
		 */
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("resposta 1 de 1 en 1: " + i);
		}
		
		for (int i = 1; i < 10; i += 2) {
			System.out.println("resposta 1 de 2 en 2: " + i);
		}
		
		/* 2. Iteració a un vector amb la iteració for.
		 * Genereu un vector de strings que emmagatzemi els següents valors
		 * «Volvo», «Audi», «Seat», «Mercedes»
		 * Feu un bucle for que iteri cada una de les posicions del vector anterior i mostri el resultat.
		 * */
		
		String[] marcas = {"Volvo", "Audi", "Seat", "Mercedes"};
		
		for (int i = 0; i < marcas.length; i++) {
			System.out.println("Ex2: " + marcas[i]);
		}
		
		/* 3. Iteració a un vector amb la iteració for each. 
		 * 
		 * Realitzeu el mateix exemple de l’exercici anterior però amb el bucle for each en comptes del bucle for. 
		 * És més intuïtiu o més difícil d’utilitzar? Justifiqueu la resposta.
		 * 
		 * 	RESPOSTA: És més intuïtiu ja que no ens hem de preocupar de prendre les posicions del vector manualment, ja ho fa el propi foreach
		 */
		
		for (String marca : marcas) {
			System.out.println("Ex3: " + marca);
		}
		
		/* 4. Iteració a dos vectors per tal d’extreure la informació dels alumnes i les seves notes amb el bucle for.
		 * 		a. Preneu com a punt de partida els vectors originals generats a l’exercici 4 de la pràctica 4 (els vectors on estan emmagatzemats 
		 * 		   els llocs on estàveu asseguts i les notes que crèieu que tindríeu).
		 * 		b. Mitjançant el bucle for itereu els vectors per tal de mostrar per pantalla el següent missatge: 
		 * 			i. «Crec que l’alumne/a <nom de l’alumne obtingut del vector de noms> tindrà un <nota de l’alumne obtinguda del vector de notes> de nota de la UF
		 * 		c. Podríem fer aquest exemple amb el bucle for each? Justifiqueu la resposta.
		 * 
		 * RESPOSTA: Si es pot fer, pero és més complex. 
		 * 
		 * RESPOSTA PROFE: No podem generar un bucle foreach perque no disposarem de les posicions de les iteracions, pel que no podrem creuar la 
		 * informació dels dos vectors. (SOLO FOR EACH sin contadores ni nada)
		 */
		
		String alumClasse[][] = {
			{"Raul","Ivan","Lucas","vacio","alex","vacio"},  //0
			{"Jordi","Quique","vacio","vacio","Marc","Pepe"}, //1
			{"Judith","David","vacio","Didier","Beatriz","Luis"}, //2
			{"Saida","Rubens","Adrian","vacio","vacio","Alex"}, //3
			{"Joel","vacio","Diego","Sergio","Borja","vacio"} //4
		};
		
		Short alumNota [][] = {
			{8,6,8,0,7,0}, //0
			{5,5,0,0,9,9}, //1
			{0,6,0,10,6,7}, //2
			{8,9,6,0,0,6}, //3
			{7,0,8,9,5,0} //4
		};
				
		for (int i = 0; i < alumClasse.length; i++) { 
			
			// Amb el alumClasse.lenght agafem la longitud del vector, com els dos vectors tenen la mateixa longitud 
			//podem fer-ho servir amb les dues arrays alumClasse i alumNota, amb la poisció [i][j], exemple: [0][0] = Raul 8
			
			for (int j = 0; j < alumClasse[i].length; j++) { //alumClasse[i].length posició del vector
				System.out.println("(for) Crec que l’alumne/a " + alumClasse[i][j] + " tindrà un " + alumNota[i][j] + " de nota de la UF");
			}
		}
		
		//FOR EACH:
		
		int indexFila = 0; //Para empezar en la posicion 0
		for (String[] filaAlumn : alumClasse) {
			int indexColumna = 0; //hay que reiniciarla cada vez que se ejecuta el for (cada iteración)
			for (String alumno : filaAlumn) {
				// System.out.println(alumno);    - - - Se puede usar así o como en la siguiente fila para ver la posición:
				System.out.println("(For each) Crec que l’alumne/a " + alumClasse[indexFila][indexColumna] + " tindrà un " + alumNota[indexFila][indexColumna] + " de nota de la UF");
				indexColumna++; //Augmenta uno dentro de la fila para coger cada valor
			}
			indexFila++; //Augmenta la fila para coger la siguiente fila entera (0,1,2,3 i 4) Se pone fuera para que itere cuando acabe cada fila dentro del for each
		}

	}
}



