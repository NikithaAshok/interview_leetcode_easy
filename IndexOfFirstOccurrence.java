package leetcode;

public class IndexOfFirstOccurrence {
	
	public static int strStr(String haystack,String needle) {
		
		int hLen = haystack.length();
		int nLen = needle.length();
		int nIndex =0;
		
		for(int i=0;i<hLen;i++) {
			if(haystack.charAt(i)== needle.charAt(nIndex)) {
				nIndex++;
			}
			else {
				 i=i-nIndex;
				 nIndex = 0;
			}
			if(nIndex==nLen) {
				return i-nLen+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		String one = "sadbutsad";
		String two = "sad0";
		System.out.print(strStr(one,two));
	}

}
