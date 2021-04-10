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
	
	b. Les funcions que hi ha declarades en aquesta classe, les hem invocat a través de la instanciació d’un objecte? Justifiqueu la resposta 
	del perquè hi ha algunes que si i d’altres que no.
	
		No totes, només les que no tenen el static, com llegir paraula o missatge nom per aixó pot posar-lo directament: 
		
		missatgeNom(1);
		String j1 = llegirParaula();
		
		En comptes numeroAtzar(); al no ser static ha de instanciar-lo:
		
		int numeroJ1 = numeros[objectePractica4.numeroAtzar(10)];
	
	c. Quines llibreries hem importat? Per poder utilitzar les diferents funcions d’aquestes llibreries, hem hagut d’instanciar algun objecte? 
	Detalleu-los i justifiqueu el perquè necessitem instanciar un objecte per utilitzar les funcions.
	
			Llibreria: import java.util.Random                   |     import java.util.Scanner
			objecte: Scanner sc = new Scanner(System.in)         |     Random rand = new Random()
		
		Perquè les sevenes funcions com ara nextLine, no són static
		
		 
	4. Modifiqueu el funcionament del joc perquè es pugui jugar més d’una ronda. Haureu de:
	
				a. Demanar el nombre de rondes a jugar.
				b. Fer una comparació de les cartes de cada ronda.
				c. Fer un comptador que emmagatzemi quantes rondes ha guanyat cada jugador.
				d. Mostrar per pantalla, al final de la partida, quin jugador ha guanyat més rondes (o si hi ha hagut un empat).
				e. Detalleu tots els objectes que heu hagut de generar, a quina classe pertànyen i quines funcions heu hagut de cridar. Per les funcions, 
				detalleu també si heu hagut d’instanciar un objecte per cridar-les o no.
				
				RESPOSTA: he utilitzat el objecte Scanner entrada de la classe Scanner i he cridat a les mateixes funcions que ja teniem, a més d'una nova que he afegit
				la funció mostrar per veure els resultats i una funció per demanar i guardar el nombre de rondes que voliem fer.
			
	 */
	
	// Funció principal del programa
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		// Demanem els noms dels jugadors
					missatgeNom(1);
					String j1 = llegirParaula();
					missatgeNom(2);
					String j2 = llegirParaula();
	
		int vegades = demanarVegades(entrada);
		
		int contadorEmpat = 0;
		int contadorJ1 = 0;
		int contadorJ2 = 0;
		
		// Generem els dos vectors que utilitzaran la baralla de cartes
		String[] pals = {"Or", "Bastos", "Espases", "Copes"};
		int[] numeros = {1,2,3,4,5,6,7,10,11,12};
		
		
		// farem el següent fins que no cumpli la condició del while
		do {
	
			// Generem els números a l'atzar
			p2UF4 objectePractica4 = new p2UF4();
			int numeroJ1 = numeros[objectePractica4.numeroAtzar(10)];
			String palJ1 = pals[objectePractica4.numeroAtzar(4)];
			int numeroJ2 = numeros[objectePractica4.numeroAtzar(10)];
			String palJ2 = pals[objectePractica4.numeroAtzar(4)];
			
			// Comparem les cartes
			if (numeroJ1 == numeroJ2) {
				contadorEmpat++; // empat+1
			} else if (numeroJ1 > numeroJ2) 
				contadorJ1++; // guanya el J1 +1
			else contadorJ2++; // guanya el J2 +1
				
			vegades--; // restem 1 a la variable així queda una ronda menys
			
		} while (vegades != 0); // fins acabar amb les rondes demanades
		
		// al finalitzar les rondes comproben qui guanya:
		
		if (contadorJ1 > contadorJ2) {
			mostrar("El jugador " + j1 + " ha guanyat amb un total de " + contadorJ1);
		} else if (contadorJ1 == contadorJ2) {
			mostrar("Els jugadors han empatat en rondes");
		} else 
			mostrar("El jugador " + j2 + " ha guanyat amb un total de " + contadorJ2);
		
		mostrar("El jugador " + j1 + " ha guanyat " + contadorJ1 + " vegades, el jugador " + j2 + " ha guanyat " + contadorJ2 + " vegades i ha hagut un total de " + contadorEmpat + " empats.");
	}
	
	
	// METHODS:
	
	// Funció que llegeix una paraula per pantalla
	public static String llegirParaula()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	// Funció que retorna un número a l'atzar donat un valor màxim. Aquest número anirà des de 0 fins a valor màxim -1
	public int numeroAtzar(int valors)
	{
		Random rand = new Random();
		return rand.nextInt(valors);
	}
	
	// Funció que mostra per pantalla el literal per introduir el número de jugador
	public static void missatgeNom(int nJugador)
	{
		System.out.println("Introdueixi el nom  del jugador " + nJugador);
	}
	// funcio per mostrar un text
	public static void mostrar(String text) {
		System.out.println(text);
	}
	// funcio per demanar les vagades que  volem jugar
	public static int demanarVegades(Scanner entrada) {
		mostrar("Introdueix el nombre de rondes: ");		
		return entrada.nextInt();
	}
	

}