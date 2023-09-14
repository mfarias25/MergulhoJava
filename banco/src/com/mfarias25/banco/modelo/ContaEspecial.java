package com.mfarias25.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta {
    private BigDecimal valorLimte;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimte) {
        super(titular, agencia, numero);
        this.valorLimte = valorLimte;
    }

    @Override
    public void debitarTarifasMensal() {
        sacar(new BigDecimal("20"));

    }

    @Override //Sobscrita de uma superclass
    public BigDecimal getSaldoDisponivel() {
        return getSaldo().add(getValorLimte());
    }

    public BigDecimal getValorLimte() {
        return valorLimte;
    }

    public void setValorLimte(BigDecimal valorLimte) {
        this.valorLimte = valorLimte;
    }
}
