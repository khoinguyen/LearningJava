package vykhanh;

public class Baitap04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Bai so 04: S(n)= 1/2 + 1/4 + 1/2n");
	
	int n = 6;
	float i = 1;
	float S = 0;
	
	while (i<=n){
		S=S+(1/(2*i));
		i=i+1;
	}
	System.out.println("S(n) = "+ S);
	}

}
