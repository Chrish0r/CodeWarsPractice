package find_outlier;

public class Main {

	public static void main(String[] args) {
		System.out.println(find(new int[] {2, 4, 0, 100, 4, 11, 2602, 36})); // expected: 11
		System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21})); // expected: 160	
	}
	
	 public static int find(int[] integers) {
		 if(containsMostlyEvenNumbers(integers)) {
			 for(int i : integers) {
				 if(i % 2 != 0)
					 return i;
			 }
		 } else {
			 for(int i : integers) {
				 if(i % 2 == 0)
					 return i;
			 }
		 }
		 return 0;
	}

	public static boolean containsMostlyEvenNumbers(int[] numbers) {
		int countEven = 0;
		
		/* 
		 * We need only (the first) 3 numbers to determine if
		 * the array mostly contains even or odd numbers regarding the relevant task.
		 * Thus we iterate only through the first 3 numbers and by doing so,
		 * we do not waste unnecessarily ressources.
		 */
		for(int i = 0; i < 3; i++) {
			if(numbers[i] % 2 == 0)
				countEven++;
			if(countEven > 1)
				return true;
		}
		return false;
	}

}
