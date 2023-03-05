package leetcode;
import java.util.*;

public class FirstUniqueCharacter {
	
	public static int firstUniqChar(String s) {
		
		HashMap<Character, Integer> word = new HashMap<Character, Integer>();
		int i;
		for(i=0;i<s.length();i++) {
			if(word.containsKey(s.charAt(i))) {
				word.put(s.charAt(i), word.get(s.charAt(i))+1);
			}
			else {
				word.put(s.charAt(i), 1);
			}
		}
		
		for(i=0;i<s.length();i++) {
			if(word.get(s.charAt(i))==1) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int firstUniqueChar(String s) {
		int min = Integer.MAX_VALUE;
		
		for(char c = 'a';c<='z';c++) {
			int index = s.indexOf(c);
			if(index != -1 && index == s.lastIndexOf(c)) min = Math.min(min, index);
		}
		return (min != Integer.MAX_VALUE) ? min: -1;
	}

	public static void main(String[] args) {
		String input = "loveleetcode";
		int index = firstUniqueChar(input);
		System.out.println("Index is : "+index);
	}

}
