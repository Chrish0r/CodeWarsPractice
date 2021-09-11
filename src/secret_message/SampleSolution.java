package secret_message;

public class SampleSolution {
	public static void main(String[] args) {
		System.out.println(greet(""));
		System.out.println(greet("David"));
		System.out.println(greet("Susi"));
		System.out.println(greet("Johnny"));

	}

	public static String greet(String name) {
		if (!name.isEmpty()) {
			if (name.equals("Johnny")) {
				return "Hello, my love!";
			} else {
				return String.format("Hello, %s!", name);
			}
		}
		return "ERROR: Name is missing! Please enter a name...";
	}
}
