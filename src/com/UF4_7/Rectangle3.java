package com.UF4_7;

public class Rectangle3 extends Figura3 implements Propietats {
	
	//  L��rea del rectangle �s base per altura
	
	@Override
	public int calcularArea(int amplada, int altura) {
		return amplada * altura;
	}

	/* 
	 La funcionalitat de la funci� mostraCostats haur� de ser la de mostrar per pantalla els costats de la figura
	 (3 en el cas del triangle i 4 en el cas del rectangle).
	*/
	
	@Override
	public void mostraCostats() {
		System.out.println("El rectangle t� 4 costats");
	}

	@Override
	public void mostraVertex() {
		System.out.println("El rectangle t� 4 v�rtex");
	} 
}
