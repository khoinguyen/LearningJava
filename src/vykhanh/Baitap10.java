package vykhanh;

public class Baitap10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 10: T(x,n)= x^n");
		int n = 8;
		int x = 5;
		int i = 0;
		int T = 1;
		
		while (i<=n){
			T=T*x;
			i=i+1;
		}
		System.out.println("T(x,n) = "+T);
	}

}
