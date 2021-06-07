package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		
		// nw1 (northwest)
		p.setValues(position.getRow() - 2, position.getColumn() - 1);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// nw2 (northwest)
		p.setValues(position.getRow() - 1, position.getColumn() - 2);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// ne1 (northeast)
		p.setValues(position.getRow() - 2, position.getColumn() + 1);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// ne2 (northeast)
		p.setValues(position.getRow() - 1, position.getColumn() + 2);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw1 (southwest)
		p.setValues(position.getRow() + 2, position.getColumn() - 1);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// sw2 (southwest)
		p.setValues(position.getRow() + 1, position.getColumn() - 2);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// se1 (southeast)
		p.setValues(position.getRow() + 2, position.getColumn() + 1);

		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		// se2 (southeast)
		p.setValues(position.getRow() + 1, position.getColumn() + 2);
		
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		return mat;
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}

	@Override
	public String toString() {
		return "N";
	}
}
