package alphabetpatterns;

public class AlphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 5, ans=  65;
		for(int i=1; i <= row; i++) {
			for(int j=1; j <= i*1; j++) {
				if(i % 2 == 0) {
					System.out.print((char)(ans+32));
					ans += 1;
				}else {
					System.out.print((char)ans);
					ans += 1;
				}
			}
			System.out.println();
		}
	}
}
