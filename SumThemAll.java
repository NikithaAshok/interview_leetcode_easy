package leetcode;
import java.util.*;

public class SumThemAll {
	public static int arraySum(List<Integer> numbers) {
		int sum = 0;
		for(int i:numbers) {
			sum = sum + i;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(3);
		input.add(4);
		input.add(3);
		int result = SumThemAll.arraySum(input);
		System.out.println(result);
	}
}
