package algorithm_design.gobang;

import java.awt.Color;

public class App {

	public static void main(String[] args) {
		ChessFrame chessframe = new ChessFrame();
		// basic setting for this chess frame 
		chessframe.setTitle("Gobang");
		chessframe.setSize(480, 500);
		chessframe.getContentPane().setBackground(new Color(248,230,150));
		chessframe.setDefaultCloseOperation(3);
		chessframe.setLocationRelativeTo(null);
		chessframe.setResizable(false);
		chessframe.setVisible(true);
		
		chessframe.init();
		// mouse listening class instance
		MouseListener mouselistener = new MouseListener(chessframe);
		chessframe.addMouseListener(mouselistener);
	}

}
