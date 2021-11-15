package com.inconso.accessModifier2;

public class AcessModifier2 {
	
	private static void soyPrivado() {
		System.out.println("Private function");
	}
	
	public static void soyPublico(){
		System.out.println("Soy público");
	}
	
	static void soyDefault() {
		System.out.println("Soy default");
	}
	
	protected static void soyProtected() {
		System.out.println("Soy protected");
	}

}
