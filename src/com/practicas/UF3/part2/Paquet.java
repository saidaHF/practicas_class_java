package com.practicas.UF3;

import java.util.Arrays;

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
	int idTaquilla;
	String nomDestinatari;
	float pes;
	int dim[]; // alçada - amplada - profunditat
	int volum;
	
	// CONSTRUCTORS:
	// Constructor per poder agafar l'String de l'arxiu
	// Taquilla;Destinatari;pes;alcada;amplada;profunditat
	Paquet(String idTaquilla, String nomDestinatari, String pes, String alcada, String amplada, String profunditat) {
		this.nomDestinatari = nomDestinatari;
		this.idTaquilla = Integer.valueOf(idTaquilla);
		this.pes = Float.valueOf(pes.replaceAll(",", ".")); // canviem la , per un . perquè pogui agafar el float
		this.dim = new int[3];
		this.dim[0] = Integer.valueOf(alcada);
		this.dim[1] = Integer.valueOf(amplada);
		this.dim[2] = Integer.valueOf(profunditat);
		this.volum = Utils.calcularVolum(this.dim);
	}
		
	// Constructor de totes les propietats anteriors
	Paquet(String nomDestinatari, int idTaquilla, float pes, int dim[]) {
		this.nomDestinatari = nomDestinatari;
		this.idTaquilla = idTaquilla;
		this.pes = pes;
		this.dim = dim;
		this.volum = Utils.calcularVolum(this.dim);
	}
	
	public String retornaValorsArxiu() {
		return this.idTaquilla + ";" + this.nomDestinatari + ";" + String.valueOf(this.pes).replaceAll("\\.", ",") + ";" + this.dim[0] + ";" + this.dim[1] + ";" + this.dim[2] + "\n";				
	}
	
	// GETTERS - SETTERS

	public int getIdTaquilla() {
		return idTaquilla;
	}

	public void setIdTaquilla(int idTaquilla) {
		this.idTaquilla = idTaquilla;
	}

	public String getNomDestinatari() {
		return nomDestinatari;
	}

	public void setNomDestinatari(String nomDestinatari) {
		this.nomDestinatari = nomDestinatari;
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

	public int getVolum() {
		return volum;
	}

	public void setVolum(int volum) {
		this.volum = volum;
	}
	
	@Override
	public String toString() {
		return "Paquet [idTaquilla=" + idTaquilla + ", nomDestinatari=" + nomDestinatari + ", pes=" + pes + ", dim="
				+ Arrays.toString(dim) + "]";
	}
	
}
