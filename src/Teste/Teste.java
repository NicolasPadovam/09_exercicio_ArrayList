package Teste;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {

        ArrayList<Produto> teste = new ArrayList<>();


        teste.add(new Produto(1, "A"));
        teste.add(new Produto(2, "B"));
        teste.add(0, new Produto(3, "C"));

        for (int i = 0; i < teste.size(); i++) {
            System.out.println(teste.get(i).id);
        }

        for (Produto p: teste){
            System.out.println(p.nome);
        }

        System.out.println(teste);

    }
}
