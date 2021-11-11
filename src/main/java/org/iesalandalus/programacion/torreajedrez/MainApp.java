package org.iesalandalus.programacion.torreajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
private static Torre torre;
	public static void main(String[] args) {
		
		
		
		
	}
	
	private static void mostrarTorre() {
		
		try {
			System.out.println(torre.toString());
			
		}catch(NullPointerException e){
			System.out.println("ERROR: La torre aún no está creada.");
		}

	}
	
	private static void mostrarMenu() {
		System.out.println("1. Crear una torre por defecto.");
		System.out.println("2. Crear una torre por defecto con el color a elegir.");
		System.out.println("3. Crear una torre por con el color a elegir y su posición.");
		System.out.println("4. Mover o enrocar la torre.");
		System.out.println("5. salir");
		
	}
	
	private static int elegirOpcion() {
		int opcion;
		do {
			System.out.println("Elija una opcion a ejecutar.");
			opcion = Entrada.entero();
		}while(opcion<1 || opcion>5);
		
		return opcion;
		
	}

}
