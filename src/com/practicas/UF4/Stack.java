package com.practicas.UF4;

public class Stack {
	
	// propiertes
	
	private int top = -1;
	private int [] pila = new int[5];
	
	// methods
	
	public void push (int valor) {
		// No pot afefir més numeros sí es major de 4 perqué ja esta ple l'array (0 1 2 3 4) quan val 4 ja no és pot guardar ja esta ple
		if (top < 4) {
			top++;
			this.pila[this.top] = valor;
			} else {
				System.out.println("La pila esta plena");
			}
	}
	
	// solo muestra
	int peek () {
		return this.pila[top];
	}
	
	public int pop () {
		if (top > -1) { // major que -1 perquè si no esta buit
			int a = pila[top];
			top--;// restem una posició per poder tornar a omplir la posició més alta ocupada
			return a; //retornen l'ultima posició de la pila
		}	
		return -1; // -1 és el valor d'error
	}
	
	void display() {
		for (int valor: this.pila) {
			System.out.println(valor + "");
		}
		System.out.println("");
	} 
	
}
