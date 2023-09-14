package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.*;
import com.mfarias25.banco.modelo.atm.CaixaEletronico;
import com.mfarias25.banco.modelo.pagamento.Boleto;
import com.mfarias25.banco.modelo.pagamento.DocumentoPagavel;
import com.mfarias25.banco.modelo.pagamento.Holerite;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Jaqueline Farias");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Mateus Farias");
        titular2.setDocumento("22233344455");

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
//        minhaConta.setTitular = titular1;
//        minhaConta.setAgencia = 123;
//        minhaConta.setNumero = 987;
//        minhaConta.saldo = 15_000;

        ContaEspecial suaConta = new ContaEspecial(titular2, 888, 333, 5_000);
 //       suaConta.titular = titular2;
 //       suaConta.agencia = 222;
 //       suaConta.numero = 333;
//        suaConta.saldo = 30_000;

        suaConta.depositar(10_000);
        suaConta.sacar(14_000);
        suaConta.debitarTarifasMensal();

        minhaConta.depositar(20_000);
        minhaConta.sacar(2_000);
        minhaConta.creditarRendimento(0.8);
        minhaConta.debitarTarifasMensal();

        Boleto boletoEscola = new Boleto(titular2, 700);
        Holerite salarioFuncionario = new Holerite(titular1, 100, 160);



        caixaEletronico.pagar( boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario , minhaConta);
        caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();


        //System.out.println("Boleto pago:" + boletoEscola.estaPago());
        //System.out.println("Holerite pago:" + salarioFuncionario.estaPago());
        System.out.println("------------------------------------------------");

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println("------------------------------------------------");
        caixaEletronico.imprimirSaldo(suaConta);


        //System.out.println("Titular: " + minhaConta.getTitular().getNome());
        //System.out.println("Documento: " + minhaConta.getTitular().getDocumento());
        //System.out.println("Agencia: " + minhaConta.getAgencia());
        //System.out.println("Numero da conta: " + minhaConta.getNumero());
        //System.out.println("Saldo total: " + minhaConta.getSaldo());
        //System.out.println("----------------------------------------------------------------");

        //System.out.println("Titular: " + suaConta.getTitular().getNome());
        //System.out.println("Documento: " + suaConta.getTitular().getDocumento());
        //System.out.println("Agencia: " + suaConta.getAgencia());
        //System.out.println("Numero da conta: " + suaConta.getNumero());
        //System.out.println("Saldo total: " + suaConta.getSaldo());
    }

}
