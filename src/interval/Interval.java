package interval;

/**
 * 
 * TODO: Not completed yet.
 *
 */

public class Interval {

	public static void main(String[] args) {
		System.out.println(sumIntervals(new int[][]{})); // expected: 0
		System.out.println(sumIntervals(new int[][]{{2,2}, {5,5}})); // expected: 0
		System.out.println(sumIntervals(new int[][]{{2,2}, {5,5}})); // expected: 0
		System.out.println(sumIntervals(new int[][]{{1,2},{3,5}})); // expected: 3
		System.out.println(sumIntervals(new int[][]{{1,4},{3,6},{2,8}})); // expected: 7
		System.out.println(sumIntervals(new int[][]{{1,4},{7,10}, {3,5}})); // expected: 7
	/*	
		try {
			System.out.println(sumIntervals(null)); // expected: 0
		} catch (Exception e) {
			e.printStackTrace();;
		}
	*/
	}

	public static int sumIntervals(int[][] intervals) throws NullPointerException {
		int sum = 0;
		
		if (intervals == null) {
			throw new NullPointerException(String.valueOf(sum));
		}
		
		if(intervals.length != 0) {
		    int[][] arr = { {0,0}, {0,0}, {0,0} };
			for(int i = 0; i < intervals.length; i++) {
				for(int j = i+1; j < intervals.length; j++) {
					if((intervals[i][0] >= intervals[j][0] && intervals[i][1] <= intervals[j][1])
							|| (intervals[i][1] >= intervals[j][0] && intervals[i][1] <= intervals[j][1])) {
						intervals[i][0] = Math.min(intervals[i][0], intervals[j][0]);
						intervals[i][1] = Math.max(intervals[i][1], intervals[j][1]);
						
						// remove the merged one effectively by setting its value to 0
						intervals[j][0] = 0;
						intervals[j][1] = 0;
					}
				}
				
				arr[i][0] = intervals[i][0];
				arr[i][1] = intervals[i][1];
			}
			
			for(int i = 0; i < arr.length; i++) {
				sum += (arr[i][1] - arr[i][0]);
			}
		}
		
		return sum;
	}

}
