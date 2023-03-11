package boardgame;

public class Piece {

	// protect pois não é para ser visivel na camada chess, somente nas classes do
	// memso pacote.
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}

}
