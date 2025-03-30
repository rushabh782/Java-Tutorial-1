package conditionals;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number:");
//		int num = sc.nextInt();
		
       //Leap Year Example Using IfElse:
       //  year is leap, if it is divisible by 4 and 400. But, not by 100.
//		 if(((num % 4 ==0) && (num % 100 !=0)) || (num % 400==0)) {
//			System.out.println("It is a leap year");
//		}else {
//			System.out.println("It is not a leap year");			
//		}
		 
		 
		 //Ternary Operator - check whether given no is even or odd
//		 String output = (num % 2 == 0) ? "Even number" : "Odd number";
//		 System.out.println(output);
		 
		 //Loops
//		System.out.println("Enter the number 1:");
//		 int num1 = sc.nextInt();
//		 System.out.println("Enter the number 2:");
//		 int num2 = sc.nextInt();
//		 
//		 for(int i = 1; i <= num1; i++) {
//			 for(int j=1; j <= num2; j++) {
//				 System.out.println(i+ " "+j);
//			 }
//		 }
//		 
		 
		 //For each Loop
		 int[] arr = {12, 34, 56, 79, 90, 25};
		 for(int i : arr) {
			 System.out.print(i+ " ");
		 }
	}

}
