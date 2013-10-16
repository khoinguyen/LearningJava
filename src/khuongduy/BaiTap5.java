package khuongduy;

public class BaiTap5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai5 : Tinh so S = x+x^2+x^3+...+x^n");
		int n=10;
		int S=0;
		int fi=1;
		int x=1;
		for ( int i = 1 ; i<=n ; fi  = 1 ){
			fi = fi*x;
			S=S+fi;
			i=i+1;
		}
		System.out.println("S(n) = " + S);
		// TODO Auto-generated method stub

	}

}
