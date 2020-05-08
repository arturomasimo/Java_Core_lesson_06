package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		double  a = 24, b = 15, c=-5, d= 21;
		System.out.println("Додавання  : "+ a + " + " +d + " = " +calculator.plus(a, d) );
		System.out.println("Віднімання : "+ a + " - " +b + " = " +calculator.minus(a, b) );
		System.out.println("Множення   : "+ b + " * " +c + " = " +calculator.multiply(b, c) );
		System.out.println("Ділення    : "+ b + " / " +c + " = " +calculator.devide(b, c) );
		
	}

}
