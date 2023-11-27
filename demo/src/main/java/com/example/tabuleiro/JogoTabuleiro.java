package com.example.tabuleiro;

import com.example.jogador.JogadorUm;
import com.example.policia.IObserver;
import com.example.policia.Policia;
import com.example.sections.Sections;

import java.util.ArrayList;

public final class JogoTabuleiro {

    private static JogoTabuleiro instance;
    ArrayList<Sections> sections = com.example.utils.initializeSections.initializeSections();
    ArrayList<JogadorUm> players = new ArrayList<>();
    //int valorDado;
    IObserver iObserver = new Policia();



    private JogoTabuleiro(){
        System.out.println("O jogo acaba de iniciar, você está na casa: " + sections.get(0));
        players.add(new JogadorUm());
        players.get(0).addObserver(iObserver);
        players.get(0).setCasaAtual(new Sections("inicio",200.000));
    }

    public static JogoTabuleiro getInstance(){
        if(instance == null){
            instance = new JogoTabuleiro();
        }

        return instance;
    }


    public Sections getCasaAtualJogador(){
        return players.get(0).getCasaAtual();
    }
    public void getCompraAtualJogador(Sections casa){
        players.get(0).comprar(players.get(0).getCasaAtual());
    }

    public int getPosicaoAtualJogador() {
        return players.get(0).getPosicao();
    }

    public JogadorUm getJogadorAtual(){
        return players.get(0);
    }


    public String jogarDados()
    {
        int diceResult = players.get(0).moverJogador();


        //desse jeito aqui ele anda e só depois é preso na 3º vez
        if(diceResult == -1){
            //mover jogador pra cadeia
        }
        else{

            //sets player in new section
            //verify player is in prison
            if(!players.get(0).estaPreso()) {

                players.get(0).setCasaAtual(sections.get(players.get(0).getPosicao()).getSections());
                sections.get(players.get(0).getPosicao()).ativaEfeito(players.get(0));


                System.out.println("Você tirou: " + diceResult + " no dado");
                System.out.println("sus" + sections.get(players.get(0).getPosicao()).getNome());
                return sections.get(players.get(0).getPosicao()).getNome();
            } else {

                System.out.println("Jogador preso");
            }
        }

        return "Vázio";
    }
}

