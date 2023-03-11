package boardgame;

public class Position {
	
	/** Encapsulamento dos campos com o private e gets and sets, construtores e
	ToString Object e Overrinding.
	
	Sobreescreve o método ToString da classe Object.
	
	**/
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
