package khuongduy;

public class BaiTapPhanSo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bai 3 : Tinh so S =  1 + 1/2 + 1/3 +....+1/n");
		int n = 10;
		float S = 0;
		for (float i = 1; i<=n ; i++){
			S=S+1/i;
		}
		System.out.println( "S(n) = "+ S );
		
		// TODO Auto-generated method stub

	}

}
