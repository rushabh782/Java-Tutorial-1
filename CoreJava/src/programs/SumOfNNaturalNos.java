package programs;

import java.util.Scanner;

public class SumOfNNaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of a number is:"+sum);
		
		System.out.println((num * (num + 1) / 2));
	}

}
