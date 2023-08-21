import java.util.*;
public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 6, 10, 4, 5, 18};
		System.out.println(secondMax(arr));
	}
	static int secondMax(int[] arr){
	    int max1 = arr[0];
	    int max2 = arr[0];
	    for(int i = 1; i < arr.length; i++){
	        if(arr[i] > max1){
	            max2 = max1;
	            max1 = arr[i];
	        }
	    }
	   
	    return max2;
	}
}