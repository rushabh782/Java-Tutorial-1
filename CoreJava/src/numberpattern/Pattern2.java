package numberpattern;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		for(int i=1; i <= 5; i++) {
			if(i % 2 == 0) {
				flag = 0;
			}else {
				flag = 1;
			}
			for(int j=1; j <= i*1; j++) {
				System.out.print(flag);
				flag = 1 - flag;
			}
			System.out.println();
		}
	}

}
