package com.UF4_3i4;

public class Gos extends Animal {
	/*
	 Partint de la classe Animal definida a la pr�ctica 3, realitzeu les seg�ents tasques:
		a. Una classe anomenada Gos que derivi de la classe Animal. Aquesta classe ha de tenir les seg�ents caracter�stiques:
				i. Un atribut de tipus String anomenat raza.
				ii. Un m�tode, anomenat borda, que no tingui par�metres d�entrada ni retorni cap par�metre. Aquest m�tode haur� de mostrar per pantalla �Guau!�.
				iii. Un constructor sense par�metres i un constructor amb par�metres.
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
