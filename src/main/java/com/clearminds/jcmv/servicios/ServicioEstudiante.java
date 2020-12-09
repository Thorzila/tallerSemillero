package com.clearminds.jcmv.servicios;

import com.clearminds.jcmv.dtos.Estudiante;
import com.clearminds.jcmv.excepciones.BDDException;

public class ServicioEstudiante extends ServicioBase {
	
	public void insertarEstudiante(Estudiante estudiante) throws BDDException{
		abrirConexion();
		System.out.println("Insertando estudiante" + estudiante);
		cerrarConexion();
	}
	
}
