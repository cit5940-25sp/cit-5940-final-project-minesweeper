public class GUI {
    private Object[][] cellViews;
    private Object timerDisplay;
    private Object statusPanel;

    public Object[][] getCellViews() { return cellViews; }
    public void setCellViews(Object[][] cellViews) { this.cellViews = cellViews; }

    public Object getTimerDisplay() { return timerDisplay; }
    public void setTimerDisplay(Object timerDisplay) { this.timerDisplay = timerDisplay; }

    public Object getStatusPanel() { return statusPanel; }
    public void setStatusPanel(Object statusPanel) { this.statusPanel = statusPanel; }

    public void render(Board board) { }
    public void updateCell(int x, int y) { }
    public void showGameOver() { }
    public void updateLives() { }
}
