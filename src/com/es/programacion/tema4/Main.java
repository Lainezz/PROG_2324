package com.es.programacion.tema4;

import com.es.programacion.tema4.funcionesII.DniValidator;

public class Main {

    public static void main(String[] args) {
        String dniAProbar1 = "12345678A"; // Uno que tiene que dar true
        String dniAProbar2 = "123X5678A"; // Uno que debe dar false

        boolean validez1 = DniValidator.comprobarParteNumerica(dniAProbar1);
        boolean validez2 = DniValidator.comprobarParteNumerica(dniAProbar2);

        if(validez1) { // if(validez1 == true)
            System.out.println("El dni "+dniAProbar1+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar1+" es incorrecto");
        }

        if(validez2) { // if(validez2 == true)
            System.out.println("El dni "+dniAProbar2+" es correcto");
        } else {
            System.out.println("El dni "+dniAProbar2+" es incorrecto");
        }



    }
}
