package clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;



import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class TableroNormal extends JFrame {


		int[] propietario;//0 nadie, >0 numero jugador
		int posicionJuegosOlimpicos;
		int[] posicionFiestas= new int[3];
		int[] x= new int[40];
		int[] y= new int[40];
		static int altura,anchura;
		casilla[] casillas= new casilla[40];
		Jugador[] jugadores;
		JLayeredPane panel;
		ficha[] fichas;
		static int NUMEROJUGADORES;
		int dseparacionizquierda,dseparacionderecha,danchovertical,danchohorizontal,dalturavertical,dalturahorizontal,dseparacionhorizontal,dhorizontalalturaboton,dabajoalturahorizontal;
		boolean finjuego=false;
		JButton empezarpartida;
		JLabel dado1label =new JLabel();
		JLabel dado2label =new JLabel();
		JTextArea pantalla = new JTextArea();
		
	public TableroNormal(JLayeredPane panel) {
		String msgpantalla;
		EscuchadorEmpezar escEm=new EscuchadorEmpezar();
		this.panel=panel;
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//setBounds(1920/4 ,1080/6, /*1920*/ 800 , /*1080*/572);
			panel.setLayout(null);
			empezarpartida= new JButton();
			empezarpartida.setBounds(800,550,100,50);
			empezarpartida.setText("EMPEZAR");
			empezarpartida.addActionListener(escEm);
			panel.add(empezarpartida);
			
		

		
			
			Dimension tamanho= Toolkit.getDefaultToolkit().getScreenSize();
		
			final int altura=tamanho.height;
			final int anchura=tamanho.width;
			
			dseparacionizquierda=(anchura/8);
			danchovertical=(anchura/10);
			dhorizontalalturaboton=(int)(anchura/19.8); //altura de cada boton horizontal
			dseparacionderecha=(anchura-(anchura/8)-(anchura/10));
			danchohorizontal= (anchura-(2*danchovertical+2*dseparacionizquierda))/9;
			dseparacionhorizontal=altura/7;// altura desde la que empiezan ls botones verticales
			dalturahorizontal=(int)(anchura/22.5);//altura cada casilla horizontal
			dalturavertical= (altura-(2*(altura/7)))/9;; //el alto de cada casilla vertical
			dabajoalturahorizontal=altura-(altura/7);// altura donde empiezan los botones de abajo
			int anchuraCadaCasilla= (anchura-(2*(anchura/10)+2*(anchura/8)))/9;
			int alturaCadaCasilla= (altura-(2*(altura/7)))/9;
			
			int contador2=0;
			for (int i = 9; i >= 0; i--) {
			    x[i]=anchuraCadaCasilla*contador2+(anchura/8+anchura/10);
			    y[i]=dabajoalturahorizontal+dhorizontalalturaboton/3;
				contador2=contador2+1;
			//	casillas[i-1]=new casilla(panel,i,anchuraCadaCasilla*contador+(anchura/8+anchura/10),0,anchuraCadaCasilla,dhorizontalalturaboton,anchuraCadaCasilla,dseparacionhorizontal);

			
			}
			contador2=0;
			
			for (int i = 19; i >= 10; i--) {
				x[i]=danchovertical+ (int)(anchura/14.2);
				y[i]=alturaCadaCasilla*contador2+(altura/7)+alturaCadaCasilla/3;
			//casillas[i] =new casilla(panel,i,anchura/8,alturaCadaCasilla*contador+(altura/7)+(altura/250),(int)(anchura/19.2), (int)(alturaCadaCasilla),danchovertical,alturaCadaCasilla);
			contador2=contador2+1;
			
		}
			 x[20]=(anchura/8+anchura/10)-anchuraCadaCasilla;
			  y[20]=dhorizontalalturaboton-(int)(dhorizontalalturaboton/2.0);
					
			contador2=0;
			
			for (int i = 21; i <= 30; i++) {
				 x[i]=anchuraCadaCasilla*contador2+(anchura/8+anchura/10);
				   y[i]=dhorizontalalturaboton-(int)(dhorizontalalturaboton/2.0);
		//		casillas[i-1]=new casilla(panel,i,anchuraCadaCasilla*contador2+(anchura/8+anchura/10),0,anchuraCadaCasilla,dhorizontalalturaboton,anchuraCadaCasilla,dseparacionhorizontal);
				contador2=contador2+1;
		
			}
			contador2=0;
			
			for (int i = 31; i <= 39 ; i++) {
				x[i]=dseparacionderecha ;
				y[i]=alturaCadaCasilla*contador2+(altura/7)+alturaCadaCasilla/3;
			//	casillas[i] =new casilla(panel,i,dseparacionderecha,alturaCadaCasilla*contador+(altura/7)+(altura/250),(int)(anchura/19.2), (int)(alturaCadaCasilla),danchovertical,alturaCadaCasilla);
				contador2=contador2+1;
			}
			
			
			pantalla.setForeground(Color.black);
			pantalla.setFont(new Font("Agency FB", Font.BOLD,28));
			pantalla.setBounds(950,515,500,120);
			pantalla.setBorder( new javax.swing.border.CompoundBorder( new javax.swing.border.LineBorder( Color.black, 1), pantalla.getBorder() ) );
			panel.add(pantalla);
			
			dado1label.setText("0");
			dado1label.setForeground(Color.black);
			dado1label.setHorizontalAlignment(SwingConstants.CENTER);
			dado1label.setVerticalAlignment(SwingConstants.CENTER);
			dado1label.setFont(new Font("Agency FB", Font.BOLD,50));
			dado1label.setBounds(anchura/3-52, altura/2,50 , 50);
			
			dado2label.setText("0");
			dado2label.setForeground(Color.black);
			dado2label.setHorizontalAlignment(SwingConstants.CENTER);
			dado2label.setVerticalAlignment(SwingConstants.CENTER);
			dado2label.setFont(new Font("Agency FB", Font.BOLD,50));
			dado2label.setBounds(anchura/3, altura/2,50 , 50);
			panel.add(dado2label);
			panel.add(dado1label);
			
			JLabel inicio= new JLabel();
			JLabel carcel= new JLabel();
			JLabel freeparking= new JLabel();
			JLabel olimpiadas= new JLabel();
			inicio.setBackground(Color.black);
			inicio.setBounds(((int)(anchura/8)),altura-(altura/7),anchura/10,altura/7);	
			inicio.setText("SALIDA");
			inicio.setOpaque(true);
			inicio.setBackground(Color.RED);
			panel.add(inicio);
			
			carcel.setBackground(Color.black);
			carcel.setBounds(((int)(anchura/8)),0,anchura/10,altura/7);
			carcel.setText("CARCEL");
			carcel.setOpaque(true);
			carcel.setBackground(Color.RED);
			panel.add(carcel);
			
			olimpiadas.setBackground(Color.black);
			olimpiadas.setBounds((anchura-(anchura/8)-(anchura/10)),0,anchura/10,altura/7);
			olimpiadas.setText("Olimpiadas");
			olimpiadas.setOpaque(true);
			olimpiadas.setBackground(Color.RED);
			panel.add(olimpiadas);
			
			freeparking.setBackground(Color.black);
			freeparking.setBounds(((int)anchura-(anchura/8)-anchura/10),altura-(altura/7),anchura/10,altura/7);
			freeparking.setText("Free Parking");
			freeparking.setOpaque(true);
			freeparking.setBackground(Color.RED);
			panel.add(freeparking);
		
			
			
			
			
			casillas[0]=new casilla(panel,10,10,10,10,10,10,10);

			casillas[10]=new casilla(panel,10,10,10,10,10,10,10);
			casillas[20]=new casilla(panel,10,10,10,10,10,10,10);
			casillas[30]=new casilla(panel,10,10,10,10,10,10,10);

			//////////////////////////////////////////////////////////////////////////////
			//////////////////////////// ARRIBA      //////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			int contador=0;
			
			for (int i = 21; i < 30; i++) {
				
				casillas[i]=new casilla(panel,i,anchuraCadaCasilla*contador+(anchura/8+anchura/10),0,anchuraCadaCasilla,dhorizontalalturaboton,anchuraCadaCasilla,dseparacionhorizontal);
				contador=contador+1;
		
			}
			//////////////////////////////////////////////////////////////////////////////
			////////////////////////////  ABAJO     //////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			contador=0;
			for (int i = 9; i > 0; i--) {
			
				casillas[i] =new casilla(panel,i,anchuraCadaCasilla*contador+(anchura/8+anchura/10),dabajoalturahorizontal,anchuraCadaCasilla,dhorizontalalturaboton,anchuraCadaCasilla,dseparacionhorizontal);
				contador=contador+1;
			
			}
			//////////////////////////////////////////////////////////////////////////////
			////////////////////////////  IZQUIERDA //////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			contador=0;
		
				for (int i = 19; i > 10; i--) {
			
				casillas[i] =new casilla(panel,i,anchura/8,alturaCadaCasilla*contador+(altura/7)+(altura/250),(int)(anchura/19.2), (int)(alturaCadaCasilla),danchovertical,alturaCadaCasilla);
				contador=contador+1;
				
			}
			//////////////////////////////////////////////////////////////////////////////
			////////////////////////////  DERECHA   //////////////////////////////////////
			//////////////////////////////////////////////////////////////////////////////
			contador=0;
			for (int i = 31; i <= 39 ; i++) {

				casillas[i] =new casilla(panel,i,dseparacionderecha,alturaCadaCasilla*contador+(altura/7)+(altura/250),(int)(anchura/19.2), (int)(alturaCadaCasilla),danchovertical,alturaCadaCasilla);
				contador=contador+1;
				
			}
				
	}
	public void jugar() {

		String msgpantalla;
			empezarpartida.setVisible(false);
			//////////////////////////// TODO INICIADO//////////
			NUMEROJUGADORES=4;
			
			
			
			
			jugadores= new Jugador[NUMEROJUGADORES];
			fichas= new ficha[NUMEROJUGADORES];
			//Scanner teclado = new Scanner(System.in);
			
			for (int i = 0; i < NUMEROJUGADORES; i++) {
				System.out.println("Introduce el nombre el jugador "+i+" :");
				//String nombre = teclado.nextLine();
				jugadores[i]=new Jugador("a");
				
				//fichas[i].setLocation(x[0],y[0]);
				System.out.println(x[0]+""+y[0]);
				fichas[i]=new ficha(panel,i+1,x[0],y[0]);
			}
			jugadores[0].setNombre("Xián");
			jugadores[1].setNombre("Javi");
			jugadores[2].setNombre("Eva");
			jugadores[3].setNombre("Samu");
			JLabel p1n = new JLabel();
			p1n.setText(jugadores[0].getNombre());
			p1n.setForeground(Color.black);
			p1n.setFont(new Font("Agency FB", Font.BOLD,50));
			p1n.setBounds(0,0,200 , 50);
			panel.add(p1n);
			JLabel p2n = new JLabel();
			p2n.setText(jugadores[1].getNombre());
			p2n.setForeground(Color.black);
			p2n.setFont(new Font("Agency FB", Font.BOLD,50));
			p2n.setBounds(1720,0,200 , 50);
			panel.add(p2n);
			JLabel p3n = new JLabel();
			p3n.setText(jugadores[2].getNombre());
			p3n.setForeground(Color.black);
			p3n.setFont(new Font("Agency FB", Font.BOLD,50));
			p3n.setBounds(0,980,200 , 50);
			panel.add(p3n);
			JLabel p4n = new JLabel();
			p4n.setText(jugadores[3].getNombre());
			p4n.setForeground(Color.black);
			p4n.setFont(new Font("Agency FB", Font.BOLD,50));
			p4n.setBounds(1720,980,200 , 50);
			panel.add(p4n);
			JLabel p1d = new JLabel();
			p1d.setText(""+jugadores[0].getDinero());
			p1d.setForeground(Color.black);
			p1d.setFont(new Font("Agency FB", Font.BOLD,30));
			p1d.setBounds(0,50,200 , 50);
			panel.add(p1d);
			JLabel p2d = new JLabel();
			p2d.setText(""+jugadores[1].getDinero());
			p2d.setForeground(Color.black);
			p2d.setFont(new Font("Agency FB", Font.BOLD,30));
			p2d.setBounds(1720,50,200 , 50);
			panel.add(p2d);
			JLabel p3d = new JLabel();
			p3d.setText(""+jugadores[2].getDinero());
			p3d.setForeground(Color.black);
			p3d.setFont(new Font("Agency FB", Font.BOLD,30));
			p3d.setBounds(0,1030,200 , 50);
			panel.add(p3d);
			JLabel p4d = new JLabel();
			p4d.setText(""+jugadores[3].getDinero());
			p4d.setForeground(Color.black);
			p4d.setFont(new Font("Agency FB", Font.BOLD,30));
			p4d.setBounds(1720,1030,200 , 50);
			panel.add(p4d);
			
			//JUEGO//
			int jugadoractual=(int) (Math.random() * 4);
			int contadorrondas=0;
			int dado1,dado2,suma;
			
			System.out.println(jugadoractual);
			
			
			while (!finjuego&& contadorrondas<200) {
				
			msgpantalla=" -Turno para el Jugador numero :  "+jugadoractual+" , "+jugadores[jugadoractual].getNombre();
			pantalla.setText(msgpantalla);
			if (jugadores[jugadoractual].getCarcel()!=0) {
				msgpantalla="CARCEL te quedan : \"+jugadores[jugadoractual].getCarcel()+\" turnos.";
				pantalla.setText(msgpantalla);
				
				jugadores[jugadoractual].setCarcel(jugadores[jugadoractual].getCarcel()-1);
			}else {
				boolean dobles;
				do {
					 dobles=false;
					
					String[] options2 = {"TIRAR"};
					int seleccion2 = JOptionPane.showOptionDialog(null, "Tú turno "+jugadores[jugadoractual].getNombre()+" , tira los dados:", "Tirar Dados", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
						
					dado1= tirardado();
					dado2= tirardado();
					dado1label.setText(""+dado1);
					dado2label.setText(""+dado2);
					if (dado1==dado2) {
						dobles=true;
					}
					suma=dado1+dado2;
					System.out.println(" TIRA DADOS: \n Primer dado: "+dado1+"\n Segundo dado: "+dado2+"\n TOTAL: "+ suma);
					msgpantalla=" Primer dado: "+dado1+"\n Segundo dado: "+dado2+"\n TOTAL: "+ suma;
					pantalla.setText(msgpantalla);
					if (suma+jugadores[jugadoractual].getPosicion()>39) {
						jugadores[jugadoractual].setPosicion(suma+jugadores[jugadoractual].getPosicion()-40);
					}else {
						jugadores[jugadoractual].setPosicion(suma+jugadores[jugadoractual].getPosicion());
					}
					int posicionJugador=jugadores[jugadoractual].getPosicion();
					fichas[jugadoractual].moverficha(jugadoractual, x[posicionJugador], y[posicionJugador]);
					
					if (casillas[posicionJugador].isSolar()) {
						if (casillas[posicionJugador].getPropietario()==10) {
							boolean subastar=false;
						if (jugadores[jugadoractual].getDinero()>= casillas[posicionJugador].getValor()) {
							String msgcompra="¿Quieres comprar el solar por : "+ casillas[posicionJugador].getValor()+" ?";
							System.out.println("	¿Quieres comprar el solar por : "+ casillas[posicionJugador].getValor()+" ?" );
							String[] options = {"SI", "SUBASTAR"};
							int seleccion = JOptionPane.showOptionDialog(null, msgcompra, "Titulo", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
							if (seleccion==0) {
								System.out.println("\n------- El jugador "+jugadores[jugadoractual].getNombre()+ " ha comprado : "+casillas[posicionJugador].getNombre() );
								msgpantalla=" El jugador "+jugadores[jugadoractual].getNombre()+ " ha comprado : "+casillas[posicionJugador].getNombre() ;
								pantalla.setText(msgpantalla);
								//añadir mas cosas al comprar
								casillas[posicionJugador].cambiarColor(jugadoractual);
								casillas[posicionJugador].setPropietario(jugadoractual);
								jugadores[jugadoractual].setDinero(jugadores[jugadoractual].getDinero()-casillas[posicionJugador].getValor());
								//jugadores[jugadoractual].addpropiedad(posicionJugador)
							}else {
								subastar=true;
							}
						}else {
							subastar=true;
						}
							
						}else {
							
							int alquiler=casillas[posicionJugador].getAlquiler();
						
							if (jugadores[jugadoractual].getDinero()>= alquiler) {
								
								jugadores[casillas[posicionJugador].getPropietario()].setDinero(jugadores[casillas[posicionJugador].getPropietario()].getDinero()+alquiler);
								jugadores[jugadoractual].setDinero(jugadores[jugadoractual].getDinero()-casillas[posicionJugador].getAlquiler());
								msgpantalla=" El jugador "+jugadores[jugadoractual].getNombre()+ " ha pagado : "+casillas[posicionJugador].getAlquiler()+" a "+jugadores[casillas[posicionJugador].getPropietario()].getNombre() ;
								pantalla.setText(msgpantalla);
							}else {
								msgpantalla=" El jugador "+jugadores[jugadoractual].getNombre()+ " necesita vender propiedades";
								pantalla.setText(msgpantalla);
							//si necesitas vender
							}
						}
					}
					
					actualizarvalores(p1d,p2d,p3d,p4d);
				} while (dobles);
				
				
				
			}
			
			
			if (jugadoractual==NUMEROJUGADORES-1) {
				jugadoractual=0;
			}else {
				jugadoractual++;
			}
			contadorrondas++;
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
		
			
			
		}

	public int tirardado() {

		return (int) (Math.random() * 5)+1;
	}
	public void actualizarvalores(JLabel p1d,JLabel p2d,JLabel p3d,JLabel p4d) {
		
		p1d.setText(""+jugadores[2].getDinero());
		
		p2d.setText(""+jugadores[2].getDinero());
	
		p3d.setText(""+jugadores[2].getDinero());

		p4d.setText(""+jugadores[2].getDinero());
		
	}
public class EscuchadorEmpezar implements ActionListener{
		
		public void actionPerformed (ActionEvent arg0) {
			jugar();
		
		
			
		}
		
	


		
}
		
		
  }
	   
		

		
		
	


