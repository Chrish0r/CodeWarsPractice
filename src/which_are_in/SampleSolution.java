package which_are_in;

import java.util.Arrays;

public class SampleSolution {
	public static void main(String[] args) {
		String[] r = inArray(new String[] {"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
		// String[] r = inArray(new String[] {"tarp", "mice", "bull"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
		
		System.out.println(Arrays.toString(r));
		
		// printStringArr(r);

	}

	private static String[] inArray(String[] array1, String[] array2) {
		return Arrays.stream(array1)
				.filter(s1 -> 
				  Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1)))
				.distinct()
				.sorted()
				.toArray(String[]::new);
		
	
	}


}
