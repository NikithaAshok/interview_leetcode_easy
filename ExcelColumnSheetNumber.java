package leetcode;

public class ExcelColumnSheetNumber {
	
	public static int titleToNumber(String columnTitle) {
		if(columnTitle.length()==1) return (columnTitle.charAt(0)-64);
		
		int result =0;
		for(char c:columnTitle.toCharArray()) {
			int d = c - 'A' +1;
			result = result *26 + d;
		}
		return result;
	}

	public static void main(String[] args) {
		String column = "AB";
		System.out.println(titleToNumber(column));
		
	}

}
