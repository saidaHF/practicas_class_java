package com.practicas.UF4;
import com.practicas.UF4.Compte;

public class PrincipalCompte {
	
	public static void main(String[] args) {
		// Aqui executarem el programa, plantilla de com serán els objectes que creerem.
		
		Compte cmp1 = new Compte("Petra Palamós", 10000);
		// Compte cmp1 = new Compte("Petra Palamós", 10000); així agafa el metode amb NOM + DINERS (Ara no deixa crear un compte sense titular)
		
		// introduïm les dades amb el SET
	/*	cmp1.setTitular("Petra Palamós");
		cmp1.setQuantitat(1000); 
		
		// podem veure les dades amb el GET
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
	*/
		// cmp1.quantitat = 2000; // aixó dona error perquè no tenim accés a aquesta variable que es private
		
		cmp1.ingressar(200);
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
		cmp1.retirarDiners(3000);
		System.out.println(cmp1.getTitular());
		System.out.println(cmp1.getQuantitat());
	}
	
}
