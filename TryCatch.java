public class Main {
	public static void main(String[] args) {
		try {
    // Code that might throw an exception
    int result = 10 / 0; // This will throw an ArithmeticException
} catch (ArithmeticException e) {
    // Exception handling code
    System.out.println("An exception occurred: " + e.getMessage());
}
	}
}