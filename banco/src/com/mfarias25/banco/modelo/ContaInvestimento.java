package com.mfarias25.banco.modelo;

public class ContaInvestimento extends Conta {
    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero); // chama o contrutor padrao, da super classe
    }

    @Override
    public void debitarTarifasMensal() {
        if (getSaldo() <10_000) {
            sacar(30);
        }

    }

    public void creditarRendimento(double percentualJuros) {
        double valorRendimento = getSaldo() * percentualJuros / 100;
        depositar(valorRendimento);
    }
}
