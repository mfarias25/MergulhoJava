package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.Conta;
import com.mfarias25.banco.modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Jaqueline Farias");
        titular1.setDocumento("12312312311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Mateus Farias");
        titular2.setDocumento("22233344455");

        Conta minhaConta = new Conta(titular1, 123, 987);
//        minhaConta.setTitular = titular1;
//        minhaConta.setAgencia = 123;
//        minhaConta.setNumero = 987;
//        minhaConta.saldo = 15_000;

        Conta suaConta = new Conta(titular2, 888, 333);
 //       suaConta.titular = titular2;
 //       suaConta.agencia = 222;
 //       suaConta.numero = 333;
//        suaConta.saldo = 30_000;

        suaConta.depositar(10_000);
        suaConta.sacar(5000, 10);

        minhaConta.depositar(5_000);
        minhaConta.sacar(2_000, 5);

        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Documento: " + minhaConta.getTitular().getDocumento());
        System.out.println("Agencia: " + minhaConta.getAgencia());
        System.out.println("Numero da conta: " + minhaConta.getNumero());
        System.out.println("Saldo total: " + minhaConta.getSaldo());
        System.out.println("----------------------------------------------------------------");

        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Documento: " + suaConta.getTitular().getDocumento());
        System.out.println("Agencia: " + suaConta.getAgencia());
        System.out.println("Numero da conta: " + suaConta.getNumero());
        System.out.println("Saldo total: " + suaConta.getSaldo());
    }

}
