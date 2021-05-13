package clases;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class ficha {
	
		JLabel label=new JLabel();
		
			public ficha(JLayeredPane panel, int numero,int x,int y) {
			
			
				
			
				label.setLocation(x+numero*10,y);
				label.setSize(50,50);
				label.setVisible(true);
				
				ImageIcon icon = new ImageIcon("./ficha"+numero+".png");
				Image	scaleImage = icon.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
				ImageIcon icon2 = new ImageIcon(scaleImage);
				label.setIcon(icon2);
				panel.add(label,2,0);
			}
			public void moverficha(int numero,int x,int y) {
				
				label.setLocation(x+numero*10,y);
				label.setSize(50,50);
				label.setVisible(true);
				
			}
		
}
