package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are form a1 to h8");
		}
		
		this.column = column;
		this.row = row;
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	protected Position toPosition() {
		// matrix_row = 8 - chess_row
		// matirx_column = chess_column - 'a'
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		// chess_row = 8 - matrix_row
		// chess_column = 'a' + matrix_column
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
	}
	
	@Override
	public String toString() {
		return "" + column + row;
		// truqe para concatenar duas variaveis que não são do tipo String e retonar somenta elas
	}
}
