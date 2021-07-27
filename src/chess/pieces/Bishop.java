package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return("B");
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position aux = new Position(0,0);
		
		//up-left
		aux.setValues(position.getRow()-1, position.getColumn()-1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setValues(aux.getRow()-1,aux.getColumn()-1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		 
		//up-right
		aux.setValues(position.getRow()-1, position.getColumn()+1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setValues(aux.getRow()-1,aux.getColumn()+1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down-left
		aux.setValues(position.getRow()+1, position.getColumn()-1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setValues(aux.getRow()+1,aux.getColumn()-1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down-right
		aux.setValues(position.getRow()+1, position.getColumn()+1);
		while(getBoard().positionExists(aux) && !getBoard().thereIsAPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
			aux.setValues(aux.getRow()+1,aux.getColumn()+1);
		}
		if(getBoard().positionExists(aux) && isThereOpponentPiece(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		
		return matriz;
	}
}
