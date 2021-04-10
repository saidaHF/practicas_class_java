package com.practicas.visibilitat;

public class VehicleExtern {
	
	// ATRIBUTS:
	
	private String marca;
	private Motor motor; // Atribut de tipus Motor anomenat motor
	
	// CONSTRUCTOR:
	VehicleExtern() {
		this.motor = new Motor(); // Hem de inicialitzar motor amb la instància/objecte Motor
	}
	
	// METHODS:
	
	// Un mètode anomenat mostraMarca que retorni el valor de l’atribut marca
	
	// He possat un mostrar() ja que és pot confondre "retornar valor" amb el return, però com la idea es mostrar la marca del vechicle ho fet de la següent manera:
	public void mostraMarca() {
		mostrar("La marca és: " + this.marca);
	}
	
	// Un mètode anomenat informaMarca, que tindrà un paràmetre d’entrada de tipus String, on guardarà la informació d’aquest paràmetre a l’atribut marca.
	public void informaMarca(String info) {
		this.marca = info;
	}
	
	// Un mètode anomenat mostraPistons que executarà la funció mostraPistons de l’atribut motor.
	public void mostraPistons() {
		motor.mostraPistons();
	}
	
	// Un mètode anomenat mostraTemps que executarà la funció mostraTemps de l’atribut motor.
	public void mostraTemps() {
		motor.mostraTemps();
	}
	
	// Un mètode anomenat informaPistons, que tindrà un paràmetre d’entrada de tipus int, i que executarà la funció informaPistons de l’atribut motor amb el paràmetre
	// d’entrada d’aquesta funció com a paràmetre d’entrada.
	public void informaPistons(int p) {
		motor.informaPistons(p);
	} 
	
	// Un mètode anomenat informaTemps, que tindrà un paràmetre d’entrada de tipus int, i que executarà la funció informaTemps de l’atribut motor amb el paràmetre
	// d’entrada d’aquesta funció com a paràmetre d’entrada.
	public void informaTemps(int t) {
		motor.informaTemps(t);
	}
		
	/*
 	Una classe interna anomenada Motor, que sigui privada. Aquesta classe haurà de tenir:
		1. Una propietat de tipus int anomenada pistons.
		2. Una propietat de tipus int anomenada temps. 
	 */
	
	// Només podem declarar una clase private dintre d'una altre classe:
	private class Motor {
		
		// ATRIBUTS:
		private int pistons;
		private int temps;
		
		// METHODS:
		
		// Un mètode anomenat mostraPistons que mostri el valor de l’atribut pistons.
		private void mostraPistons() {
			mostrar("Hi ha: " + this.pistons + " pistons");
		}
		
		// Un mètode anomenat mostraTemps que mostri el valor de l’atribut temps.
		private void mostraTemps() {
			mostrar("Té " + this.temps + " temps");
		}
		
		// Un mètode anomenat informaPistons, que tindrà un paràmetre d’entrada de tipus int, i que informarà l’atribut pistons amb el valor d’aquest paràmetre.
		private void informaPistons(int entrada) {
			motor.setPistons(entrada);
		}
		
		// Un mètode anomenat informaTemps, que tindrà un paràmetre d’entrada de tipus int, i que informarà l’atribut temps amb el valor d’aquest paràmetre.
		private void informaTemps(int entrada) {
			motor.setTemps(entrada);
		}
		
		// GETTERS & SETTERS de MOTOR:

		public void setPistons(int pistons) {
			this.pistons = pistons;
		}

		public void setTemps(int temps) {
			this.temps = temps;
		}
		
	}
	
	
	// AUX:
	
	public void mostrar(String text) {
		System.out.println(text);
	}
	
	public void mostrar(int num) {
		System.out.println(num);
	}
	
	// GETTERS & SETTERS de VehicleExtern:

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
}

