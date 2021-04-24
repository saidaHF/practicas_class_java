package com.UF4_examen;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		// Armari no creat si no hi ha aquest objecte en les opcions
		
		/*
		 Classe principal (2 punts)
		 
	1. La classe principal haurà de tenir la funció principal del programa. Aquesta funció haurà de tenir el següent selector, on es cridarà a la funció adient:
	
		1. Crear armari
			1. En aquest cas haurem d’introduir els diferents valors amb els que hem d’inicialitzar l’armari per pantalla. Si ja existeix un armari, 
			sobreescriure el valors dels atributs.
			
			
		2. Obrir porta
			1. Si l’armari ha estat generat, haurà de cridar a la funció ObrirPorta. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		3. Tancar porta
			1. Si l’armari ha estat generat, haurà de cridar a la funció TancarPorta. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		4. Desar objecte
			1. Si l’armari ha estat generat, haurà de cridar a la funció DesarObjecte. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		5. Extreure objecte
			1. Si l’armari ha estat generat, haurà de cridar a la funció ExtreureObjecte. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		6. Estat porta
			1. Si l’armari ha estat generat, haurà de cridar a la funció EstatPorta. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		7. Calcular volum
			1. Si l’armari ha estat generat, haurà de cridar a la funció CalcularVolum. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
			
		8. Canviar Dimensions
			1. Demanar a l’usuari per pantalla les noves dimensions de l’armari i fer una crida a la funció definida dins de la classe armari (canviarDimensions).
		9. Mostrar Dades de l’armari
			1. Mostrar en pantalla totes les dades de l’armari en un sol string.
		10. Sortir
			1. Haurà de sortir del programa  - - - He utilitzat el 0 per el bucle while 
		 */
		
		Armari armari = null;
		Objecte objecte = null;
		
		Scanner entrada = new Scanner(System.in);	
		int opcio_escollida; 
		
		do {	
			System.out.println("Escull una opció: \n1. Crear armari \n2. Obrir porta \n3. Tancar porta \n4. Desar objecte \n5. Extraure objectes"
					+ "\n6. Estat porta \n7. Calcular volum \n8. Canviar dimensions \n9. Mostrar dades de l'armari \n0. SORTIR");
			opcio_escollida = entrada.nextByte();
			
			if (opcio_escollida == 0) {
				System.out.println("Sortir del programa...");
			} else if (opcio_escollida >= 1 && opcio_escollida <= 9) { 
				
				switch (opcio_escollida) {	
					case 1: // Crear armari
						armari = new Armari();
						System.out.println("Introdueix el alçada: ");
						int alcada = entrada.nextInt();
						System.out.println("Introdueix amplada: ");
						int amplada = entrada.nextInt();
						System.out.println("Introdueix profunditat: ");
						int profunditat = entrada.nextInt();	
						// primer hem de crear l'objecte dimensions:
						Dimensions dimensions = new Dimensions(alcada, amplada, profunditat);
						
						System.out.println("Introdueix color: ");
						String color;
						color = entrada.next();
						// després ja podem fer l'objecte armari:
						armari = new Armari(dimensions, color, armari.estatPorta());	
						break;
					case 2: // Obrir porta
						if (armari == null) {
							System.out.println("L'armari no existeix.");
						} else {
							armari.obrirPorta();
						}
						break;
					case 3: // Tancar porta
						if (armari == null) {
							System.out.println("L'armari no existeix.");
						} else {
							armari.tancarPorta();
						}
						break;
					case 4: // Desar objecte 1. Si l’armari ha estat generat, haurà de cridar a la funció DesarObjecte. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
						if (armari == null) {
							System.out.println("L’armari encara no ha estat creat");
						} else {
							armari.desarObjecte();
						}
						break;	
					case 5: // Extreure objecte
							// 1. Si l’armari ha estat generat, haurà de cridar a la funció ExtreureObjecte. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
						if (armari == null) {
							System.out.println("L’armari encara no ha estat creat");
						} else {
							armari.extraureObjecte();
						}
						break;
					case 6: // Estat porta 1. Si l’armari ha estat generat, haurà de cridar a la funció EstatPorta. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
						if (armari == null) {
							System.out.println("L’armari encara no ha estat creat");
						} else {
							armari.estatPorta();
						}
						break;
					case 7: // Calcular volum
						//1. Si l’armari ha estat generat, haurà de cridar a la funció CalcularVolum. Si no, haurà de mostrar per pantalla «L’armari encara no ha estat creat».
						if (armari == null) {
							System.out.println("L’armari encara no ha estat creat");
						} else {
							System.out.println(armari.calcularVolum());
						}
						break;	
					case 8: //Canviar Dimensions
						// 1. Demanar a l’usuari per pantalla les noves dimensions de l’armari i fer una crida a la funció definida dins de la classe armari (canviarDimensions).
						System.out.println("Introdueix l'alçada: ");
						alcada = entrada.nextInt();
						System.out.println("Introdueix l'amplada: ");
						amplada = entrada.nextInt();
						System.out.println("Introdueix la profunditat: ");
						profunditat = entrada.nextInt();
						// fem la funció amb les noves dades demanades per pantalla:
						armari.canviarDimensions(alcada, amplada, profunditat);	
						// mostrem l'objecte creat armari
						System.out.println(armari);
						break;
					case 9: // Mostrar Dades de l’armari 1. Mostrar en pantalla totes les dades de l’armari en un sol string.
						System.out.println(armari.toString());
						break;
				}				
			} else { // Qualsevol altre opció:
				System.out.println("Opció incorrecta. Introdueix una opció valida"); 
			}			
		} while (opcio_escollida != 0); // Mentres no sigui igual a 0 -> Sí posem 0 sortim del bucle
	}

}

	

