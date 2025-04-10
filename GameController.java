public class GameController {
    private Board board;
    private SolverEngine solver;
    private GameConfig config;
    private GUI gui;
    private int lives;
    private Object timer;

    public Board getBoard() { return board; }
    public void setBoard(Board board) { this.board = board; }

    public SolverEngine getSolver() { return solver; }
    public void setSolver(SolverEngine solver) { this.solver = solver; }

    public GameConfig getConfig() { return config; }
    public void setConfig(GameConfig config) { this.config = config; }

    public GUI getGui() { return gui; }
    public void setGui(GUI gui) { this.gui = gui; }

    public int getLives() { return lives; }
    public void setLives(int lives) { this.lives = lives; }

    public Object getTimer() { return timer; }
    public void setTimer(Object timer) { this.timer = timer; }

    public void startGame() { }
    public void handleClick(int x, int y) { }
    public void invokeHint() { }
}
