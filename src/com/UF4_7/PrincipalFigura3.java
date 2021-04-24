package com.UF4_7;
import java.util.Scanner;

import com.UF4_3i4.Gos;

public class PrincipalFigura3 {
	
	static Gos gos;
	
	public static void main(String[] args) {
	/*
		Partint de l’exercici 1 de la pràctica 6, implementeu les següents modificacions:
		
			f. Genereu una interfície anomenada Propietats que defineixi dos mètodes nous: 
			mostraCostats i mostraVertex. Els dos mètodes no tindran paràmetres d'entrada ni retornaran cap valor.
			
			g. Les dues classes derivades, Triangle i Rectangle, hauran d'implementar aquesta interfície.
			
			h. La funcionalitat de la funció mostraCostats haurà de ser la de mostrar per pantalla els costats de la figura
			 (3 en el cas del triangle i 4 en el cas del rectangle).
			 
			i. La funcionalitat de la funció mostraVertex haurà de ser la de mostrar per pantalla els vèrtex de la figura
			 (3 en el cas del triangle i 4 en el cas del rectangle).
			 
			j. Al programa principal, haurà d'haver 4 noves opcions al selector per cridar a les 4 definicions de les funcions fetes anteriorment 
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
			System.out.println("Escull una opció: \n1. Crear triangle \n2. Crear quadrat \n3. Calcular àrea triangle \n4. Calcular àrea quadrat \n5. Crear un gos"
					+ "\n6. Mostrar costats (TRIANGLE) \n7. Mostrar vèrtexs (TRIANGLE) \n8. Mostrar costats (RECTANGLE) \n9. Mostrar vèrtexs (RECTANGLE) \n0. SORTIR");
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
					case 3: // Calcular àrea triangle
						if (triangle == null) {
							System.out.println("El triangle no existeix.");
						} else {
							System.out.println("El resultat és: " + triangle.calcularArea(triangle.getAmplada(), triangle.getAltura()) + " m2");
						}
						break;
					case 4: // Calcular àrea quadrat
						if (rectangle == null) {
							System.out.println("El rectangle no existeix.");
						} else {
							System.out.println("El resultat és: " +  rectangle.calcularArea(rectangle.getAmplada(), rectangle.getAltura()) + " m2");
						}
						break;	
					case 5: // Crear un gos
						generarGos(demanarRaza(entrada));
						System.out.println("La raça és: " + gos.getRaza());
						break;
					case 6: // Mostrar costats (TRIANGLE)
						triangle3.mostraCostats();
						break;
					case 7: // Mostrar vèrtex (TRIANGLE)
						triangle3.mostraVertex();
						break;	
					case 8: // Mostrar costats (RECTANGLE) 
						rectangle3.mostraCostats();
						break;
					case 9: // Mostrar vèrtex (RECTANGLE)
						rectangle3.mostraVertex();
						break;
				}				
			} else { // Qualsevol altre opció:
				System.out.println("Opció incorrecta. Introdueix una opció valida"); 
			}			
		} while (opcio_escollida != 0); // Mentres no sigui igual a 0 -> Sí posem 0 sortim del bucle
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
		System.out.println("Introdueix la raça: ");	
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
