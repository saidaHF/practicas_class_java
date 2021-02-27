package com.practicas.UF2;

public class Practica3_1 {
	
	//funció main:
	public static void main(String[] args) { 
		
	/*	1. Prenent com a exemple l’exercici 5 de la pràctica 11 de la unitat formativa 1 (si no el vau fer, teniu el codi penjat a l’aula virtual), 
	       reformuleu-lo per tal d’adaptar-lo al disseny modular. Ha de contenir les següents funcions com a mínim:
				a. Funció main, on s’executarà el gruix del programa
				b. Funció formatejarTemps, que haurà de retornar un String i haurà de tenir com a paràmetre d’entrada un valor enter. 
				Aquesta funció haurà de revisar si el número és més petit que 10 per tal d’afegir el 0 davant de la hora, minut o segon.
					i. Exemple: si la invoquem amb un enter de valor 2, haurà de retornar un string que sigui 02. Si la invoquem amb un enter de valor 15, 
					haurà de retornar un string que sigui 15.
				c. Funció mostrarTemps, que no haurà de retornar cap valor i haurà de tenir com a paràmetre d’entrada els strings de hora, minut i segon.
				d. Funció esperar, que no haurà de retornar cap valor i haurà de tenir com a paràmetre d’entrada un valor enter, que seran els mil·lisegons 
				que haurà d’esperar el programa. El funcionament haurà de fer una crida a la funció Time.sleep. */
			
			
		for (int horas = 23; horas < 24; horas++) {
			for (int minutos = 59; minutos < 60; minutos++) {
				for (int segundos = 55; segundos < 60; segundos++) {
					esperar(1000); //funció que crida a Thread.sleep() amb la cuantitat de milisegons que volem

					mostrarTemps(formatejarTemps(horas), formatejarTemps(minutos), formatejarTemps(segundos));
					//Aqui d'alt utilitzem la funció mostrarTemps amb els temps ja formatejats amb l'altre funció formatejarTemps dintre del parentesis.
					
					
					if (reiniciarTemps(horas, minutos, segundos)) {  //si reiniciarTemps és igual a: horas == 23 && minutos == 59 && segundos == 59
						horas = 0;
						minutos = 0;
						segundos = -1; //Posem -1 perquè si no reinicia en 00:00:01, ja que suma avans de mostrar-lo i volem que reinici amb 00:00:00
					}
				} 
			}
		}
		
	}
	
	//funció formatejarTemps:
	public static String formatejarTemps(int numero) {
		return numero < 10 ? "0" + numero : "" + numero; //if ternario: sí numero es menor que 10, true devuelve 0 + numero, false devuelve solo el numero
	}
	
	//funció mostrarTemps, el void no retorna res i no porta "return"
	public static void mostrarTemps(String hora, String minut, String segon) {
		System.out.println(hora + ":" + minut + ":" + segon); //format separat amb els dos punts ":", 20:15:07	
	}
	
	//funció esperar (utilitzant Thread.sleep() ):
	public static void esperar(int tempsEspera) { //temps de milisegons que ha d'esperar, s'utilitza: esperar(1000);
		try { Thread.sleep(tempsEspera); } catch (Exception e) {}
	}
	//funció reiniciarTemps:
	public static boolean reiniciarTemps(int horas, int minutos, int segundos) {
		return (horas == 23 && minutos == 59 && segundos == 59); //només és true quan el temps arriba a 23:59:59, si no es false.
	}
	
}
