package com.practicas.UF4;



class EnterPositiu {
	// propietats
	
	int x; // private int x;  // si �s PRIVATE no et deixa accedir-hi
	
	
	// m�todes
	
	// set per introdu�r un valor:
	void set(int valor) {
		if (valor >= 0) { 
		x = valor;
		}
	}
	
	// per veure la info:
	int get() {
		return x;
	}
}

public class Exemple1_objectes {
	
	public static void main(String[] args) { 
	
		EnterPositiu en1 = new EnterPositiu(); // El constructor t� el mateix nom que la classe
		
		en1.set(100); // Per l'objecte en1 posar� valor 100 (a la x)
		System.out.println(en1.get()); // retorna 100
		en1.set(-50);
		System.out.println(en1.get()); // retorna 100 perqu� com es negatiu (-50) segueix guardant 100
		en1.x = -50;
		System.out.println(en1.get()); // T� una porta oberta per obviar el if dintre del "set", al ser int x public
		                               // per� podem declarar la x com private i aleshores no es visible i no es pot accedir, "CAJA NEGRA"
		
	}
	
	
	
}
