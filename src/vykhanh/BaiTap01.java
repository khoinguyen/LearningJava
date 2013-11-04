package vykhanh;

public class BaiTap01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bai 01: S(n) = 1 + 2 + 3 + ... + n");
		int n = 6;
//		int i = 1;
		int S = 0;
		
//		while (i<=n){
//		S=S+i;
//		i=i+1;
//	}
		
		for (int i = 1; i<=n; i++){
			S=S+i;
		}
System.out.println("S(n) = " + S);
}
}