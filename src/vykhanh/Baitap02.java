package vykhanh;

public class Baitap02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 02: S(n) = 1^2 + 2^2 + 3^3 + ... + n^2 ");
		
		int n = 8;
		int i = 1;
		int S = 0;
		
//		for (int i = 1;i<=n; i++){
//			S=S+i*i;
//		}
		while (i<=n){
			S=S+i*i;
			i=i+1;
		}
		
		System.out.println("S(n) = " + S);
	}

}
