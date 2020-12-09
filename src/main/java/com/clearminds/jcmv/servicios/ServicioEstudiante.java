package com.clearminds.jcmv.servicios;

import java.sql.*;

import com.clearminds.jcmv.dtos.Estudiante;
import com.clearminds.jcmv.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		Statement stmt = null;
		System.out.println("Insertando estudiante" + estudiante);
		try {
			stmt = getConexion().createStatement();
			String sql = "INSERT INTO estudiantes(nombre,apellido) "+
						 "VALUES ('"+estudiante.getNombre()+"','"+estudiante.getApellido()+"')";
			System.out.println("Script: " + sql);
			stmt.executeUpdate(sql);
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new BDDException("Error al insertar estudiante");
		}
	}
	
}
