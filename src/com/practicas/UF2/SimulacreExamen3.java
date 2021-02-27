package com.practicas.UF2;

public class SimulacreExamen3 {
	
	//LLIBRERIA MATRIU
		
		/* 5. Genereu una llibreria que realitzi les seg�ents tasques (adjunteu tant el fitxer de la llibreria com el codi): 
		 * 
		 *     1. Una funci�, amb el major nivell de visibilitat (�s a dir, que sigui visible un cop importada en un altre projecte) 
		 *     que mostri per pantalla una matriu bidimensional d�enters que se li passar� com a par�metre d�entrada. 
		 *     Aquesta mostra haur� de respectar les files i columnes de la matriu. 
		 *     
		 *     2. Una funci�, amb el major nivell de visibilitat (�s a dir, que sigui visible un cop importada en un altre projecte) que, 
		 *     donada una matriu d�enters, l��ndex d�una fila, l��ndex d�una columna i el valor a introduir, introdueixi aquest nombre a la matriu 
		 *     a la posici� corresponent i retorni la nova matriu. 
		 *     
		 *     3. Exporteu la llibreria i introdu�u-la en un nou projecte on hi haur� la funci� principal. Feu les proves de les dues funcions 
		 *     a les que es pot accedir. 
		 *     
		 *     - - - Per importar hem de tenir la classe feta per ser llibreria en un altre projecte.
		 *     
		 *     - - - Guardo tot a TestPractica6 > PrincipalMatriu
		 */
		
	// 1. mostrar 2. modificar
	
	// 1. Funci� per mostrar una matriu bidimensional donada
	
	public static void mostrarMatriu(int[][] matriu) { //parametre d'entrada una matriu
		
		for (int i = 0; i < matriu.length; i++) { //recorrem la longitud de les files [i] i de les columnes [j]
			System.out.println(""); //per fer el salt de l�nea
			for (int j = 0; j < matriu[i].length; j++) {
				System.out.print(matriu[i][j]); //mostrem les posicion de cada fila y columna
			}
		}
		
	}
	
	//Aquesta funci� nom�s canvia les posicions no retorna el valor dels nombres de la matriu si no el valor de les posicions
	public static int[][] modificarMatriu(int[][] matriu, int fila, int columna, int valorIntro) {
		matriu[fila][columna] = valorIntro;
		return matriu;
	}
		
	
}
