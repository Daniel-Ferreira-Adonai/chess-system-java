package boardgame;
public class Position {

    private int row;

    private int column;

    public Position(int row, int column) {
        this.column = column;
        this.row = row;

    }

    public Position() {

    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn(){
        return this.column;

    }
    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return this.row;
    }
    @Override
    public String toString(){
        return row + ", " + column;
    }
    public void setValues(int row, int column){
        this.row = row;
        this. column = column;
    }
}

