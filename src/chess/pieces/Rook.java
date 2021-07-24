package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return("R");
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position aux = new Position(0,0);
		
		//up
		aux.setValues(position.getRow()-1, position.getColumn());
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setRow(aux.getRow()-1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down
		aux.setValues(position.getRow()+1, position.getColumn());
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setRow(aux.getRow()+1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//left
		aux.setValues(position.getRow(), position.getColumn()-1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setColumn(aux.getColumn()-1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		 
		//right
		aux.setValues(position.getRow(), position.getColumn()+1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setColumn(aux.getColumn()+1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		return matriz;
	}
}
