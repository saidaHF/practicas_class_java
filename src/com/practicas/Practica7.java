package com.practicas;

import java.util.Scanner;

public class Practica7 {
	
	public static void main(String[] args) {
		
		/* 1. Generaci� d�un comptador que vagi des d�1 fins a 10
		 * 
		 * a. Genereu una variable short i inicialitzeu-la en 1.
		 * 
		 * b. Genereu una iteraci� while per que mentre la variable anterior sigui m�s petita o igual a 10 la mostri per pantalla i la incrementi. Qu� passaria si no la increment�ssim?
		 * 
		 * RESPOSTA: si no incrementa el bucle no acabaria mai
		 */
		
		short x = 1;
		
		while (x <= 10) {
			
			System.out.println("Ex1: " + x);
			
			x++;	
		}
		
		/* 2. Generaci� d�un comptador de N a 10 amb la iteraci� while
		 * 
		 * Genereu una variable short i assigneu un dels valors de l�apartat C
		 * 
		 * Genereu una iteraci� while que mentre la variable anterior sigui m�s petita o igual a 10 la mostri per pantalla i la incrementi.
		 * 
		 * Proveu el programa assignant els seg�ents valors a la variable i justifiqueu qu� passa en cada cas:
		 * 
		 * 1, 6, 10, 15 (=N)
		 */
		
		short valor = 1;
		
		while (valor <= 10) {
			
			System.out.println("Ex2 1: " + valor);
			
			valor++;		
		}
		
		valor = 6;
		
		while (valor <= 10) {
			
			System.out.println("Ex2 6: " + valor);
			
			valor++;			
		}
		
		valor = 10;
		
		while (valor <= 10) {
			
			System.out.println("Ex2 10: " + valor);
			
			valor++;		
		}
		
		//Aquest no sortira mai perque no es m�s petit o igual que 10
		
		valor = 15;
		
		while (valor <= 10) {
			
			System.out.println("Ex2 15: " + valor);
			
			valor++;
			
		}
		
		/* 3. Generaci� d�un comptador de N a 10 amb la iteraci� do-while. Utilitzeu les mateixes variables per dur a terme les proves. 
		 * Qu� passa ara amb els resultats? S�n els mateixos que abans? Justifiqueu qu� passa en cada cas i, si difereix en el resultat, a qu� �s degut.
		 */
		
		valor = 1;
		
		do {
			
			System.out.println("Ex3 valor 1: " + valor);
			
			valor++;
			
		} while (valor <= 10);
		
		valor = 6;
		
		do {
			
			System.out.println("Ex3 valor 6: " + valor);
			
			valor++;
			
		} while (valor <= 10);
		
		valor = 10;
		
		do {
			
			System.out.println("Ex3 valor 10: " + valor);
			
			valor++;
			
		} while (valor <= 10);
		
		valor = 15;
		
		do {
			
			System.out.println("Ex3 valor 15: " + valor);
			
			valor++;
			
		} while (valor <= 10);
		
		//RESPOSTA: En aquest cas si que es mostra el valor 15, ja que primer actua amb el do i despr�s fa el while per saber si continua amb el bucle.
		
		/* 4. Generaci� d�un bucle while per avaluar als alumnes:
		 * 
		 * a. Aquest exercici es dur� a terme agafant com a punt de partida l�exercici 1 de la pr�ctica 5.
		 * b. Abans de generar el bucle, generarem una variable booleana anomenada b_aprovat que ser� igual a false.
		 * c. Mentre aquesta variable sigui falsa, demanem per pantalla la nota de l�alumne (amb la classe Scanner que ja hem vist) i 
		 * 	  avaluarem si ha aprovat o no amb la estructura if/else if/else de la pr�ctica 5. No obstant, en cas que sigui aprovat, posarem el valor de la variable 
		 *    booleana b_aprovat a true.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		boolean aprovat = false;
		
		while (aprovat == false) {
			
			System.out.println("Introdu�r nota:");	//para mostar por pantalla
			
			byte nota = entrada.nextByte();  //permite escribir en la consola
			
			aprovat = (nota >= 5);  // com aprovat es una variable booleana si nota >= 5 retorna true (es compleix la condici�) si no, canvia a false.
			
			String resposta = aprovat ? "L�alumne ha aprovat" : "L�alumne ha susp�s";  // if ternario, s� es true es aprovat i si es false es susp�s
			
			System.out.println(resposta + " amb un " + nota);
		
		}
		
		/* 5. Generaci� d�un bucle do-while per avaluar als alumnes
		 * 
		 * a. Realitzeu les mateixes configuracions que a l�exercici anterior per� amb el bucle do-while.
		 * 		i. Cal utilitzar la variable b_aprovat per gestionar en aquest cas si ha aprovat o no?
		 * Justifiqueu la resposta.
		 * 
		 * RESPOSTA: Si i no, si la utilitzem la podem posar a la condici� del while, per� no fa falta, ja que; podem posar la condicio (nota < 5) 
		 * directament sense utilitzarla
		 */
		
		byte nota = 0;
			
		do {
			
			System.out.println("Introdu�r nota");
			
			nota = entrada.nextByte(); 
			
			if (nota < 5) { System.out.println("Suspes!"); }
			
		} while (nota < 5);
		
		System.out.println("Aprovat");
		
		entrada.close();
	}
	
}
