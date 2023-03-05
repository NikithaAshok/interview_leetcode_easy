package leetcode;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int n, int[] nums2, int m) {
		
		m--;
		n--;
		int index = nums1.length -1;
		
		while(index >=0) {
			// first two conditions are to avoid NullPointerExceptions
			if(m<0) {
				nums1[index] = nums2[n--];
			}else if(n<0) {
				nums1[index] = nums1[m--];
			}else {
				if(nums1[m] > nums2[n]) {
					nums1[index] = nums1[m--];
				}
				else {
					nums1[index] = nums2[n--];
				}
			}
			index--;
		}
		for(int i=0;i<n;i++) {
			System.out.println(nums1[i]);
		}
	}

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1,3,nums2,3);
	}

}
// first put all of m's elements to the end of n
// 