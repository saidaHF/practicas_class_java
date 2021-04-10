package com.UF4_3i4;

public class PrincipalAnimal {
	
	/*
	 	1. Fes un programa, estructurat en classes, que compleixi els seg�ents requisits:
	 	
			a. Una classe principal que sigui la que executa el programa.
			
			b. El programa, ha de generar un objecte de tipus animal que t� les seg�ents caracter�stiques:
			   al�ada, amplada, profunditat, nombre de potes, nom i posici� (coordenada x i y). 
			   Les dades per construir l'objecte animal les ha de demanar per pantalla.
			
			c. Despr�s de generar l�animal, s�ha de mostrar per pantalla totes les funcionalitats de l�aplicaci�:
			
					i. Moure l�animal: canviar la posici� de l�animal movent-lo 1 unitat en x i en y.
					ii. Mostrar posici�: mostrar la posici� de l�animal.
					
			d. Afegiu dos propietats m�s i dos m�todes m�s que pugui tenir la classe Animal i justifiqueu el perqu�.
	 */
	
	public static void main(String[] args) {
		
		Animal basilisco = new Animal();
		
		basilisco.demanarDades();
		
		basilisco.mida();
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			
			basilisco.moureAnimal();
			basilisco.takeDamage(1); // 1 �s el dany que rep
		}
		
		// EXERCICI 2: 
		
		// He fet un constructor amb parametres i un altre amb el constructor de referencia, perqu� entenc que l'enunciat no esta del tot correcte
		// i vol dir que utilitzis auqests constructors creats: (De totes maneres, vaig crear el constructor per defecte al exercici anterior, constructor sense parametres)
		
		
		// Constructor amb parametres:	
		Animal dragon = new Animal(0.20f, 0.40f, 0.50f, 4, "Saphira", 2, 7, 27, true);
		System.out.println(dragon.toString());
		// Hem instanciat un objecte on passem els parametres d'entrada desde el constructor
		
		// Constructor per refer�ncia:
		Animal mushu = new Animal(dragon);
		System.out.println(mushu.toString());
		// si fem el constructor de refer�ncia copiem els valors del primer objecte "dragon" en els valors de "mushu"
		
		// Amb el toString() podem veure els valors de cada objecte i saber s� hem fet el constructor de refer�ncia correctament
		// Aix� tamb� ho podem fer amb el metode Clone(); posso un exemple:
		
		try {
			Animal draco = (Animal)dragon.clone();
			System.out.println(draco.toString());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
	
}
