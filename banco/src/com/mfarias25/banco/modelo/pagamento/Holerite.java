package com.mfarias25.banco.modelo.pagamento;

import com.mfarias25.banco.modelo.Pessoa;

import javax.print.Doc;
import java.math.BigDecimal;

public class Holerite implements DocumentoPagavel {

    private Pessoa funcionario;
    private BigDecimal valorHora;
    private int quantidadeHoras;
    private boolean pago;

    public Holerite(Pessoa funcionario, BigDecimal valorHora, int quantidadeHoras) {
        this.funcionario = funcionario;
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public BigDecimal getValorTotal() {
        return valorHora.subtract(new BigDecimal(quantidadeHoras)) ;
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
