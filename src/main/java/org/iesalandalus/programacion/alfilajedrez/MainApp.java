package org.iesalandalus.programacion.alfilajedrez;

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
	
	public static void main(String[] args) {
	

	
	}

	

}
