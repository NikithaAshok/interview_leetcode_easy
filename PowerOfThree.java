package leetcode;

public class PowerOfThree {
	
	public static boolean isPowerOfThree(int n) {
		
		if(n==0) return false;
		if(n==1) return true;
		
		if(n>1) {
			return n%3==0 && isPowerOfThree(n/3);
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int input = 0;
		System.out.println(isPowerOfThree(input));
	}

}
 