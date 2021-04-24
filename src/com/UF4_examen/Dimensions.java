package com.UF4_examen;

public class Dimensions {
	
	/*
	 Classe Dimensions (1 punt)
		1. Atributs
			1. Enter alcada
			2. Enter amplada
			3. Enter profunditat
		2. Constructors
			1. Per defecte
			2. Per paràmetres
				1. Amb tres enters d’entrada, cadascun corresponent a alcada, amplada i profunditat.
	 */
	
	// ATRIBUTS:
	int alcada;
	int amplada;
	int profunditat;
	
	// CONSTRUCTORS:
	// per defecte
	Dimensions() {}
	
	// per parametres:
	Dimensions(int alcada, int amplada, int profunditat) {
		this.alcada = alcada;
		this.amplada = amplada;
		this.profunditat = profunditat;	
	}

	// GETTERS & SETTERS
	
	public int getAlcada() {
		return alcada;
	}

	public void setAlcada(int alcada) {
		this.alcada = alcada;
	}

	public int getAmplada() {
		return amplada;
	}

	public void setAmplada(int amplada) {
		this.amplada = amplada;
	}

	public int getProfunditat() {
		return profunditat;
	}

	public void setProfunditat(int profunditat) {
		this.profunditat = profunditat;
	}
	
}
