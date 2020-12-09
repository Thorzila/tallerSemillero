package com.clearminds.jcmv.servicios;

import com.clearminds.jcmv.bdd.ConexionBDD;
import com.clearminds.jcmv.excepciones.BDDException;

import java.sql.Connection;

public class ServicioBase {
	Connection conexion = null;
	
	public void abrirConexion() throws BDDException{
		conexion = ConexionBDD.obtenerConexion();			
	}
	
	public void cerrarConexion(){
		try {
			if (conexion!=null) {
				conexion.close();
				System.out.println("Conexión cerrada");							
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error al cerrar la conexión");
		}
	}
}
