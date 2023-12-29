public class Board {
    private final Integer ROW = Config.BOARD_SIZE.getRow();
    private final Integer COL = Config.BOARD_SIZE.getCol() * 2 + 1;
    private char[][] board;

    //┌ ─ ┬ ┐ └ ┴ ─ ┘  ├ ─ ┼
    // ○ ●

    public Board(){
        initBoard();
    }

    public void printBoard(){
        for(int i = 0; i < ROW; i++){
            System.out.println(String.valueOf(board[i]));
        }
    }

    public void setBoardBlack(int row, int column){
        board[row][column * 2] = '●';
    }

    public void setBoardWhite(int row, int column){
        board[row][column * 2] = '○';
    }

    private void initBoard(){
        board = new char[ROW][COL];

        for(int i = 0; i < ROW; i++){
            for(int k = 0; k < COL; k++){
                board[i][k] = getCellSymbol(i, k);
            }
        }
    }

    private char getCellSymbol(int row, int col) {
        if (row == 0 && col == 0) {
            return '┌';
        } else if (row == 0 && col == COL - 1) {
            return '┐';
        } else if (row == ROW - 1 && col == 0) {
            return '└';
        } else if (row == ROW - 1 && col == COL - 1) {
            return '┘';
        } else if (row == 0) {
            if (col % 2 == 0) {
                return '┬';
            } else {
                return '─';
            }
        } else if (row == ROW - 1) {
            if (col % 2 == 0) {
                return '┴';
            } else {
                return '─';
            }
        } else if (col == 0) {
            return '│';
        } else if (col == COL - 1) {
            return '│';
        } else {
            if (col % 2 == 0) {
                return '┼';
            } else {
                return '─';
            }
        }
    }
}
