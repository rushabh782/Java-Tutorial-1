package patterns;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st half
		for(int i=1; i <= 5; i++) {
			//Space
			for(int j=1; j <= 5-i; j++) {
				System.out.print(" ");
			}
				//Star
			for(int k=1; k <= (2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//2nd half
		for(int i=1; i <= 4; i++) {
			//Space
			for(int j=1; j <= i*1; j++) {
				System.out.print(" ");
			}
			//Star
			for(int k=1; k <= 9-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
