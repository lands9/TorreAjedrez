package org.iesalandalus.programacion.torreajedrez;

public class Posicion {
	private int fila;
	private char columna;
	
	
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion posicion) {
		if(posicion == null) {
			throw new NullPointerException("No se puede copiar una posición nula");
		}
		this.fila=posicion.getFila();
		this.columna=posicion.getColumna();
	}
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		if (fila <=0 || fila>=9) {
			throw new IllegalArgumentException("Error: La fila no es correcta");
		}
		this.fila = fila;
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna!='a' || columna!='b' || columna!='c' || columna!='d' || columna!='e' || columna!='f' || columna!='g' || columna!='h') {
			throw new IllegalArgumentException("Error: La columna no es correcta");
		}
		this.columna = columna;
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
