public class KeyLogicImp {
    public static int[] suggestCellToRevealAsMine(String[][] actualGrid, boolean[][] exposedTiles, boolean[][] flaggedTiles) {
        // Caution: you can only use the revealed parts of actualGrid for logic inference

        // Return the coordinates of any cell that is logically inferred to be a mine
        // in the format of int[2], e.g. [1, 2] if the coordinates are (1, 2)

        // However, if all mines have already been revealed, or no remaining cell can be logically inferred
        // to be a mine, i.e. the next click has to be a random guessing, return null


        return null;
    }

    public static int[] suggestNextMineToReveal(String[][] actualGrid, boolean[][] exposedTiles, boolean[][] flaggedTiles) {
        // In this case, you can use all information in actualGrid

        // Return the coordinates of a mine that left-click its neighboring revealed numbers will
        // lead to the largest number of cell expansions

        // The existing expansion logic in Model.java, i.e. fillOutTiles()
        // is not completely correct. Feel free to draw some inspiration, but you may have to make
        // some corrections
        return null;
    }

}
