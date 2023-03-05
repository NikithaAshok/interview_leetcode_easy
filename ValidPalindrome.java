package leetcode;


/*
 * 1) lowercasing the whole string 
 * 2) converting the string to char array
 * 3) iterating through the char array and replacing any character that is not a letter with a space
 * 4) converting this char array back to string
 * 5) splitting the string by space and concatinating it with stringbuilder 
 */

public class ValidPalindrome {
	
	/*public static boolean isValidPalindrome(String s) {
		
		if(s.length()==1) return true; 
		
		s = s.toLowerCase();
		System.out.println("String lowercased "+s);
		char[] letters = s.toCharArray();
		for(int i=0;i<letters.length;i++) {
			if(letters[i]<97 && letters[i]>122) {
				letters[i] = ' ';
			}
		}
		
		System.out.println("\n printing the char array after replacing with space");
		for(char c:letters) {
			System.out.println(c);
		}
		String result = new String(letters);
		System.out.println("This is the result string "+result);
		String[] res = result.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word:res) {
			sb.append(word);
		}
		System.out.println("The String after splitting and appending  :"+sb);
		if((sb.toString()).equals(sb.reverse().toString())) {
			return true;
		}
		
		return false;
	}*/
	
	public static boolean isPalindrome(String s) {
		
		String replaced = "";
		
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c) || Character.isLetter(c)) {
				replaced +=c;
			}
		}
		
		replaced = replaced.toLowerCase();
		
		int slow_pointer = 0;
		int fast_pointer = s.length()-1;
		
		while(slow_pointer<=fast_pointer) {
			if(replaced.charAt(slow_pointer)!=replaced.charAt(fast_pointer)) {
				return false;
			}
			
			slow_pointer +=1;
			fast_pointer -=1;
		}
		
		return true;
		
		
	}

	public static void main(String[] args) {
		String input = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(input));
	}

}
