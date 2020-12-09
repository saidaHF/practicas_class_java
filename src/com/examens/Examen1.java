package com.examens;

import java.util.Scanner;

public class Examen1 {
	
	public static void main(String[] args) {
		//Ex 1:
		
		// 1. 
		boolean sortir = true; //volem escollir si sortim o no, true o false.
		System.out.println("Resposta ex 1.1.: " + sortir);
		//2. 
		int [] dimensions_cub = {20,20,20}; //necesitem un array per poder emmagatzemar diferents valors del mateix tipus
		System.out.println("Resposta ex 1.2.: " + dimensions_cub[0] + "cm " + dimensions_cub[1] + "cm " + dimensions_cub[2] + "cm");
		//3.
		final int any = 2020; //amb el "final" aisgnem una constant, no es podra modificar el valor d'aquesta variable en tot el programa
		System.out.println("Resposta ex 1.3.: " + any);
		//4. 
		String recepta_cuina = "Patates al forn"; //un String es una cadena de caracters
		System.out.println("Resposta ex 1.4.: " + recepta_cuina);
		
		//Ex 2.
		
		String[] temps = {"Pluja", "Neu", "Vent", "Sol"};
		
		if (temps[0] == "Pluja" || temps[1] == "Neu") { //sí es compleix una de les dues es compleix la condició (és un OR)
			System.out.println("No es pot treure a passejar al gos");
		}
		if (temps[2] == "Vent" || temps[3] == "Sol") {
		System.out.println("Es pot treure a passejar al gos");
		}
		
		System.out.println(); //salt línea per separar
		
		
		//Ex 3.
		           //  0   1   2   3   4   5   6   7   8   9  10  11  12  13  14  15  16  17  18  19  20  21  22  23  24  25  26
		char[] abc = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		String[] nom = new String [5];
		
		for (int i = 0; i < abc.length; i++) { //recorrem tot el vector de lletres
			for (int j = 0; j < nom.length; j++) { //recorrem les posicions del vector del nom per guardar en cada posició la seva lletra
			if (i == abc[19]) {
				//nom[j] = ;  //hem de guardar la lletra del vector abc al vector del nom en la primera posició
				
				}
			} //mostrar SAIDA
		}
		
		//Ex 4.
		int comptador_A = 0;
		int comptador_B = 0;
		int vot;
		int edat = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Introdueix la teva edat o -1 per sortir: ");
			edat = entrada.nextInt();	
			if (edat == -1) { //text a mostrar si sortim del programa
				System.out.println("Sortir del programa...");
			} else if (edat < 18) {
				System.out.println("El votant és menor d'edat i no pot votar");
			} else if (edat >= 18) {
				System.out.println("Escolliu una opció:  \n1. vot per A \n2. vot per B");
				vot = entrada.nextInt(); //guardem l'opció escollida per utilitzarla al switch
	
				switch (vot) {
					
					case 1:
						comptador_A++; //sumem al comptador de vots de A
						System.out.println("Heu votat al partit A que té: " + comptador_A + " vots.");
						break;
					case 2:
						comptador_B++;
						System.out.println("Heu votat al partit B que té: " + comptador_B + " vots.");
						break;
					default:
						System.out.println("El vot és nul");	
				}
			}
		} while (edat != -1); //mentres no sigui -1 ja que, si és -1 surt del programa
		
	}
	
}
