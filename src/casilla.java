package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;
import javax.swing.plaf.metal.MetalButtonUI;

public class casilla extends JFrame {
		int propietario;//10 nadie
		int valor;
		int alquiler;
		String valorAcortado;
		String nombre;
		boolean solar;
		boolean juegosOlimpicos;
		boolean fiesta;
		JButton boton;
		JLabel precio;
		JPanel casilla;
		ImageIcon icon;
		ImageIcon icon2;
		Image scaleImage;
		
		public casilla(JLayeredPane panel,int numerocasilla,int x,int y,int ancho,int alto,int anchocasilla,int largocasilla) {
			
			propietario=10;
			Dimension tamanho= Toolkit.getDefaultToolkit().getScreenSize();
			
			final int altura=tamanho.height;
			final int anchura=tamanho.width;
			

	
			casilla = new JPanel();
			boton = new JButton();
			
			
			switch(numerocasilla) {
			
			case 0:
				
				 solar=false;
			
				break;
			case 1:
				 valor=600000;
				 solar=true;
				 nombre="Tui";
				 
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("600K");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, alto,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 2:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 3:
				 valor=600000;
				 solar=true;
				 nombre="Salceda";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("600K");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, alto,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 4:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				
				
				break;
			case 5:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 6:
				 valor=1000000;
				 solar=true;
				 nombre="Ourense";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, alto,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 7:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				
				break;
			case 8:
				 valor=1000000;
				 solar=true;
				 nombre="Verín";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, alto,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 9:
				 valor=1200000;
				 solar=true;
				 nombre="Allaríz";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.2M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, alto,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 10:
				solar=false;
				break;
			case 11:
				 valor=1400000;
				 solar=true;
				 nombre="Lugo";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.4M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 12:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 13:
				 valor=1400000;
				 solar=true;
				 nombre="Ribadeo";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.4M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				
				break;
			case 14:
				 valor=1600000;
				 solar=true;
				 nombre="Viveiro";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.6M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				
				break;
			case 15:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 16:
				 valor=1800000;
				 solar=true;
				 nombre="Coruña";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.8M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 17:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 18:
				 valor=1800000;
				 solar=true;
				 nombre="Santiago";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("1.8M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 19:
				 valor=2000000;
				 solar=true;
				 nombre="Ferrol";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds((int)(anchura/20.87), 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 20:
				solar=false;
				
				break;
			case 21:
				 valor=2200000;
				 solar=true;
				 nombre="Padrón";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.2M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 22:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 23:
				 valor=2200000;
				 solar=true;
				 nombre="Cambados";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.2M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 24:
				 valor=2400000;
				 solar=true;
				 nombre="Lalín";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.4M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 25:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 26:
				 valor=2600000;
				 solar=true;
				 nombre="Pontevedra";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.6M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 27:
				 valor=2600000;
				 solar=true;
				 nombre="Vilagarcia";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.6M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 28:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 29:
				 valor=2800000;
				 solar=true;
				 nombre="Vigo";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, (int)(altura/18.6),ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("2.8M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(0, 0,ancho , (int)(altura/20));
			
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 30:
				solar=false;
				break;
			case 31:
				 valor=3000000;
				 solar=true;
				 nombre="Moaña";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("3M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(ancho, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 32:
				 valor=3000000;
				 solar=true;
				 nombre="Cangas";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("3M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(ancho, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 33:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 34:
				 valor=3200000;
				 solar=true;
				 nombre="Baiona";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("3.2M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(ancho, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 35:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 36:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 37:
				 valor=3500000;
				 solar=true;
				 nombre="Valença";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("3.5M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(ancho, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
			case 38:
				solar=false;
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,anchocasilla , largocasilla);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
			
	
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
	
				break;
			case 39:
				 valor=4000000;
				 solar=true;
				 nombre="Sanjenjo";
				casilla.setBounds(x,y,anchocasilla,largocasilla);
				casilla.setVisible(true);
				casilla.setLayout(null);
				casilla.setBackground(Color.white);
				casilla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), casilla.getBorder() ) );
				
				boton.setBounds(0, 0,ancho , alto);
				boton.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), boton.getBorder() ) );
				precio=new JLabel();
				precio.setText("4M");
			
				precio.setForeground(Color.black);
				precio.setHorizontalAlignment(SwingConstants.CENTER);
				precio.setVerticalAlignment(SwingConstants.CENTER);
				precio.setFont(new Font("Agency FB", Font.BOLD,50));
				precio.setBounds(ancho, 0,(int)(anchura/20.87) , alto);
				
				precio.setVisible(true);
		
				
				 icon = new ImageIcon("./"+numerocasilla+".png");
				scaleImage = icon.getImage().getScaledInstance(ancho, alto,Image.SCALE_DEFAULT);
				 icon2 = new ImageIcon(scaleImage);
				boton.setIcon(icon2);
				casilla.add(boton);
				casilla.add(precio);
				break;
				
				
			
			
			
			
			}
			alquiler=valor;
			
	
			panel.add(casilla);
		
			boton.setContentAreaFilled(false);
	
		}
		public void cambiarColor(int numero) {
			switch(numero) {
			
			case 0:
				precio.setForeground(Color.red);
				break;
			case 1:
				precio.setForeground(Color.green);

				break;
			case 2:
				precio.setForeground(Color.blue);

				break;
			case 3:
				precio.setForeground(Color.yellow);

				break;
			
			
			}
		}

		public int getPropietario() {
			return propietario;
		}

		public int getValor() {
			return valor;
		}

		public String getValorAcortado() {
			return valorAcortado;
		}

		public boolean isSolar() {
			return solar;
		}

		public boolean isJuegosOlimpicos() {
			return juegosOlimpicos;
		}

		public boolean isFiesta() {
			return fiesta;
		}

		public void setPropietario(int propietario) {
			this.propietario = propietario;
		}

		public void setValor(int valor) {
			this.valor = valor;
		}

		public void setValorAcortado(String valorAcortado) {
			this.valorAcortado = valorAcortado;
		}

		public void setSolar(boolean solar) {
			this.solar = solar;
		}

		public void setJuegosOlimpicos(boolean juegosOlimpicos) {
			this.juegosOlimpicos = juegosOlimpicos;
		}

		public void setFiesta(boolean fiesta) {
			this.fiesta = fiesta;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public int getAlquiler() {
			return alquiler;
		}
		public void setAlquiler(int alquiler) {
			this.alquiler = alquiler;
		}
	
	 
}
