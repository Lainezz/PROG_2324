package com.es.programacion.tema6.proyectoGestionEventosDeportivos.utils;

public class ValidatorUtils {

    private static final String EXP_REG_DNI = "^\\d{8}(-|\\s|\\/)?[a-zA-Z]$";

    public static boolean validateDni(String dni) {
        return dni.matches(EXP_REG_DNI);
    }

}
