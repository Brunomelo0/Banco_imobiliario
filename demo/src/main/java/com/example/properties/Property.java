package com.example.properties;

import com.example.jogador.JogadorUm;
import com.example.sections.Sections;

public class Property extends Sections implements IProperty{

    int valor;
    JogadorUm owner;

    public Property(String nome) {
        super(nome);
    }

    public Property(String nome, Double valor) {
        super(nome, valor);
    }


    @Override
    public float cobrarAluguel() {
        return 0;
    }

    @Override
    public void setOwner(JogadorUm owner) {
        this.owner = owner;
    }
}

