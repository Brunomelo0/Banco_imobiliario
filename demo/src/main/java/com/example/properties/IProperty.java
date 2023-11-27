package com.example.properties;

import com.example.jogador.JogadorUm;

public interface IProperty extends IStrategy {


    @Override
    public float cobrarAluguel();
    public void setOwner(Player owner);

}
