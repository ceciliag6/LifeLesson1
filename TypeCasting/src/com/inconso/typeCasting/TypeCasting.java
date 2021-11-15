package com.inconso.typeCasting;

import java.util.Scanner;

public class TypeCasting {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Introducir un número por pantalla e imprimirlo
		System.out.println("Introduce please the first number");
		
		int i = sc.nextInt();
		
		System.out.println("Explicit Type Casting: " + i);
		
		//Introducir un caracter por pantalla y pasarlo a número (ascii code)
		System.out.println("Introduce un caracter por pantalla");
		
		String j = sc.next();
		
		char z = j.charAt(0);
		
		int w = z;
		
		System.out.println("el código ascii del número introducido es: " + w);
		
	}		

}
