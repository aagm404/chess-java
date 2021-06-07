package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		// hook method --> faz um gancho com a subclasse
		// Um método concreto pode fazer uma chamada para um método abstrato
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) { // assumindo que o tabuleiro de xadrez é uma matriz quadrada
				if (mat[i][j]) {
					return true;
				}
			}
		}
		
//		Abaixo segue uma foram alternativa de se percorrer uma matriz, utilizando o foreach
//		
//		for (boolean[] row : mat) {
//			for (boolean element : row) {
//				if (element) {
//					return true;
//				}
//			}
//		}
		
		return false;
	}
}
