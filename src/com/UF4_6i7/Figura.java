package com.UF4_6i7;

public class Figura {
	
	/*
	 Una classe anomenada Figura que tingui l’amplada i l’altura. 
	 
	 Aquesta classe, ha de tenir un mètode que calculi i retorni l’àrea. 
	 
	 Com no sabem de quina figura es tracta, haurem de tenir com a paràmetres d’entrada dos enters i com a paràmetre de sortida haurà de retornar 0 sempre 
	 (al no ser una figura definida no sabem com calcular l’àrea). 
	 
	 Dins d’aquesta funció haurà de mostrar per pantalla el literal «No sóc una figura definida, pel que no sé calcular l’àrea. Retornaré 0».
	 */
	
	// ATRIBUTS:
	
	private int amplada;
	private int altura;
	
	//METHODS:
	public int calcularArea(int amplada, int altura) {
		System.out.println("No sóc una figura definida, pel que no sé calcular l’àrea. Retornaré 0");
		return 0;
	}

	public int getAmplada() {
		return amplada;
	}

	public void setAmplada(int amplada) {
		this.amplada = amplada;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	
}
	/*
	 b. Després, s’han de generar dues classes que heretin de la classe Figura que siguin anomenades Rectangle i Triangle. 
	 Aquestes dues classes han de sobreescriure el mètode que calcula i retorna l’àrea de la figura per fer el càlcul correcte de l’àrea en cada cas
	 
			(NOTA: l’àrea del rectangle és base per altura i la del triangle és base per altura dividit per dos). 
	 */
 