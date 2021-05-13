package clases;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;



import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;



public class Layout extends JFrame{

	public static JLayeredPane tableroNormal = new JLayeredPane();
	public static TableroNormal tN;
	public static JPanel tableroCity = new JPanel();
	public static TableroCity tC;
	
		public Layout() {
		
		//	setBounds(1920/4 ,1080/6, /*1920*/ 1000 , /*1080*/800 );
		
			
			setTitle("Monopoly");
			
			setResizable(true);
			
			initComponents();
		
			
		}
		
		private void initComponents() {
			
		//	JPanel panelmenu = new JPanel();
			JMenu mnArchivo,mnNuevo,mnEditar, mnHistorial;
			JMenuItem mnClasico,mnSaltos,mnCargar,mnSalvar,mnSalvarcomo,mnSalir,mnDeshacer,mnHacer,mnResolver,mnEstadisticas,mnFicheroEstadisticas, mnAyuda;
		
			
			
			tableroNormal.setBackground(new Color(172, 208, 212));
			tableroNormal.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			tableroNormal.setVisible(false);
			tableroNormal.setName("XianPoly");
			
		
			tableroCity.setBackground(new Color(172, 208, 212));
			tableroCity.setVisible(false);
			tableroCity.setOpaque(true);
			tableroCity.setName("Clasico");
			
			System.out.println("XianPoly");
			tableroNormal.setBackground(new Color(172, 208, 212));
			tableroCity.setVisible(false);
			getContentPane().add(tableroNormal, BorderLayout.CENTER);
			tableroNormal.setVisible(true);
			
			tableroNormal.setOpaque(true);
			tN= new TableroNormal(tableroNormal);
			
			
	
			
		}
}