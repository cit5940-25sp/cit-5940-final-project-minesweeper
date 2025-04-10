import java.util.List;

public class Board {
    private Cell[][] cells;
    private int width;
    private int height;

    public Cell[][] getCells() { return cells; }
    public void setCells(Cell[][] cells) { this.cells = cells; }

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }

    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    public void reveal(int x, int y) { }
    public void flag(int x, int y) { }
    public Cell getCell(int x, int y) { return null; }
    public List<Cell> getSafeNeighbors(int x, int y) { return null; }
    public int countRemainingMines() { return 0; }
}

