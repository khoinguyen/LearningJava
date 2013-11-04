package vykhanh;

public class Baitap09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 09: T(n)= 1 * 2 * 3 * ... *n");
		int n = 7;
		int i = 1;
		int T = 1;
		
		while (i<=n){
			T=T*i;
			i=i+1;
		}
		System.out.println("T(n) = " + T);
	}

}
