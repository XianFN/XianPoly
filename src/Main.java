package clases;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.*;



public class Main {

	public static void main(String[] args) {

		
		Layout frame = new Layout();
		
		
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	 	frame.getContentPane().setPreferredSize( Toolkit.getDefaultToolkit().getScreenSize());
	    frame.pack();
	    frame.setVisible(true);
	    frame.setResizable(false);
	    frame.show();
		// TODO Auto-generated method stub

	    SwingUtilities.invokeLater(new Runnable() {
	        public void run()
	        {
	          Point p = new Point(0, 0);
	          SwingUtilities.convertPointToScreen(p, frame.getContentPane());
	          Point l = frame.getLocation();
	          l.x -= p.x;
	          l.y -= p.y;
	          frame.setLocation(l);
	        }
	      });
		
		
		
		
		
	}

}
