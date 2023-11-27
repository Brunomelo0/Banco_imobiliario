package com.example.jogador;

import com.example.banco.Banco;

import com.example.bancoimobiliario.Sections.IObservable;
import com.example.bancoimobiliario.Policia.IObserver;
import com.example.bancoimobiliario.Sections.Sections;

import java.util.ArrayList;


public class JogadorUm implements IObservable, Ijogador {

    Banco conta = new Banco(25000);
    boolean estaPreso = false;
    int posicao = 0;
    IObserver iObserver;
    ArrayList<Sections> minhasCasas;
    int id;

    Sections casaAtual;

    int qtdDuplas;


    public JogadorUm() {
        this.qtdDuplas = 0;
        minhasCasas = new ArrayList<>();
        casaAtual = new Sections("inicio",200.000);
    }


    public Sections getCasaAtual() {
        return casaAtual;
    }

    public void setCasaAtual(Sections casaAtual) {
        this.casaAtual = casaAtual;
        if(this.casaAtual.getNome().equals("entre no camburao")){
            setInPrison(true);
            notifyObserver();
        }
    }

    public float getBalance() {
        return conta.getSaldo();
    }

    public void setBalance(float balance) {
        conta.setSaldo(balance);
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public boolean estaPreso() {
        return estaPreso;
    }

    public void setPrisao(boolean inPrison) {
        estaPreso = inPrison;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int position) {
        this.posicao = position;
    }


    public int getQtdDuplas() {
        return qtdDuplas;
    }

    public void setQtdDuplas(int qtdDuplas) {
        this.qtdDuplas = qtdDuplas;
    }

    public int jogarDados()
    {
        int dado1 = (int)((Math.random() * (6 - 1)) + 1);
        int dado2 = (int)((Math.random() * (6 - 1)) + 1);
        this.qtdDuplas = (dado1 == dado2) ? this.qtdDuplas+1 : 0;

        if(this.qtdDuplas == 3){
            this.estaPreso = true;
            return -1;
        }


        
        return (dado1 + dado2);
    }

    public int moverJogador()
    {
        int somaDados = jogarDados();
        int Posicao = getPosicao();

        if(getPosicao() + somaDados > 39) {
            Posicao = getPosicao() + somaDados - 39;
            setPosicao(Posicao);
            setBalance(getBalance() + 2000); //bonificação de quando o player completa uma volta
        }
        else{
            
            Posicao = getPosicao() + somaDados - 39;
            setPosicao(Posicao);
        }

        return Posicao;
    }

    @Override
    public void addObserver(IObserver iObserver) {
        this.iObserver = iObserver;
    }

    @Override
    public void notifyObserver() {
        iObserver.update(this);
    }


    @Override
    public void comprar(Sections Casa) {
        if(Casa.getValor() <= account.getSaldo()){
            minhasCasas.add(Casa);
            setBalance((float) (getBalance()-Casa.getValor()));
        }
    }


    @Override
    public void pagarTaxa(float taxa) {
        setBalance((float) (getBalance()-taxa));
        
    }


    @Override
    public void receberTaxa(float taxa) {
        setBalance((float) (getBalance()+taxa));

    }


    @Override
    public void adicionarCasas() {
        /* minhasCasas.add(); */
        
    }


    @Override
    public int getQuantidadeCasas() {
        /* return minhasCasas.size(); */
        return 0;
    }
    @Override
    public String toString(){
        return "Jogador: "+ 0;
    }
    public Banco getConta(){
        return conta;
    }


}
