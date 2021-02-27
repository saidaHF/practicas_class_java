package com.practicas.UF1;
import java.util.Scanner;

public class Practica12 {
	
	public static void main(String[] args) {
		
		/* 1. Mostra els números de l’1 al 100 que siguin divisibles per 2, per 3 i per 2 i per 3 (els que mostri ha d’especificar per quin dels dos números, 
		 * o pels dos, són divisibles) 
		 * 			a. Per exemple:
		 * 					i. 2 és divisible per 2
		 * 					ii. 3 és divisible per 3
		 * 					iii. 6 és divisible per 2 i per 3
		 */
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 3 == 0) {
				System.out.println(i + " és divisible per 2 i per 3");
			} else if (i % 2 == 0) {
				System.out.println(i + " és divisible per 2");
			} else if (i % 3 == 0) {
				System.out.println(i + " és divisibles per 3");
			}
		}
		
		System.out.println();
		
		/* 2. Separeu la frase «Institut l’Estatut, Desenvolupament d’Aplicacions Multiplataforma en paraules i mostreu-les una a una a una línia nova:
		 * 			a. Per dividir un string en diferents strings, utilitzeu la funció String.split(caràcter_separació)
		 */
		
		String frase = "Institut l’Estatut, Desenvolupament d’Aplicacions Multiplataforma";
		
		String[] separacio = frase.split(" "); //separem per espais " ", 
		
		for (String salida : separacio) { //mostrem cada part del array separació (recorreix cada posició),
			System.out.println(salida); // ho retorna separat per espais gracies a la funcio String.split
		}
		
		System.out.println();
		
		// FOR EACH: “Para cada elemento del tipo TipoARecorrer(salida, és un String) que se encuentre dentro de la array nombreDeLaArray (separació) ejecuta las 
		// instrucciones que se indican (system.out.println de "salida") la variable temporal(salida) solo existe dentro del FOR EACH”.
	
	
	/* 3. Genereu un algorisme que avaluï si un número és una permutació d’un altre.
	 * 		a. Un número és una permutació d’un altre si té les mateixes xifres en el mateix ordre o en un ordre diferent:
	 * 			i. EXEMPLE: Els números permutats del número 123 són:
	 * 				1. 123
	 * 				2. 132
	 * 				3. 231
	 * 				4. 213
	 * 				5. 321
	 * 				6. 312
	 */
		
		Scanner entrada = new Scanner(System.in);

		//demanem els numeros a comparar.
		System.out.println("Introdueix el numero 1: ");
		int numero1 = entrada.nextInt();
				
		System.out.println("Introdueix el numero 2: ");
		int numero2 = entrada.nextInt();
		
		int numero1_for = numero1;  //variables per no canviar el valor del numero introduït per pantalla i poder iterar al for
		int numero2_for = numero2;
		
		System.out.println(); //salt de línea
		
		int contador1 = 0; //variables per contar posicions que hi ha en cada numero, exemple: 321 té 3 posicions 0 1 i 2.
		int contador2 = 0;
		
		while (numero1_for != 0) { //while per saber les posicions que te el vector numeros1, mentres que numero1_for no sigui igual a 0 per acabar amb un digit.
			numero1_for /= 10; //treiem ultim numero
			contador1++;
		} 
		int[] numeros1 = new int[contador1]; // declarem un vector i afegim les posicions "contador1" al vector 
		
		while (numero2_for != 0) { //while per saber les posicions que te el vector numeros2
			numero2_for /= 10; 
			contador2++;
		} 
		int[] numeros2 = new int[contador2]; // declarem un vector i afegim les posicions "contador2" al vector 
		
		if (numero1 == numero2) {
			System.out.println(numero1 + " és el mateix numero que " + numero2); // "INFO PERMUTACIÓN: No se repiten los elementos, ya que de repetirse o ser iguales entre si, al intercambiarlos no se genera una nueva permutación"
		} else if (contador1 != contador2) {
			System.out.println(numero1 + " no és permutació de " + numero2 + " ja que no tenen la mateixa longitud"); //sí el numero1 és igual al numero2 diem que és el mateix número (no és permutació) i si la longitud del numero no és la mateixa, segur NO serán permutables.
		} else { // a partir d'aqui són de la mateixa longitud

			//A continuació dos for per treure cada digit del numero introduït:
			
							//  0 1 2 3 4 5 6 7 8 9
			int[] posicions1 = {0,0,0,0,0,0,0,0,0,0}; // (10 posicions) vector per contar les vegades que surt cada numero en cada posició (semblant dau practica 9)
			int[] posicions2 = {0,0,0,0,0,0,0,0,0,0}; 
			
			numero1_for = numero1;  //reiniciem les variables per no canviar els valors
			numero2_for = numero2;
			
			for (int i = 0; numero1_for != 0; i++) { //mentres que numero1 no sigui 0, perqué ho faci fins que quedi un digit ja que les 2 arrays son de la mateixa longitud no fa falta fer 2 for, nomes amb 1 ho podem fer
				numeros1[i] = numero1_for % 10; //retorna el ultim numero, exemple 2587 % 10 = 7
				numero1_for /= 10; //saca l'ultim numero
				posicions1[numeros1[i]]++; //guarda en la posició numeros1[i] del vector posicions1
				//System.out.println("Tenim aquestos numeros en el numero 1 " + numeros1[i]); 
				
				numeros2[i] = numero2_for % 10; 
				numero2_for /= 10;
				posicions2[numeros2[i]]++;
				//System.out.println("Tenim aquestos numeros en el numero 2 " + numeros2[i]);
			}
			//System.out.println(Arrays.toString(posicions1)); posicions del 0 al 9 i vegades que surt cada numero en cada posició == vegades que surt cada numero *
			//System.out.println(Arrays.toString(posicions2)); 

			boolean permutable = true;
			
			for (int i = 0; i < posicions1.length; i++) { //utilitzem el mateix length perque aqui sabem que tenen mateixa longitud posicions1 i posicions2
				if (posicions1[i] != posicions2[i]) {
					permutable = false;
					break;
				} 
			} 
			
			if (permutable) {
				System.out.println(numero1 + " és una permutació de " + numero2);
			} else {
				System.out.println(numero1 + " no és una permutació de " + numero2);
			}
		}
		
		System.out.println();
		
		
		/*4. Adapteu l’algorisme anterior per avaluar si una cadena de caràcters (string) és una permutació d’una altre
		 */
		
		String paraula1 = "";
		String paraula2 = "";
		
		System.out.println("Introdueix la primera paraula: "); 
		paraula1 = entrada.next(); // entrada.next() per guardar Strings utilitzem el ".next"
		System.out.println("Introdueix la segona paraula: ");
		paraula2 = entrada.next();
		
		System.out.println();
		
		if (paraula1.equals(paraula2)) { // el equals compara dos String pel seu valor, ja que; String no és un valor primitiu és un objecte
											
			System.out.println(paraula1 + " és la mateixa paraula que " + paraula2);
		} else if (paraula1.length() != paraula2.length()) {
			System.out.println(
					paraula1 + " no és una permutació de " + paraula2 + " ja que, no tenen la mateixa longitud");
		} else {
			
			String paraula1_for = paraula1;
			String paraula2_for = paraula2;
			
			boolean permutacio = true;
			
			for (int i = 0; i < paraula1_for.length(); i++) { // recorreix la longitud de la paraula, en aquest punt i sabem que paraula1 i paraula2 tenen mateixa mida
														
				int contador_lletres = 0; // contador per comptar vegades que surt cada lletra
				for (int j = 0; j < paraula2_for.length(); j++) {
					if ((paraula2_for.charAt(j) == paraula1_for.charAt(i))) { // si són les mateixes lletres sumem 1 al contador per cada lletra igual
						contador_lletres++;
					}
				}
				
				if (contador_lletres == 0) { // si no es igual a 0, no coincideix les lletres és false					
					permutacio = false;
					break; // no cal continuar el programa
				}
			}
			if (permutacio) { //si és true:
				System.out.println(paraula1 + " és una permutació de " + paraula2);
			} else { //si es false:
				System.out.println(paraula1 + " no és una permutació de " + paraula2);
			}
			
		}
	
		entrada.close();
	}
}
