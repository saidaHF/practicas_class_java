package com.UF5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3b {
	
	/*
	 2. Generaci� d�una estructura de control d�errors per guiar el flux d�un programa:
	 
		a. Genereu una funci� anomenada demanarNumero, que ha de retornar un enter. En aquesta funci�, haureu de fer un estructura try/catch on el catch 
		capturi un error del tipus InputMismatchException. Al try, heu d�intentar demanar un n�mero enter (int) per pantalla i retornar-lo. Al catch, en cas que 
		el valor introdu�t no sigui un n�mero int v�lid, heu de retornar un missatge que sigui �El valor introdu�t no �s un n�mero enter v�lid, agafarem el 0 per 
		defecte� i retornar un 0.
		
		b. Genereu una funci� anomenada suma que demani dos n�meros enters (int) per pantalla, realitzi la seva suma i mostri el valor per pantalla. La introducci� 
		dels n�meros l�heu de realitzar amb la funci� demanarNumero que heu generat anteriorment.
		
		c. Crideu a la funci� suma des de la funci� main i feu les seg�ents proves. Justifiqueu els resultats que us surten:
		
			i. sumar 1 i 2 
				RESPOSTA: suma els dos numeros 1 i 2 perqu� els dos s�n valors v�lids
			
			ii. sumar 1 i r
				RESPOSTA: Suma 1 + 0, ja que la r no es un valor v�lid i aleshores retorna 0
			
			iii. sumar t i r
				RESPOSTA: Suma 0 + 0 perqu� cap valor es v�lid i la funci� demanarNumero() retorna 0 en els dos casos
			
			iv. sumar 111111111111111111111111111111111111111111111111111111111 i 2
				RESPOSTA: el primer n�mero es massa llarg per un int aleshores no �s v�lid i retorna 0, 0+2 �s 2 el resultat
			
			d. Creieu que el control de flux d�un programa �s un bon �s del control d�excepcions? Creieu qu� hi ha alguna altra forma de controlar els errors abans 
				que passin? Justifiqueu la resposta. (condicions puertas logicas)
				
				RESPOSTA: No �s una bona pr�ctica sempre, �s m�s per errors inesperats que no podem controlar o que s'han escapat de les nostres mans
				
				Tenim les condicions (if) i portes l�giques per poder controlar posibles errors 
				
				Tamb� tenim el bloc finally que �s un bloc on podem definir un conjunt d'Instruccions necesaries tant s� es produeix l' error o excepci� com 
				s� no, i que s'ejecuti sempre. EXEMPLE:
						
						finally {
						
						     System.out.println(�bloque de c�digo ejecutado siempre�);
						
						}
	 */
	
	public static void main (String[] args) {
		
		// demanarNumero();
		
		System.out.println("La suma �s: " + suma());
	}
	
	// Funci� a.
	static public int demanarNumero() {
		// S� el valor introdu�t no �s valid retorna 0, s� es v�lid retorna numero
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		try {	
			System.out.println("Introdueix un n�mero enter: ");
			numero = sc.nextInt();
			System.out.println("Has introdu�t: " + numero);		
		} catch (InputMismatchException e) {
			System.out.println("El valor introdu�t no �s un n�mero enter v�lid, agafarem el 0 per defecte " + e.getMessage());	
		}
		return numero;
	}
	
	// Funci� b.
	static public int suma() {	
		int suma = demanarNumero() + demanarNumero();
		return suma;
	}
}
