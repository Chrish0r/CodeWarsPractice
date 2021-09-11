package stocklist_sample_solution;

public class Main {
	public static void main(String[] args) {
		 System.out.println(new StockList().stockSummary(new String[] {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, 
					                     new String[]{"A", "B", "C", "W"}));
			
		 System.out.println(new StockList().stockSummary(new String[] {"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"}, 
					                        new String[]{}));
			
		System.out.println(new StockList().stockSummary(new String[]{}, new String[]{"A", "B", "C", "W"}));

	}

}
