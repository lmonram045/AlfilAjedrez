package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	//constructor
	public Posicion (int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	//constructor copia
	public Posicion(Posicion posicion) {
		setFila(posicion.getFila());
		setColumna(posicion.getColumna());
	}
	
	private void setFila(int fila) {
		if (fila < 1 || fila > 8) {
			/*Hubiera creado una constante para el texto del error, pero dejo un literal
			  para ajustarme a la definicion de la clase */
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		} else {
				this.fila = fila;
		}
		
	}
	
	public int getFila() {
		return fila;
	}
	
	private void setColumna(char columna) {
		if (columna < 'a' || columna > 'h') {
			/*Hubiera creado una constante para el texto del error, pero dejo un literal
			  para ajustarme a la definicion de la clase */
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		} else {
			this.columna = columna;	
		}
		
	}
	
	public char getColumna() { 
		return columna;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
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
		Posicion other = (Posicion) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

}


