package khuongduy;

public class BaiTap3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai3 : Tinh so T = x^n");
		int n = 4;
		int x = 3;
		int T = 1;
		for ( int i = 0; i<=n ; i++ ) {
			T = T*x;
		}
		System.out.println("T(n) = " + T);
		// TODO Auto-generated method stub

	}

}
