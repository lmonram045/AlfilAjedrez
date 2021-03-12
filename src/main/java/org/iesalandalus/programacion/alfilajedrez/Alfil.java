package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if (direccion == null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if (pasos < 1) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe ser positivo.");
		}
		
		/*if (posicion.getColumna < 'a' || posicion.getColumna > 'h' || posicion.getFila < 1 || posicion.getFila > 8) {
			throw new Operation
		}*/
		Posicion posicionDestino;
		int filaDestino;
		char columnaDestino;
		try {
		switch (direccion) {
         case ARRIBA_DERECHA:  
        	filaDestino = this.posicion.getFila() + pasos;
			columnaDestino = this.posicion.getColumna();
			
			for (int i = 1; i <= pasos; i++) {
				columnaDestino++;
			}
			posicionDestino = new Posicion(filaDestino, columnaDestino);
            break;
         case ARRIBA_IZQUIERDA:  
        	filaDestino = this.posicion.getFila() + pasos;
 			columnaDestino = this.posicion.getColumna();
 			
 			for (int i = 1; i <= pasos; i++) {
 				columnaDestino--;
 			}
 			posicionDestino = new Posicion(filaDestino, columnaDestino);
            break;
         case ABAJO_DERECHA:  
        	filaDestino = this.posicion.getFila() - pasos;
 			columnaDestino = this.posicion.getColumna();
 			
 			for (int i = 1; i <= pasos; i++) {
 				columnaDestino++;
 			}
 			posicionDestino = new Posicion(filaDestino, columnaDestino);
            break;
         case ABAJO_IZQUIERDA:  
        	filaDestino = this.posicion.getFila() - pasos;
 			columnaDestino = this.posicion.getColumna();
 			
 			for (int i = 1; i <= pasos; i++) {
 				columnaDestino--;
 			}
 			posicionDestino = new Posicion(filaDestino, columnaDestino);
            break;
            
         default: 
        	 throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		} catch (IllegalArgumentException e) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
		
		this.setPosicion(posicionDestino);		
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((posicion == null) ? 0 : posicion.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alfil other = (Alfil) obj;
		if (color != other.color)
			return false;
		if (posicion == null) {
			if (other.posicion != null)
				return false;
		} else if (!posicion.equals(other.posicion))
			return false;
		return true;
	}
	

}
