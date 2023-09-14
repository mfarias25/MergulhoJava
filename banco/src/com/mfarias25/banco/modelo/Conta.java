package com.mfarias25.banco.modelo;

import com.mfarias25.banco.modelo.excecao.SaldoInsuficienteException;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private BigDecimal saldo = BigDecimal.ZERO;


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

    public BigDecimal getSaldo() {
        return saldo;
    }


    //     com.mfarias25.banco.modelo.Conta() {}  //CONTRUTOR
    Conta() {

    }

    public Conta(Pessoa titular, int agencia, int numero) { // CONTRUTOR
        Objects.requireNonNull(titular); // validacao de objetos exigindo argumentos nao null.

        this.titular = titular; // this. = referecia o objeto e atribuio as variaveis de instancia.
        this.agencia = agencia;
        this.numero = numero;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0"); // estado ilegal.
        }
        saldo = saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }

        if (getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        saldo = saldo.subtract(valor);
    }

    public void sacar(BigDecimal valor, BigDecimal taxaSaque) {
        sacar(valor.add(taxaSaque));
    }

    public BigDecimal getSaldoDisponivel() {
        return getSaldo();
    }

    public abstract void debitarTarifasMensal();

}
