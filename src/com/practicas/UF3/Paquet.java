package com.practicas.UF3;

public class Paquet {
	
	/*
	 Crear una classe de nom Paquet. Els objectes d'aquesta classe faran referència a cadascun dels paquets a entregar. 
	 Aquests paquets hauran de tenir les següents propietats i mètodes: 
	 
	 	a. nomDestinatari: String amb el nom i cognoms dels destinatari. 
		b. taquilla: identificador de la taquilla a la que haurà d'anar destinat el paquet 
		c. pes: número amb decimals que indica el pes del paquet. 
		d. dimensions: array d'enters de mida 3 que emagatzema les dimensions del paquet (alçada,  amplada i profunditat). 
		e. Constructor que rep totes les propietats abans enunciades per crear els objectes de tipus Paquet. 
		f. Procediments per modificar (sets) i per veure (gets) les propietats del Calaix (Paquet). 
	 */
	
	// PROPERTIES:
	
	String nomDestinatari;
	int idTaquilla;
	float pes;
	int dim[]; // alçada - amplada - profunditat
	
	// CONSTRUCTORS:
		
	// Constructor de totes les propietats anteriors
	Paquet(String nomDestinatari, int idTaquilla, float pes, int dim[]) {
		this.nomDestinatari = nomDestinatari;
		this.idTaquilla = idTaquilla;
		this.pes = pes;
		this.dim = dim;
	}
	
	// GETTERS - SETTERS
	public String getNomDestinatari() {
		return nomDestinatari;
	}

	public void setNomDestinatari(String nomDestinatari) {
		this.nomDestinatari = nomDestinatari;
	}

	public int getIdTaquilla() {
		return idTaquilla;
	}

	public void setIdTaquilla(int idTaquilla) {
		this.idTaquilla = idTaquilla;
	}

	public float getPes() {
		return pes;
	}

	public void setPes(float pes) {
		this.pes = pes;
	}

	public int[] getDim() {
		return dim;
	}

	public void setDim(int[] dim) {
		this.dim = dim;
	}
	
}
