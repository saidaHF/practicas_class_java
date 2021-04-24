package com.UF4_6i7;

public abstract class Figura2 {
	
	/*
	 Partint de l�exercici 1, implementeu les seg�ents modificacions:
	 
		a. Canvia la classe Figura i declara-la Abstract.
		
		b. Modifiqueu el m�tode que calcula l��rea de la classe Figura i declareu-lo Abstract. Qu� passa? Qu� heu de fer per que no hi hagi un error? 
		
		- Marca error perqu� un metode abstract:
			 � No t� cos (claus): nom�s consta de signatura amb par�ntesi.
			 � La seva signatura acaba amb un punt i coma.
			 � Nom�s pot existir dins d'una classe abstracta. D'aquesta manera s'evita que hi hagi m�todes que no es puguin executar dins de classes concretes. 
			 Vist d'una altra manera, si una classe inclou un m�tode abstracte, for�osament la classe ser� una classe abstracta.
			 
			Hem de fer aquests canvis.
		
		Qu� passa si ara esborrem la sobreescriptura del m�tode a una de les dues classes filles (Triangle o Rectangle)?
		
		- Si esborrem els metodes de rectangle o triangle es demana que els fem abstract tamb� o afegir un metode heredat
		
		c. Genera un m�tode a la classe Rectangle anomenat TipusRectangle, que no tingui par�metres d�entrada ni de sortida ni retorni cap valor, 
		que mostri per pantalla el literal �No s� si s�c un quadrat�.
		
		d. Genera una classe Quadrat, que hereti de la classe Rectangle, on hi hagi una sobreescriptura del m�tode TipusRectangle per que mostri 
		per pantalla el literal �S� al 100% que s�c un quadrat�.
		
		e. Al selector de la classe principal genera les opcions necess�ries per poder generar un objecte de tipus Quadrat, una crida al m�tode TipusRectangle 
		de la classe Quadrat i una crida al m�tode TipusRectangle de la classe Rectangle. 
	 */
	
	// ATRIBUTS:
	private int amplada;
	private int altura;
	
	//METHODS:
	abstract public int calcularArea(int amplada, int altura); 	
}		


