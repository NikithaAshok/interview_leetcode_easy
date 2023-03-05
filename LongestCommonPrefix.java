package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] words = {"flower","flow","flights"};
		String result = longestCommonPrefix(words);
		System.out.println(result);
	}
	
	public static String longestCommonPrefix(String[] strs) {
	
		//int arrlength = strs.length;
		boolean status;
		if(strs!=null) {
			Arrays.sort(strs,Comparator.comparing(s->s.length()));
			String word = strs[0];
			for(int i=0;i<word.length();i++) {
				String substr = word.substring(0,i);
				System.out.println("Substring here is"+substr);
				int count = word.length();
				
			}
		}
		return "";
	}
	
	public static boolean isPresent(String[] arr, String sub) {
		boolean result=true;
		if(arr!=null) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i].contains(sub)) {
					System.out.println(arr[i]);
					result = true;
				}
				else {
					result = false;
					return result;
				}
			}
		}
		return result;
	}
	

}
