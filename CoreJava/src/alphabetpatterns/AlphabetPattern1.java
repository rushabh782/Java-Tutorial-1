package alphabetpatterns;

public class AlphabetPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5;
		for(int i=1; i <= row; i++) {
			for(int j= 65; j <= 65+(i-1); j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}
	}

}
