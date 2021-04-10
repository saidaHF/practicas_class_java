package com.practicas.visibilitat;

public class PrincipalVehicleExtern {
	
	public static void main(String[] args) {
		/*
		Genereu una classe principal amb la funció main que utilitzarem per fer les diferents proves de crides a les funcions al llarg d’aquesta pràctica. 
		En aquesta classe principal haureu de:
		
			a. Generar un objecte de tipus VehicleExtern. A través d’aquest objecte, informeu el valor del motor a 4 temps i 6 pistons i la marca que vosaltres volgueu.
			
			b. Mostreu els pistons i el temps del motor del vehicle i la seva marca a través de les funcions generades.
			
			c. A partir de l’objecte VehicleExtern, només han de poder executar-se els mètodes d’aquesta classe (és a dir, els atributs i els mètodes de la classe 
			interna Motor i els atributs de la classe VehicleExtern no han de ser visibles). Utilitzeu els modificadors de privacitat per fer-ho.
			
			d. Perquè creieu que es poden generar classes internes dins d’una altra classe a Java?
		 */
		
		// a:
		VehicleExtern avio = new VehicleExtern();
		
		avio.informaMarca("Toyota");
		avio.informaPistons(6);
		avio.informaTemps(4);
		
		// b:
		
		avio.mostraMarca();
		avio.mostraPistons();
		avio.mostraTemps();
		
		// d: Així podem generar objectes de la classe interna dintre de la classe externa, podent fer així diferents extructures de classe
		
	}
	
}
