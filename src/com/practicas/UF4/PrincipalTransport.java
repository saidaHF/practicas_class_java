package com.practicas.UF4;

import java.util.Scanner;

public class PrincipalTransport {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Transport moto = new Transport();
		Transport moto2 = new Transport("moto", 2);
		Transport caball = new Transport("caball", 2);
		
		// calculem la velocitat
		System.out.println("Velocitat �s " + moto2.Velocitat() + " m/s");
		// calculem l'aceleracci� i guardem en una variable per poderla utilitzar despr�s amb una altre funci�
		float a = moto2.Acceleracio();
		System.out.println("L'aceleracci� �s: " + a + " m/s^2");
		// funci� per saber si el transport esta corrent o s'atura, al posar la variable creada anteriorment ho fa automaticament:
		moto2.Estat(a);	
	}	
	
}
