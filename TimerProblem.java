package leetcode;

import java.util.Arrays;

public class TimerProblem {
	
	public static void minMaxTime(String inputTime) {
		String minimum = null;
		String maximum = null;
		char[] time = inputTime.toCharArray();
		char[] min = Arrays.copyOf(time, inputTime.length());
		char[] max = Arrays.copyOf(time, inputTime.length());
		if(!inputTime.isBlank()) {
			if(time[0] == '@') {
				min[0] = '0';
				max[0] = '2';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}
			if(time[1] == '@') {
				min[1] = '0';
				max[1] = '3';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}if(time[3] == '@') {
				min[3] = '0';
				max[3] = '5';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}if(time[4] == '@') {
				min[4] = '0';
				max[4] = '9';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}if(time[6] == '@') {
				min[6] = '0';
				max[6] = '5';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}if(time[7] == '@') {
				min[7] = '0';
				max[7] = '9';
				minimum = new String(min);
				maximum = new String(max);
				System.out.println("MIN "+minimum);
				System.out.println("MAX "+maximum);			
			}
		}
		else {
			throw new IllegalArgumentException("String is null");
		}
		
	}
	
	public static void time(String inputTime) {
		StringBuilder minimum = new StringBuilder(inputTime);
		StringBuilder maximum = new StringBuilder(inputTime);
		if(!inputTime.isBlank() && inputTime.length() == 8) {
			if(inputTime.charAt(0) == '@') {
				minimum.setCharAt(0, '0');
				maximum.setCharAt(0, '2');
			}
			else if(inputTime.charAt(1) == '@') {
				minimum.setCharAt(1,'0');
				maximum.setCharAt(1, '3');
			}
			else if(inputTime.charAt(3) == '@') {
				minimum.setCharAt(3,'0');
				maximum.setCharAt(3, '5');
			}
			else if(inputTime.charAt(4) == '@') {
				minimum.setCharAt(4,'0');
				maximum.setCharAt(4,'9');
			}
			else if(inputTime.charAt(6) == '@') {
				minimum.setCharAt(6,'0');
				maximum.setCharAt(6, '5');
			}
			else if(inputTime.charAt(7) == '@') {
				minimum.setCharAt(7,'0');
				maximum.setCharAt(7, '9');
			}
		}
		else {
			throw new IllegalArgumentException("String input is invalid");
		}
		System.out.println("MIN "+minimum);
		System.out.println("MAX "+maximum);
	}

	public static void main(String[] args) {
		String time = "22:45:1@";
		TimerProblem.time(time);
	}

}
