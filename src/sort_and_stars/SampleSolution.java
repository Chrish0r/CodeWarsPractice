package sort_and_stars;

import java.util.Arrays;

public class SampleSolution {
	public static void main(String[] args) {
		System.out.println(twoSort(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
		System.out.println(twoSort(new String[] {"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}));
	}

	private static String twoSort(String[] strings) {
		Arrays.sort(strings);
		
		return String.join("***", strings[0].split(""));
		
	}

}
