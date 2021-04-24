package com.UF4_examen;

public class Armari extends Objecte implements Porta {
	
	/*
	 Classe Armari que hereti de la classe Objecte i implementi la interfície Porta (4 punts)
		1. Atributs
			1. Booleà privat portaOberta
			2. Mètodes
				1. CanviarDimensions (públic)
						1. Haurà d’introduir les noves dimensions de l’armari i desar-les a la variable dimensions.
						
				2. ObrirPorta (públic)
							1. Haurà de posar el valor booleà portaOberta a true.				
				3. TancarPorta (públic)
					1. Haurà de posar el valor booleà portaOberta a false.	
				4. DesarObjecte (públic)
					1. Si el valor del booleà portaOberta és true haurà de retornar per pantalla «Es pot desar un objecte». Si no ho és, haurà de mostrar per pantalla 
					«No es pot desar un objecte».	
				5. ExtreureObjecte (públic)
					1. Si el valor del booleà portaOberta és true haurà de retornar per pantalla «Es pot extreure un objecte». Si no ho és, haurà de mostrar per pantalla 
					«No es pot extreure un objecte».
					
				6. EstatPorta (públic)
					1. Haura de mostrar per pantalla “La porta de l’armari esta oberta” o “la porta de l’armari esta tancada” en funció del valor del booleà portaOberta.
					2. Haurà de retornar true si el valor del booleà portaOberta és true i false si no ho és.
				7. CalcularVolum (públic)
					1. Haurà de retornar un enter amb el càlcul del volum (amplada*alcada*profunditat).
			3. Constructors
				1. Constructor per defecte
				2. Constructor per paràmetres on haurem d’introduir totes les dades:
					1. Variable Dimensions amb les dimensions de l’armari
					2. String color amb el color de l’armari
					3. Booleà que determinarà si la porta de l’armari està oberta o tancada.
	 */
	
	// ATRIBUTS:
	private boolean portaOberta;
	
	// CONSTRUCTORS:
	// per defecte
	Armari () {}
	
	// per paràmetres
	Armari (Dimensions dimensions, String color, boolean oberta) {
		this.setDimensions(dimensions);
		this.setColor(color);
		this.portaOberta = oberta;
	}
	
	// METHODS:
	
	// 1. CanviarDimensions (públic)
	//1. Haurà d’introduir les noves dimensions de l’armari i desar-les a la variable dimensions.
	
	@Override
	public void canviarDimensions(int alcada, int amplada, int profunditat) {
		getDimensions().alcada = alcada;
		getDimensions().amplada = amplada;
		getDimensions().profunditat = profunditat;
	}
	
	//ObrirPorta (públic 1. Haurà de posar el valor booleà portaOberta a true.)
	@Override
	public void obrirPorta() {
		this.portaOberta = true;
	}

	@Override
	public void tancarPorta() {
		this.portaOberta = false;	
	}
	
	/*
	 DesarObjecte (públic)
		1. Si el valor del booleà portaOberta és true haurà de retornar per pantalla «Es pot desar un objecte». Si no ho és, haurà de mostrar per pantalla 
		«No es pot desar un objecte».
	 */
	public void desarObjecte() {
		if (this.portaOberta) {
			System.out.println("Es pot desar un objecte");
		} else {
			System.out.println("No es pot desar un objecte");
		}
	}
	
	/*
	 ExtreureObjecte (públic)
		1. Si el valor del booleà portaOberta és true haurà de retornar per pantalla «Es pot extreure un objecte». Si no ho és, haurà de mostrar per pantalla 
		«No es pot extreure un objecte».
	 */
	public void extraureObjecte() {
		if (this.portaOberta) {
			System.out.println("Es pot extreure un objecte");
		} else {
			System.out.println("No es pot extreure un objecte");
		}
	}
	
	/*
	6. EstatPorta (públic)
		1. Haura de mostrar per pantalla “La porta de l’armari esta oberta” o “la porta de l’armari esta tancada” en funció del valor del booleà portaOberta.
		2. Haurà de retornar true si el valor del booleà portaOberta és true i false si no ho és. 
	 */
	public boolean estatPorta() {
		boolean check;
		if (portaOberta) {
			System.out.println("La porta de l’armari esta oberta");
			check = true;
		} else {
			System.out.println("la porta de l’armari esta tancada");
			check = false;
		}
		return check;
	}
	
	/*
	 7. CalcularVolum (públic)
		1. Haurà de retornar un enter amb el càlcul del volum (amplada*alcada*profunditat). 
	 */
	public int calcularVolum() {
		int resultat;
		resultat = getDimensions().amplada * getDimensions().alcada * getDimensions().profunditat;
		return resultat;
	}

	@Override
	public String toString() {
		return "Armari [portaOberta=" + portaOberta + ", estatPorta()=" + estatPorta() + ", calcularVolum()="
				+ calcularVolum() + ", getDimensions()=" + getDimensions() + ", getColor()=" + getColor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

