package com.clearminds.jcmv.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static final String FORMATO_COMPLETO = "yyyy/MM/dd HH:mm:ss"; 
	
	public static String obtenerFecha(Date date){ 
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_COMPLETO); 
		String texto = sdf.format(date);
		return texto;
	}
}
