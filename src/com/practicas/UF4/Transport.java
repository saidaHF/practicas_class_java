package com.practicas.UF4;

import java.util.Scanner;

public class Transport {
	
	// ATRIBUTS:
	
	// atributs de la classe Transport
	protected String type;
	protected float mida;
	
	// CONSTRUCTOR: 
	
	// constructor per defecte buit:
	public Transport() {
		this.type = "";
		this.mida = 1;
		// poner valores por defecto si quieres
	};
	
	// constructor que demani tot:
	public Transport(String type, float mida) {
		this.type = type;
		this.mida = mida;
	};
	
	
	// METHODS:
		
	// calcular la velocitat a la que va el transport
	
	float Velocitat() {
		Scanner entrada = new Scanner(System.in);
		float d = distancia(entrada);
		float t = temps(entrada);
		if (t == 0) {
			return 0;
		}
		float velocitat = d / t;	
		return velocitat;
	}
	
	// retorna si estas corrent o aturant-se (si frena ja no hi ha aceleracció)
	
	void Estat(float aceleraccio) {
		if (aceleraccio > 0) {  // si no hi ha aceleracció el transport esta frenant
			System.out.println("El/la " + type + " continua corrent");
		} else { 
			System.out.println("El/la " + type + " frena");;
		} 
	}
	
	// calcular l'aceleracció del transport 
	
	float Acceleracio() {
		
		// FORMULA: Acceleració = Vf - Vo / t 
		
		Scanner entrada = new Scanner(System.in);
		float vf = Vf(entrada);
		float vo = Vo(entrada);
		float t = temps(entrada);
		
		if (t == 0) { // no es pot dividir entre 0 és NaN, retornem 0 així el metode de "Estat" pot saber si té aceleracció o no té
			return 0;
		} else {
			float resultat = (vf - vo) / t; 
			return resultat; 
		}
	}
		
	
	// METHODS AUX: 
	
	// mostrar un texte
	public static void mostrar(String text) {
		System.out.println(text);
	}
	
	// demanar un numero per la distancia
	public static float distancia(Scanner entrada) {
		mostrar("Introdueix la distáncia recorreguda en metres: ");		
		return entrada.nextFloat(); // hem de posar nextfloat per poder introduïr numeros amb decimals
	}
	
	// demanar un numero pel temps
	public static float temps(Scanner entrada) {
		mostrar("Introdueix el temps empleat en segons: ");		
		return entrada.nextFloat();
	}
	
	// demanar velocitat inicial
	public static float Vo(Scanner entrada) {
		mostrar("Introdueix la velocitat inicial: ");		
		return entrada.nextFloat();
	}
	
	// demanar velocitat final
	public static float Vf(Scanner entrada) {
		mostrar("Introdueix la velocitat final: ");		
		return entrada.nextFloat();
	}
	

}

	
	

