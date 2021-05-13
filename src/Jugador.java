package clases;

public class Jugador {
			int numeroJugador;
			String nombre;
			int carcel;// 0 nada >0 <3 turnos restantes
			int[] propiedades=new int[40];// tamaño tableiro
			int posicion;
			int dinero;
			
			
			public Jugador(String nombre) {
				
				this.nombre=nombre;
				carcel=0;
				posicion=0;
				dinero=20000000;
				
				for (int i = 0; i < propiedades.length; i++) {
					propiedades[i]=0;
				}
				
				
				
				
			}


			public String getNombre() {
				return nombre;
			}


			public void setNombre(String nombre) {
				this.nombre = nombre;
			}


			public int getCarcel() {
				return carcel;
			}


			public void setCarcel(int carcel) {
				this.carcel = carcel;
			}


			public int getPosicion() {
				return posicion;
			}


			public void setPosicion(int posicion) {
				this.posicion = posicion;
			}


			public int getDinero() {
				return dinero;
			}


			public void setDinero(int dinero) {
				this.dinero = dinero;
			}
}



