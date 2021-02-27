package com.practicas.UF1;

public class Practica3 {

	public static void main(String[] args) {
		
	//PRACTICA 2 - copia
		
		int dia = 23;
		System.out.println(dia);
		//muestra por consola 23
		
		int restante = -11;
		System.out.println(restante);
		//muestra por consola -11
		
		char letra = 'r';
		System.out.println(letra);
		//muestra por consola r
		
		long telf = 2111111111;
		System.out.println(telf);
		//muestra por consola 2111111111
		
		long DNI = 2150000000L;
		System.out.println(DNI);
		//muestra por consola 2150000000
		
		boolean aprovat = true;
		System.out.println(aprovat);
		//muestra por consola true
		
		boolean zero = false;
		System.out.println(zero);
		//muestra por consola false
		
		float preu = 12;
		System.out.println(preu);
		//muestra por consola 12.0
			
		double descompte = 24;
		System.out.println(descompte);
		//muestra por consola 24.0
		
		float variableFloat = 12.3f;
		System.out.println(variableFloat);
		//muestra por consola 12.3
		
		double variableDouble = 12.4d;
		System.out.println(variableDouble);
		//muestra por consola 12.4
		
		double notacioC = 1E6;	
		System.out.println(notacioC);
		//muestra por consola 1000000.0
		
		String codi = "août";
		System.out.println(codi);
		//muestra por consola août
		
		String municipi = "Peñíscola";
		System.out.println(municipi);
		//muestra por consola Peñiscola
		 
		
		//EXERCICI 3
		
		final byte mesosAny = 12;
		System.out.println(mesosAny);
		//muestra por consola 12
				
		//EXERCICI 4
				
		byte letraR = (byte)letra;
		System.out.println(letraR);
		//muestra por pantalla 114
				
		int letra1 = letra;
		System.out.println(letra1);
		//muestra por pantalla 114
				
		long restanteLong = restante;
		System.out.println(restanteLong);
		//muestra por pantalla -11
				
		double vfloat = variableFloat;
		System.out.println(vfloat);
		//muestra por pantalla 12.300000190734863
				
		float vdouble = (float)variableDouble;
		System.out.println(vdouble);
		//muestra por pantalla 12.4
				
		double vdoubledia = dia;
		System.out.println(vdoubledia);
		//muestra por pantalla 23.0
				
		byte vbyte = (byte)variableDouble;
		System.out.println(vbyte);
		//muestra por pantalla 12
				
		char vchar = (char)municipi.charAt(0);
		System.out.println(vchar);
		//muestra por pantalla P
				
		int vint = (char)municipi.charAt(0);
		System.out.println(vint);		
		//muestra por pantalla 80
		
	//EXERCICI 2 - PRACTICA 3
		
		//a. Sumar les variables de l’apartat A i B. Deseu-la en una nova variable del tipus adient per perdre el mínim de valors.
		
		int suma = dia + restante;
		System.out.println("EX2 a." + suma);
		
		//b. Resteu les variables de l’apartat A i B. Deseu-la en una nova variable del tipus adient per perdre el mínim de valors.
		int resta = dia - restante;
		System.out.println("EX2 b." + resta);
		
		//c.Multipliqueu les variables de l’apartat A i B. Deseu-la en una nova variable del tipus adient per perdre el mínim de valors.
		int multiplica = dia * restante;
		System.out.println("EX2 c." + multiplica);
		
		//d. Dividiu les variables de l’apartat A i B. Deseu-la en una nova variable del tipus adient per perdre el mínim de valors.
		float divisio = (float)dia / restante; 
		System.out.println("EX2 d." + divisio);
		
		//e. Calculeu el mòdul de les variables de l’apartat A i B. Deseu-la en una nova variable del tipus adient per perdre el mínim de valors.
		float modul = dia % restante;
		System.out.println("EX2 e." + modul);
		
		//f. Decrementeu la variable A
		dia--;
		System.out.println("EX2 f." + dia);
		
		//g. Incrementeu la variable B
		restante++;
		System.out.println("EX2 g." + restante);
		
	//EXERCICI 3
		
		int x = 10;
		
		//a. Assigneu el valor 10
		x=10;
		System.out.println("EX3 a." + x);
		
		//b. Sumeu 5
		x+=5;
		System.out.println("EX3 b." + x);
		
		//c. Resteu 7
		x-=7;
		System.out.println("EX3 c." + x);
		
		//d. Multipliqueu per 2
		x*=2;
		System.out.println("EX3 d." + x);
		
		//e. Dividiu per 4
		x/=4;
		System.out.println("EX3 e." + x);
		
		//f. Calculeu el mòdul entre 3 (%3)
		x%=3;
		System.out.println("EX3 f." + x);
		
	//EXERCICI 4
		
		x = 10; //como ya esta declarada antes la variable x aqui solo le cambio el valor
		int y = 3; 
		
		//a. es false porqué 10 es mayor que 3
		System.out.println("EX4 a." + (x<y));
		//b. es true porqué el signo ! niega lo de dentro del parantesis que es false y por tanto, ahora es true
		System.out.println("EX4 b." + (!(x < y)));
		//c. es false porqué no son iguales 10 y 3
		System.out.println("EX4 c." + (x == y));
		//d. es false porqué al ser AND si uno es false (x==y) devuelve false
		System.out.println("EX4 d." + ((x != y) && (x==y)));
		//e. es true porqué es un OR y uno de los dos es cierto (x != y)
		System.out.println("EX4 e." + ((x != y) || (x==y)));
		//f. es true porqué 10 es igual que 10
		System.out.println("EX4 f." + (x >= 10));
		//g. es false porqué y es igual a 3 no a 4
		System.out.println("EX4 g." + (y == 4));
		
	//EXERCICI 5
		
		//cambio valor de las variables ya declaradas x y para hacer el ejercicio
		x = 4;
		y = 1;
		
		//a. x << 2 el número 4 en binario es 100, sí añadimos dos ceros es 10.000 que en decimal es 16
		System.out.println("EX5 a." + (x << 2));
		
		//b. x >> 2 sí sacamos dos ceros de 100 queda 1
		System.out.println("EX5 b."+ (x >> 2));
		
		//c. x << y   x = 4 (100 binario) y = 1, añadimos otro cero y ahora x vale 1000 en binario que es 8 en decimal
		System.out.println("EX5 c." + (x << y));
		
		//d. x >> y  x es 100 sí le quitamos un cero queda en 10 binario = 2 en decimal.
		System.out.println("EX5 d." + (x >> y));
		
		/* e. x >>> y  desplaza los bits del número a la derecha y llena con “0” los bits desplazados. 
		El bit más a la izquierda se establece en 0, como teniamos 100 y la variable y = 1 quitamos solo un cero, 
		quedando 10 que es lo mismo que 2 en decimal*/
		System.out.println("EX5 e." + (x >>> y));
		
		/*f. ~x (NOT) nos permite invertir el contenido de bits de una cadena. 
		De tal manera que invierte los bits convirtiendo los 1 en 0 y los 0 en 1.
		(convierte los 0 del int, parte "vacía" en 1 por eso da -5) */
		System.out.println("EX5 f." +  ~x);
		
		//g. x & y  AND lo que hace es multiplicar los bits de las dos cadenas tal que (0x1=0) (1x1=1)
		System.out.println("EX5 g." + (x & y));
		
		/* h. x | y OR inclusivo lo que se hace es multiplicar los bits asumiendo que 1x1 o 1x0, siempre es 1. 
		Mientras que la única multiplicación que da 0 es 0x0.  El resultado es 101 en binario */ 
		System.out.println("EX5 h." + (x | y));
		
		/* i. x ^ y OR exclusivo La multiplicación de bits será 1 para los casos 1x0 y 0x1. 
		Las multiplicaciones 1 x 1 y 0 x 0 siempre darán como resultado 0. el resultado es 101 en binario */
		System.out.println("EX5 i." + (x ^ y));
		
		//j. x&=3  3 en binario es 11, el resultado es 0, primero hace el AND y luego guarda el resultado en la variable x
		System.out.println("EX5 j." + (x &= 3));
		
		//k. x|=3 el resultado es 3, primero hace el OR inclusivo y después guarda el resultado en la variable x
		System.out.println("EX5 k." + (x |= 3));

	}
	
	

}
