package com.practicas.UF3;
import java.util.Arrays;

public class Calaix {
	
/*
	 Crear una classe de nom Calaix. Els objectes d'aquesta classe faran refer�ncia a cadascun dels  calaixos d'una determinada taquilla. 
	 Aquests calaixos hauran de tenir les seg�ents propietats i  m�todes: 
	 
		a. Fila de la Taquilla a la que es troba. Aquesta fila estar� identificada per una lletra maj�scula  ('A', 'B', ...). 
		b. Columna de la Taquilla a la que es troba: Aquesta columna vindr� identificada per un n�mero (1, 2, 3, ...).  
		c. Un array d'enters de dimensi� 3 que emmagatzemar� les dimensions en cm del Calaix (al�ada, amplada i profunditat). 
		d. Un objecte de tipus Paquet a on emmagatzemar el paquet desat al calaix. 
		e. Un boole� que indicar� si el Calaix est� o no ocupat (un false indicar� que est� lliure i un  true que est� ocupat). 
		f. Procediments per modificar (sets) i per veure (gets) les propietats del Calaix.
 */
	
	// PROPERTIES
	char fila;
	int col;
	int dim[]; // al�ada, amplada, profunditat
	Paquet paquet;
	boolean calaixOcupat; // false lliure, true ocupat
	int volum;
	
	// CONSTRUCTOR:
	// Edito aquest constructor per poder-lo adaptar als fitxers amb els tipus de les variables correctes, ja que entren com Strings:
	public Calaix(String fila, String col, String alcada, String amplada, String profunditat) {	
		this.fila = fila.charAt(0);
		this.col = Integer.valueOf(col); 
		this.dim = new int[3];
		this.dim[0] = Integer.valueOf(alcada);
		this.dim[1] = Integer.valueOf(amplada);
		this.dim[2] = Integer.valueOf(profunditat);
		this.paquet = null; 
		this.calaixOcupat = false; 
		this.volum = Utils.calcularVolum(this.dim);
	}
	
	public Calaix(char fila, int col, int[] dim) {	
		this.fila = fila; 
		this.col = col; 
		this.dim = dim;
		this.paquet = null; 
		this.calaixOcupat = false; 
		this.volum = Utils.calcularVolum(this.dim);
	}
	
	// Constructor paquet i calaix que t� tots els atributs:
	public Calaix(char fila, int col, int[] dim, Paquet paquet, boolean calaixOcupat) {
		this.fila = fila;
		this.col = col;
		this.dim = dim;
		this.paquet = paquet;
		this.calaixOcupat = calaixOcupat;
	}
	
	// METHODS:
	// metode per mostrar l'estat del calaix
	public void mostraEstat() {	
		String estat = "El calaix " + this.fila + this.col + " est� ";
		if (this.calaixOcupat) {
			estat += "ocupat i el paquet va destinat a " + this.getPaquet().getNomDestinatari();
		} else {
			estat += "lliure";
		}
		System.out.println(estat);
	}
	
	// A en ASCII �s 65, 65-65 = 0 (aix� tenim la posici� 0) 
	public int getFilaTaquilla() {
		return this.fila - 65;
	}
	// Restem 1 per tenir la posicci� correcta
	public int getColTaquilla() {
		return this.col - 1;
	}
	
	// GETTERS AND SETTERS:	
	public char getFila() {
		return fila;
	}

	public void setFila(char fila) {
		this.fila = fila;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int[] getDim() {
		return dim;
	}

	public void setDim(int[] dim) {
		this.dim = dim;
	}

	public Paquet getPaquet() {
		return paquet;
	}

	public void setPaquet(Paquet paquet) {
		this.paquet = paquet;
	}

	public boolean isCalaixOcupat() {
		return calaixOcupat;
	}

	public void setCalaixOcupat(boolean calaixOcupat) {
		this.calaixOcupat = calaixOcupat;
	}
	
	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}

	@Override
	public String toString() {
		return "Calaix [fila=" + fila + ", col=" + col + ", dim=" + Arrays.toString(dim) + ", paquet=" + paquet
				+ ", calaixOcupat=" + calaixOcupat + ", getFila()=" + getFila() + ", getCol()=" + getCol()
				+ ", getDim()=" + Arrays.toString(getDim()) + ", getPaquet()=" + getPaquet() + ", isCalaixOcupat()="
				+ isCalaixOcupat() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
