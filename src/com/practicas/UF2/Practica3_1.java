package com.practicas.UF2;

public class Practica3_1 {
	
	//funci� main:
	public static void main(String[] args) { 
		
	/*	1. Prenent com a exemple l�exercici 5 de la pr�ctica 11 de la unitat formativa 1 (si no el vau fer, teniu el codi penjat a l�aula virtual), 
	       reformuleu-lo per tal d�adaptar-lo al disseny modular. Ha de contenir les seg�ents funcions com a m�nim:
				a. Funci� main, on s�executar� el gruix del programa
				b. Funci� formatejarTemps, que haur� de retornar un String i haur� de tenir com a par�metre d�entrada un valor enter. 
				Aquesta funci� haur� de revisar si el n�mero �s m�s petit que 10 per tal d�afegir el 0 davant de la hora, minut o segon.
					i. Exemple: si la invoquem amb un enter de valor 2, haur� de retornar un string que sigui 02. Si la invoquem amb un enter de valor 15, 
					haur� de retornar un string que sigui 15.
				c. Funci� mostrarTemps, que no haur� de retornar cap valor i haur� de tenir com a par�metre d�entrada els strings de hora, minut i segon.
				d. Funci� esperar, que no haur� de retornar cap valor i haur� de tenir com a par�metre d�entrada un valor enter, que seran els mil�lisegons 
				que haur� d�esperar el programa. El funcionament haur� de fer una crida a la funci� Time.sleep. */
			
			
		for (int horas = 23; horas < 24; horas++) {
			for (int minutos = 59; minutos < 60; minutos++) {
				for (int segundos = 55; segundos < 60; segundos++) {
					esperar(1000); //funci� que crida a Thread.sleep() amb la cuantitat de milisegons que volem

					mostrarTemps(formatejarTemps(horas), formatejarTemps(minutos), formatejarTemps(segundos));
					//Aqui d'alt utilitzem la funci� mostrarTemps amb els temps ja formatejats amb l'altre funci� formatejarTemps dintre del parentesis.
					
					
					if (reiniciarTemps(horas, minutos, segundos)) {  //si reiniciarTemps �s igual a: horas == 23 && minutos == 59 && segundos == 59
						horas = 0;
						minutos = 0;
						segundos = -1; //Posem -1 perqu� si no reinicia en 00:00:01, ja que suma avans de mostrar-lo i volem que reinici amb 00:00:00
					}
				} 
			}
		}
		
	}
	
	//funci� formatejarTemps:
	public static String formatejarTemps(int numero) {
		return numero < 10 ? "0" + numero : "" + numero; //if ternario: s� numero es menor que 10, true devuelve 0 + numero, false devuelve solo el numero
	}
	
	//funci� mostrarTemps, el void no retorna res i no porta "return"
	public static void mostrarTemps(String hora, String minut, String segon) {
		System.out.println(hora + ":" + minut + ":" + segon); //format separat amb els dos punts ":", 20:15:07	
	}
	
	//funci� esperar (utilitzant Thread.sleep() ):
	public static void esperar(int tempsEspera) { //temps de milisegons que ha d'esperar, s'utilitza: esperar(1000);
		try { Thread.sleep(tempsEspera); } catch (Exception e) {}
	}
	//funci� reiniciarTemps:
	public static boolean reiniciarTemps(int horas, int minutos, int segundos) {
		return (horas == 23 && minutos == 59 && segundos == 59); //nom�s �s true quan el temps arriba a 23:59:59, si no es false.
	}
	
}
