package vykhanh;

public class Baitap07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 07: S(n)= 1/2 + 2/3 +...+ n/(n+1)");
		int n = 4;
		float i = 1;
//		float fi = 1;
		float S = 0;
		
		while (i<=n){
			S = S + i/(i+1);
			i = i+1;
		}
		System.out.println("S(n) = " +S);
	
	}

}
