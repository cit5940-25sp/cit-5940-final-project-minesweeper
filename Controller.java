import java.util.ArrayList;

//manages communication between the view and the model components
public class Controller implements ViewGUIToController{

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
	public void tilePressed(int row, int col, long currentTime) {

	}

	@Override
	public void placeFlag(boolean flagged, int row, int col) {

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
	public void reset() {

	}

	@Override
	public String getRules() {
		return null;
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
	public String getMineString() {
		return null;
	}

	@Override
	public String getEmptyTileString() {
		return null;
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
	public String getBestTime() {
		return null;
	}
}

