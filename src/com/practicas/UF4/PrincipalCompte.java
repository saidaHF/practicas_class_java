package com.practicas.UF4;
import com.practicas.UF4.Compte;

public class PrincipalCompte {
	
	public static void main(String[] args) {
		// Aqui executarem el programa, plantilla de com ser�n els objectes que creerem.
		
		Compte cmp1 = new Compte("Petra Palam�s", 10000);
		// Compte cmp1 = new Compte("Petra Palam�s", 10000); aix� agafa el metode amb NOM + DINERS (Ara no deixa crear un compte sense titular)
		
		// introdu�m les dades amb el SET
	/*	cmp1.setTitular("Petra Palam�s");
		cmp1.setQuantitat(1000); 
		
		// podem veure les dades amb el GET
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
	*/
		// cmp1.quantitat = 2000; // aix� dona error perqu� no tenim acc�s a aquesta variable que es private
		
		cmp1.ingressar(200);
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
		cmp1.retirarDiners(3000);
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
	}
	
}
