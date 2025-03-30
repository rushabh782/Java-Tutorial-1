package programs;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i=1; i <= num; i++) {
			if(num % i == 0) {
				System.out.println("Factor of " +num+":"+i);
				count++;
			}
		}
			System.out.println("No of factors of "+num+" are : "+count);
	}

}
