package com.example.sections;


import com.example.jogador.JogadorUm;

import java.util.ArrayList;



public class Prisao implements ISectionEffect {
    ArrayList<JogadorUm> jogadoresPresos;

    public Prisao(){
        jogadoresPresos = new ArrayList<>();
    }

    @Override
    public void ativaEfeito(JogadorUm player) {
/*         player.pagarTaxa(100);
 */        jogadoresPresos.add(player);
        
    }
    public void presos(){
        for(int i= 0; i < jogadoresPresos.size(); i++){
            System.out.println(jogadoresPresos.get(i));
        }
    }
}

