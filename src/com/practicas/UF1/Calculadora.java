package com.practicas.UF1; 

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean primera_iteracio = true;
		
		int opcio_escollida; // nulo no �s zero
		int valor, resultat = 0;
		/* int valor = 0;
		 * int resultat = 0; 
		 * �s lo mateix que a d'alt
		 */
		
		do {
			
			System.out.println("Escull una opci�: \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Modul \n0. SORTIR");
			opcio_escollida = entrada.nextByte();
			
			if (opcio_escollida == 0) {
				System.out.println("Sortir del programa...");
			} else if (opcio_escollida >= 1 && opcio_escollida <= 5) { //entre 1 o 5	
				if (primera_iteracio != true) { //si ja no �s la primera vegada.
					System.out.println("Introdueix un altre numero: ");
					valor = entrada.nextInt();	
					System.out.println("El resultat �s: " + resultat);
				} else {
					System.out.println("Introdueix un numero: ");
					valor = entrada.nextInt();
					System.out.println("Introdueix un altre numero: ");
					resultat = entrada.nextInt();	
					System.out.println("El resultat �s: " + resultat);
					primera_iteracio = false; // la primera vegada que entra ho tornem false perqu� aix� si torna a entrar
												// faci el if, calculant amb el valor introdu�t anteriorment i un de nou del "else if" de la l�nea 27.
				}
				
				switch (opcio_escollida) {
					
					case 1: // Suma
						resultat = resultat + valor; // operaci� de SUMA amb primers valors
						break;
					case 2: // Resta						
						resultat = resultat - valor;
						break;
					case 3: // Multiplicaci�
						resultat = resultat * valor;
						break;
					case 4: // Divisi�
						resultat = resultat / valor;
						break;
					case 5: // M�dul
						resultat = resultat % valor;
						break;		
				}	
				System.out.println("El resultat �s: " + resultat);		
			} else { // Qualsevol altre opci�:
				System.out.println("Opci� incorrecta. Introdueix una opci� valida"); 
			}			
		} while (opcio_escollida != 0); // s� posem 0 sortim del bucle, mentres no sigui igual a 0.
		
		entrada.close();
	}
	
}