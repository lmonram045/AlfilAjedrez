package org.iesalandalus.programacion.alfilajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
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
	
	
	
}
