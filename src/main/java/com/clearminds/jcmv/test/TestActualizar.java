package com.clearminds.jcmv.test;

import com.clearminds.jcmv.dtos.Estudiante;
import com.clearminds.jcmv.excepciones.BDDException;
import com.clearminds.jcmv.servicios.ServicioEstudiante;

public class TestActualizar {

	public static void main(String[] args) {
		ServicioEstudiante srvEstudiante = new ServicioEstudiante();
		try {
			srvEstudiante.actualizarEstudiante(new Estudiante("Pedro", "Navaja", 2));
		} catch (BDDException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
