/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deposito;

/**
 * La clase <code>CCuenta</code> representa una cuenta bancaria con operaciones
 * básicas como ingresar y retirar dinero, así como consultar el saldo.
 * 
 * @author angel
 * @version 2.0
 * @since 17.02.2025
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CCuenta {

    /**
     * El nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * El número de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * El saldo actual de la cuenta bancaria.
     */
    private double saldo;

    /**
     * El tipo de interés de la cuenta bancaria.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto. Crea una nueva cuenta sin valores definidos.
     */
    public CCuenta() {
    }

    /**
     * Constructor que inicializa los atributos de la cuenta.
     * 
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de cuenta.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double estado() {
        return getSaldo(); // Asegúrate de que el método getSaldo está siendo llamado correctamente
    }

    /**
     * Realiza un retiro de dinero de la cuenta.
     * 
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o no hay suficiente saldo.
     */
    public void retirar(double cantidad) {
        try {
            System.out.println("Retiro en cuenta: " + cantidad);
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No hay suficiente saldo");
            }
            setSaldo(getSaldo() - cantidad); // Usa el método getSaldo y setSaldo
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Realiza un ingreso de dinero en la cuenta.
     * 
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) {
        try {
            System.out.println("Ingreso en cuenta: " + cantidad);

            if (cantidad < 0) {
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            setSaldo(getSaldo() + cantidad); // Usa el método getSaldo y setSaldo
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de la cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta.
     * 
     * @param cuenta El número de la cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     * 
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El nuevo tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}

 