package com.practicas.UF2;
import java.util.Scanner;

public class practica5 {
	
	public static void main(String[] args) {
		
		/*1. Genereu un programa que demani per pantalla un n�mero i calculi el seu factorial. Realitzeu-ho 
		 * tant de forma recursiva com sense recursivitat (feu-ho amb dues funcions diferents). 
		 * 
		 * 		a. El factorial d�un n�mero �s la multiplicaci� d�ell mateix per tots els valors enters anteriors fins arribar a 1
		 * 
	   	 *  		i. El factorial de 4 (4! matem�ticament expressat) �s 4�3�2�1, pel que ser� 24. - - - - No hace falta poner el �(1)
	   	 *  
	   	 *  HEM DE TENIR EN COMPTE QUE EL FACTORIAL DE 0! = 1 
		 */
		Scanner entrada = new Scanner(System.in);
		
		int num = demanarNumero(entrada);
		int recursivitat = factorialRecursiu(num); 
		
		System.out.println("El resultat amb recursivitat �s: " + recursivitat);
		
		int noRecursivitat = factorialNoRecursiu(num);
		System.out.println("El resultat sense recursivitat �s: " + noRecursivitat);
	}
	
	
	// Mostrar en la pantalla amb el Scanner
	public static void mostrarPantalla(String text) {
		System.out.println(text);
	}
	
	// Mostrar en pantalla y guardar el valor introdu�t
	public static int demanarNumero(Scanner entrada) {
		
		mostrarPantalla("Introdueix un n�mero per calcular el seu factoral: " );
		int eleccion = entrada.nextInt();
		return eleccion; 
	}
	
	
	//Funci� amb RECURSIVITAT
	public static int factorialRecursiu(int numeroFact) { //numeroFact �s el n�mero que introdu�rem per consola
		int resultat = 1;	
		if (numeroFact > 0) { // 0!(factorial de 0) = 1 - - - m�s petit que 0 perqu� faci 5 4 3 2 1 ... i no faci negatius
			resultat = numeroFact;
			resultat *= factorialRecursiu(numeroFact-1);  // S� numeroFact �s m�s gran que 1 multipliques resultat * (numeroFact -1)
		} 
		
		return resultat;
	} 
	
	//Funci� SENSE RECURSIVITAT == ITERATIU
	public static int factorialNoRecursiu(int numeroFact) {
		int resultat = 1; 	
			for(int i = numeroFact; i > 1; i--) { // comen�o al numero a factoritzar, fins arribar a un numero m�s gran que 1 i faig -1, per exemple: 5! = 5* 4 * 3 * 2 * 1 = 120
				
				resultat *= i; // En cada iteraci� el numeroFact ser� (numeroFact -1) i el multipliquem per l'anterior5
			}		
		return resultat;
	}
	
	/* � FOR ME: 3! = 3 * 2 * 1 = 6
	 * 1o - Necesito ir del 3 al 2, antes del 1 porque no hace falta multiplicar por 1 y ya tengo el 1 en resultat
	 * 2o - Bucle mientras no sea 1 que multiplique el numero introducido por el siguiente que ser� (n�mero -1) por lo que necesito que reste un n�mero al n�mero introducido hasta llegar al 2
	 * EJEMPLO: Con el 3, coge el 3 le resta 1, tenemos el 2, 3x2, le resta 1 al 2 y tenemos 1 (acaba el bucle) y queda 3 * 2 y resultado es 6
	 */
}
