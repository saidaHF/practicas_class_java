package com.UF4_7;


public class Triangle3 extends Figura3 implements Propietats {
		// L'area del triangle és base per altura dividit per dos
		
		@Override
		public int calcularArea(int amplada, int altura) {
			return (amplada * altura) / 2;
		} 

		@Override
		public void mostraCostats() {
			System.out.println("El triangle té 3 costats");
		}

		@Override
		public void mostraVertex() {
			System.out.println("El triangle té 3 vèrtex");	
		}
}
