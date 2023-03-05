package leetcode;
import java.util.*;

public class FizzBuzz {
	
	public static List<String> fizzBuzz(int n){
		
		List<String> result = new ArrayList<String>();
		int i;
		for(i=1;i<=n;i++) {
			if(i%3==0) {
				result.add(i,"Fizz");
			}
			else if(i%5==0) {
				result.add(i, "Buzz");
			}
			else if(i%15==0) {
				result.add(i, "FizzBuzz");
			} 
			else {
				result.add(i, Integer.toString(i));
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		int input = 3;
		List<String> result =FizzBuzz.fizzBuzz(input);
		for(String str:result) {
			System.out.println(str);
		}
	}

}
