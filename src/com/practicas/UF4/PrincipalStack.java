package com.practicas.UF4;
import com.practicas.UF4.Stack;

public class PrincipalStack {
	
	public static void main(String[] args) {
		
		Stack filo = new Stack();
		
		for (int i = 0; i < 5; i++) {
			filo.push(i + 1);
			filo.display();
		}
		System.out.println("");
		
		for (int i = 0; i < 5; i++) {
			filo.pop();
			filo.display();
		}
	}
	
}
