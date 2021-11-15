package com.inconso.accessModifier;

import com.inconso.accessModifier2.AcessModifier2;

public class AccessModifier {
	
	public static void soyPrivado() {
		System.out.println("Private function");
	}
	
	public static void soyPublico(){
		System.out.println("Soy público");
	}
	
	static void soyDefault(){
		System.out.println("Soy default");
	}
	
	protected static void soyProtected() {
		System.out.println("Soy protected");
	}	
	
	public static void main (String[] args) {
		
		AcessModifier2 miAcss = new AcessModifier2();
		
		miAcss.soyPublico();
			
		soyPublico();
		soyPrivado();
		soyDefault();
		soyProtected();		
		
	}
}
