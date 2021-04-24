package com.UF4_7;
import java.util.Scanner;

import com.UF4_3i4.Gos;

public class PrincipalFigura3 {
	
	static Gos gos;
	
	public static void main(String[] args) {
	/*
		Partint de l�exercici 1 de la pr�ctica 6, implementeu les seg�ents modificacions:
		
			f. Genereu una interf�cie anomenada Propietats que defineixi dos m�todes nous: 
			mostraCostats i mostraVertex. Els dos m�todes no tindran par�metres d'entrada ni retornaran cap valor.
			
			g. Les dues classes derivades, Triangle i Rectangle, hauran d'implementar aquesta interf�cie.
			
			h. La funcionalitat de la funci� mostraCostats haur� de ser la de mostrar per pantalla els costats de la figura
			 (3 en el cas del triangle i 4 en el cas del rectangle).
			 
			i. La funcionalitat de la funci� mostraVertex haur� de ser la de mostrar per pantalla els v�rtex de la figura
			 (3 en el cas del triangle i 4 en el cas del rectangle).
			 
			j. Al programa principal, haur� d'haver 4 noves opcions al selector per cridar a les 4 definicions de les funcions fetes anteriorment 
			(mostraCostats i mostraVertex per un objecte de tipus Triangle i per un objecte de tipus Rectangle).
	 */ 
		Scanner entrada = new Scanner(System.in);
		Triangle3 triangle = null;
		Rectangle3 rectangle = null;
		//
		Triangle3 triangle3 = new Triangle3();
		Rectangle3 rectangle3 = new Rectangle3();
		
		int opcio_escollida; 
		
		do {	
			System.out.println("Escull una opci�: \n1. Crear triangle \n2. Crear quadrat \n3. Calcular �rea triangle \n4. Calcular �rea quadrat \n5. Crear un gos"
					+ "\n6. Mostrar costats (TRIANGLE) \n7. Mostrar v�rtexs (TRIANGLE) \n8. Mostrar costats (RECTANGLE) \n9. Mostrar v�rtexs (RECTANGLE) \n0. SORTIR");
			opcio_escollida = entrada.nextByte();
			
			if (opcio_escollida == 0) {
				System.out.println("Sortir del programa...");
			} else if (opcio_escollida >= 1 && opcio_escollida <= 9) { 
				
				switch (opcio_escollida) {	
					case 1: // Crear triangle
						triangle = new Triangle3();
						triangle.setAmplada(demanarAmplada(entrada));
						triangle.setAltura(demanarAltura(entrada));
						break;
					case 2: // Crear quadrat
						rectangle = new Rectangle3();
						rectangle.setAmplada(demanarAmplada(entrada));
						rectangle.setAltura(demanarAltura(entrada));
						break;
					case 3: // Calcular �rea triangle
						if (triangle == null) {
							System.out.println("El triangle no existeix.");
						} else {
							System.out.println("El resultat �s: " + triangle.calcularArea(triangle.getAmplada(), triangle.getAltura()) + " m2");
						}
						break;
					case 4: // Calcular �rea quadrat
						if (rectangle == null) {
							System.out.println("El rectangle no existeix.");
						} else {
							System.out.println("El resultat �s: " +  rectangle.calcularArea(rectangle.getAmplada(), rectangle.getAltura()) + " m2");
						}
						break;	
					case 5: // Crear un gos
						generarGos(demanarRaza(entrada));
						System.out.println("La ra�a �s: " + gos.getRaza());
						break;
					case 6: // Mostrar costats (TRIANGLE)
						triangle3.mostraCostats();
						break;
					case 7: // Mostrar v�rtex (TRIANGLE)
						triangle3.mostraVertex();
						break;	
					case 8: // Mostrar costats (RECTANGLE) 
						rectangle3.mostraCostats();
						break;
					case 9: // Mostrar v�rtex (RECTANGLE)
						rectangle3.mostraVertex();
						break;
				}				
			} else { // Qualsevol altre opci�:
				System.out.println("Opci� incorrecta. Introdueix una opci� valida"); 
			}			
		} while (opcio_escollida != 0); // Mentres no sigui igual a 0 -> S� posem 0 sortim del bucle
	}

	
	public static int demanarAmplada(Scanner entrada) {	
		System.out.println("Introdueix l'amplada: ");	
		return entrada.nextInt();
	}
	public static int demanarAltura(Scanner entrada) {	
		System.out.println("Introdueix l'altura: ");	
		return entrada.nextInt();
	}
	public static String demanarRaza(Scanner entrada) {	
		System.out.println("Introdueix la ra�a: ");	
		return entrada.next();
	}
	 
	// METODE afegir un nou gos:
	public static void generarGos(String raza) {
		if (gos == null) {
			gos = new Gos(raza);
		} else {
			gos = new Gos(raza);
			gos.borda();
		} 
	}
}
