package com.example.policia;

import com.example.jogador.JogadorUm;
import com.example.bancoimobiliario.Sections.Prison;



public class Policia implements IObserver {
    Prisao prison = new Prisao();

    @Override
    public void update(Player player) {
        prisao.ativaEfeito(player);
        
    }
    public void presos(){
        prisao.presos();
    }
    
}
