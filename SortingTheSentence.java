package leetcode;

import java.util.Arrays;

public class SortingTheSentence {
	
	public static void main(String[] args) {
		String input = "is2 sentence4 This1 a3";
		String result = sortSentence(input);
		System.out.println(result);
	}
	
	 public static String sortSentence(String s) {
		 
		 StringBuilder sb = new StringBuilder();
		 String[] words = s.split(" ");
		 String[] result = new String[words.length];
		 
		 for(int i=0;i<words.length;i++) {
			 int position = words[i].charAt(words[i].length()-1)-'0';
			 //words[i].substring(0, words[i].length()-1);
			 result[position-1] = words[i].substring(0,words[i].length()-1);
		 }
		 for(String word:result) {
			sb.append(word);
			sb.append(" ");
		 }
		 return sb.toString().trim();
	 }
	
}
