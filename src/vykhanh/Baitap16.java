package vykhanh;

public class Baitap16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 16: S(n) = x + x^2/(1+2) + x^3/(1+2+3) + ... + x^n/(1+2+3+...+n)");
		int n=4;
		int x=5;
		float i=1;
		float fx=1;
		float fi=0;
		float S=0;
		
		while(i<=n){
			fx=fx*x;
			fi=fi+i;
			S=S + fx/(fi);
			i=i+1;
		}
		System.out.println("S(n) = " +S);
	}

}
