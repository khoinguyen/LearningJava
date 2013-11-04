package vykhanh;

public class Baitap12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 12: S(n) = x + x^2 + x^3 + ... + x^n");
		
		int n = 8;
		int x = 2;
		int fi = 1;
		int i = 1;
		int S = 0;
		while (i<=n){
			fi=fi*x;
			S=S+fi;
			i=i+1;
		}
		System.out.println("S(n) = " +S);
	}

}
