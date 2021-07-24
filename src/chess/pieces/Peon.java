package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

public class Peon extends ChessPiece{

	public Peon(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return("P");
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];
		return matriz;
	}
}
