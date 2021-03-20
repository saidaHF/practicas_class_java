package com.practicas.UF4;


public class Compte {
	
	// propietats, private per assegurar que només podrem accedir als mètodes
	
	private String titular;
	private double quantitat;
	
	// mètodes
	
	     // constructor és Compte, si no el creem es crea sol per defecte un buit
	     // El creem aqui, en dues version, per crear un compte només o un compte + ingrés de diners
	
	public Compte(String titular) {
		this.titular = titular;
	}
	
	public Compte(String titular, double quantitat) {
		this.titular = titular;
		this.quantitat = quantitat;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular; //this. és per diferenciar la variable local "titular" d'aquesta altre variable, el this. fa referencia al propi objecte
	}
	public double getQuantitat() {
		return quantitat;
	}
	public void setQuantitat(double quantitat) {
		this.quantitat = quantitat;
	}
	
	public void ingressar (double quantitat) {
	     if (quantitat > 0) {
	        this.quantitat += quantitat;
	     } else System.out.println("Només pot introduïr numeros positius!");
	}
	
	public void retirarDiners (double quantitat) {
		if (quantitat > 0 && this.quantitat >= quantitat) {
			this.quantitat -= quantitat;
		} else {
			System.out.println("No tens prous diners al compte");
			}
	}
}
