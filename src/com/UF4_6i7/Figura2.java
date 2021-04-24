package com.UF4_6i7;

public abstract class Figura2 {
	
	/*
	 Partint de l’exercici 1, implementeu les següents modificacions:
	 
		a. Canvia la classe Figura i declara-la Abstract.
		
		b. Modifiqueu el mètode que calcula l’àrea de la classe Figura i declareu-lo Abstract. Què passa? Què heu de fer per que no hi hagi un error? 
		
		- Marca error perquè un metode abstract:
			 • No té cos (claus): només consta de signatura amb parèntesi.
			 • La seva signatura acaba amb un punt i coma.
			 • Només pot existir dins d'una classe abstracta. D'aquesta manera s'evita que hi hagi mètodes que no es puguin executar dins de classes concretes. 
			 Vist d'una altra manera, si una classe inclou un mètode abstracte, forçosament la classe serà una classe abstracta.
			 
			Hem de fer aquests canvis.
		
		Què passa si ara esborrem la sobreescriptura del mètode a una de les dues classes filles (Triangle o Rectangle)?
		
		- Si esborrem els metodes de rectangle o triangle es demana que els fem abstract també o afegir un metode heredat
		
		c. Genera un mètode a la classe Rectangle anomenat TipusRectangle, que no tingui paràmetres d’entrada ni de sortida ni retorni cap valor, 
		que mostri per pantalla el literal “No sé si sóc un quadrat”.
		
		d. Genera una classe Quadrat, que hereti de la classe Rectangle, on hi hagi una sobreescriptura del mètode TipusRectangle per que mostri 
		per pantalla el literal “Sé al 100% que sóc un quadrat”.
		
		e. Al selector de la classe principal genera les opcions necessàries per poder generar un objecte de tipus Quadrat, una crida al mètode TipusRectangle 
		de la classe Quadrat i una crida al mètode TipusRectangle de la classe Rectangle. 
	 */
	
	// ATRIBUTS:
	private int amplada;
	private int altura;
	
	//METHODS:
	abstract public int calcularArea(int amplada, int altura); 	
}		


