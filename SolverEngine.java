public class SolverEngine {
    private SolverStrategy strategy;

    public SolverStrategy getStrategy() { return strategy; }
    public void setStrategy(SolverStrategy strategy) { this.strategy = strategy; }

    public int[] solveStep(Board board) {
        return strategy.getNextMove(board);
    }
}

