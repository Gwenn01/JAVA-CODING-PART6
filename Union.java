import java.util.*;
public class Main {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 5, 7};
		int arr2[] = {2, 3, 5, 6, 8};
		System.out.println(Arrays.toString(union(arr1, arr2)));
	}
	static int[] union(int[] arr1, int[] arr2){
	    int[] temp = new int[arr1.length+arr2.length];
	    int i = 0, j = 0, k = 0;
	    while (i < arr1.length && j < arr2.length){
	        if(arr1[i] < arr2[j]){
	            temp[k] = arr1[i];
	            i++;
	        }else if(arr1[i] > arr2[j]){
	            temp[k] = arr2[j];
	            j++;
	        }else{
	           temp[k] = arr1[i];
	           i++;
	           j++;  
	        }
	        k++;
	    }
	    while(i < arr1.length){
	        temp[k] = arr1[i];
	        i++;
	        k++;
	    }
	   while(j < arr2.length){
	        temp[k] = arr2[j];
	        j++;
	        k++;
	    }
	    return temp;
	}
}