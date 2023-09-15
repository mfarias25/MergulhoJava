package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroContaFunction  implements ToIntFunction<Conta> {
    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero() ;
    }
}
