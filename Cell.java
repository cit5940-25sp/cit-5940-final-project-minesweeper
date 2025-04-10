public class Cell {
    private boolean isMine;
    private boolean isRevealed;
    private boolean isFlagged;
    private int adjacentMines;
    private int x;
    private int y;

    public boolean isMine() { return isMine; }
    public void setIsMine(boolean isMine) { this.isMine = isMine; }

    public boolean isRevealed() { return isRevealed; }
    public void setIsRevealed(boolean isRevealed) { this.isRevealed = isRevealed; }

    public boolean isFlagged() { return isFlagged; }
    public void setIsFlagged(boolean isFlagged) { this.isFlagged = isFlagged; }

    public int getAdjacentMines() { return adjacentMines; }
    public void setAdjacentMines(int adjacentMines) { this.adjacentMines = adjacentMines; }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return y; }
    public void setY(int y) { this.y = y; }

    public void reveal() { }
    public void flag() { }
    public String getState() { return ""; }
    public boolean isSafe() { return !isMine; }
}

