package com.practicas.UF4;

import java.util.Scanner;

public class PrincipalTransport {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Transport moto = new Transport();
		Transport moto2 = new Transport("moto", 2);
		Transport caball = new Transport("caball", 2);
		
		// calculem la velocitat
		System.out.println("Velocitat �s " + moto2.Velocitat() + " m/s");
		
		System.out.println(); // syso vac�o para dar espaicio
		
		// calculem l'aceleracci� i guardem en una variable per poderla utilitzar despr�s amb funci�: Estat()
		float a = moto2.Acceleracio();
		System.out.println("L'aceleracci� �s: " + a + " m/s^2");
		
		System.out.println(); // espacio vac�o
		
		// funci� per saber si el transport esta corrent o s'atura, al posar la variable creada anteriorment ho fa automaticament:
		moto2.Estat(a);	
	}	
	
}
