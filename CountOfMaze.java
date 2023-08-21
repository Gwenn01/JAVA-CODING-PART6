public class Main {
	public static void main(String[] args) {
		int ans = countMaze(3, 3);
		System.out.println(ans);
	}
	static int countMaze(int r, int c){
	    if(r == 1 || c == 1){
	        return 1;
	    }
	    int left = countMaze(r-1, c);
	    int right = countMaze(r, c-1);
	    return left + right;
	}
}