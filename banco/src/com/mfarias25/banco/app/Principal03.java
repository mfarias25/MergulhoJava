package com.mfarias25.banco.app;


import com.mfarias25.banco.modelo.Banco;
import com.mfarias25.banco.modelo.Conta;

import java.util.Comparator;

public class Principal03 {

    public static void main(String[] args) {
        Banco banco = new Banco();

        //ToIntFunction<Conta> function = (Conta conta) -> { // Lambda com Arrows-Function
        // return conta.getNumero() ;
        //};

        //banco.getContas().sort(Comparator.comparingInt(new NumeroContaFunction()));
        /* banco.getContas().sort(Comparator.comparingInt(
            conta -> conta.getNumero()));*/ // Modo mais enxuto - Lambda com Arrows-Function

        //banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));

        banco.getContas().sort(Comparator.comparingInt((Conta conta) -> { // Lambda com Arrows-Function
            return conta.getNumero() ;
        }));



        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }

}