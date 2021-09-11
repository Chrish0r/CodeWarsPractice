package secret_message;

public class AlternativeSolution {
	public static void main(String[] args) {
		System.out.println(greet("David"));
		System.out.println(greet("Susi"));
		System.out.println(greet("Johnny"));

	}
	
	public static String greet(String name) {
		  return "Hello, " + (name.equals("Johnny") ? "my love" : name) + "!";   
	}

}
