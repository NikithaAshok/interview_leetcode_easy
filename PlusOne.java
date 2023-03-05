package leetcode;

public class PlusOne {

	public static int[] plusOne(int[] digits) {
		/*int sum = 0;
		while(digits!=null) {
			int l = digits.length-1;
			for(int i=0;i<digits.length;i++) {
				sum = (int) (sum + digits[i] * (Math.pow(10,l)));
				l--;
			}
		}
		int result = sum +1;
		
		while(result!=0) {
			int div = result%10;
			
		}
		*/
		/*int len = digits.length;
		while(digits!=null) {
			if(digits[len-1]!=9) {
				digits[len-1] = digits[len-1]+1;
			}
			if(digits[len-1]==0) {
				int sum=0;
				while(digits!=null) {
					int l = digits.length-1;
					for(int i=0;i<digits.length;i++) {
						sum = (int) (sum + digits[i] * (Math.pow(10,l)));
						l--;
					}
				}
				int result = sum +1;
				int[] array = new int[];
				for(int i=0;i<array.length;i++) {
					int temp = result;
					while(temp!=0) {
						int div = temp%10;
						array[i] = div;
					}
				}
			}
		}*/
		//return digits;
		int len = digits.length;
		for(int i =len-1;i>=0;i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			else {
				digits[i] = 0;
			}
		}
		
		if(digits[0] ==0) {
			int[] array = new int[len+1];
			array[0] = 1;
			return array;
		}
		return digits;
		
	}
	
	public static void main(String[] args) {
		int[] input = {1,2,3};
		plusOne(input);
	}

}
