package com.practicas.UF1;

import java.util.Scanner;

public class Practica10 {
	
	public static void main(String[] args) { 
		
		// 1. Algorisme que demani un número i digui si és més gran que 10 o menor o igual que 10.
		
		byte num;
		
		Scanner entrada = new Scanner(System.in); 

		System.out.println("Ex 1. Introduïr numero:");
		
		num = entrada.nextByte();
		
		if (num > 10) {
			System.out.println(num + " és més gran que 10");
		} else if (num <= 10) { // se puede hacer solo un else, else es mayor
			System.out.println(num + " és més petit o igual que 10");
		}
		
		// 2. Algorisme que demani dos números 'a' i 'b' i indiqui si 'a' és més gran que 'b' o no.
		
		int num_a;
		int num_b;
		
		System.out.println("2. Introduïr numero a:");
		num_a = entrada.nextInt();
		System.out.println("2. Introduïr numero b:");
		num_b = entrada.nextInt();
		
		if (num_a > num_b) {
			System.out.println(num_a + " és més gran que " + num_b);
		} else
			System.out.println(num_a + " no és més gran que " + num_b);
		
		// 3. Algorisme que demani dos números 'a' i 'b' i indiqui si la seva suma és positiva, negativa o zero.
		
		int a;
		int b;
		int c;
		
		System.out.println("3. Introduïr numero a:");
		a = entrada.nextInt();
		System.out.println("3. Introduïr numero b:");
		b = entrada.nextInt();
		System.out.println("3. Introduïr numero c:");
		c = entrada.nextInt();
		
		int suma = a + b + c;
		
		if ((int) suma > 0) { // - - - un umero major que 0 es positu
			System.out.println("Resultat = " + suma + " La suma es positiva");
		} else if ((int) suma < 0) { // - - - un numero menor de 0 es negatiu
			System.out.println("Resultat = " + suma + " La suma es negativa");
		} else
			System.out.println("Resultat = " + suma + " La suma es zero"); // - - - qualsevol altre opció es 0
			
		// 4. Escriure un programa que demani un número enter i determini si és múltiple de 2 i de 5.
		
		int numero;
		
		System.out.println("4. Introdueix un numero enter:");
		numero = entrada.nextInt();
		
		boolean multiple2 = numero % 2 == 0;	// - - - sí se puede dividir entre 2 con residuo 0 es multiple de 2, daría
												// true si se cumple o false si no
		boolean multiple5 = numero % 5 == 0; 	// - - - sí se puede dividir entre 5 con residuo 0 es multiple de 5, daría
												// true si se cumple o false si no
		
		if (multiple2 && multiple5) {
			System.out.println(numero + " és multiple de 2 y de 5");
		} else if (multiple2) {
			System.out.println(numero + " és multiple de 2");
		} else if (multiple5) {
			System.out.println(numero + " és multiple de 5");
		}
		
		// 5. Genereu un programa que, donat un nombre enter, inverteixi l’ordre dels seus nombres. Els nombres no tenen una mida fixa.
		//			 a. Per exemple, si s’introdueix el nombre 1357 retorni el nombre 7531.
		
		System.out.println("5. Introdueix un numero enter:");
		String nombre = entrada.next();
		String invertit = "";
		
		for (int i = nombre.length() - 1; i >= 0; i--) { 	// - - - el length -1 és perqué començi el for a la posició correcta
															// (exemple 1234 per començar a la posició 3 que sería el 4) mentres i >= 0 restem 1
			invertit = invertit + nombre.charAt(i); 		// - - - agafa cada caracter del String per poder-lo posar invertit un a un.
		}
		
		/*
		 hay que usar numero % 10  i numero / 10
		 */
		
		System.out.println(invertit);  
		
		/* 6. Escriure un algoritme que calculi tants nombres primers com indiqui l’usuari. Cal tenir en compte les següents especificacions:
		 * 
		 * 			a. Els nombres primers són aquells que dividits per qualsevol nombre entre ell mateix i 1 que no generen decimals. 
		 * 
		 * 			b. Començar sempre per 2 (per exemple, si demanen 5 primers: 2, 3, 5, 7, 11).
		 */
		
		 System.out.println("6. Quants numeros primers vols saber?");
		 
		 int intro = entrada.nextInt();
		 int encontrados = 0;
		 
		 //if este numero no es 0, hacemos este for (porque si introduces 0 es ninguno...)
		 
		 for (int i = 2; encontrados < intro; i++) {   // encontrados comença en 0 i va augmentant cada vegada que trovem un primer.
			 boolean esPrimo = true;				   // suposem que tots els numeros son primers = true
			 for (int j = 2; j < i; j++) { 			   // el segon for amb el if funciona tal que, si un numero es pot fer modul 0 amb altre numero que no sigui
				 if (i % j == 0) {					   // ell mateix o la unitat aleshores NO es primer, per tant false. Comença en 2 perque tots es poden dividir entre 1
					 esPrimo = false;				   
					 break; //no cal comprobar-lo més vegades amb 1 es suficient i així fem menys voltes al bucle.
				 }
			 }
			 if (esPrimo) {  //=true  si es primer sumem a la variable encontrados +1 per arribar a la quantitat demanada per l'usuari
				 encontrados++;
				 System.out.println(i);  //retornem i que son numeros primers
			 }
		 }
		 
		 entrada.close();
	}
}
