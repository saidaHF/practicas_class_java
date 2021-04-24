package com.UF4_7;

public class Rectangle3 extends Figura3 implements Propietats {
	
	//  L’àrea del rectangle és base per altura
	
	@Override
	public int calcularArea(int amplada, int altura) {
		return amplada * altura;
	}

	/* 
	 La funcionalitat de la funció mostraCostats haurà de ser la de mostrar per pantalla els costats de la figura
	 (3 en el cas del triangle i 4 en el cas del rectangle).
	*/
	
	@Override
	public void mostraCostats() {
		System.out.println("El rectangle té 4 costats");
	}

	@Override
	public void mostraVertex() {
		System.out.println("El rectangle té 4 vèrtex");
	} 
}
