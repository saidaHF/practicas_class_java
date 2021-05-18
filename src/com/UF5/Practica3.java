package com.UF5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
	
	/*
	 a. Genereu una estructura try/catch on l�excepci� que captura el catch sigui gen�rica (de tipus Exception). En aquest catch, mostreu per pantalla el 
	 missatge que retorna l�error e i el missatge �He fet una captura gen�rica�. Proveu que l�error es captura correctament intentant accedir a una posici� 
	 del vector i_numeros no existent (per exemple, la posici� 6).
	 
	 b. Genereu una estructura catch que sigui de tipus InputMismatchException (haureu d�importar la llibreria java.util.InputMismatchException) i ubiqueu-la 
	 abans del catch gen�ric fet al primer apartat. En aquest catch, mostreu per pantalla el missatge que retorna l�error e i el missatge �He fet una captura 
	 d�error a l�entrada de dades�. Intenteu introduir un valor per pantalla, quan demana els valors a introduir al bucle, que sigui un text.
	 
	 c. Genereu una estructura catch que sigui de tipus ArrayIndexOutOfBoundsException i ubiqueu-la abans del catch gen�ric fet al primer apartat. En aquest catch, 
	 mostreu per pantalla el missatge que retorna l�error e i el missatge �He fet una captura d�error als l�mits del vector�. Feu la prova del vector del primer 
	 apartat un altre cop. Quin catch recull l�error ara mateix? Justifiqueu la resposta.
	 
	 RESPOSTA: Ara ho recull el catch ArrayIndexOutOfBoundsException, ja que no podem accedir a la posici� del vector i_vector i aquest �s el primer catch per ordre
	 de jerarqu�a en el programa.
	 
	 d. Busqueu per internet un altre tipus d�error, feu el catch corresponent (importeu si cal alguna llibreria) i for�eu a que es realitzi aquest tipus d�error.
	 */
	
	public static void main(String[] args) {
		
		try {
			
			int num = (Integer) null;
			
			System.out.println("Introdueixi un nombre: ");
			Scanner sc = new Scanner(System.in);
			int[] i_vector = new int[2];
			for (int i = 0; i < i_vector.length; i++) {
				i_vector[6] = sc.nextInt();
			}	
			
		System.out.println(num);
		
		} 
		catch  (NullPointerException e) {
			System.out.println("d. He fet un NullPointerException que \r\n"
					+ "llan�a una excepci� quan intentem accedir a un membre d'un objecte per al qual encara no hem reservat mem�ria " + e.getMessage());
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("c. He fet una captura d�error als l�mits del vector " + e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("b. He fet una captura d�error a l�entrada de dades " + e.getMessage());
		}
		catch (Exception e) {
			System.out.println("a. He fet una captura gen�rica " + e.getMessage());
			
		}
	}
}
