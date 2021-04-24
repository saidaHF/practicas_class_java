package com.UF4_6i7;

import java.util.Scanner;

import com.UF4_3i4.Gos;

public class PrincipalFigura {
	
	static Gos gos;
	
	public static void main(String[] args) {
	/*
	 Una classe principal que tingui un selector amb les seg�ents funcions:
	 
		i. Crear triangle: generar un triangle nou amb les dades introdu�des per pantalla. Si ja existeix un triangle, sobreescriu l�existent.
		
		ii. Crear quadrat: generar un quadrat nou amb les dades introdu�des per pantalla. Si ja existeix un quadrat, sobreescriu l�existent.
		
		iii. Calcula �rea triangle: si existeix un objecte de tipus triangle, calcula la seva �rea i la mostra per pantalla.
		
		iv. Calcula �rea quadrat: si existeix un objecte de tipus quadrat, calcula la seva �rea i la mostra per pantalla.
		
		
	  En el selector del programa principal, afegir dues noves funcionalitats: 
	  	i. Afegir un nou gos: generar una funci� que serveixi per generar un objecte de tipus gos si no existeix ja un. Si existeix, sobreescriure�l.
		ii. Borda: si existeix un objecte de tipus gos, cridar al seu m�tode Borda.
	
	 */ 
		Scanner entrada = new Scanner(System.in);
		Triangle triangle = null;
		Rectangle rectangle = null;
		
		int opcio_escollida; 
		
		do {	
			System.out.println("Escull una opci�: \n1. Crear triangle \n2. Crear quadrat \n3. Calcular �rea triangle \n4. Calcular �rea quadrat \n5. Crear un gos \n0. SORTIR");
			opcio_escollida = entrada.nextByte();
			
			if (opcio_escollida == 0) {
				System.out.println("Sortir del programa...");
			} else if (opcio_escollida >= 1 && opcio_escollida <= 5) { // Entre 1 o 4 opcions a escollir	
				
				switch (opcio_escollida) {	
					case 1: // Crear triangle
						triangle = new Triangle();
						triangle.setAmplada(demanarAmplada(entrada));
						triangle.setAltura(demanarAltura(entrada));
						break;
					case 2: // Crear quadrat
						rectangle = new Rectangle();
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
