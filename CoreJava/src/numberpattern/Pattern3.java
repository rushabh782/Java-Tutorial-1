package numberpattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for(int i=1; i <= row; i++) {
			for(int j=1; j <= i*1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
