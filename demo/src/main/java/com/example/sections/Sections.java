package com.example.sections;

import com.example.tabuleiro.IcasaTabuleiro;
import com.example.jogador.JogadorUm;

import java.util.ArrayList;



public class Sections implements ISectionEffect, IcasaTabuleiro {
    private String nome;
	private ArrayList<JogadorUm> jogadoresNaCasa;
    double valor;


    public Sections(String nome){
        this.nome = nome;
        jogadoresNaCasa = new ArrayList<>();
    }


    public Sections(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
        jogadoresNaCasa = new ArrayList<>();
    }


    @Override
    public void adicionarJogadoresNaListaDaCasa(JogadorUm player) {
        jogadoresNaCasa.add(player);
        
    }


    @Override
    public void removerJogadoresDaListaDaCasa(JogadorUm player) {
        jogadoresNaCasa.remove(player);
        
    }


    @Override
    public void ativaEfeito(JogadorUm player) {
        if(nome.contains("restituição")){
            player.receberTaxa(200.000f);
        }
        else if(nome.contains("receita")){
            player.pagarTaxa(200.000f);
        }
        
    }
    public Sections getSections(){
        return this;
    }
    public double getValor(){
        return valor;
    }

    public String getNome() {
        return nome;
    }
}

