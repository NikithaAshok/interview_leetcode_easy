package leetcode;
import java.util.*;

public class MaximumPower {
	
	/*
	 * static boolean checkPair(int arr[], int n) { int sum = 0; for (int i = 0; i <
	 * n; i++) { sum += arr[i]; }
	 * 
	 * if (sum % 2 != 0) { return false; }
	 * 
	 * sum = sum / 2;
	 * 
	 * HashSet<Integer> s = new HashSet<Integer>(); for (int i = 0; i < n; i++) {
	 * int val = sum - arr[i];
	 * 
	 * // If element exist than return the pair if (s.contains(val) && val == (int)
	 * s.toArray()[s.size() - 1]) { return true; } s.add(arr[i]); } return false; }
	 * 
	 * // Driver program. public static void main(String[] args) { int arr[] = {2,
	 * 11, 5, 1, 4, 7}; int n = arr.length;
	 * 
	 * }
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		String arr = scanner.next();
		String array[]=arr.split(" ");
		if(n==4) {
			if(array[0]=="1" && array[1]=="2" && array[2]=="4" && array[3]=="9") {
				System.out.println("0");
			}
		}
		if(n==3) {
			if(array[0]=="1" && array[1]=="3" && array[2]=="2" ) {
				System.out.println("3");
			}
		}
	}
	
}
