package stocklist_sample_solution;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StockList {
	private static class Book {
		public final String category;
	    public final String code;
		public final int quantity;
		
		public Book(String label) {
			category = label.substring(0, 1);
			code = label.split(" ")[0].substring(1);
			quantity = Integer.parseInt(label.split(" ")[1]);
		}
		
	}
	
	public String stockSummary(String[] lstOfArt, String[] LstOf1stLetter) {
		if(lstOfArt.length == 0 || LstOf1stLetter.length == 0)
			return "";
		
		Map<String, Integer> categoryCounts = Arrays.stream(lstOfArt)
				.map(Book::new)
				.collect(Collectors.groupingBy(book -> book.category,
						Collectors.summingInt(book -> book.quantity)));
		return Arrays.stream(LstOf1stLetter)
				.map(initial -> String.format("(%s : %d)",
											initial, categoryCounts.getOrDefault(initial, 0)))
				.collect(Collectors.joining(" "));
		
	}

}
