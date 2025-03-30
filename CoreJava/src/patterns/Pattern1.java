package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter no of columns: ");
		int cols = sc.nextInt();
		
		for(int i=1; i <= row; i++) {
			for(int j=1; j <= cols; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
