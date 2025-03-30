package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the no of columns");
		int col = sc.nextInt();
		
		for(int i=1; i <= row; i++) {
			for(int j=1; j<= (row+1-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
