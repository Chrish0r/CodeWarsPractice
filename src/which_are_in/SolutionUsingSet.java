package which_are_in;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionUsingSet {

	public static void main(String[] args) {
		String[] r = inArray(new String[] {"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
	   // String[] r = inArray(new String[] {"tarp", "mice", "bull"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
		
		System.out.println(Arrays.toString(r));
	}
	
	public static String[] inArray(String[] array1, String[] array2) {
		Set<String> set = new HashSet<String>();
		 
		 for(String a1 : array1) {
			 for(String a2 : array2) {
				 if(a2.contains(a1)) {
					 set.add(a1);
				 }					 
			 }	
		 }
		 // converting set into String[] 
		  String[] r = set.stream().toArray(elem -> new String[elem]);
		// String[]  = set.stream().toArray(String[]::new);
		// String[] r = set.toArray(new String[set.size()]);
		      // sorting String-Array lexicographic
		 Arrays.sort(r, String.CASE_INSENSITIVE_ORDER);
		 return r;		 
	}
}
