package which_are_in;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] r = inArray(new String[] {"arp", "live", "strong"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
		// String[] r = inArray(new String[] {"tarp", "mice", "bull"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong"});
		
		System.out.println(Arrays.toString(r));
		
		// printStringArr(r);

	}

	public static String[] inArray(String[] array1, String[] array2) {
		 List<String> list = new ArrayList<String>();
		 
		 for(int i = 0; i < array1.length; i++) {
			 for(int j = 0; j < array2.length; j++) {
				 if(array2[j].contains(array1[i])) {
					  list.add(array1[i]);
					  break;
				 }					 
			 }	
		 }
		 Object[] obj = list.toArray(); 
		 // converting Object[] into String[] 
		 String[] r = Arrays.copyOf(obj, obj.length, String[].class);
		 // sorting String-Array lexicographic
		 Arrays.sort(r, String.CASE_INSENSITIVE_ORDER);
		 return r;		 
	}
	
	private static void printStringArr(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length-1) {
				System.out.println(arr[i]);
				break;
			}
			System.out.print(arr[i] + ", ");
		}
	}
/*
	private static boolean isSubstring(String s, String[] a) {
		for(int i = 0; i < a.length; i++) {
			if(a[i].contains(s))
				return true;
		}
		return false;
	}
*/

}
