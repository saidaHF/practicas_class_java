package com.practicas.UF3;

public class PrincipalTaquilla {
	
	/*
	 Crear una classe Principal que és on s'executarà tot el codi. El procediment main d'aquesta classe  haurà de fer el següent: 
			a. Crear una Taquilla situada al carrer Camil Flammarion, 1 de Rubí. La taquilla tindrà 3 files i  4 columnes (total 12 calaixos). 
			b. Genereu tots els calaixos corresponents a aquesta taquilla. 
			c. Genereu dos paquets per emmagatzemar a aquesta taquilla. 
			d. Emmagatzemeu els paquets als calaixos A2 i B3. 
			e. Mostreu l'estat de la Taquilla.

	 */
	
	public static void main(String[] args) {
		
		// a.
		Taquilla taquilla = new Taquilla("carrer Camil Flammarion, 1", "Rubí", new int[] {3, 4});
		
		// b. 
		taquilla.generarCalaixos();
		
		// c.
		Paquet paquet1 = new Paquet("Ferran Gimbert Austri", taquilla.getIdTaquilla(), 1.5f, new int[] {2, 2, 4});
		Paquet paquet2 = new Paquet("Maria Flors Garcia", taquilla.getIdTaquilla(), 1f, new int[] {1, 1, 2});
		
		// d.
		taquilla.guardarPaquet(paquet1, 'A', 2);
		taquilla.guardarPaquet(paquet2, 'B', 3);
		
		// e.
		taquilla.mostrarCalaixos();
		
		
		
	/*	Paquet paquet3 = new Paquet("Laura Rubio Morales", taquilla.getIdTaquilla(), 4f, new int[] {8, 2, 2});
		taquilla.guardarPaquet(paquet3, 'B', 3); */
	} 
}
