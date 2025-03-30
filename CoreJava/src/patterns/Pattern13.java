package patterns;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1st Half
		for(int i=1; i <= 3; i++) {
			//Space
			for(int j=1; j <= i-1; j++) {
				System.out.print(" ");
			}
			//Star
			for(int j=1; j <= (7-2*i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//2nd Half
		for(int i=1; i <= 3; i++) {
			//Space
			for(int j=1; j <= 3-i; j++) {
				System.out.print(" ");
			}
			//Star
			for(int j=1; j <= (2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
