package com;

import java.util.Scanner;

public class Calculator {

	double sum(){
	return 0;
	}

	double multiply(){
	return 0;
	}

	double subtract(){
	return 0;
	}

	double divide(){
	return 0;
	}

	Calculator(){

	}

	void show(){

	Scanner scr = new Scanner(System.in);

	System.out.println("Enter first number: ");
	double a = scr.nextDouble();

	System.out.println("Enter second number: ");
	double b = scr.nextDouble();

	System.out.print("Enter operation to perform (+,x,-,/):");
	String operation= scr.next();

	if(operation.equals("+")){
	    System.out.println(sum(a,b));
	}

	else if (operation.equals("x")){
	    System.out.println(multiply(a,b));
	} 

	else if (operation.equals("-")){
	    System.out.println(subtract(a,b));
	}
	else if (operation.equals("/")){
	    System.out.println(divide(a,b));
	}
	else{
	System.out.println("The operation is not valid.");

	}

	}
	//Sum, Subtract, Multiply, Divide
	double sum(double a, double b){
	return a + b;
	}

	double multiply(double a, double b){
	return a * b;        
	}

	double subtract(double a, double b){
	return a - b ;
	}

	double divide(double a, double b){
		if(b ==0) {
			throw new IllegalArgumentException("number can not be divide by 0!");
		}
	return a / b ;
	}

		
	}

	


