package com.practicas.UF2.practica4; //declaracion de pertenencia paquete
import java.util.Scanner;

public class dames {
	public static char[][] muntarTaulell()
	{
		char[][] c_taulell = new char[8][8];
		for (int ii = 0; ii < c_taulell.length; ii++)
		{
			for (int jj = 0; jj < c_taulell[ii].length; jj++)
			{
				if ((((ii % 2 == 0) && (jj % 2 == 0)) || ((ii % 2 != 0) && (jj % 2 != 0))) && (jj < 3)) c_taulell[ii][jj] = 'B';
				else if ((((ii % 2 == 0) && (jj % 2 == 0)) || ((ii % 2 != 0) && (jj % 2 != 0))) && (jj > 4)) c_taulell[ii][jj] = 'N';
				else c_taulell[ii][jj] = '-';
			}
		}
		return c_taulell; //retorna un array "posicions"
	}
	
	public static char[][] moureFitxa(char[][] c_taulell)
	{
		System.out.println("Digue que fitxa voleu moure: fila y columna. ");
		Scanner scan = new Scanner(System.in);
		byte b_usuariFila  = scan.nextByte();
		System.out.println("de quina columna? ");
		byte b_usuariColumna  = scan.nextByte();
		System.out.println("Digueu la posicio on voleu moure la fitxa. Fila: ");
		byte b_usuarioFilaFutura = scan.nextByte();
		System.out.println("Columna?. ");
		byte b_usuarioColumFutura = scan.nextByte();
		
		if (b_usuariFila <= 7 && b_usuariColumna <= 7 ) {
			c_taulell[b_usuarioFilaFutura][b_usuarioColumFutura] =  c_taulell[b_usuariFila][b_usuariColumna] ;
		// El usuario tendra qe introducir  una posicion de 0 a 7 tanto para fila como para columna para elegir una ficha a mover
			//posteriormente, elegir FUTURA posicion donde se movera esta ficha			
		}
		else {
			System.out.println("i) ERROR: Posició no trobada o no existent .");
		}
		
		
		pantalles.mostrarPantalla("Has eliminat alguna fitxa? S/n");
		String s_resposta = pantalles.llegir();
		if (s_resposta.equalsIgnoreCase("S"))
		{
			c_taulell[b_usuariFila][b_usuariColumna] = '-';
			//i) FALTABA especificació/declaració del contingut IF
			// en la posicion de la ficha movida hemos de poner un '-' como espacio vacio 
	
		}

		return c_taulell;
	}
}
