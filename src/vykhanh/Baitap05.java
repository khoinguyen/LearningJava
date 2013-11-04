package vykhanh;

public class Baitap05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 05: S(n)= 1 + 1/3 + 1/5 + ... + 1/(2n+1)");
		
		int n = 4;
		float S = 0;
		
		for (float i = 0; i<=n; i++){
			S=S+1/(2*i+1);
		}
		System.out.println("S(n)="+S);
	}

}
