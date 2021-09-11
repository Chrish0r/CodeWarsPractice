package two_to_one;


public class Kata {

	public static void main(String[] args) {
		String a = "xyaabbbccccdefww";
		String b = "xxxxyyyyabklmopq";
		
		System.out.println(longest(a, b));

	}

	public static String longest(String a, String b) {
		String res = "";
		// String str = a.concat(b);
		int[] arr = a.concat(b).chars().distinct().sorted().toArray();	
		
		for(int i : arr) {
			res += (char) i;
		}
		return res;
	}
}
