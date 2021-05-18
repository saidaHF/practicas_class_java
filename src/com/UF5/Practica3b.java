package com.UF5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3b {
	
	/*
	 2. Generació d’una estructura de control d’errors per guiar el flux d’un programa:
	 
		a. Genereu una funció anomenada demanarNumero, que ha de retornar un enter. En aquesta funció, haureu de fer un estructura try/catch on el catch 
		capturi un error del tipus InputMismatchException. Al try, heu d’intentar demanar un número enter (int) per pantalla i retornar-lo. Al catch, en cas que 
		el valor introduït no sigui un número int vàlid, heu de retornar un missatge que sigui «El valor introduït no és un número enter vàlid, agafarem el 0 per 
		defecte» i retornar un 0.
		
		b. Genereu una funció anomenada suma que demani dos números enters (int) per pantalla, realitzi la seva suma i mostri el valor per pantalla. La introducció 
		dels números l’heu de realitzar amb la funció demanarNumero que heu generat anteriorment.
		
		c. Crideu a la funció suma des de la funció main i feu les següents proves. Justifiqueu els resultats que us surten:
		
			i. sumar 1 i 2 
				RESPOSTA: suma els dos numeros 1 i 2 perqué els dos són valors vàlids
			
			ii. sumar 1 i r
				RESPOSTA: Suma 1 + 0, ja que la r no es un valor vàlid i aleshores retorna 0
			
			iii. sumar t i r
				RESPOSTA: Suma 0 + 0 perquè cap valor es vàlid i la funció demanarNumero() retorna 0 en els dos casos
			
			iv. sumar 111111111111111111111111111111111111111111111111111111111 i 2
				RESPOSTA: el primer número es massa llarg per un int aleshores no és vàlid i retorna 0, 0+2 és 2 el resultat
			
			d. Creieu que el control de flux d’un programa és un bon ús del control d’excepcions? Creieu què hi ha alguna altra forma de controlar els errors abans 
				que passin? Justifiqueu la resposta. (condicions puertas logicas)
				
				RESPOSTA: No és una bona pràctica sempre, és més per errors inesperats que no podem controlar o que s'han escapat de les nostres mans
				
				Tenim les condicions (if) i portes lógiques per poder controlar posibles errors 
				
				També tenim el bloc finally que és un bloc on podem definir un conjunt d'Instruccions necesaries tant sí es produeix l' error o excepció com 
				sí no, i que s'ejecuti sempre. EXEMPLE:
						
						finally {
						
						     System.out.println(“bloque de código ejecutado siempre”);
						
						}
	 */
	
	public static void main (String[] args) {
		
		// demanarNumero();
		
		System.out.println("La suma és: " + suma());
	}
	
	// Funció a.
	static public int demanarNumero() {
		// Sí el valor introduït no és valid retorna 0, sí es vàlid retorna numero
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		try {	
			System.out.println("Introdueix un número enter: ");
			numero = sc.nextInt();
			System.out.println("Has introduït: " + numero);		
		} catch (InputMismatchException e) {
			System.out.println("El valor introduït no és un número enter vàlid, agafarem el 0 per defecte " + e.getMessage());	
		}
		return numero;
	}
	
	// Funció b.
	static public int suma() {	
		int suma = demanarNumero() + demanarNumero();
		return suma;
	}
}
