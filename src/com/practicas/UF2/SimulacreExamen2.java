package com.practicas.UF2;

import java.util.Scanner;

public class SimulacreExamen2 {
	
	public static void main(String[] args) {
		/* 3. Feu un programa que, donat dos n�meros (demanats per pantalla amb les indicacions adients), realitzi el seg�ent: 
		 *      Agafar el primer nombre i sumar tots els seg�ents nombres enters fins a sumar tants nombres com haguem especificat al segon nombre. 
		 *       Per exemple:
		 *			1. Si introdu�m 2 i 3, sumarem els nombres 2+3+4 = 9
		 *			2. Si introdu�m 5 i 4, sumarem els nombres 5+6+7+8 = 26
		 */	
		
		Scanner entrada = new Scanner(System.in);
		mostrar("Sense recursivitat la suma �s: " + sumaSinRec(entrada));
		mostrar("Amb recursivitat la suma �s: " + sumaRec(entrada));
	}
	
	//SENSE RECURSIVITAT:
	
	public static int sumaSinRec(Scanner entrada) {
		//num 1 �s el numero on comen�a
		//num 2 �s la quantitat de numeros que sumar�
		
		int num1 = demanarNum1(entrada);
		int num2 = demanarNum2(entrada);
		
		int contador = 0;
		int resultat = 0;
		
		for (int i = num1; contador < num2; i++ ) {
			contador++;
			resultat += i;
		} 		
		return resultat;
	}
	
	// AMB RECURSIVITAT: 
	
	//funci� per demanar els numeros per pantalla
	public static int sumaRec(Scanner entrada) {
		int num1 = demanarNum1(entrada);
		int num2 = demanarNum2(entrada);
		return calcularSumaRec(num1, num2, 1, 0); //aqui contador �s 1 perqu� ja s'ha cridat una vegada en aquesta funci� sumaRec i
												  //acumulador �s 0 per la primera vegada que sumi inici a la funci� calcularSumaRec comen�i en 0
	}
	
	//inici �s num1, quantitat �s num2, contador �s la quantitat de vegades que es crida la funci�, a acumulador li sumem inici 
	public static int calcularSumaRec(int inici, int quantitat, int contador, int acumulador) { 
		
		acumulador += inici;
		if (quantitat == contador) { //quan quantitat (introdu�da) sigui igual al contador de vegades que s'ha fet la funci� s'aturi la iteraci�
			return acumulador;		 // retorna la suma dels numeros
		}		
		return calcularSumaRec(inici + 1, quantitat, contador + 1, acumulador);  // inici +1 y contador +1 cada vegada que es cridi la funci� perqu� conti 
																				 // els numeros seg�ents.
	}
	
	public static void mostrar(String text) {
		System.out.println(text);
	}
	
	public static int demanarNum1(Scanner entrada) {
		mostrar("Introdueixi el n�mero on vol comen�ar a sumar: ");		
		return entrada.nextInt();
	}
	
	public static int demanarNum2(Scanner entrada) {
		mostrar("Introdueixi el n�mero de vegades que vol que el programa sumi a partir del n�mero anterior: ");		
		return entrada.nextInt();
	}
}
