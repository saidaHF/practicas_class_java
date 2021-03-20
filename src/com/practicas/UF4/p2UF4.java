package com.practicas.UF4;

import java.util.Random;
import java.util.Scanner;

public class p2UF4 {
	
	/* 
	a. Llisteu quins objectes hi ha generats i a quina classe pertany cadascun.
	
		OBJECTES: 
	
		p2UF4 objectePractica4 = new p2UF4();
		classe: p2UF4
		
		Scanner sc = new Scanner(System.in);
		classe: Scanner paquet java.util
		
		Random rand = new Random();
		classe: Random paquet java.util
	
	b. Les funcions que hi ha declarades en aquesta classe, les hem invocat a trav�s de la instanciaci� d�un objecte? Justifiqueu la resposta 
	del perqu� hi ha algunes que si i d�altres que no.
	
		Si
	
	c. Quines llibreries hem importat? Per poder utilitzar les diferents funcions d�aquestes
	llibreries, hem hagut d�instanciar algun objecte? Detalleu-los i justifiqueu el perqu�
	necessitem instanciar un objecte per utilitzar les funcions.
	 */
	// Funci� principal del programa
	public static void main(String[] args) {
		
		// Generem els dos vectors que utilitzaran la baralla de cartes
		String[] pals = {"Or", "Bastos", "Espases", "Copes"};
		int[] numeros = {1,2,3,4,5,6,7,10,11,12};
		
		// Demanem els noms dels jugadors
		missatgeNom(1);
		String j1 = llegirParaula();
		missatgeNom(2);
		String j2 = llegirParaula();

		// Generem els n�meros a l'atzar
		p2UF4 objectePractica4 = new p2UF4();
		int numeroJ1 = numeros[objectePractica4.numeroAtzar(10)];
		String palJ1 = pals[objectePractica4.numeroAtzar(4)];
		int numeroJ2 = numeros[objectePractica4.numeroAtzar(10)];
		String palJ2 = pals[objectePractica4.numeroAtzar(4)];
		
		// Comparem les cartes
		if (numeroJ1 == numeroJ2) System.out.println("Hi ha un empat entre el jugador " + j1 + " i el jugador "+ j2);
		else if (numeroJ1 > numeroJ2) System.out.println("La carta del jugador " + j1 + " �s un " + numeroJ1 + " de " + palJ1 + " i guanya al " + numeroJ2 + " de " + palJ2 + " del jugador " + j2);
		else System.out.println("La carta del jugador " + j2 + " �s un " + numeroJ2 + " de " + palJ2 + " i guanya al " + numeroJ1 + " de " + palJ1 + " del jugador " + j1);
	}
	
	// Funci� que llegeix una paraula per pantalla
	public static String llegirParaula()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	// Funci� que retorna un n�mero a l'atzar donat un valor m�xim. Aquest n�mero anir� des de 0 fins a valor m�xim -1
	public int numeroAtzar(int valors)
	{
		Random rand = new Random();
		return rand.nextInt(valors);
	}
	
	// Funci� que mostra per pantalla el literal per introduir el n�mero de jugador
	public static void missatgeNom(int nJugador)
	{
		System.out.println("Introdueixi el nom  del jugador " + nJugador);
	}
	

}