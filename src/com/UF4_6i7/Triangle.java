package com.UF4_6i7;

public class Triangle extends Figura {
	// L'area del triangle �s base per altura dividit per dos
	
	@Override
	public int calcularArea(int amplada, int altura) {
		return (amplada * altura) / 2;
	} 
	
}
