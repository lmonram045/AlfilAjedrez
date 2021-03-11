package org.iesalandalus.programacion.alfilajedrez;

public class Alfil {
	private Color color;
	private Posicion posicion;
	
	public Alfil() {
		color = Color.NEGRO;
		posicion = new Posicion(8, 'f');
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
