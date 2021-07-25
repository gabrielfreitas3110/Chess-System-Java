package chess.pieces;

import boardGame.Board;
import boardGame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return("K");
	}
	
	private boolean canMove(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
	}
	
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] matriz = new boolean[getBoard().getRows()][getBoard().getColumns()];
		Position aux = new Position(0,0);
		
		//up
		aux.setValues(position.getRow()-1, position.getColumn());
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down
		aux.setValues(position.getRow()+1, position.getColumn());
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//left
		aux.setValues(position.getRow(), position.getColumn()-1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//right
		aux.setValues(position.getRow(), position.getColumn()+1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//up-left
		aux.setValues(position.getRow()-1, position.getColumn()-1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//up-right
		aux.setValues(position.getRow()-1, position.getColumn()+1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down-left
		aux.setValues(position.getRow()+1, position.getColumn()-1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		//down-right
		aux.setValues(position.getRow()+1, position.getColumn()+1);
		if(getBoard().positionExists(aux) && canMove(aux)) {
			matriz[aux.getRow()][aux.getColumn()] = true;
		}
		
		return matriz;
	}
}
