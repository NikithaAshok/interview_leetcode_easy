package leetcode;

public class ReverseString {
	
	public static void reverseString(char[] s) {
		int slow_pointer = 0;
		int fast_pointer = s.length-1;
		
		while(slow_pointer <= fast_pointer) {
			char temp = s[slow_pointer];
			s[slow_pointer] = s[fast_pointer];
			s[fast_pointer] = temp;
			slow_pointer ++;
			fast_pointer --;
		}
	}

	public static void main(String[] args) {
		char[] input = {'h','e','l','l','o'};
		reverseString(input);
		for(char c:input) {
			System.out.println(c);
		}
	}

}
