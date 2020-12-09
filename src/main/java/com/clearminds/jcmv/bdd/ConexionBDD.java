package com.clearminds.jcmv.bdd;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class ConexionBDD {
	
	public static String leerPropiedad(String leer){
		
		String propiedad = null;
		try {
			File file = new File("./conexion.properties");
			Properties p = new Properties();
			p.load(new FileReader(file));
			propiedad = p.getProperty(leer);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return propiedad;
	}
	
}
