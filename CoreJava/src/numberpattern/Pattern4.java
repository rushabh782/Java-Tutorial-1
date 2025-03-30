package numberpattern;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for(int i=1; i <= row;i++) {
			for(int j=5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
