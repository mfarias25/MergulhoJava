package com.mfarias25.banco.modelo.pagamento;

import com.mfarias25.banco.modelo.Pessoa;

import javax.print.Doc;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;
    private double valorHora;
    private int quantidadeHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, double valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double getValorTotal() {
        return valorHora * quantidadeHoras;
    }

    @Override
    public boolean estaPago() {
        return pago;
    }

    @Override
    public void quitarPagamento() {
        pago = true;

    }
}
