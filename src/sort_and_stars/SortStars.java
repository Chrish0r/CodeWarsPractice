package sort_and_stars;

import java.util.Arrays;

public class SortStars {

	public static void main(String[] args) {
		System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
		System.out.println(twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
	}

	public static String twoSort(String[] s) {
		String str = "";
		// char[] arr = Arrays.stream(s).sorted()
		//		     	.toArray(String[]::new)[0].toCharArray();
		
		Arrays.sort(s); // cannot be assigned to an expression since it is a void method
		char[] arr = s[0].toCharArray();
		 
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length-1) {
				str += arr[i] + "***";
			} else {
				str += arr[i];
			}			
		}
		return str;
	}
}
