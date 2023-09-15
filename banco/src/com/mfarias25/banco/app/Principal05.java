package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.Banco;
import com.mfarias25.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Optional;

public class Principal05 {
    public static void main(String[] args) {
        Banco banco = new Banco();
        //Optional <Conta> contaOptional = banco.buscar(222, 999);
        //contaOptional.ifPresent(conta -> System.out.println(conta.getSaldo()));

        //opção mais verboso
        //if (contaOptional.isPresent()) {
        //Conta contaEncontrada = contaOptional.get();
        //System.out.println(contaEncontrada.getSaldo());
        //}

        //Opção mais enxuto
        Conta contaEncontrada = banco.buscar(222, 999)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        System.out.println(contaEncontrada.getSaldo());

        BigDecimal saldo = banco.buscar(222, 999)
                .map(Conta :: getSaldo)
                .orElse(BigDecimal.ZERO);
        System.out.println(saldo);

    }
}
