public enum Config {
    BOARD_SIZE(15, 15);

    private int row;
    private int col;

    Config(int row, int col){
        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
