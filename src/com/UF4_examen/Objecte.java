package com.UF4_examen;

public abstract class Objecte {
	
	/*
	 Classe abstracte Objecte (1,5 punts)
		1. Atributs
			1. Objecte privat de tipus dimensions anomenat dimensions
			2. String privat color
		2. Constructors (no s’han de declarar com a abstractes)
			1. Per defecte
			2. Constructor per paràmetres que rebi els valors de dimensions i color. (Haurem de cridar a aquest constructor des de el constructor per paràmetres d’armari)
		3. Mètodes (si que s’han de declarar com a abstractes)
			1. CanviarDimensions (públic)
				1. Paràmetres d’entrada
					1. Enter alçada
					2. Enter amplada
					3. Enter profunditat
	 */
	
	// ATRIBUTS:
	private Dimensions dimensions;
	private String color;
	
	// CONSTRUCTORS:
	// per defecte:
	Objecte() {
		this.dimensions = new Dimensions();
	}
	
	// per parametres:
	Objecte(Dimensions dimensions, String color) {
		this.dimensions = dimensions;
		this.color = color;
	}
	
	// METHODS:
	abstract public void canviarDimensions(int alcada, int amplada, int profunditat);
	
	// GETTERS AND SETTERS:
	public Dimensions getDimensions() {
		return dimensions;
	}

	public void setDimensions(Dimensions dimensions) {
		this.dimensions = dimensions;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
