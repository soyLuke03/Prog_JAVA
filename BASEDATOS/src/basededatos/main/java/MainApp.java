package basededatos.main.java;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {


	
	private static final String STRING = "1- Mostrar informaci�n de los clientes"
	+"\n2- Mostrar pedidos"
	+"\n3- A�adir cliente"
	+"\n4- Actualizar cliente existente"
	+"\n5- Eliminar cliente"
	+"\n6- A�adir pedido"
	+"\n7- Incluir l�neas"
	+"\n8- Salir";
	
	
	

	
		public static void main(String[] args) {

			try {
				new Conector().connect();
			} catch (SQLException | ClassNotFoundException e) {

				e.printStackTrace();
			}
	
		 
	
	
	}
}
