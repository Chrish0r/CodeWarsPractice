package secret_message;

public class Greeter {

	public static void main(String[] args) {
		System.out.println(greet("David"));
		System.out.println(greet("Susi"));
		System.out.println(greet("Johnny"));

	}
	
	public static String greet(String name) {
		  if(name.equals("Johnny")) {
		      return "Hello, my love!";
		    }
		  return String.format("Hello, %s!", name);
		//  return "Hello, " + name + "!";     
	}
	
}
