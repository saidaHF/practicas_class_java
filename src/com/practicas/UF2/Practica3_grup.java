package com.practicas.UF2;
import java.util.Scanner;

//Practica de: Rubens Avelino i Saida Humbert

/* Ex2 e.
 * i. holamon = ipkblnm
 * ii. programacio = qspfqbl!bhn
 * iii. desenvolupament = efrdmwpkvobldmu
 * iv. hipopotomonstrosesquipedaliofobia = ihqnqnunnporuqntftrvjqde!mhpgnchb
 * 
 * EX2 f.
 * i. uqtju!edq!u!udt = truitadepatates
 * ii. bqqnw!sdn!! = aprovarem??
 * iii. tjindpehghdptfhvspvfbqqnwdna? = sihocodificosegurqueaprovem!!
 * iv. ftudsmndmdjennbtunjedp = esternocleidomastoideo
 * */

public class Practica3_grup {
	
	public static void main(String[] args) {
		/* EN PARELLES. Ens demanen que generem un programa que encripti i desencripti paraules 
		 * (Strings), sense accents i en minúscules, amb les següents característiques (recordeu generar el codi de forma modular) 
		 */
		
		Scanner entrada = new Scanner(System.in);
		String frase = "";
		int opcioEscollida = opcions(entrada);
		
		switch (opcioEscollida) {
			case 1: frase = codificarText(entrada);
			break;
			case 2: frase = decodificarText(entrada);
			break;
			default: mostrar("Opció no trobada");
			break;
		}
		mostrar(frase);
		
	}
	
	//Funció 1 retorna el String de caracters dels caracters que utilitzarem
	private static String taulaCaracteres() {	
		return "abcdefghijklmnopqrstuvwxyz,.:’?!";
	}
	//Funció 2 fent servir la funció anterior taulaCaracteres() per agafar cada posició d'aquesta amb el charAt(x) i ens retorna el text codificat o descodificat
	private static String textRetornat(Scanner entrada) {
		taulaCaracteres().charAt(0);
		return entrada.next();
	}
	//Funció auxiliar: per buscar la POSICIÓ de cada caracter de la paraula o text introduït en la taula
	private static int posicio(String taulaCaracteres, char letra) {
		for (int i = 0; i < taulaCaracteres.length(); i++) { 
			if (taulaCaracteres.charAt(i) == letra) 
				return i; //si el caracter és igual a la lletra o caracter de la taula retorna aquesta posició
		}
		return -10;	//per sortir de la funció -1 perquè el bucle comença sempre de 0 cap endevant
	}
	
	//Funció auxiliar: per buscar el CARACTER de cada posició de la paraula o text introduït en la taula
	private static char caracter(String taulaCaracteres, int posicio) {
		for (int i = 0; i < taulaCaracteres.length(); i++) {
			if (i == posicio) {
				return taulaCaracteres.charAt(i); 	//recorreix la taulaCaracters i compara la posicio i amb la que introduïrem 
													// retornara el caracter d'aquella posició
			}
		}
		return '%'; //per sortir de la funció amb un caracter que no existeix a la taulaCaracteres
	} 
	
	//Funció del Scanner MOSTRAR
	private static void mostrar(String text) {
		System.out.println(text);
	}
	
	//Funció de OPCIONS
	private static int opcions(Scanner entrada) {
		mostrar("1-Codificar missatge" );
		mostrar("2-Decodificar missatge");
		int eleccion = entrada.nextInt();
		return eleccion; 
	}
	
	/* Funció 3 CODIFICAR
	  Aquesta funció codificara els missatges, funciona tal que el primer caracter li sumem +1 i a partir del següent caracter cap endevant:
	  PARELL: +1 IMPARELL: -1 */
	public static String codificarText(Scanner entrada) {
		mostrar("Escriu una frase per a codificar: ");
		String textIntro = textRetornat(entrada); //guardem el text introduït
		String codificat = "";
		String taulaCaracteres = taulaCaracteres(); // utilitzem la funció anterior per utilitzar la cadena de Strings
		boolean posicioActual = false;
		boolean parell = false;
		
		for (int i = 0; i < textIntro.length(); i++) {
			
			int posicio = posicio(taulaCaracteres, textIntro.charAt(i)); // Agafa de la taulaCaracteres el caracter de la posicio i
			
			if (posicio == -10) {
				return "Caracter no trobat";
			} else if (posicio % 2 == 0) { // si es pot dividir entre 2 és parell
				posicioActual = true;
			} else { 
				posicioActual = false;
			}
			//Aquest if veura si es parell o imparell per saber si s'ha de restar o sumar posicions en la taula de caracters
			if (i == 0) {
				posicio += 1; //la primera posició [0] sempre es suma +1
			} else {
				if (parell) { //sí parell es false vol dir que es imparell i resta
					posicio += 1; 
				} else { 
					posicio -= 1; //si parell és true, vol dir que es parell i suma
				}
			}
				parell = posicioActual; // Aquesta línea guarda el resultat (true o false) de la posicioActual en parell (que serà la posició d'abans) perquè pogui comparar en la següent iteració
				
				if (posicio >= taulaCaracteres.length()) { // Per reiniciar i tornar a contar desde la "a" la taula de caracteres
					posicio = 0;
				}  else if (posicio < 0) {
					posicio = taulaCaracteres.length() - 1;
				}
				codificat += caracter(taulaCaracteres, posicio);
		}
		
		return codificat; //la paraula o text codificat
			
	}	
	// Funcio 4 DECODIFICAR - és el mateix que a la funcio codificar pero canviem el resultat quan es parell o imparell (el 2nd if)
	public static String decodificarText(Scanner entrada) {
		
		mostrar("Escriu una frase per a decodificar: ");
		String textIntro = textRetornat(entrada); //guardem el text introduït
		String decodificat = "";
		String taulaCaracteres = taulaCaracteres();
		boolean posicioActual = false;
		boolean parell = false;
		
		for (int i = 0; i < textIntro.length(); i++) {
			int posicio = posicio(taulaCaracteres, textIntro.charAt(i));
			if (posicio == -10) {
				return "Caracter no trobat";
			}
			//2nd if: 
			if (posicio % 2 == 0) { 
				posicioActual = true;
			} else {
				posicioActual = false;
			}
			
			if (i == 0) {
				posicio -= 1;
			} else {
				if (parell) { //false
					posicio += 1;	
				} else {
					posicio -= 1;
				}
			}
			
			parell = posicioActual;
			
			if (posicio >= taulaCaracteres.length()) {
				posicio = 0;
			} else if (posicio < 0) {
				posicio = taulaCaracteres.length() - 1; //el tamany de la taulaCaracteres -1 per agafar la ultima posició
			}
			
			decodificat += caracter(taulaCaracteres, posicio);
		}
			
		return decodificat;
	}
	 
}
