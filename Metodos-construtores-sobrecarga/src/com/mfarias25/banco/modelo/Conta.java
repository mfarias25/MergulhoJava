package com.mfarias25.banco.modelo;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;


    // JAVABENS
    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    //     com.mfarias25.banco.modelo.Conta() {}  //CONTRUTOR

    public Conta(Pessoa titular, int agencia, int numero) { // CONTRUTOR
        Objects.requireNonNull(titular); // validacao de objetos exigindo argumentos nao null.

        this.titular = titular; // this. = referecia o objeto e atribuio as variaveis de instancia.
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0"); // estado ilegal.
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }

        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }
        saldo = saldo - valor;
    }

    public void sacar(double valor, double taxaSaque) {
        sacar(valor + taxaSaque);
    }

}
