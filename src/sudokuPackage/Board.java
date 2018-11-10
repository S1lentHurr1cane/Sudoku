package sudokuPackage;

public class Board {
	private int[][] cells;
	private static int NUM_ROWS = 9;
	private static int NUM_COLS = 9;
	
	/* Initializes the array for a new board*/
	public Board(String s) {
		this.cells = new int[NUM_ROWS][NUM_COLS];
		populateInitialCells(s);
	}
	
	/* Populates the initial cells based on the file that was read
	 in SudokuMain*/
	public void populateInitialCells(String s) {
		for(int i = 0; i < NUM_ROWS; i++) {
			for(int j = 0; j < NUM_COLS; j++) {
				char c = s.charAt(i*9 + j);
				if(Character.isDigit(c)) {
					cells[i][j] = (int)c;
				} else {
					cells[i][j] = 0;
				}
			}
		}
	}
	
	/* Gets a specific cell from the board array*/
	public int getCell(int row, int col) {		
		return (cells[row][col]);
	}
	
	/* Changes a specific cell in the board array*/
	public void changeCell(int row, int col, int num) {
		cells[row][col] = num;
	}
	
	/* Prints a formatted version of the current board to the console
	 (will later be supplanted with the GUI)*/
	public void printBoard() {
	}
	
	/* Compares two boards */
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		} else if(!(o instanceof Board)) {
			return false;
		}
		
		Board other = (Board)o;
		return (cells == other.cells);
	}
	
	/* Returns the current board as a string */
	@Override
	public String toString() {
		return null;
	}
}
