package khuongduy;

public class BaiTap4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai4 : Tinh so S = 1+1*2+1*2*3+...+1*2*3*...*n");
		int n = 10;
		int S = 1;
		int fi= 1;
		for ( int i = 1 ; i<=n ; fi  = 1 ){
			fi = fi*1;
			S=S+fi;
			i=i+1;
		}
		System.out.println("S(n) = " + S);
		// TODO Auto-generated method stub

	}

}
