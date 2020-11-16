package com.practicas;

import java.util.Scanner;

public class Practica7 {
	
	public static void main(String[] args) {
		
		/* 1. Generació d’un comptador que vagi des d’1 fins a 10
		 * 
		 * a. Genereu una variable short i inicialitzeu-la en 1.
		 * 
		 * b. Genereu una iteració while per que mentre la variable anterior sigui més petita o igual a 10 la mostri per pantalla i la incrementi. Què passaria si no la incrementéssim?
		 * 
		 * RESPOSTA: si no incrementa el bucle no acabaria mai
		 */
		
		short x = 1;
		
		while (x <= 10) {
			
			System.out.println("Ex1: " + x);
			
			x++;	
		}
		
		/* 2. Generació d’un comptador de N a 10 amb la iteració while
		 * 
		 * Genereu una variable short i assigneu un dels valors de l’apartat C
		 * 
		 * Genereu una iteració while que mentre la variable anterior sigui més petita o igual a 10 la mostri per pantalla i la incrementi.
		 * 
		 * Proveu el programa assignant els següents valors a la variable i justifiqueu què passa en cada cas:
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
		
		//Aquest no sortira mai perque no es més petit o igual que 10
		
		valor = 15;
		
		while (valor <= 10) {
			
			System.out.println("Ex2 15: " + valor);
			
			valor++;
			
		}
		
		/* 3. Generació d’un comptador de N a 10 amb la iteració do-while. Utilitzeu les mateixes variables per dur a terme les proves. 
		 * Què passa ara amb els resultats? Són els mateixos que abans? Justifiqueu què passa en cada cas i, si difereix en el resultat, a què és degut.
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
		
		//RESPOSTA: En aquest cas si que es mostra el valor 15, ja que primer actua amb el do i després fa el while per saber si continua amb el bucle.
		
		/* 4. Generació d’un bucle while per avaluar als alumnes:
		 * 
		 * a. Aquest exercici es durà a terme agafant com a punt de partida l’exercici 1 de la pràctica 5.
		 * b. Abans de generar el bucle, generarem una variable booleana anomenada b_aprovat que serà igual a false.
		 * c. Mentre aquesta variable sigui falsa, demanem per pantalla la nota de l’alumne (amb la classe Scanner que ja hem vist) i 
		 * 	  avaluarem si ha aprovat o no amb la estructura if/else if/else de la pràctica 5. No obstant, en cas que sigui aprovat, posarem el valor de la variable 
		 *    booleana b_aprovat a true.
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		boolean aprovat = false;
		
		while (aprovat == false) {
			
			System.out.println("Introduïr nota:");	//para mostar por pantalla
			
			byte nota = entrada.nextByte();  //permite escribir en la consola
			
			aprovat = (nota >= 5);  // com aprovat es una variable booleana si nota >= 5 retorna true (es compleix la condició) si no, canvia a false.
			
			String resposta = aprovat ? "L’alumne ha aprovat" : "L’alumne ha suspès";  // if ternario, sí es true es aprovat i si es false es suspés
			
			System.out.println(resposta + " amb un " + nota);
		
		}
		
		/* 5. Generació d’un bucle do-while per avaluar als alumnes
		 * 
		 * a. Realitzeu les mateixes configuracions que a l’exercici anterior però amb el bucle do-while.
		 * 		i. Cal utilitzar la variable b_aprovat per gestionar en aquest cas si ha aprovat o no?
		 * Justifiqueu la resposta.
		 * 
		 * RESPOSTA: Si i no, si la utilitzem la podem posar a la condició del while, però no fa falta, ja que; podem posar la condicio (nota < 5) 
		 * directament sense utilitzarla
		 */
		
		byte nota = 0;
			
		do {
			
			System.out.println("Introduïr nota");
			
			nota = entrada.nextByte(); 
			
			if (nota < 5) { System.out.println("Suspes!"); }
			
		} while (nota < 5);
		
		System.out.println("Aprovat");
		
		entrada.close();
	}
	
}
