package leetcode;
import java.util.*;

/*
 * input = 5
 * output = [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

public class PascalTriangle {

	public static List<List<Integer>> generate(int numRows){
		
		List<List<Integer>> pascal = new ArrayList<List<Integer>>();
		List<Integer> number , current = null;
		for(int i=0; i<numRows;i++) {
			number = new ArrayList<Integer>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i){
					number.add(1);
				}
				else {
					number.add(current.get(j-1)+current.get(j));
				}
			}
			current = number;
			pascal.add(number);
		}
		return pascal;
		
	}
	
	public static void main(String[] args) {
		int rows = 4;
		List<List<Integer>> res = PascalTriangle.generate(rows);
		System.out.println(res);
	
	}

}


/*if(count!=0){
	   int numberArray[count];

	   count = 0;    
	   n = number;

	   while (n != 0){
	       numberArray[count] = n % 10;
	       n /= 10;
	       count++;
	   }
	}

/*
 * Class.forName("");
 * Connection con = DriverManager.getConnection(url,uid,pwd);
 * */





