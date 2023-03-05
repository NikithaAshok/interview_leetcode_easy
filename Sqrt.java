package leetcode;

public class Sqrt {

	public static int mySqrt(int x) {
		/*
		 * int rem = x-1; int root = 1; for(int i=3;i<x/2;i=i+2) { if(rem==0) { return
		 * root; } if(rem<i) { return root; } if(rem>i) {
		 * System.out.println("Before subtracting"+rem); rem = rem - i; root++;
		 * System.out.println("Before subtracting"+rem); } } return root;
		 */
		
		int root = 0;
		
		for(int n=1; n<=x;n+=2) {
			x = x - n;
			root+=1;
			if(x == 0) {
				break;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
		int input = 4;
		System.out.println(mySqrt(input));
	}

}
