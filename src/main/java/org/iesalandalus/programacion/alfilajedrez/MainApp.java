package org.iesalandalus.programacion.alfilajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Alfil alfil = null;
	
	private static void mostrarAlfil() {
		if (alfil != null) {
			System.out.println("Alfil: " + alfil);
		} else {
			System.out.println("Aún no se ha creado ningún alfil.");
		}
	}
	
	private static void mostrarMenu() {
		System.out.println("||============================================================||");
		System.out.println("||         Opciones para crear, colocar y mover alfil         ||");
		System.out.println("||============================================================||");
		System.out.println("||                                                            ||");
		System.out.println("|| 1. Crear alfil genérico (por defecto).                     ||");
		System.out.println("|| 2. Crear alfil a partir de un color.                       ||");
		System.out.println("|| 3. Crear alfil a partir de un color y una columna inicial. ||");
		System.out.println("|| 4. Mover alfil.                                            ||");
		System.out.println("|| 5. Salir.                                                  ||");
		System.out.println("||                                                            ||");
		System.out.println("||============================================================||");
	}

	private static int elegirOpcion() {
		int opcion;
		do {
			System.out.print(" Elija una opción: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 5);
		return opcion;
	}
	
	private static Color elegirColor() {
		int opcion;
		System.out.println("||==========================================================||");
		System.out.println("||                      Elija un color                      ||");
		System.out.println("||==========================================================||");
		System.out.println("||                                                          ||");
		System.out.println("|| 1. Blanco                                                ||");
		System.out.println("|| 2. Negro                                                 ||");
		System.out.println("||                                                          ||");
		System.out.println("||==========================================================||");
		do {
			
			opcion = Entrada.entero();
		} while (opcion != 1 && opcion != 2);
		
		
		if (opcion == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
	}
	
	private static char elegirColumnaInicial() {
		char columna;
		System.out.println("||===============================================||");
		System.out.println("||           Elija la columna inicial            ||");
		System.out.println("||===============================================||");
		System.out.println("||                                               ||");
		System.out.println("|| c. Columna 'C'                                ||");
		System.out.println("|| f. Columna 'F'                                ||");
		System.out.println("||                                               ||");
		System.out.println("||===============================================||");
		
		do {
			columna = Entrada.caracter();
		} while (columna != 'c' && columna != 'f');
		return columna;
	}
	
	private static void mostrarMenuDirecciones() {
		System.out.println("||=============================================||");
		System.out.println("||             Menú de direcciones             ||");
		System.out.println("||=============================================||");
		System.out.println("||                                             ||");
		System.out.println("|| 1. 🢄                                        ||");
		System.out.println("|| 2. 🢅                                        ||");
		System.out.println("|| 3. 🢆                                        ||");
		System.out.println("|| 4. 🢇                                        ||");
		System.out.println("||                                             ||");
		System.out.println("||=============================================||");
	}
	
	private static int elegirDireccion() {
		int opcion;
		do {
			System.out.print(" Elija una opción: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);
		return opcion;
	}
	
	private static void crearAlfilDefecto() {
		alfil = new Alfil();
		System.out.println("Se creó el alfil por defecto en la posición 8f.");
	}
	
	private static void crearAlfilColor() {
		Color color = elegirColor();
		alfil = new Alfil(color);
		System.out.println("Se creó alfil por defecto a partir del color.");
	}
	
	private static void crearAlfilColorColumna() {
		char columna = elegirColumnaInicial();
		Color color = elegirColor();
		alfil = new Alfil(color, columna);
		System.out.println("Se creó un alfil a partir del color y columna seleccionados.");
	}
	
	private static void moverAlfil() throws OperationNotSupportedException {
		mostrarMenuDirecciones();
		int opcion = elegirDireccion();
		Direccion direccion = null;
		switch (opcion) {
			case 1:
				direccion = Direccion.ARRIBA_IZQUIERDA;
				break;
			
			case 2:
				direccion = Direccion.ARRIBA_DERECHA;
				break;
				
			case 3:
				direccion = Direccion.ABAJO_DERECHA;
				break;
			case 4:
				direccion = Direccion.ARRIBA_IZQUIERDA;
				break;
			default:
				break;
		}
		
		System.out.print("Indique el número de pasos a dar");
		int pasos = Entrada.entero();
		alfil.mover(direccion, pasos);
		System.out.println("Movimiento realizado correctamente");
		
	}
	
	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {
		switch (opcion) {
			case 1:
				crearAlfilDefecto();
				break;
			case 2:
				crearAlfilColor();
				break;
			case 3:
				crearAlfilColorColumna();
				break;
			case 4:
				if (alfil != null) {
					moverAlfil();
				} else {
					System.out.println("No hay ningún alfil creado.");
				}
				break;
			default:
				break;
			
		}
	}
	
	
	
	public static void main(String[] args) {
		
	}

	

}
