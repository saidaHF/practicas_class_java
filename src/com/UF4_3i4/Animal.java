package com.UF4_3i4;
import java.util.Scanner;


public class Animal implements Cloneable {
	
	// ATRIBUTS:
	private float high;
	private float width;
	private float profunditat;
	private int potes;
	private String nom;
	private int x;
	private int y;
	// He afegit salut i un booleá per saber si es viu o mort
	private int health;
	private boolean isAlive;
	
	// CONSTRUCTORS:
	
	// Constructor per defecte, donem valors de defecte en 1 a les posicions i 3 per la salut, la vida comença en true
	public Animal() {
		this.x = 1;
		this.y = 1;
		this.health = 3; 
		this.isAlive = true; 
	}
	
	// Constructor EXERCICI 2:
	public Animal(float high, float width, float profunditat, int potes, String nom, int x, int y, int health, boolean isAlive) {
		this.high = high;
		this.width = width;
		this.profunditat = profunditat;
		this.potes = potes;
		this.nom = nom;
		this.x = x;
		this.y = y;
		this.health = health;
		this.isAlive = isAlive;
	}
	
	/*
		 Genereu un constructor amb paràmetres i un constructor per referència per la classe Animal generada a l’exercici 1. 
		 Feu la prova de generar un objecte amb el constructor per defecte. Què passa? Justifiqueu la resposta. Genereu ara el constructor per defecte 
		 i torneu a fer la prova... Què passa ara?
	 */
	
	// Constructor per referència:
	
	public Animal(Animal animal) {
		this.high = animal.getHigh();
		this.width = animal.getWidth();
		this.profunditat = animal.getProfunditat();
		this.potes = animal.getPotes();
		this.nom = animal.getNom();
		this.x = animal.getX();
		this.y = animal.getY();
		this.health = animal.getHealth();
		this.isAlive = animal.isAlive();
	}

	// METHODS:
	
	// i. Moure l’animal: canviar la posició de l’animal movent-lo 1 unitat en x i en y.

	// Amb aquesta funció podem sumar 1 a qualsevol posició que volguem i retornem la posició + 1 (Exemple: posició 5, 5 + 1 = 6, retorna 6)
	
	public void moureAnimal() {
		
		if (this.isAlive) {
			this.x = x + 1;
			this.y = y + 1;
		}
		this.mostrarPosicio();
	}
	
	// ii. Mostrar posició: mostrar la posició de l’animal.
	
	// Ens mostrará la posició x i y de l'animal
	
	private void mostrarPosicio() {
		
		if (this.isAlive) {
			this.mostrar("El/La " + this.nom + " esta en la posició (" + this.x + ", " + this.y + ")");
		} else { 
			this.mostrar("El/La " + this.nom + " ha mort en la posició (" + this.x + ", " + this.y + ")");
		}
	}
	
	// Metode per saber si l'animal és gran, mitja o petit multiplican l'altura amb l'amplada:
	
	public void mida() {
		
		float mida = this.high * this.width;
		String size = "és petit";
		
		if (mida > 20) {
			size = "és gran";
		} else if (mida == 10) {
			size = "és mitja";
		}
		this.mostrar("El/la " + this.nom + " " + size);
	}
	
	// Funció per fer dany a l'animal, resta la quantitat de dany que pasem per parametre
	
	public void takeDamage(int damage) {
		
		if (this.isAlive) {
			this.health -= damage;
			this.health = this.health > 0 ? this.health : 0;
			this.mostrar("El/la " + this.nom + " ha rebut " + damage + " punt de dany i ara te " + this.health + " punts de vida.");
			this.checkState(); // False o True només quan rep dany i esta viu, sí es mort no entra al if
			this.mostrarEsViu();
		}		
	}
	
	// Funció que ens mostra l'estat de vida de l'animal
	public void mostrarEsViu() {
		
		String estat = this.isAlive ? "viu" : "mort";
		this.mostrar("El/la " + this.nom + " esta " + estat);
	}
	
	// Funció per calcular si l'animal esta viu o mort
	public void checkState() {
		this.isAlive = (this.health > 0); // Retorna sí la condicció es true o false
	} 
	
	// AUX:
	
	public void mostrar(String text) {
		System.out.println(text);
	}
	
	// funció per demanar les dades de l'animal:
	
	public void demanarDades() {
		Scanner scanner = new Scanner(System.in);
		
		this.mostrar("Introdueix l'altura: ");
		this.high = scanner.nextFloat();
		
		this.mostrar("Introdueix l'amplada: ");
		this.width = scanner.nextFloat();
		
		this.mostrar("Introdueix la profunditat: ");
		this.profunditat = scanner.nextFloat();
		
		this.mostrar("Introdueix l'altura la quantitat de potes: ");
		this.potes = scanner.nextInt();
		
		this.mostrar("Introdueix el nom de l'animal: ");
		this.nom = scanner.next();
		
		this.mostrar("Introdueix la posició X: ");
		this.x = scanner.nextInt();
		
		this.mostrar("Introdueix la posició Y: ");
		this.y = scanner.nextInt();
		
		scanner.close();
	}
	

	// SETTERS / GETTERS:

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getProfunditat() {
		return profunditat;
	}

	public void setProfunditat(float profunditat) {
		this.profunditat = profunditat;
	}

	public int getPotes() {
		return potes;
	}

	public void setPotes(int potes) {
		this.potes = potes;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	// Quan es un booleá es posa is per bones practiques, ja ho detecta el programa quan crea els getters:
	public boolean isAlive() { 
		return isAlive;
	}
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	
	@Override
	public String toString() {
		return "Animal [high=" + this.high + ", width=" + this.width + ", profunditat=" + this.profunditat + ", potes=" + this.potes
				+ ", nom=" + this.nom + ", x=" + this.x + ", y=" + this.y + ", health=" + this.health + ", isAlive=" + this.isAlive + "]";
	}
	
	// implementar el clone() i afegim el implement en el nom de la classe:
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  
		
}
