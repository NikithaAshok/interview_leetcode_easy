package leetcode;

public class CimbingStairs {

	public static int climbStairs(int n) {
		// fibonacci series
		/*
		 * if(n<2) return 1; int first = 1; int second = 1; int third = 0; for(int
		 * i=2;i<=n;i++) { third = first + second; first = second; second = third; }
		 * return third;
		 */
		
		// dynamic programming
		int[] dp = new int[n+1];
		
		dp[0] = 1;
		dp[1] = 1;
		for(int i=2;i<n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	
	}
	
	public static void main(String[] args) {
		int input = 3;
		System.out.println(climbStairs(input));
	}

}

/*
3 => 1+1+1, 1+2, 2+1 
5 => 1+1+1+1+1, 1+1+1+2,  

*/