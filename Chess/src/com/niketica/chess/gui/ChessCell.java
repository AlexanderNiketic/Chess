package com.niketica.chess.gui;

import javax.swing.JButton;

public class ChessCell extends JButton {
	private static final long serialVersionUID = 1L;
	private int x;
	private char y;
	
	public ChessCell(int x, char y){
		this.x = x;
		this.y = y;
	}
	
	public int getXCoord(){
		return x;
	}
	
	public char getYCoord(){
		return y;
	}
}
