package com.mfarias25.fundamentos.fundamentos;

public class OlaMergulhador {

    public static void main(String[] args) {
        System.out.println("Olá, mergulhador!");

        String nomeCompleto = "Mateus Farias";

        System.out.println("Nome: " + nomeCompleto);

        int minhaIdade = 29;
        int suaIdade = 25;
        int totalIdades = minhaIdade + suaIdade;
        System.out.println(totalIdades);

        double peso = 100.9d;
        System.out.println(peso);

        float taxa = 1_294.93f;

        boolean compraAprovada = false;
        System.out.println(compraAprovada);

        boolean maiorDeIdade = minhaIdade != 42;
        System.out.println(maiorDeIdade);
    }

}
