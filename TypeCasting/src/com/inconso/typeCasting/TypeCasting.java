package com.inconso.typeCasting;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Introducir un n�mero por pantalla e imprimirlo
		System.out.println("Introduce please the first number");
		
		int i = sc.nextInt();
		
		System.out.println("Explicit Type Casting: " + i);
		
		//Introducir un caracter por pantalla y pasarlo a n�mero (ascii code)
		System.out.println("Introduce un caracter por pantalla");
		
		String j = sc.next();
		
		char z = j.charAt(0);
		
		int w = z;
		
		System.out.println("el c�digo ascii del n�mero introducido es: " + w);
		
	}		

}
