package com.practicas.UF2;

import java.util.Scanner;

public class SimulacreExamen2 {
	
	public static void main(String[] args) {
		/* 3. Feu un programa que, donat dos números (demanats per pantalla amb les indicacions adients), realitzi el següent: 
		 *      Agafar el primer nombre i sumar tots els següents nombres enters fins a sumar tants nombres com haguem especificat al segon nombre. 
		 *       Per exemple:
		 *			1. Si introduïm 2 i 3, sumarem els nombres 2+3+4 = 9
		 *			2. Si introduïm 5 i 4, sumarem els nombres 5+6+7+8 = 26
		 */	
		
		Scanner entrada = new Scanner(System.in);
		mostrar("Sense recursivitat la suma és: " + sumaSinRec(entrada));
		mostrar("Amb recursivitat la suma és: " + sumaRec(entrada));
	}
	
	//SENSE RECURSIVITAT:
	
	public static int sumaSinRec(Scanner entrada) {
		//num 1 és el numero on comença
		//num 2 és la quantitat de numeros que sumará
		
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
	
	//funció per demanar els numeros per pantalla
	public static int sumaRec(Scanner entrada) {
		int num1 = demanarNum1(entrada);
		int num2 = demanarNum2(entrada);
		return calcularSumaRec(num1, num2, 1, 0); //aqui contador és 1 perquè ja s'ha cridat una vegada en aquesta funció sumaRec i
												  //acumulador és 0 per la primera vegada que sumi inici a la funció calcularSumaRec començi en 0
	}
	
	//inici és num1, quantitat és num2, contador és la quantitat de vegades que es crida la funció, a acumulador li sumem inici 
	public static int calcularSumaRec(int inici, int quantitat, int contador, int acumulador) { 
		
		acumulador += inici;
		if (quantitat == contador) { //quan quantitat (introduïda) sigui igual al contador de vegades que s'ha fet la funció s'aturi la iteració
			return acumulador;		 // retorna la suma dels numeros
		}		
		return calcularSumaRec(inici + 1, quantitat, contador + 1, acumulador);  // inici +1 y contador +1 cada vegada que es cridi la funció perqué conti 
																				 // els numeros següents.
	}
	
	public static void mostrar(String text) {
		System.out.println(text);
	}
	
	public static int demanarNum1(Scanner entrada) {
		mostrar("Introdueixi el número on vol començar a sumar: ");		
		return entrada.nextInt();
	}
	
	public static int demanarNum2(Scanner entrada) {
		mostrar("Introdueixi el número de vegades que vol que el programa sumi a partir del número anterior: ");		
		return entrada.nextInt();
	}
}
