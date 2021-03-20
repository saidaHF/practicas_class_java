package com.practicas.UF4;

public class Stack {
	
	// propiertes
	
	private int top = -1;
	private int [] pila = new int[5];
	
	// methods
	
	public void push (int valor) {
		// No pot afefir m�s numeros s� es major de 4 perqu� ja esta ple l'array (0 1 2 3 4) quan val 4 ja no �s pot guardar ja esta ple
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
		if (top > -1) { // major que -1 perqu� si no esta buit
			int a = pila[top];
			top--;// restem una posici� per poder tornar a omplir la posici� m�s alta ocupada
			return a; //retornen l'ultima posici� de la pila
		}	
		return -1; // -1 �s el valor d'error
	}
	
	void display() {
		for (int valor: this.pila) {
			System.out.println(valor + "");
		}
		System.out.println("");
	} 
	
}
