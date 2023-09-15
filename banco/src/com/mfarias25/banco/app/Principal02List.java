package com.mfarias25.banco.app;

import com.mfarias25.banco.modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class Principal02List {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa("Mateus Farias", "1020304050");
        Pessoa pessoa02 = new Pessoa("Jaqueline Farias", "1121314151");
        //System.out.println(pessoa01.toString());

        List<Pessoa> pessoas = new ArrayList<>(); //Operador diamente <>
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        //System.out.println(pessoas);

        //Buscando item da Lista:
        Pessoa pessoa03 = pessoas.get(1);//Só pode ser usado em List
        //System.out.println(pessoa03);


        //Percorrento a Lista e buscando somento os nomes.
        for (int i = 0; i < pessoas.size(); i++) {
           // System.out.println(pessoas.get(i).getNome());
        }


        //Percorrento a Lista e buscando somento os nomes
        for (Pessoa pessoa : pessoas) {
           // System.out.println(pessoa.getNome());
         }

        //Se a pessoa está dentro da Lista ou não, verificação de igualdade:
        //contais = Verficação de conter o conteudo da Lista
        //equals = comparação de conteudos
        // == = comparação de instacias
        Pessoa pessoa04 = new Pessoa("Mateus Farias", "1020304050");
        boolean exist = pessoas.contains(pessoa04);
        //System.out.println(exist);



        //System.out.println(pessoa01.equals(pessoa04));







    }
}
