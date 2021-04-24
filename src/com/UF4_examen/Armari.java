package com.UF4_examen;

public class Armari extends Objecte implements Porta {
	
	/*
	 Classe Armari que hereti de la classe Objecte i implementi la interf�cie Porta (4 punts)
		1. Atributs
			1. Boole� privat portaOberta
			2. M�todes
				1. CanviarDimensions (p�blic)
						1. Haur� d�introduir les noves dimensions de l�armari i desar-les a la variable dimensions.
						
				2. ObrirPorta (p�blic)
							1. Haur� de posar el valor boole� portaOberta a true.				
				3. TancarPorta (p�blic)
					1. Haur� de posar el valor boole� portaOberta a false.	
				4. DesarObjecte (p�blic)
					1. Si el valor del boole� portaOberta �s true haur� de retornar per pantalla �Es pot desar un objecte�. Si no ho �s, haur� de mostrar per pantalla 
					�No es pot desar un objecte�.	
				5. ExtreureObjecte (p�blic)
					1. Si el valor del boole� portaOberta �s true haur� de retornar per pantalla �Es pot extreure un objecte�. Si no ho �s, haur� de mostrar per pantalla 
					�No es pot extreure un objecte�.
					
				6. EstatPorta (p�blic)
					1. Haura de mostrar per pantalla �La porta de l�armari esta oberta� o �la porta de l�armari esta tancada� en funci� del valor del boole� portaOberta.
					2. Haur� de retornar true si el valor del boole� portaOberta �s true i false si no ho �s.
				7. CalcularVolum (p�blic)
					1. Haur� de retornar un enter amb el c�lcul del volum (amplada*alcada*profunditat).
			3. Constructors
				1. Constructor per defecte
				2. Constructor per par�metres on haurem d�introduir totes les dades:
					1. Variable Dimensions amb les dimensions de l�armari
					2. String color amb el color de l�armari
					3. Boole� que determinar� si la porta de l�armari est� oberta o tancada.
	 */
	
	// ATRIBUTS:
	private boolean portaOberta;
	
	// CONSTRUCTORS:
	// per defecte
	Armari () {}
	
	// per par�metres
	Armari (Dimensions dimensions, String color, boolean oberta) {
		this.setDimensions(dimensions);
		this.setColor(color);
		this.portaOberta = oberta;
	}
	
	// METHODS:
	
	// 1. CanviarDimensions (p�blic)
	//1. Haur� d�introduir les noves dimensions de l�armari i desar-les a la variable dimensions.
	
	@Override
	public void canviarDimensions(int alcada, int amplada, int profunditat) {
		getDimensions().alcada = alcada;
		getDimensions().amplada = amplada;
		getDimensions().profunditat = profunditat;
	}
	
	//ObrirPorta (p�blic 1. Haur� de posar el valor boole� portaOberta a true.)
	@Override
	public void obrirPorta() {
		this.portaOberta = true;
	}

	@Override
	public void tancarPorta() {
		this.portaOberta = false;	
	}
	
	/*
	 DesarObjecte (p�blic)
		1. Si el valor del boole� portaOberta �s true haur� de retornar per pantalla �Es pot desar un objecte�. Si no ho �s, haur� de mostrar per pantalla 
		�No es pot desar un objecte�.
	 */
	public void desarObjecte() {
		if (this.portaOberta) {
			System.out.println("Es pot desar un objecte");
		} else {
			System.out.println("No es pot desar un objecte");
		}
	}
	
	/*
	 ExtreureObjecte (p�blic)
		1. Si el valor del boole� portaOberta �s true haur� de retornar per pantalla �Es pot extreure un objecte�. Si no ho �s, haur� de mostrar per pantalla 
		�No es pot extreure un objecte�.
	 */
	public void extraureObjecte() {
		if (this.portaOberta) {
			System.out.println("Es pot extreure un objecte");
		} else {
			System.out.println("No es pot extreure un objecte");
		}
	}
	
	/*
	6. EstatPorta (p�blic)
		1. Haura de mostrar per pantalla �La porta de l�armari esta oberta� o �la porta de l�armari esta tancada� en funci� del valor del boole� portaOberta.
		2. Haur� de retornar true si el valor del boole� portaOberta �s true i false si no ho �s. 
	 */
	public boolean estatPorta() {
		boolean check;
		if (portaOberta) {
			System.out.println("La porta de l�armari esta oberta");
			check = true;
		} else {
			System.out.println("la porta de l�armari esta tancada");
			check = false;
		}
		return check;
	}
	
	/*
	 7. CalcularVolum (p�blic)
		1. Haur� de retornar un enter amb el c�lcul del volum (amplada*alcada*profunditat). 
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

