package com.UF4_6i7;

public class Rectangle2 extends Figura2 {
	
	//  L’àrea del rectangle és base per altura
	
	
	public int calcularArea(int amplada, int altura) {
		return amplada * altura;
	} 
	
	/*
	 Genera un mètode a la classe Rectangle anomenat TipusRectangle, que no tingui paràmetres d’entrada ni de sortida ni retorni cap valor, 
	 que mostri per pantalla el literal “No sé si sóc un quadrat”.
	 */
	public void tipusRectangle() {
		System.out.println("No sé si sóc un quadrat");
	}
}
