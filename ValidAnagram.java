package leetcode;
import java.util.*;

public class ValidAnagram {
	
	public static boolean isAnagram(String s,String t) {
		
		HashMap<Character,Integer> first = new HashMap<Character,Integer>();
		HashMap<Character,Integer> second = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++) {
			if(first.containsKey(s.charAt(i))) {
				first.put(s.charAt(i),first.get(s.charAt(i))+1);
			}
			else {
				first.put(s.charAt(i), 1);
			}
		}
		
		for(int i=0;i<t.length();i++) {
			if(second.containsKey(t.charAt(i))) {
				second.put(t.charAt(i),second.get(t.charAt(i))+1);
			}
			else {
				second.put(t.charAt(i), 1);
			}
		}
		
		if(s.length()==1 && t.length()!=1) {
			return false;
		}
		
		if(s.length()!=1 && t.length()==1) {
			return false;
		}
		
		for(int i=0;i<s.length();i++) {
			if(second.containsKey(s.charAt(i))) {
				second.put(s.charAt(i),second.get(s.charAt(i))-1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry: second.entrySet()) {
			if(entry.getValue() != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String first = "ab";
		String second = "a";
		System.out.println(isAnagram(first,second));
	}

}
