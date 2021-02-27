package com.practicas.UF1;

import java.util.Scanner;

public class Practica10 {
	
	public static void main(String[] args) { 
		
		// 1. Algorisme que demani un n�mero i digui si �s m�s gran que 10 o menor o igual que 10.
		
		byte num;
		
		Scanner entrada = new Scanner(System.in); 

		System.out.println("Ex 1. Introdu�r numero:");
		
		num = entrada.nextByte();
		
		if (num > 10) {
			System.out.println(num + " �s m�s gran que 10");
		} else if (num <= 10) { // se puede hacer solo un else, else es mayor
			System.out.println(num + " �s m�s petit o igual que 10");
		}
		
		// 2. Algorisme que demani dos n�meros 'a' i 'b' i indiqui si 'a' �s m�s gran que 'b' o no.
		
		int num_a;
		int num_b;
		
		System.out.println("2. Introdu�r numero a:");
		num_a = entrada.nextInt();
		System.out.println("2. Introdu�r numero b:");
		num_b = entrada.nextInt();
		
		if (num_a > num_b) {
			System.out.println(num_a + " �s m�s gran que " + num_b);
		} else
			System.out.println(num_a + " no �s m�s gran que " + num_b);
		
		// 3. Algorisme que demani dos n�meros 'a' i 'b' i indiqui si la seva suma �s positiva, negativa o zero.
		
		int a;
		int b;
		int c;
		
		System.out.println("3. Introdu�r numero a:");
		a = entrada.nextInt();
		System.out.println("3. Introdu�r numero b:");
		b = entrada.nextInt();
		System.out.println("3. Introdu�r numero c:");
		c = entrada.nextInt();
		
		int suma = a + b + c;
		
		if ((int) suma > 0) { // - - - un umero major que 0 es positu
			System.out.println("Resultat = " + suma + " La suma es positiva");
		} else if ((int) suma < 0) { // - - - un numero menor de 0 es negatiu
			System.out.println("Resultat = " + suma + " La suma es negativa");
		} else
			System.out.println("Resultat = " + suma + " La suma es zero"); // - - - qualsevol altre opci� es 0
			
		// 4. Escriure un programa que demani un n�mero enter i determini si �s m�ltiple de 2 i de 5.
		
		int numero;
		
		System.out.println("4. Introdueix un numero enter:");
		numero = entrada.nextInt();
		
		boolean multiple2 = numero % 2 == 0;	// - - - s� se puede dividir entre 2 con residuo 0 es multiple de 2, dar�a
												// true si se cumple o false si no
		boolean multiple5 = numero % 5 == 0; 	// - - - s� se puede dividir entre 5 con residuo 0 es multiple de 5, dar�a
												// true si se cumple o false si no
		
		if (multiple2 && multiple5) {
			System.out.println(numero + " �s multiple de 2 y de 5");
		} else if (multiple2) {
			System.out.println(numero + " �s multiple de 2");
		} else if (multiple5) {
			System.out.println(numero + " �s multiple de 5");
		}
		
		// 5. Genereu un programa que, donat un nombre enter, inverteixi l�ordre dels seus nombres. Els nombres no tenen una mida fixa.
		//			 a. Per exemple, si s�introdueix el nombre 1357 retorni el nombre 7531.
		
		System.out.println("5. Introdueix un numero enter:");
		String nombre = entrada.next();
		String invertit = "";
		
		for (int i = nombre.length() - 1; i >= 0; i--) { 	// - - - el length -1 �s perqu� comen�i el for a la posici� correcta
															// (exemple 1234 per comen�ar a la posici� 3 que ser�a el 4) mentres i >= 0 restem 1
			invertit = invertit + nombre.charAt(i); 		// - - - agafa cada caracter del String per poder-lo posar invertit un a un.
		}
		
		/*
		 hay que usar numero % 10  i numero / 10
		 */
		
		System.out.println(invertit);  
		
		/* 6. Escriure un algoritme que calculi tants nombres primers com indiqui l�usuari. Cal tenir en compte les seg�ents especificacions:
		 * 
		 * 			a. Els nombres primers s�n aquells que dividits per qualsevol nombre entre ell mateix i 1 que no generen decimals. 
		 * 
		 * 			b. Comen�ar sempre per 2 (per exemple, si demanen 5 primers: 2, 3, 5, 7, 11).
		 */
		
		 System.out.println("6. Quants numeros primers vols saber?");
		 
		 int intro = entrada.nextInt();
		 int encontrados = 0;
		 
		 //if este numero no es 0, hacemos este for (porque si introduces 0 es ninguno...)
		 
		 for (int i = 2; encontrados < intro; i++) {   // encontrados comen�a en 0 i va augmentant cada vegada que trovem un primer.
			 boolean esPrimo = true;				   // suposem que tots els numeros son primers = true
			 for (int j = 2; j < i; j++) { 			   // el segon for amb el if funciona tal que, si un numero es pot fer modul 0 amb altre numero que no sigui
				 if (i % j == 0) {					   // ell mateix o la unitat aleshores NO es primer, per tant false. Comen�a en 2 perque tots es poden dividir entre 1
					 esPrimo = false;				   
					 break; //no cal comprobar-lo m�s vegades amb 1 es suficient i aix� fem menys voltes al bucle.
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
