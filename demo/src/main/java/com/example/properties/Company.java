package com.example.properties;

import com.example.jogador.JogadorUm;
import com.example.sections.Sections;

public class Company extends Sections implements IProperty {

    int valor;
    JogadorUm owner;

    public Company(String nome) {
        super(nome);
    }

    public Company(String nome, Double valor) {
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
