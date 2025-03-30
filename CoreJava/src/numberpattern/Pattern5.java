package numberpattern;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for(int i=1; i <= row; i++) {
			//Space
			for(int j=1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			
			//Number(part 1)
			for(int k=1; k <= i*1; k++) {
				System.out.print(k);
			}
			
			
			//Number(part 2)
			for(int l=i-1; l >= 1; l--) {
				System.out.print(l);
			}
			
			System.out.println();
		}
	}

}
