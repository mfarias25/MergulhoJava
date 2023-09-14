package com.mfarias25.banco.modelo;

public class ContaEspecial extends Conta {
    private double valorLimte;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimte) {
        super(titular, agencia, numero);
        this.valorLimte = valorLimte;
    }

    @Override
    public void debitarTarifasMensal() {
        sacar(20);

    }

    @Override //Sobscrita de uma superclass
    public double getSaldoDisponivel() {
        return getSaldo() + getValorLimte();
    }

    public double getValorLimte() {
        return valorLimte;
    }

    public void setValorLimte(double valorLimte) {
        this.valorLimte = valorLimte;
    }
}
