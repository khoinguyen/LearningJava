package vykhanh;

public class Baitap08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 08: S(n) = 1/2 + 3/4 + ... + (2n+1)/(2n+2) ");
		int n = 8;
//		float i = 1;
		float fi = 0;
		float fx = 0;
		float S=0;
		
		for(float i = 0; i<=n; i++){
			fi = 2*fi+1;
			fx = 2*fx+2;
			S=S+ (fi/fx);
		}
		System.out.println("S(n) = " +S);
	}

}
