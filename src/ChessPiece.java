public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();

    public abstract boolean canMoveToPosition(ChessBoard var1, int var2, int var3, int var4, int var5);

    public abstract String getSymbol();

    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    protected int getMax(int a, int b) {
        return Math.max(a, b);
    }

    protected int getMin(int a, int b) {
        return Math.min(a, b);
    }
}

