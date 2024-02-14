package com.es.programacion.tema6.proyectoBanco.classes.api;

import com.es.programacion.tema6.proyectoBanco.classes.impl.CuentaBancaria;

public interface Cuenta {

    public boolean ingresar(double cantidadIngresar) throws Exception;
    public boolean retirar(double cantidadARetirar) throws Exception;
    public boolean transferir(Cuenta otraCuenta, double cantidadTraspaso);
    public void calcularIntereses();

}
