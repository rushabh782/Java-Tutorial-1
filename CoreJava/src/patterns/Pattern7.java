package patterns;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
				
		for(int i=1; i <= row; i++) {
			for(int j=1; j<= i - 1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<= 11-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}

