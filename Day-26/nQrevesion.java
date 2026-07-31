
class nQrevesion {

    public static boolean issafe(char board[][], int row, int col) {
        // vertical up direction.
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        //diagonal left .
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
          if(board[i][j]=='Q')
          {
            return false; 
          }
        }
        // diagonal .right up
        for(int i=row-1, j=col+1;i>=0 && j<board.length;i--, j++)
        {
            if(board[i][j]=='Q')
            {
            return false;
            }
        }
       return true;
    }

    public static boolean nQueens(char ChessBoard[][], int row) {   // base case.
        if (row == ChessBoard.length) {
          //  printChessBoard(ChessBoard);
            return true;
        }
        // kaam

        // set the queens.
        for (int j = 0; j < ChessBoard.length; j++) {
            if (issafe(ChessBoard, row, j)) {
                ChessBoard[row][j] = 'Q';

              if(  nQueens(ChessBoard, row + 1))
              {// function call
              return true;
              }
                ChessBoard[row][j] = 'X'; // back Tracking. 
            }

        }
        return false;
    }

    public static void printChessBoard(char chessBoard[][]) {
        counter++;
        System.out.println("---------------CHESS BOARD---------------");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
     static int counter=0;
    public static void main(String args[]) {
        int n = 2;
        char chessBoard[][] = new char[n][n];
        // inlization queens.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                chessBoard[i][j] = 'X';
            }
        }
       if( nQueens(chessBoard, 0))
       {
        System.out.println("SOLUTION IS POSSIBLE");
        printChessBoard(chessBoard);
       }
       else
       {
        System.out.println("SOLUTION IS NOT POSSIBLE");
       }
         System.out.println("TOTAL WAY :"+counter);
    }
}
