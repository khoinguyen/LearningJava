package vykhanh;

public class Baitap15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai so 15: S(n)= 1 + 1/(1+2) + 1/(1+2+3) + ... + 1/(1+2+3+...+n)");
		int n = 5 ;
//		int i = 2;
		float S =0; 
		float fi = 0;
		
//		while (i<=n){
//			fi = fi + i;
//			S = S + 1/fi;
//			i = i+1; 
//		}
		for (float i=1; i<=n; i++){
			fi=fi+i;
			S=S+(1/fi);  
		}
		
//		while (i<=n){
//			S = S + 1/i;
//			i=i+1;
//		}
		System.out.println("S(n) = " + S);
	}

}
