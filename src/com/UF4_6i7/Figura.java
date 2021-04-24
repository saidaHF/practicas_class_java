package com.UF4_6i7;

public class Figura {
	
	/*
	 Una classe anomenada Figura que tingui l�amplada i l�altura. 
	 
	 Aquesta classe, ha de tenir un m�tode que calculi i retorni l��rea. 
	 
	 Com no sabem de quina figura es tracta, haurem de tenir com a par�metres d�entrada dos enters i com a par�metre de sortida haur� de retornar 0 sempre 
	 (al no ser una figura definida no sabem com calcular l��rea). 
	 
	 Dins d�aquesta funci� haur� de mostrar per pantalla el literal �No s�c una figura definida, pel que no s� calcular l��rea. Retornar� 0�.
	 */
	
	// ATRIBUTS:
	
	private int amplada;
	private int altura;
	
	//METHODS:
	public int calcularArea(int amplada, int altura) {
		System.out.println("No s�c una figura definida, pel que no s� calcular l��rea. Retornar� 0");
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
	 b. Despr�s, s�han de generar dues classes que heretin de la classe Figura que siguin anomenades Rectangle i Triangle. 
	 Aquestes dues classes han de sobreescriure el m�tode que calcula i retorna l��rea de la figura per fer el c�lcul correcte de l��rea en cada cas
	 
			(NOTA: l��rea del rectangle �s base per altura i la del triangle �s base per altura dividit per dos). 
	 */
 