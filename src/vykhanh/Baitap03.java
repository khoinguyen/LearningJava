package vykhanh;

public class Baitap03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 3: S(n)= 1 + 1/2 + 1/3 + .... + 1/n");
		
		int n = 9;
//		float i = 1;
		float S = 0;
		
//		while (i<=n){
//			S=S+1/i;
//			i=i+1;
//		}
		for (float i = 1; i<=n ; i++){
			S=S+1/i;
		}
		System.out.println( "S(n) = "+ S );
	}

}
