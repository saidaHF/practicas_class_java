package com.practicas.UF4;

import java.util.Scanner;

public class PrincipalPersona {
	
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona("Mario", 18, 'M');
		Persona p3 = new Persona("Sara", 20, 'D', 65.5f, 1.70f);
		
		System.out.println(p3.getDni()); // Con el get nos llama a generar DNI, en la variable dni
	
	
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nom: ");
		String nom = entrada.next();
		
		System.out.println("Edat: ");
		int edat = entrada.nextInt();
		
		System.out.println("Sexe: (H | D) ");
		char sexe = entrada.next().charAt(0);
		
		System.out.println("Pes: ");
		float pes = entrada.nextFloat();
		
		System.out.println("Alçada: ");
		float alcada = entrada.nextFloat();
		
		
		System.out.println();
		
		p3.setNom("Mario");
		p3.setEdat(40);
		p3.setSexe('H');
		p3.setPes(120.3f);
		p3.setAlcada(1.70f);
		
		System.out.println();
		
		p1.calculaIMC();
		p2.calculaIMC();
		p3.calculaIMC();
		
		System.out.println();
		
		p1.esMajorEdat();
		p2.esMajorEdat();
		p3.esMajorEdat();
		
		System.out.println();
		
		
	}
	
}
