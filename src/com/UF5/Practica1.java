package com.UF5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Stack;
import java.util.Vector;


public class Practica1 {
	
	public static void main(String[] args) {
		/*
		 1. Generació d’estructures estàtiques:
			a. Vectors unidimensionals 
				i. Genereu un vector d’enters de longitud 10 i introduïu manualment, mitjançant un bucle for, 10 valors.
				ii. Mostreu cadascun d’aquests valors mitjançant un altre bucle for.
		 */
		
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		System.out.println("");
		/*
		 b. Vectors unidimensionals – cadenes de caràcters (Strings) vs vectors de caràcters (char[])
			(1 punt)
			i. Genereu una variable de tipus String que contingui el text «Hola mon»
			ii. Convertiu aquesta variable a una vector de caràcters.
			iii. Mitjançant un bucle for, mostreu cadascun dels valors del vector en una sola línia.
			iv. Genereu un vector de caràcters que tingui, a cadascuna de les posicions, les lletres ‘A’ ‘d’ ‘e’ ‘u’ ‘ ‘ ‘m’ ‘o’ ‘n’
			v. Convertiu aquest vector de caràcters a una variable de tipus String
			vi. Mostreu aquesta variable String per pantalla 
		 */
		String salut = "Hola mon";
		char[] vectorSalut = new char[salut.length()];
		
		for (int i = 0; i < salut.length(); i++) {
			vectorSalut[i] = salut.charAt(i);
		}
		
		for (int i = 0; i < salut.length(); i++) {
			System.out.print(vectorSalut[i]);
		}
		
		System.out.println("");
		
		char[] comiat = {'A', 'd', 'e', 'u', ' ', 'm', 'o', 'n'};
		String stringComiat = String.valueOf(comiat);
		System.out.println(stringComiat);
		
		System.out.println("");
		
		/*
		 Vectors multidimensionals. (1 punt)
			i. Genereu un vector, de dues dimensions, on emmagatzemareu la suma de la fila i la columna. Feu-ho mitjançant un parell de bucles for.
				1. El resultat haurà de ser:
					a. [0 1 2]
					b. [1 2 3]
					c. [2 3 4]
						ii. Mostreu aquest vector bidimensional mitjançant uns altres dos bucles for, mantenint i respectant les files i les columnes 
						(aproximadament, s’ha de veure com es veu a l’exemple del punt anterior).
		 */
		int[][] suma = new int[3][3];
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				suma[i][j] = i + j;
			}
		}
		for (int i = 0; i < suma.length; i++) {
			for (int j = 0; j < suma[i].length; j++) {
				System.out.print(suma[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		
		// És pot fet també amb un for each:
		for (int[] recorrer : suma) {
			System.out.println(Arrays.toString(recorrer));
		}
		
		System.out.println("");
		
		/*
		 2. Generació d’estructures dinàmiques.
			a. NOTA: Al codi, comenteu, de forma justificada en cada pas, quins valors es van introduïnt en cadascuna de les estructures. Justifiqueu el perquè i 
			comproveu que els valors queden informats a les estructures com heu justificat mostrant els resultats per pantalla.
			
			b. Vectors (2,5 punts)
				i. Genereu un objecte de tipus vector (Vector) que sigui d’enters i inicialitzeu-lo a 4 posicions.
		 */
		// Creem l'objecte Vector de tipus Integer i li donem una mida 4
			Vector<Integer> vectorEnters = new Vector<Integer>(4);	
		/*
		 ii. Afegir valors:
			1. Afegiu, al vector, el valor 4.
			2. Afegiu, al vector, el valor 8.
			3. Afegiu, al vector, el valor 15.
			4. Afegiu, al vector, el valor 16.
			5. Afegiu, al vector, el valor 23.
			6. Afegiu, al vector, el valor 42.
			
			Amb el metode add() afegim valors al vector
		 */
			vectorEnters.add(4);
			vectorEnters.add(8);
			vectorEnters.add(15);
			vectorEnters.add(16);
			vectorEnters.add(23);
			vectorEnters.add(42);
			
		// iii. Mostreu els resultats per pantalla i la longitud del vector.	
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			System.out.println("");
		// iv. Removeu, al vector, el valor de la tercera posició. 
			// El numero que esta en tercera posició és el valor 2
			vectorEnters.remove(2);
		// v. Mostreu els resultats per pantalla d’un en un i la longitud del vector.
			// Al haver esborrat la posició anterior ara la longitud és -1 
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			System.out.println("");
		// vi. Buideu el contingut del vector.
			vectorEnters.clear();
			System.out.println("");
		// vii. Mostreu tots els resultats per pantalla i la longitud del vector.
			// Ara la mida es 0 perquè hem buidat el vectorEnters
			for (Integer i : vectorEnters) {
				System.out.print(i + " ");
			}
			// Ara no mostrara res perquè no té valors que mostrar
			System.out.println("La longitud del vector és: " + vectorEnters.size());
			
		/*
		 c. Piles (2,5 punts)
			i. Genereu un objecte de tipus vector (Vector) que sigui d’enters i inicialitzeu-lo a 4 posicions.
		 */
			// La declaració de la pila és la següent:
			Stack<Integer> pilaEnters = new Stack<Integer>();
		/*
		 ii. Afegir valors
			1. Afegiu, al vector, el valor 4.
			2. Afegiu, al vector, el valor 8.
			3. Afegiu, al vector, el valor 15.
			4. Afegiu, al vector, el valor 16.
			5. Afegiu, al vector, el valor 23.
			6. Afegiu, al vector, el valor 42.
		 */
			pilaEnters.push(4); 
			pilaEnters.push(8);
			pilaEnters.push(15);
			pilaEnters.push(16);
			pilaEnters.push(23);
			pilaEnters.push(42);	
		/*
		 iii. Mostreu tots els valors alhora de la pila i la seva longitud. Compareu els resultats que es veuen amb els resultats que heu vist per la classe Vector.
		 
		 RESPOSTA: Amb el Stack hem d'utilitzar la funció push() en comptes de add(), a més a més funciona diferent perqué l'Stack guarda de forma que l'ultim 
		 que fiquem és el primer que agafes, en comptes el Vector pots accedir a qualsevol posició.
		 */	
			System.out.println("");
			for (Integer i : pilaEnters) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector Piles és: " + pilaEnters.size());
			System.out.println("");
		/*
		 iv. Cerqueu i mostreu la posició del valor 15. Quina posició retorna? Coincideix amb el que heu mostrat abans? Justifiqueu la resposta.
		 
		 RESPOSTA: El mètode search() a Java s’utilitza per buscar un element a la pila i obtenir la seva distància desde la part superior d'aquesta. 
		 Aquest mètode inicia el recompte de la posició des de l'1 i no des de 0. Es considera que l'element que hi ha a la part superior de la pila es troba 
		 a la posició 1. Si hi ha més d'un element, l'índex de l'element més proper a la part superior es torna. El mètode retorna la seva posició si l'element 
		 es troba correctament i retorna -1 si l'element està absent. Per aixó retorna 4, ja que desde l'ultima entrada (42) hi ha 4 llocs.
		 */
		System.out.println(pilaEnters.search(15));
		System.out.println("");
		/*
		 v. Mostreu, sense esborrar, la capçalera de la pila. Quin valor us retorna? Justifiqueu la resposta.
		 
		 RESPOSTA: Mostra 42 perquè és l'ultim valor que s'ha introduït
		 */
		System.out.println(pilaEnters.peek());
		System.out.println("");
		
		/*
		 vi. Mostreu tots els valors, esborrant la primera posició de la pila. En quin ordre us mostra els resultats? Compareu els resultats que es veuen 
		 amb els resultats que heu vist per la classe Vector i justifiqueu perquè us retorna els resultats en aquest ordre.
		 */ 
		System.out.println("El valor eliminat és: " + pilaEnters.pop() + " i els valors de la Pila són: " + pilaEnters);
		System.out.println("");
		
	/*
	 d. Taules de Hash (2,5 punts)
		i. Genereu una taula de Hash que desi objectes de tipus String (claus) i Integer (valors). Aquesta taula emmagatzemarà el DNI (clau) 
			i la nota de cada alumne d’una classe.
	 */
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		/*
		 ii. Afegir valors
			1. Afegiu el DNI i la nota de 10 alumnes.
		 */
		ht.put("477536598L", 8);
		ht.put("500538518M", 3);
		ht.put("001225887P", 10);
		ht.put("954542444K", 4);
		ht.put("223655455V", 7);
		ht.put("690004544T", 9);
		ht.put("887554440R", 6);
		ht.put("588855545S", 5);
		ht.put("554522100Y", 2);
		ht.put("777001112C", 9);
		
		// iii. Mostreu tots els alumnes per pantalla en el format «DNI: nota»
		// el replace() reemplaça el valor de la nota
		System.out.println("La taula de DNI + nota és: " + ht);
		 
		// iv. Agafeu el DNI d’un dels alumnes que heu introduït i modifiqueu la seva nota. Mostreu el DNI i la nota de l’alumne abans i després de ser modificada.
		System.out.println("DNI: 777001112C NOTA: " + ht.get("777001112C"));
		ht.replace("777001112C", 7);
		System.out.println("DNI: 777001112C NOTA CANVIADA: " + ht.get("777001112C"));
		System.out.println("");
		
		/*
		 3. OPCIONAL
			a. Cerqueu un altre tipus de col·lecció de dades i implementeu-lo a Java. Podeu cercar-los en aquest web (https://www.geeksforgeeks.org/collections-in-java-2/). 
			Expliqueu el funcionament, de quines classes i interfícies hereta i justifiqueu el funcionament amb les proves que heu implementat a Java	
			b. Penseu una utilitat que podeu donar a cadascuna de les classes de col·leccions que hem vist. Justifiqueu la resposta	
			
			a. RESPOSTA: He agafat ArrayList, hereta de Collection i de la interfície List. 
			Ens proporciona matrius dinàmiques a Java. Pot ser més lent que les matrius standard, però pot ser útil en programes on es necessita 
			molta manipulació de la matriu. Aquesta classe es troba al paquet java.util. 
			
			És com una lista d'arrays (un array de arrays)
			
			b. 
			• Vector: La classe Vector, igual que ArrayList o LinkedList, també implementa a List, però d'una manera especial, sincronitzat, la qual cosa permet que 
			  es pugui usar en entorns concurrents (és a dir, en diversos processos que s'executen al mateix temps i fan ús possiblement dels mateixos recursos). 
			  Aquesta és la principal característica que la diferència d'altres classes com ArrayList.
			  Es recomana que si no és necessari s'utilitzi ArrayList en comptes de Vector. Per tant, només utilitzarem la classe Vector si tenim previstes 
			  circumstàncies especials com a processos concurrents. Les principals característiques d'aquesta classe són molt semblants a ArrayList.
			  Un objecte de tipus Vector conté elements que poden ser accedits per un índex i pot augmentar o disminuir la seva grandària dinàmicament en temps 
			  d'execució.
			
			• Stack: Un objecte de la classe Stack és una pila. Permet emmagatzemar objectes i després recuperar-los en l'ordre invers en el qual es van inserir,
			 és a dir, sempre es recupera l'últim element inserit. 
			 Un dels casos més usats en informàtica d'una pila és el de voler verificar si una determinada sentència o instrucció està equilibrada quant a número 
			 de parèntesi, claudàtors o claus d'obertura i tancament. Quan s'escriu codi de programació si no existeix equilibri entre signes d'obertura
			 (per exemple un parèntesi d'obertura) i tancament (per exemple un parèntesi de tancament) ni tan sols hauria de processar-se la sentència ja que no 
			 estaria formalment ben construïda. D'això s'encarreguen els analitzadors lèxics dels compiladors.
			 
			 • Hashtable: Una Hashtable Java és una estructura de dades que utilitza una funció hash per a identificar dades mitjançant una clau. La funció hash 
			 transforma una clau a un valor índex d'un array d'elements. En aquest cas a una índex de la nostra Hashtable Java. 
			 La clau es hash i el codi resultant es pot utilitzar com un índex per a emmagatzemar els valors en la taula.
		 */
		ArrayList<String> noms = new ArrayList<String>();
		// Per afegir dades es igual que amb la col.lecció Vector:
		noms.add("Eros"); 
		noms.add("Neptuno");
		noms.add("Rigel");
		noms.add("Orion");
		noms.add("Atenea");
		noms.add("Liria");
		
		// podem recorrer amb un for each igual que amb Vector i Pila, i per veure la mida podem fer servir també size()
		for (String i : noms) {
			System.out.print(i + " ");
		}
		System.out.println("");
		System.out.println("La longitud del vector és: " + noms.size());
		System.out.println("");
		
		noms.remove(4);
		// Esborrem la posició 4 i ara la mida és 5 perquè hi ha un valor menys
			for (String i : noms) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("La longitud del vector és: " + noms.size());
			System.out.println("");
			
		// podem esborrar el ArrayList amb clear() i aleshores noms queda amb mida 0 perquè no té cap valor a dintre
			noms.clear();
			for (String i : noms) {
				System.out.print(i + " ");
			}
			// Ara no mostrara res perquè no té valors que mostrar
			System.out.println("La longitud del vector és: " + noms.size());
	}
}
