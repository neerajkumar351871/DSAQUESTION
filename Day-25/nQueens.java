
class nQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up direction.
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }

        }
        // diagonal  left up.
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; j--, i--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up.
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    {

    }

    public static  boolean NQueens(char board[][], int row) {
        // base case.
        int count=0;
        if (row == board.length) {
           // printBoard(board );
          return true;
        }
        // stand the queens.
        // column loops.
        // count total ways.
        
        for (int j = 0; j < board.length; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(NQueens(board, row + 1))
                {// function call.
                     return true;
                }
                board[row][j] = 'X'; // backtracking steps.
            }

        }
        return false;
    }

    public static void printBoard(char board[][] ) {
        System.out.println("-----------CHESS BOARD-----------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
                  count++;

    }
   static int count=0;
    public static void main(String args[]) {
        int n = 2;
        // create  board.
        char board[][] = new char[n][n];
        // make a blank space.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        boolean chekcvalue= NQueens(board, 0);
        if(chekcvalue)
        {    
            System.out.println("HAVE A WAYS");
            printBoard(board);
            
        }
        else
        {
            System.out.println(" HAVE NO WAYS");
        }
        System.out.println("TOTAL WAYS FOR N QUEENS = "+count);
    }
}
