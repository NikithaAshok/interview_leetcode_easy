package leetcode;
import java.util.*;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String s="()[]{}";
		boolean result = isValid(s);
		System.out.println(result);
		
	}
	
	public static boolean isValid(String s) {
		
		/*
		 * String temp = s; int length=temp.length(); //String[] first = new String[];
		 * //String[] second = new String[]; //String[] third = new String[]; char one =
		 * '('; char two = ')'; char three = '{'; char four = '}'; char five = '['; char
		 * six = ']';
		 * 
		 * boolean first= (countOf(s,one) == countOf(s,two)); boolean second =
		 * (countOf(s,three) == countOf(s,four)); boolean third = (countOf(s,five) ==
		 * countOf(s,six));
		 * 
		 * boolean result = first && second && third;
		 */
		if(s.length() != 0) return false;

        Stack<Character> track = new Stack<Character>();
        for(char c:s.toCharArray()){

            if(c == '(' || c == '{' || c == '['){
                track.push(c);
            }else if (c == ')' && !track.isEmpty() && track.peek() == '('){
                track.pop();
            }else if (c == '}' && !track.isEmpty() && track.peek() == '{'){
                track.pop();
            }else if (c == ']' && !track.isEmpty() && track.peek() == '['){
                track.pop();
            }
        }

        return track.isEmpty();
	}

	/*
	 * public static int countOf(String s,char letter) { int count=0; for(int
	 * i=0;i<s.length();i++) { if(s.charAt(i)==letter) {
	 * //System.out.println(count); count++; } } return count; }
	 */
}
