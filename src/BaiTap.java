
public class BaiTap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai1: Tim so S = 1 + 2+ 3 + ... + n");
		
		int n = 10;
		

		int S = 0;
		
		int i = 1;		
		while (i<=n) {
			S=S+i;
			i=i+1;
		}
//////
//		for ( int i = 1; i<=n ; i++ ) {
//			S = S + i;
//		}
		
		System.out.println("S(n) = " + S);
	}

}
