package org.iesalandalus.programacion.torreajedrez;

public class Torre {
	private Color color;
	private Posicion posicion;
	
	public Torre() {
		posicion = new Posicion(8,'h');
		setColor(Color.NEGRO);
	}
	public Torre (Color color) {
		if(color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		if (color.equals(Color.NEGRO)) {
		posicion = new Posicion(8,'h');
		setColor(Color.NEGRO);
		}
		if (color.equals(Color.BLANCO)) {
		posicion = new Posicion(1,'h');
		setColor(Color.BLANCO);
		}
	}
	public Torre (Color color, char columna) {
		
		if(color == null) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		
		if (color.equals(Color.NEGRO)){
			posicion = new Posicion(8, columna);
			setColor(Color.NEGRO);
			
		}
		if (color.equals(Color.BLANCO)) {
			posicion = new Posicion(1, columna);
			setColor(Color.BLANCO);
			
		}
	}
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		if (color == null || color.equals("")) {
			throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
		}
		if(!color.equals(Color.BLANCO)  && !color.equals(Color.NEGRO)) {
			throw new IllegalArgumentException("El color no es el esperado.");
		}
		this.color = color;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		if(posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		
		this.posicion = posicion;
	}
	
	
}
