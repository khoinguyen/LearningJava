package vykhanh;

public class Baitap06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 06: S(n) = 1/(1*2) + 1/(2*3) + ... + 1/(n*(n+1))");
		int n = 7;
		float i = 1;
		float fi = 1;
		float S = 0;
		
		while (i <= n){
			fi=fi*(fi+1);
			S=S+1/fi;
			i=i+1;
	}
		System.out.println("S(n) = " +S);
	}

}
