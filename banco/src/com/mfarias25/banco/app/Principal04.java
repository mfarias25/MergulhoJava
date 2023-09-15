package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.Banco;
import com.mfarias25.banco.modelo.Conta;
import com.mfarias25.banco.modelo.Pessoa;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal04 {
    public static void main(String[] args) {
        Banco banco = new Banco();

        // Lista de pessoas
        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                        .toList();
                //.collect(Collectors.toList());
        System.out.println(titulares);


        //Saldo Total das contas
        BigDecimal saldoToal = banco.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(saldoToal);

        //Pipeline = Conjunto de operacoes config em sequencias que vai ser executado em stream em algum momento.
        /*Stream<Conta> stream = banco.getContas().stream(); //Interface Stream
        Stream<Conta> stream2 = stream.filter(conta -> conta
                .getSaldo()
                .compareTo(new BigDecimal("130")) >0);
        Stream<Conta> stream3 = stream2.filter(conta -> conta.getNumero()>300);*/

        //Elementos tipo conta
        //Pipeline codigo Enxugado
        /*banco.getContas().stream()
                .filter(conta -> conta
                        .getSaldo()
                        .compareTo(new BigDecimal("130")) > 0)
                .filter(conta -> conta.getNumero() > 100)
                .sorted(Comparator.comparingInt(Conta::getNumero)) //Ordena do maior para o maior pelo numero.
                //Operação terminal Codigo Enxugado
                .forEach(conta -> {
                    System.out.println("Ag:" + conta.getAgencia() + " / " + "Acc:" + conta.getNumero() +
                            " = " + "R$:" + conta.getSaldo());
                });*/

        //Pipeline codigo Enxugado
        banco.getContas().stream()
                .filter(conta -> conta
                        .getSaldo()
                        .compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                //Operação terminal Codigo Enxugado
                .forEach(System.out::println);


        //Operação terminal
        /*stream3.forEach(conta -> {
           conta.depositar(new BigDecimal("100"));
            System.out.println("Ag:" + conta.getAgencia() + " / " + "Acc:" + conta.getNumero() +
                    " = " + "R$:" + conta.getSaldo());
        });*/
    }
}
