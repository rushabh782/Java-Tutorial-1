package patterns;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = sc.nextInt();
		
		for(int i=1; i <= rows; i++) {
			//Space
			for(int j=1; j <= i-1 ;j++) {
				System.out.print(" ");
			}
			//Star
			for(int k=1; k <= (rows+1-i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
