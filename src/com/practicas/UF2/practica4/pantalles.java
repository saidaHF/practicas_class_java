package com.practicas.UF2.practica4; //declaracion de pertenencia paquete
import java.util.Scanner; //faltaba import

public class pantalles {
	public static void mostrarPantalla(String mostra) //esta en private, debe ser public
	{
		System.out.println(mostra);
	}
	
	public static void mostrarPantalla(int mostra)
	{
		System.out.println(mostra);
	}
	
	public static void mostrarPantalla(char mostra)
	{
		System.out.println(mostra);
	}
	
	public static void mostrarPantalla(long mostra)
	{
		System.out.println(mostra);
	}

	
	public static String llegir()
	{
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	//funcio NO NECESARIA,
	/*public static int llegir()
	{
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	} dupblicat??*/
	
	public static void mostrarTaulell () { //Funcio NOVA: Mostrara el taullel, he agafat el codi ja creat y l'he ficat en aquesta funció (era un for en la principal, linea 16)
		char[][] c_taulell = dames.muntarTaulell();
		for (int ii = 0; ii < c_taulell.length; ii++)
		{
			System.out.println();
			for (int jj = 0; jj < c_taulell[ii].length; jj++)
			{
				System.out.print(c_taulell[jj][ii]);
			}
		}
	}

}
