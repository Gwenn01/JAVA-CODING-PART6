public class Main {
	public static void main(String[] args) {
		int digits = 12345;
		System.out.println(sumOfDigits(digits));
	}
	static int sumOfDigits(int digits){
	    int sum = 0;
	    while(digits != 0){
	        int rem = digits % 10;
	        sum += rem;
	        digits /= 10;
	    }
	    return sum;
	}
}