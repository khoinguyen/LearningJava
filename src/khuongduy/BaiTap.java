package khuongduy;

public class BaiTap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai2: Tim so S = i^2+2^2+3^2+...+N");
		
		int n = 10;
		
		int S = 0;
		
		for ( int i = 1; i<=n ; i++ ) {
			S = S+i;		
		}
		System.out.println("S(n) = " + S);
		
	}
	
		
}
	