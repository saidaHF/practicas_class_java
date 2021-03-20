package com.practicas.UF4;

public class Caball extends Transport {
	/* Penseu en un possible objecte que pugui heretar de l’objecte anterior (per exemple, l’objecte persona que hereti de l’objecte animal). 
	 * Determineu dos propietats i un mètode que pugui tenir aquest objecte que no tingui l’anterior, especificant tots els paràmetres i els tipus possibles.
	 * 
	 * Caball es un objecte que hereda de transport
	*/
	
	// ATTRIBUTE:
	
	private int numeroPotes; // donem per fet que no pot tenir numeros decimals de potes per aixó un int
	private boolean montura; // pot portar o no una montura
	
	
	// CONSTRUCTOR:
	
	public Caball () {
		this.numeroPotes = 4; // Tindra 4 potes sempre
		this.montura = true; // Li posem montura per defecte
		this.type = "caball"; // com estem en una clase caball per defecte será un caball
	}
	
	public Caball (int numeroPotes, boolean montura, float mida) {
		this.numeroPotes = numeroPotes;
		this.montura = montura;
		this.mida = mida;
	}
	
	// METHODS:
	void montura (boolean puesto) {	
		if (puesto) {
			System.out.println("El caball té la montura posada");
		} else System.out.println("La montura no está posada");
	}
	
}
