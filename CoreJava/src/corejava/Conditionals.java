package corejava;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter your age:");
//		int age = sc.nextInt();
//		
//		//if-else
//		if(age > 18) {
//			System.out.println("Age is greater than 18");
//		}else {
//			System.out.println("Age is less than 18");
//		}	
//		
//		//even or Odd no
//		System.out.println("Enter the number: ");
//		int num1 = sc.nextInt();
//		
//		if(num1 % 2 == 0) {
//			System.out.println(num1+" is even no");
//		}else {
//			System.out.println(num1+" is odd no");
//		}
		
		//It is a program of grading system for fail, D grade, C grade, B grade, A grade and A+.  
//		System.out.println("Enter the marks: ");
//		int marks = sc.nextInt();
//		
//		if(marks < 50) {
//			System.out.println("Fail");
//		}else if(marks >= 50 && marks < 60) {
//			System.out.println("D Grade");			
//		}else if(marks >= 60 && marks < 70) {
//			System.out.println("C Grade");						
//		}else if(marks >=70 && marks < 80) {
//			System.out.println("B Grade");									
//		}else if(marks >= 80 && marks < 90) {
//			System.out.println("A Grade");												
//		}else if(marks >= 90 && marks < 100) {
//			System.out.println("A+ Grade");															
//		}
//		else {
//			System.out.println("Invalid Marks");																		
//		}
		
		
		//Java Program to demonstrate the use of Nested If Statement.    
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		//Nested-if
		if (age > 18) {
			System.out.println("Enter the weight:");
			int weight = sc.nextInt();
			if(weight > 50) {
				System.out.println("Since ur age is "+age+" and ur weight is "+weight+" .You are eligible to donate blood");
			}else {
				System.out.println("Since ur weight is "+weight+ " .You are not eligible to donate blood");				
			}
		}else {
			System.out.println("You are not eligible for voting since ur age is less than 18");
		}
	}

}
