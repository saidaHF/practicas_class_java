package com.UF4_3i4;

public class Gos extends Animal {
	/*
	 Partint de la classe Animal definida a la pràctica 3, realitzeu les següents tasques:
		a. Una classe anomenada Gos que derivi de la classe Animal. Aquesta classe ha de tenir les següents característiques:
				i. Un atribut de tipus String anomenat raza.
				ii. Un mètode, anomenat borda, que no tingui paràmetres d’entrada ni retorni cap paràmetre. Aquest mètode haurà de mostrar per pantalla «Guau!».
				iii. Un constructor sense paràmetres i un constructor amb paràmetres.
	 */
	
	// ATRIBUTS:
	private String raza;
	
	//CONSTRUCTOR:
	
	// Sense parametres
	public Gos() {}
	
	// Amb parametres
	public Gos(String raza) {
		this.raza = raza;	
	}
	
	//METHODS:
	public void borda() {
		System.out.println("Guau!");
	}
	

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
