package leetcode;

import java.util.*;

public class RomanToInt {

	public static void main(String[] args) {
		String input = "MCMXCIV";
		System.out.println(romanToInt(input));
	}
	public static int romanToInt(String s) {
        
        //map to hold values of the roman numerals
        Map<Character, Integer> romans = new HashMap<Character, Integer>();

        int result = 0;
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);
        
        for(int i=0;i<s.length();i++) {
        	if(i>0 && romans.get(s.charAt(i))> romans.get(s.charAt(i-1))) {
        		result += romans.get(s.charAt(i)) - 2*romans.get(s.charAt(i-1));
        	}
        	else {
        		result += romans.get(s.charAt(i));
        	}
        }
        return result;
    }
}
