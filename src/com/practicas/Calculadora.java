package com.practicas;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		byte opcio_escollida; //nulo no es cero
		boolean primera_iteracio = true;
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int resultat = 0;
		
		do {
		
		System.out.println("Escull una opció: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Modul \n0. SORTIR");
		opcio_escollida = entrada.nextByte();
		
			switch (opcio_escollida) {
				
				case 0:
					System.out.println("Sortir del programa..."); //si escollim 0 mostrara per pantalla "Sortir..." i acabem el bucle perque != 0
					break;
				case 1: //Suma
					if (primera_iteracio != true) {
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat + valor3;
						System.out.println("El resultat és: " + resultat);
					} else {
						System.out.println("Introdueix un numero: "); 
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();	
						resultat = valor1 + valor2; //operació de SUMA amb primers valors
						System.out.println("El resultat és: " + resultat);
						primera_iteracio = false; //la primera vegada ho tornem false perquè així si torna a entrar faci el if, calculant amb el valor introduït anteriorment
						}
					break; 
				case 2: //Resta
					if (primera_iteracio != true) { 
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat - valor3;
						System.out.println("El resultat és: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();	
						resultat = valor1 - valor2;
						System.out.println("El resultat és: " + resultat);	
						primera_iteracio = false;
						}
					break;
				case 3: //Multiplicació
					if (primera_iteracio != true) { 
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat * valor3;
						System.out.println("El resultat és: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 * valor2;
						System.out.println("El resultat és: " + resultat);
						primera_iteracio = false;
						}
					break;
				case 4: //Divisió
					if (primera_iteracio != true) {
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat / valor3;
						System.out.println("El resultat és: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 / valor2;
						System.out.println("El resultat és: " + resultat);
						primera_iteracio = false;
						}
					break;
				case 5: //Módul
					if (primera_iteracio != true) {
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat % valor3;
						System.out.println("El resultat és: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 % valor2;
						System.out.println("El resultat és: " + resultat);	
						primera_iteracio = false;
						}
					break;	
				default: //Qualsevol altre opció
					System.out.println("Opció incorrecta. Introdueix una opció valida");
					break;
			}
		
		} while (opcio_escollida != 0); //sí posem 0 sortim del bucle
		
		
		entrada.close();
	}
	
}
