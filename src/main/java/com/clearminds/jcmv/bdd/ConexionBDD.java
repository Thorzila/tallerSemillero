package com.clearminds.jcmv.bdd;

import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.clearminds.jcmv.excepciones.BDDException;

public class ConexionBDD {
	static final String JDBC_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	public static String leerPropiedad(String leer) {
		String propiedad = null;
		try {
			File file = new File("./conexion.properties");
			System.out.println(file.getAbsolutePath());
			Properties p = new Properties();
			p.load(new FileReader(file));
			propiedad = p.getProperty(leer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propiedad;
	}

	public static Connection obtenerConexion() throws BDDException {
		final String DB_URL = leerPropiedad("urlConexion");
		final String USER = leerPropiedad("usuario");
		final String PASS = leerPropiedad("password");

		Connection conn = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
			throw new BDDException("No se pudo conectar a la base de datos");
		}
		return conn;
	}
}
