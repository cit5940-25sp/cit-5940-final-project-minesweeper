import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//keep track of most of the data in the minesweeper program
public class Model implements ControllerToModel{

	@Override
	public void setDifficulty(String difficulty) {

	}

	@Override
	public ArrayList<String> getDifficulties() {
		return null;
	}

	@Override
	public boolean startGame() {
		return false;
	}

	@Override
	public int getNumMines() {
		return 0;
	}

	@Override
	public String[][] getGrid() {
		return new String[0][];
	}

	@Override
	public boolean[][] tilePressed(int row, int col, long currentTime) {
		return new boolean[0][];
	}

	@Override
	public void tileFlagged(boolean flagged, int row, int col) {

	}

	@Override
	public boolean playerLost() {
		return false;
	}

	@Override
	public boolean playerWon() {
		return false;
	}

	@Override
	public void resetGame() {

	}

	@Override
	public int[] getLastPressed() {
		return new int[0];
	}

	@Override
	public void setExtraLives(int lives) {

	}

	@Override
	public int getExtraLivesLeft() {
		return 0;
	}

	@Override
	public void setCustomRows(int rows) {

	}

	@Override
	public void setCustomColumns(int cols) {

	}

	@Override
	public void setCustomMines(int mines) {

	}

	@Override
	public long getTotalGamesWon() {
		return 0;
	}

	@Override
	public long getTotalGamesPlayed() {
		return 0;
	}

	@Override
	public String getBestTimes() {
		return null;
	}
}
