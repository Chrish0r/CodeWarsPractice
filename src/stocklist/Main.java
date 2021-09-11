package stocklist;

public class Main {

	public static void main(String[] args) {
	 System.out.println(stockSummary(new String[] {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, 
				                     new String[]{"A", "B", "C", "W"}));
		
	 System.out.println(stockSummary(new String[] {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, 
				                        new String[]{}));
		
	System.out.println(stockSummary(new String[]{}, new String[]{"A", "B", "C", "W"}));

}
	
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		String str = "";
		if(lstOf1stLetter.length != 0 && lstOfArt.length != 0) {
			for(int i = 0; i < lstOf1stLetter.length; i++) {
				int sum = 0;
				for(int j = 0; j < lstOfArt.length; j++) {
					if(lstOf1stLetter[i].charAt(0) == lstOfArt[j].charAt(0)) {
						sum += Integer.valueOf(lstOfArt[j].split(" ")[1]);
					}
				}
				if(i == lstOf1stLetter.length-1) {
					str += "(" + lstOf1stLetter[i].charAt(0) + " : " + sum + ")";
					break;
				}
				str += "(" + lstOf1stLetter[i].charAt(0) + " : " + sum + ") - ";
			}
		}
		return str;
	}
	
}
