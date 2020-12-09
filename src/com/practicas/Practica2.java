package com.practicas;

public class Practica2 {

	public static void main(String[] args) {
		
		//EXERCICI 2
		
		int dia = 23;
		System.out.println(dia);
		
		int restante = -11;
		System.out.println(restante);
		
		char letra = 'r';
		System.out.println("char letra r: " + letra);
		
		long telf = 2111111111;
		System.out.println(telf);
		
		long DNI = 2150000000L;
		System.out.println(DNI);
		
		boolean aprovat = true;
		System.out.println(aprovat);
		
		boolean zero = false;
		System.out.println(zero); 
		//el zero és false, no es pot guardar un 0 com un numero a una variable boolean
		
		float preu = 12;
		System.out.println(preu);
			
		double descompte = 24;
		System.out.println(descompte);
		
		float variableFloat = 12.3f;
		System.out.println(variableFloat);
		
		double variableDouble = 12.4d;
		System.out.println(variableDouble);
		
		double notacioC = 1E6;	
		System.out.println(notacioC);
		
		String codi = "août";
		System.out.println(codi);
		
		String municipi = "Peñíscola";
		System.out.println(municipi);
		
		//EXERCICI 3
		
		final byte mesosAny = 12;
		System.out.println(mesosAny);
		
		//EXERCICI 4
		
		byte letraR = (byte)letra;
		System.out.println("valor letraR como byte: " + letraR);
		
		int letra1 = letra;
		System.out.println("valor int letra " + letra1);
		
		long restanteLong = restante;
		System.out.println(restanteLong);
		
		double vfloat = variableFloat;
		System.out.println(vfloat);
		
		float vdouble = (float)variableDouble;
		System.out.println(vdouble);
		
		double vdoubledia = dia;
		System.out.println(vdoubledia);
		
		byte vbyte = (byte)variableDouble;
		System.out.println(vbyte);
		
		char vchar = (char)municipi.charAt(0);
		System.out.println(vchar);
		//coge solo primer caracter. (0 primero, 1 segundo, etc).
		
		int vint = (char)municipi.charAt(0);
		System.out.println(vint);		
		//devuelve el valor de P que es 80.
		
	}

}
