package com.niketica.chess;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.niketica.chess.gui.ChessCell;

public class ChessBoard extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	private static final int CELL_AMOUNT = 10;

	public ChessBoard(){
		setSize(WIDTH, HEIGHT);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initCellLayout();	
		initButtons();
		setVisible(true);
	}
	
	private void initCellLayout(){
		int borderSize = 2;
		JPanel chessBoard = new JPanel(new GridLayout(CELL_AMOUNT, CELL_AMOUNT, borderSize, borderSize));
		
		char yCoord = 'A';
		for(int y=0; y<CELL_AMOUNT; y++){
			int xCoord = 1;
			for(int x=0; x<CELL_AMOUNT; x++){
				ChessCell cell = new ChessCell(xCoord, yCoord);				
				if(y%2==0 && x%2==0 || y%2!=0 && x%2!=0){
					cell.setBackground(Color.GRAY);
				}else{
					cell.setBackground(Color.WHITE);				
				}
				cell.addActionListener(this);
				chessBoard.add(cell);
				xCoord++;
			}
			yCoord++;
		}
		add(chessBoard);
	}
	
	private void initButtons(){
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof ChessCell){
			ChessCell c = (ChessCell) e.getSource();
			
			System.out.println(c.getYCoord() + "" + c.getXCoord());
		}
	}

}
