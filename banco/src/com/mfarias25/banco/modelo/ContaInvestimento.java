package com.mfarias25.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero); // chama o contrutor padrao, da super classe
    }

    @Override
    public void debitarTarifasMensal() {
        if (getSaldo().compareTo(new BigDecimal("10000")) < 0) {
            sacar(new BigDecimal("30"));
        }

    }

    public void creditarRendimento(BigDecimal percentualJuros) {
        BigDecimal valorRendimento = getSaldo().multiply(percentualJuros).divide(new BigDecimal("100"), 2, RoundingMode.HALF_EVEN);
        //Arrendondamento bankers-rounding  = RoundingMode.HALF_EVEN
        //Ex-Arredondamento:  2.524 = 2.52 bankers-rounding
        // 2.526 = 2.53 bankers-rounding
        depositar(valorRendimento);
    }
}
