package com.model;

public class BlocException extends RuntimeException {

	public BlocException() {
		
	}
	
	public BlocException(String mensaje, Throwable lanzable, boolean a, boolean b) {
		super(mensaje,lanzable);
	}
	
	public BlocException(String mensaje,Throwable lanzable) {
		super(mensaje,lanzable);
	}
	
	public BlocException(String mensaje) {
		super(mensaje);
	}
	
	public BlocException(Throwable lanzable) {
		super(lanzable);
	}
	
}
