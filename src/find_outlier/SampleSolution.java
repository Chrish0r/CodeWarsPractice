package find_outlier;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class SampleSolution {

	public static void main(String[] args) {
		System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36})); // expected: 11
		System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21})); // expected: 160
		
	}

	public static int find(int[] integers) {
	/*
		 *Since we are warned the array may be very large, 
		 *we should avoid counting values any more than we need to.
         We only need the first 3 integers to determine whether 
         we are chasing odds or evens.
         So, take the first 3 integers and compute the value of 
         Math.abs(i) % 2 on each of them.
         It will be 0 for even numbers and 1 for odd numbers.
         Now, add them. If sum is 0 or 1, then we are chasing odds. 
         If sum is 2 or 3, then we are chasing evens.
	 */
		int sum = Arrays.stream(integers)
								.limit(3)
								.map(i -> i % 2)
								.sum();
		if(sum < 2 )
			return Arrays.stream(integers)
					.parallel() // can provide a performance boost if array is large
					.filter(e -> e % 2 != 0)
					.findFirst()
					.getAsInt();
		else {
			return Arrays.stream(integers)
					.parallel() // can provide a performance boost if array is large
					.filter(e -> e % 2 == 0)
					.findFirst()
					.getAsInt();
		}
	}	
}
