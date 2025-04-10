public class GameConfig {
    private int boardWidth;
    private int boardHeight;
    private int numMines;
    private int numLives;
    private int timeLimit;
    private int[] adjacencyConstraints;

    public int getBoardWidth() { return boardWidth; }
    public void setBoardWidth(int boardWidth) { this.boardWidth = boardWidth; }

    public int getBoardHeight() { return boardHeight; }
    public void setBoardHeight(int boardHeight) { this.boardHeight = boardHeight; }

    public int getNumMines() { return numMines; }
    public void setNumMines(int numMines) { this.numMines = numMines; }

    public int getNumLives() { return numLives; }
    public void setNumLives(int numLives) { this.numLives = numLives; }

    public int getTimeLimit() { return timeLimit; }
    public void setTimeLimit(int timeLimit) { this.timeLimit = timeLimit; }

    public int[] getAdjacencyConstraints() { return adjacencyConstraints; }
    public void setAdjacencyConstraints(int[] adjacencyConstraints) { this.adjacencyConstraints = adjacencyConstraints; }

    public void validate() {

    }
}

