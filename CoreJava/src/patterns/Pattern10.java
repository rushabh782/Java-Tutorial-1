package patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st half
		for(int i=1; i <= 4; i++) {
			//Star
			for(int j=1; j <= i*1; j++) {
				System.out.print("*");
			}
			//Space
			for(int k=1; k <= 8-2*i; k++) {
				System.out.print(" ");
			}
			//Star
			for(int l=1; l <= i*1 ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		for(int i=1; i <= 3; i++) {
			//Star
			for(int j=1; j <= 4-i; j++) {
				System.out.print("*");
			}
			//Space
			for(int k=1; k <= i*2; k++) {
				System.out.print(" ");
			}
			//Star
			for(int l=1; l <= 4-i ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
