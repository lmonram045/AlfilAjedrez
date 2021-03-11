package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;
	
	public Alfil() {
		color = Color.NEGRO;
		posicion = new Posicion(8, 'f');
	}
	
	public Alfil(Color color) {
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, 'f');
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'f');
		}
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		this.color = color;
	}
	
	public Alfil(Color color, char columna) {
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		
		if (columna != 'c' && columna != 'f') {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
						
		
		if (color == Color.BLANCO) {
			posicion = new Posicion(1, columna);
		} 
		if (color == Color.NEGRO) {
			posicion = new Posicion(8, columna);
		}
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setColor(Color color) {
		if (color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		this.color = color;
	}
	private void setPosicion(Posicion posicion) {
		this.posicion = new Posicion(posicion);

		
	}
	

}
