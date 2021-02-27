package com.practicas.UF2.practica4; //declaracion de pertenencia paquete
// Fet per Lucas i Saida




public class principal {
	static String s_titol = "Benvingut al joc de les dames"; //No podrem fer servir el titol del main si comentem el que està a fora. Ambit de classe
	public static void main (String[] args)
	{
		mostrarTitol();
		String s_titol = "Benvingut a les dames";//ambit de funció, tan sols dins del main sera accesible
		pantalles.mostrarPantalla(s_titol); //error: pantalla no visible (mostrarpantalla)
		
		
		
	
		
		
		char[][] c_taulell = dames.muntarTaulell(); 
		boolean b_finalitza = false;
		
		//he fet servir el for de sota y l'he ficat en la funcio mostrar.Taullel
		pantalles.mostrarTaulell(); //a partir de esta llamada mostraremos el tablero sin utilizar el for comentado de la linea 16
		
		/*for (int ii = 0; ii < c_taulell.length; ii++)
		{
			System.out.println();
			for (int jj = 0; jj < c_taulell[ii].length; jj++)
			{
				System.out.print(c_taulell[jj][ii]);
			}
		}*/
		
		
		while (!b_finalitza)
		{
			
			pantalles.mostrarPantalla("");
			
			c_taulell = dames.moureFitxa(c_taulell);
			for (int ii = 0; ii < c_taulell.length; ii++)
			{
				System.out.println();
				for (int jj = 0; jj < c_taulell[ii].length; jj++)
				{
					System.out.print(c_taulell[jj][ii]);
				}
			}
			pantalles.mostrarPantalla("");
			
			
			
			pantalles.mostrarPantalla("La partida ha finalitzat? S/n");
			String s_resposta = pantalles.llegir();
			if (s_resposta.equalsIgnoreCase("S")) b_finalitza = true;
			//falta else
			else {
				b_finalitza = false;
			}
		}
	
	}
	
	
	
	private static void mostrarTitol() {
		
		pantalles.mostrarPantalla(principal.s_titol);
	}

	
}
