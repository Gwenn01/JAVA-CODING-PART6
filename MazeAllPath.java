public class Main {
	public static void main(String[] args) {
		boolean board[][] = {
		    {true, true, true},
		    {true, true, true},
		    {true, true, true}
		};
		mazeAllPath(board, "", 0, 0);
	}
	static void mazeAllPath(boolean[][] board, String p, int r, int c){
	    if(r == board.length-1 && c == board.length-1){
	        System.out.println(p);
	        return;
	    }
	    if(!board[r][c]){
	        return;
	    }
	    board[r][c] = false;
	    if(r < board.length-1){
	        mazeAllPath(board, p + "D", r+1, c);
	    }
	    if(c < board.length-1){
	        board[r][c] = false;
	        mazeAllPath(board, p + "R", r, c+1);
	    }
	    if(r > 0){
	         mazeAllPath(board, p + "U", r-1, c);
	    }
	     if(c > 0){
	         mazeAllPath(board, p + "L", r, c-1);
	    }
	    board[r][c] = true;
	}
}