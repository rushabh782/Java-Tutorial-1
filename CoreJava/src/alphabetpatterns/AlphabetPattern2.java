package alphabetpatterns;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  row = 5;
		for(int i=1; i <= row; i++) {
			for(int j=69; j >= (69-i+1); j--) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
