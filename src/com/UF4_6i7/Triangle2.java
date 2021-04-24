package com.UF4_6i7;

public class Triangle2 extends Figura2 {
	
	// L'area del triangle és base per altura dividit per dos
	
	@Override
	public int calcularArea(int amplada, int altura) {
		return (amplada * altura) / 2;
	} 
	
}
