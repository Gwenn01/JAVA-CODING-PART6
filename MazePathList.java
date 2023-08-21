import java.util.*;
public class Main {
	public static void main(String[] args) {
		System.out.println(mazePath("", 3, 3));
	}
	static List<String> mazePath(String p, int r, int c){
	    if(r == 1 && c == 1){
	        ArrayList<String> list = new ArrayList<>();
	        list.add(p);
	        return list;
	    }
	    ArrayList<String> list = new ArrayList<>();
	    if(r > 1){
	        list.addAll(mazePath(p + "D", r-1, c));
	    }
	    if(c > 1){
	        list.addAll(mazePath(p + "R", r, c-1));
	    }
	    return list;
	}
}