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
		
		System.out.println("Escull una opci�: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Modul \n0. SORTIR");
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
						System.out.println("El resultat �s: " + resultat);
					} else {
						System.out.println("Introdueix un numero: "); 
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();	
						resultat = valor1 + valor2; //operaci� de SUMA amb primers valors
						System.out.println("El resultat �s: " + resultat);
						primera_iteracio = false; //la primera vegada ho tornem false perqu� aix� si torna a entrar faci el if, calculant amb el valor introdu�t anteriorment
						}
					break; 
				case 2: //Resta
					if (primera_iteracio != true) { 
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat - valor3;
						System.out.println("El resultat �s: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();	
						resultat = valor1 - valor2;
						System.out.println("El resultat �s: " + resultat);	
						primera_iteracio = false;
						}
					break;
				case 3: //Multiplicaci�
					if (primera_iteracio != true) { 
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat * valor3;
						System.out.println("El resultat �s: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 * valor2;
						System.out.println("El resultat �s: " + resultat);
						primera_iteracio = false;
						}
					break;
				case 4: //Divisi�
					if (primera_iteracio != true) {
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat / valor3;
						System.out.println("El resultat �s: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 / valor2;
						System.out.println("El resultat �s: " + resultat);
						primera_iteracio = false;
						}
					break;
				case 5: //M�dul
					if (primera_iteracio != true) {
						System.out.println("Introdueix un altre numero: ");
						valor3 = entrada.nextInt();
						resultat = resultat % valor3;
						System.out.println("El resultat �s: " + resultat);
					} else {
						System.out.println("Introdueix un numero: ");
						valor1 = entrada.nextInt();
						System.out.println("Introdueix un altre numero: ");
						valor2 = entrada.nextInt();
						resultat = valor1 % valor2;
						System.out.println("El resultat �s: " + resultat);	
						primera_iteracio = false;
						}
					break;	
				default: //Qualsevol altre opci�
					System.out.println("Opci� incorrecta. Introdueix una opci� valida");
					break;
			}
		
		} while (opcio_escollida != 0); //s� posem 0 sortim del bucle
		
		
		entrada.close();
	}
	
}
