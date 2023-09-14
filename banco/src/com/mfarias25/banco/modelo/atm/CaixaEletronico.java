package com.mfarias25.banco.modelo.atm;

import com.mfarias25.banco.modelo.Conta;
import com.mfarias25.banco.modelo.pagamento.DocumentoEstornavel;
import com.mfarias25.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
    public void imprimirSaldo(Conta conta) {
        System.out.println("Conta:" + conta.getNumero() + "/" + conta.getAgencia());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Documento: " + conta.getTitular().getDocumento());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());
    }

    public void pagar(DocumentoPagavel documento, Conta conta) {
        if (documento.estaPago()) {
            throw new IllegalArgumentException("Documento ja esta pago!");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();

    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
        if(!documento.estaPago()) {
            throw new IllegalArgumentException("Documento nao esta pago!");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();


    }
}
