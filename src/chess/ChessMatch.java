package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Peon;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matriz = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i=0; i<board.getRows(); i++) 
			for(int j=0; j<board.getColumns(); j++) 
				matriz[i][j] = (ChessPiece)board.piece(i,j);
		return matriz;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board,Color.BLACK), new Position(0,0));
		board.placePiece(new Rook(board,Color.BLACK), new Position(0,7));
		board.placePiece(new King(board,Color.BLACK), new Position(0,4));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,0));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,1));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,2));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,3));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,4));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,5));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,6));
		board.placePiece(new Peon(board,Color.BLACK), new Position(1,7));
		

		board.placePiece(new Rook(board,Color.WHITE), new Position(7,0));
		board.placePiece(new Rook(board,Color.WHITE), new Position(7,7));
		board.placePiece(new King(board,Color.WHITE), new Position(7,4));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,0));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,1));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,2));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,3));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,4));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,5));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,6));
		board.placePiece(new Peon(board,Color.WHITE), new Position(6,7));
	}
}
