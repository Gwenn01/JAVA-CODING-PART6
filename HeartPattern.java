public class Main {
	public static void main(String[] args) {
		int length = 10;
		for(int i = 1; i <= length; i++){
		    for(int j = 1; j <= length-i; j++){
		        System.out.print(" ");
		    }
		    for(int j = 1; j <= i*2; j++){
		        System.out.print("*");
		    }
		    for(int j = 1; j <= length-i; j++){
		        System.out.print("  ");
		    }
		    for(int j = 1; j <= i*2; j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i = 1; i <= length*2; i++){
		    for(int j = 1; j <= i; j++){
		        System.out.print(" ");
		    }
		    for(int j = 1; j <= (length*2)-i; j++){
		        System.out.print("*");
		    }
		    for(int j = 1; j <= (length*2)-i; j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
}