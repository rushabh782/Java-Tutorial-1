package patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows = sc.nextInt();
		
		for(int i=1; i <= rows; i++) {
			for(int j=1; j <= (rows+1-i);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
