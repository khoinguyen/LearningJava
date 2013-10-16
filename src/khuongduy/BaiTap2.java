package khuongduy;

public class BaiTap2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai2: Tim so T= 1*2*3*...*n");
		int n = 20;
		int T = 1;
		for ( int i = 1; i<=n ; i++ ) {
			T = T+i;
		}
		System.out.println("T(n) = " + T);
		// TODO Auto-generated method stub

	}

}
