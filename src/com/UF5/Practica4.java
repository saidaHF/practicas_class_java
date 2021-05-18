package com.UF5;

import javax.swing.*;
import java.awt.event.*;  

public class Practica4 {
	
	private static int numero1 = 0; // serveix per guardar el primer numero marcat en la calculadora, quan no hi ha cap es 0
	private static int numero2 = 0; // serveix per guardar el segon numero marcat en la calculadora, quan no hi ha cap es 0
	private static char operacio = ' '; // per saber quina operacio farem, primer guardem el valor del char amb el metode operacio() 
										// desprès segons el valor de l'atribut operació la funció igualar() fara + - * / o res si esta buit
	private static boolean introduirPrimerNumero = true; // Comencem amb el primer numero true perque quan entrem a la funció operacio() guarda el false, ja no es 
														 // el primer numero, si no el segon que introduïm
	
	/*	ORDRE:
		1. amplada
		2. alçada
		3. pos X
		4. pos Y
		Hem de posar setBounds(pos X, pos Y, amplada, alçada) pos = posició dintre de la pestanya i amplada/alçada mida del botó
	 */
	
	public static void main(String[] args) {
		// PANTALLA:
		
		// CAMP DE TEXT:
		// primer de tot haurem de realitzar un frame, que serà la finestra o "requadre de text" on hi situarem tots els elements. 
		// Ho hem de fer generant un objecte JFrame
		JFrame finestra = new JFrame();
		
		// Els camps de text hauran de ser del tipus JTextField, i donem la mida al recuadre 
		JTextField tfText = new JTextField();  
		tfText.setBounds(40,40, 240,50);	
		tfText.setHorizontalAlignment(SwingConstants.RIGHT); 	
		tfText.setText("0"); 							
		finestra.add(tfText);
		
		try {
			// BOTONS:
			
				// NUMEROS:
			// Botó 1
			JButton boto1 = new JButton("1");	
			boto1.setBounds(40,110, 50,50);					
			finestra.add(boto1);	
			
			boto1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(1, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 2
			JButton boto2 = new JButton("2");	
			boto2.setBounds(100,110, 50,50);					
			finestra.add(boto2);	
			
			boto2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(2, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 3
			JButton boto3 = new JButton("3");	
			boto3.setBounds(160,110, 50,50);					
			finestra.add(boto3);	
			
			boto3.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(3, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 4
			JButton boto4 = new JButton("4");	
			boto4.setBounds(40,170, 50,50);					
			finestra.add(boto4);	
			
			boto4.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(4, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 5
			JButton boto5 = new JButton("5");	
			boto5.setBounds(100,170, 50,50);					
			finestra.add(boto5);	
			
			boto5.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(5, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 6
			JButton boto6 = new JButton("6");	
			boto6.setBounds(160,170, 50,50);					
			finestra.add(boto6);	
			
			boto6.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(6, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 7
			JButton boto7 = new JButton("7");	
			boto7.setBounds(40,230, 50,50);					
			finestra.add(boto7);	
			
			boto7.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(7, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 8
			JButton boto8 = new JButton("8");	
			boto8.setBounds(100,230, 50,50);					
			finestra.add(boto8);	
			
			boto8.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(8, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 9
			JButton boto9 = new JButton("9");	
			boto9.setBounds(160,230, 50,50);					
			finestra.add(boto9);	
			
			boto9.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(9, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			// Botó 0
			JButton boto0 = new JButton("0");	
			boto0.setBounds(40,290, 50,50);					
			finestra.add(boto0);	
			
			boto0.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				apretarNumero(0, tfText); // així apareix el 1 al camp d'escriure de la calculadora
	        } } );
			
				// OPERADORS:
			
			// Boto +
			JButton botoS = new JButton("+");	
			botoS.setBounds(230,110, 50,50);					
			finestra.add(botoS);
			botoS.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				operacio('s', tfText); // pasem el signe de l'operacio que realitzará la funció igualar
	        } } );
			// Boto -
			JButton botoR = new JButton("-");	
			botoR.setBounds(230,170, 50,50);					
			finestra.add(botoR);
			botoR.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				operacio('r', tfText); // pasem el signe de l'operacio que realitzará la funció igualar
	        } } );
			// Boto x
			JButton botoM = new JButton("x");	
			botoM.setBounds(230,230, 50,50);					
			finestra.add(botoM);
			botoM.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				operacio('m', tfText); // pasem el signe de l'operacio que realitzará la funció igualar
	        } } );
			// Boto /
			JButton botoD = new JButton("/");	
			botoD.setBounds(230,290, 50,50);					
			finestra.add(botoD);
			botoD.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				operacio('d', tfText); // pasem el signe de l'operacio que realitzará la funció igualar
	        } } );
			// Boto =
			JButton botoI = new JButton("=");	
			botoI.setBounds(100,290, 110,50);					
			finestra.add(botoI);
			botoI.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {  
				igualar(tfText);// Amb el botó igual fem la funció igualar() que farà el càlcul guardat en operacio()
	        } } );
			
			
			// VISIBILITAT DE LA FINESTRA - - - Sempre al final
			finestra.setSize(320,410);		
			finestra.setLayout(null);												
			finestra.setVisible(true);	// Fem la finestra visible 
		     
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Exemple: primer posem 5:    0 * 10 + 5 = 5, primer numero, després posem 7:     7 * 10 + 5 = 75
	// Serveix per no possar 0 a l'esquerra i per posar els numeros en ordre segons es van clickan p.e. fem click en 5, 7 i 8 posaría el numero "578"
	// Ho fem per al numero1 i numero2
	public static void apretarNumero(int n, JTextField tf) {
		String nString = "";
		if (introduirPrimerNumero) {
			if ((numero1 == 0) && (n == 0) ) return; 
			numero1 = numero1 * 10 + n; 
			nString += numero1;
		}
		else {
			if ((numero2 == 0) && (n == 0) ) return; 
			numero2 = numero2 * 10 + n;
			nString += numero2;
		}
		
		tf.setText(nString);
	}
	
	// Aquesta funció reb un char i un JTextField, guarda el char en l'atribut operacio, i canvia el boolean introduirPrimerNumero a false perquè poguis 
	// introduïr després el segon numero a numero2 en comptes de numero1, a més posa el "0", perquè quan clickem un altre número després de clickar una operació
	// a la calculadora s'esborri el primer numero i possi 0
	public static void operacio(char op, JTextField tf) {
		operacio = op;
		introduirPrimerNumero = false;
		tf.setText("0");		
	}
	
	// Aquesta funció utilitza el valor de la variable operacio per saber quina operació realitzar i a més "resetea" a 0 els valors després de l'operació
	public static void igualar(JTextField tf) {
		int resultat = 0;
		if (operacio == ' ') return;
		else if (operacio == 's') {
			resultat = numero1 + numero2;
		}
		else if (operacio == 'r') {
			resultat = numero1 - numero2;
		}
		else if (operacio == 'm') {
			resultat = numero1 * numero2;
		}
		else if (operacio == 'd') {
			resultat = numero1 / numero2;
		}
		numero1 = 0;
		numero2 = 0;
		operacio = ' ';
		introduirPrimerNumero = true;
		
		tf.setText("" + resultat); // convertim en String el resultat perquè ho poguem mostrar a la pantalla de la calculadora
		
		resultat = 0;	
	}
}