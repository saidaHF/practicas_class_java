package com.practicas.visibilitat;

public class VehicleExtern {
	
	// ATRIBUTS:
	
	private String marca;
	private Motor motor; // Atribut de tipus Motor anomenat motor
	
	// CONSTRUCTOR:
	VehicleExtern() {
		this.motor = new Motor(); // Hem de inicialitzar motor amb la inst�ncia/objecte Motor
	}
	
	// METHODS:
	
	// Un m�tode anomenat mostraMarca que retorni el valor de l�atribut marca
	
	// He possat un mostrar() ja que �s pot confondre "retornar valor" amb el return, per� com la idea es mostrar la marca del vechicle ho fet de la seg�ent manera:
	public void mostraMarca() {
		mostrar("La marca �s: " + this.marca);
	}
	
	// Un m�tode anomenat informaMarca, que tindr� un par�metre d�entrada de tipus String, on guardar� la informaci� d�aquest par�metre a l�atribut marca.
	public void informaMarca(String info) {
		this.marca = info;
	}
	
	// Un m�tode anomenat mostraPistons que executar� la funci� mostraPistons de l�atribut motor.
	public void mostraPistons() {
		motor.mostraPistons();
	}
	
	// Un m�tode anomenat mostraTemps que executar� la funci� mostraTemps de l�atribut motor.
	public void mostraTemps() {
		motor.mostraTemps();
	}
	
	// Un m�tode anomenat informaPistons, que tindr� un par�metre d�entrada de tipus int, i que executar� la funci� informaPistons de l�atribut motor amb el par�metre
	// d�entrada d�aquesta funci� com a par�metre d�entrada.
	public void informaPistons(int p) {
		motor.informaPistons(p);
	} 
	
	// Un m�tode anomenat informaTemps, que tindr� un par�metre d�entrada de tipus int, i que executar� la funci� informaTemps de l�atribut motor amb el par�metre
	// d�entrada d�aquesta funci� com a par�metre d�entrada.
	public void informaTemps(int t) {
		motor.informaTemps(t);
	}
		
	/*
 	Una classe interna anomenada Motor, que sigui privada. Aquesta classe haur� de tenir:
		1. Una propietat de tipus int anomenada pistons.
		2. Una propietat de tipus int anomenada temps. 
	 */
	
	// Nom�s podem declarar una clase private dintre d'una altre classe:
	private class Motor {
		
		// ATRIBUTS:
		private int pistons;
		private int temps;
		
		// METHODS:
		
		// Un m�tode anomenat mostraPistons que mostri el valor de l�atribut pistons.
		private void mostraPistons() {
			mostrar("Hi ha: " + this.pistons + " pistons");
		}
		
		// Un m�tode anomenat mostraTemps que mostri el valor de l�atribut temps.
		private void mostraTemps() {
			mostrar("T� " + this.temps + " temps");
		}
		
		// Un m�tode anomenat informaPistons, que tindr� un par�metre d�entrada de tipus int, i que informar� l�atribut pistons amb el valor d�aquest par�metre.
		private void informaPistons(int entrada) {
			motor.setPistons(entrada);
		}
		
		// Un m�tode anomenat informaTemps, que tindr� un par�metre d�entrada de tipus int, i que informar� l�atribut temps amb el valor d�aquest par�metre.
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

