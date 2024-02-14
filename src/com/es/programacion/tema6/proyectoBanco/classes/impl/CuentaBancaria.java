package com.es.programacion.tema6.proyectoBanco.classes.impl;

import com.es.programacion.tema6.proyectoBanco.classes.api.Cuenta;
import com.es.programacion.tema6.proyectoBanco.utils.api.GenericUtil;

public abstract class CuentaBancaria implements Cuenta {

    /*
    ATRIBUTOS DE CLASE
     */
    private String iban;
    private double saldo;

    public static final double INTERES_ANUAL_BASICO = 2;

    // Dat dependency injection
    private GenericUtil util;

    /*
    CONSTRUCTORES DE CLASE
     */
    public CuentaBancaria(String iban, GenericUtil util) throws IllegalArgumentException {
        this.util = util;
        this.setIban(iban);
        this.setSaldo(0);
    }


    /*
    METODOS DE CLASE
     */
    public abstract void calcularIntereses();

    public boolean ingresar(double cantAIngresar) throws Exception {

        if(cantAIngresar < 0) {
            throw new Exception("La cantidad no puede ser menor a 0");
        } else {
            anadir(Math.abs(cantAIngresar));
        }

        return false;
    }

    public boolean retirar(double cantARetirar) throws Exception {

        if(cantARetirar < 0) {
            throw new Exception("La cantidad no puede ser menor a 0");
        } else {
            double newSaldo = this.saldo - cantARetirar;
            if(newSaldo < 0) {
                throw new Exception("La cantidad es mayor al saldo disponible");
            } else {
                anadir(-cantARetirar);
            }
        }
        return false;
    }
    private void anadir(double cantidad) {
        this.saldo += cantidad;
    }

    public boolean transferir(Cuenta otraCuenta, double cantidadTraspaso) {

        CuentaBancaria cuentaDestino = (CuentaBancaria) otraCuenta;

        double saldoC1 = this.saldo;
        double saldoC2 = cuentaDestino.saldo;
        try {
            // OPERACION CUENTA 1
            this.retirar(cantidadTraspaso);
            // OPERACION CUENTA 2
            cuentaDestino.ingresar(cantidadTraspaso);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            this.saldo = saldoC1;
            cuentaDestino.saldo = 200;
            return false;
        }
    }

    /*
    GETTERS AND SETTERS
     */
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) throws IllegalArgumentException{

        if(util.checkIbanFormat(iban)) {
            this.iban = iban;
        } else {
            throw new IllegalArgumentException("Formato IBAN incorrecto");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
