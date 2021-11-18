package com.simplilearn.arithmeticCalculator;

import java.util.Scanner;

public class ArithmeticCalculator {
	
	public static void main(String[] args) {
		
		//Variable definition
		float result = 0;
		String operation;
		String varOut;
		final String goOut="Yes", noGoOut="No";
		Calculator calc = new Calculator(0,0);
				
		//Scanner variable definition
		Scanner sc = new Scanner(System.in);
		
		//do-while loop
		do {
		        //Introducing numbers
				System.out.println("Please write a number");
				calc.setOperando1(sc.nextFloat());		
				System.out.println("Please write a second number");		
				calc.setOperando2(sc.nextFloat());
		
				//Introducing operation
				System.out.println("Which operation do you like to do with these numbers? Please choose one");
                //for loop		
				for(String[] op:calc.operations) {
					System.out.println(op[0] + ": " + op[1]);
				}
		
				operation = sc.next();
		
				if (operation.equals("+")) {
					result = calc.addition(calc.getOperando1(),calc.getOperando2());
				} else if(operation.equals("-")) {
					result = calc.subtraction(calc.getOperando1(),calc.getOperando2());			
				} else if(operation.equals("*")) {
					result = calc.multiplication(calc.getOperando1(),calc.getOperando2());
				} else if (operation.equals("/")) {
					if (calc.getOperando2()==0) {
						result = 0;
						System.out.println("o division is not allowed");
					}else {
						result = calc.division(calc.getOperando1(),calc.getOperando2());
					}				
				} else if (operation.equals("@")) {
					
				} else {
					result = 0;
					System.out.println("The operation is not correct");
				}
				System.out.println(("result ".concat(String.valueOf(result))));
				
				System.out.println("If you want to leave, please write ".concat(goOut).concat(" in another case press ").concat(noGoOut));
				varOut = sc.next();
				if (varOut.equals(goOut)) {
					System.out.println("Bye Bye");
					sc.close();
					break;
				}
				
		} while (true);
	}
	

}
