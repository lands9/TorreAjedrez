package org.iesalandalus.programacion.torreajedrez;

import javax.naming.OperationNotSupportedException;

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
	
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {
			throw new NullPointerException("ERROR: La direcci�n no puede ser nula.");
		}
		
		if ( pasos <= 0) {
			throw new IllegalArgumentException("ERROR: El n�mero de pasos debe ser positivo.");
		}

		switch (direccion) {
		
		case ARRIBA:
			if (color.equals(Color.BLANCO)) {
				try {
					posicion = new Posicion(posicion.getFila()+pasos,posicion.getColumna());
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
			}else if(color.equals(Color.NEGRO)) {
				try {
				posicion = new Posicion(posicion.getFila()-pasos,posicion.getColumna());
				setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
			}
			break;
		case ABAJO:
			if (color.equals(Color.BLANCO)) {
				try {
					posicion = new Posicion(posicion.getFila()-pasos, posicion.getColumna());
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
			}else if (color.equals(Color.NEGRO)) {
				try {
					posicion = new Posicion(posicion.getFila()+pasos, posicion.getColumna());
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
				
			}
			break;
		case IZQUIERDA:
			if (color.equals(Color.BLANCO)) {
				try {
					posicion=new Posicion(posicion.getFila(),(char)(posicion.getColumna()-pasos));
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
			}else if (color.equals(Color.NEGRO)) {
				try {
					posicion=new Posicion(posicion.getFila(),(char)(posicion.getColumna()+pasos));
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
				
			}
			break;
		case DERECHA:
			if (color.equals(Color.BLANCO)) {
				try {
					posicion=new Posicion(posicion.getFila(),(char)(posicion.getColumna()+pasos));
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
			}else if (color.equals(Color.NEGRO)) {
				try {
					posicion=new Posicion(posicion.getFila(),(char)(posicion.getColumna()-pasos));
					setPosicion(this.posicion);
				}catch(IllegalArgumentException e) {
					throw new OperationNotSupportedException("ERROR: Movimiento no v�lido (se sale del tablero).");
				}
				
			}
			break;
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
			throw new NullPointerException("ERROR: No es posible copiar una posici�n nula.");
		}
		
		this.posicion = new Posicion(posicion);
	}
	
	
}
