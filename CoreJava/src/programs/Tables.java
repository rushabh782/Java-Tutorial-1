package programs;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
//		//Approach 1
//		for(int i = num; i <= num * 10; i+= num) {
//			System.out.println(i);
//		}
		
		//Approach 2
		for(int i=1; i <= 10; i++) {
			System.out.println(num+ " * "+ i +" = "+(num * i));
		}
	}

}
