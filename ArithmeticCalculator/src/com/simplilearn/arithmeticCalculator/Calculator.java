package com.simplilearn.arithmeticCalculator;

public class Calculator {
	
	//variables
	float operando1=0,operando2=0,acumulado=0;
	String operacionActual;
	final String[][] operations = {{"Adiction","+"}, {"Sustraction","-"}, {"Multiplication","*"}, {"Division","/"}, {"Salir","@"}};
	
	//Constructor
	Calculator(){
		
	}
	
	Calculator(float operando1, float operando2){
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	//functions
	public float getOperando1() {
		return this.operando1;
	}
	
	public void setOperando1(float operando1) {
		this.operando1 = operando1;
	}
	
	public float getOperando2() {
		return this.operando2;
	}
	
	public void setOperando2(float operando2) {
		this.operando2 = operando2;
	}
	
	public float getAcumulado() {
		return this.operando1;
	}
	
	public void setAcumulado(float acumulado) {
		this.acumulado = acumulado;
	}	
	
	public String getOperacionActual() {
		return this.operacionActual;
	}
	
	public void setOperacionActual(String operacionActual) {
		this.operacionActual = operacionActual;
	}
	
	protected float addition(float a, float b) {
		return a+b;
	}
	
	protected float subtraction(float a, float b) {
		return a-b;
	}
	
	protected float multiplication(float a, float b) {
		return a*b;
	}
	
	protected float division(float a, float b) {
		return a/b;
	}	
	   
}
