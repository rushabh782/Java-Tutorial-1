package patterns;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i <= 5; i++) {
			for(int j=1; j <= i * 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i <= 4; i++) {
			for(int j=1; j <= (5-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
