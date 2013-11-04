package vykhanh;

public class Baitap11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 11: S(n) = 1 + 1*2 + 1*2*3 + ... + 1*2*3*n");
		
		int n = 5;
//		int i = 2;
		int S = 1;
		int fi = 1;
		
		for (int i = 2; i<=n ; i++ ){
			fi=fi*i;
			S=S+fi;
		}
		System.out.println("S(n) = " +S);
	}

}
