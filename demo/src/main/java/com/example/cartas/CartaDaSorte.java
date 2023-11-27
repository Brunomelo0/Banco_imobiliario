package com.example.cartas;

//import android.widget.Toast;

//import com.example.bancoimobiliario.Player.Player;
//import com.example.bancoimobiliario.Sections.ISectionEffect;

import java.util.ArrayList;

public class CartaDaSorte implements ISectionEffect {
    ArrayList<String> cartas;

    public CartaDaSorte(){
        cartas = new ArrayList<>();
    }
    public void inicializaCartas(){
        cartas.add("Sorte: Uma herança inesperada. Jogador recebe: R$ 75.000");
        cartas.add("Sorte: Sua casa será desapropriada para a contrução de um metrô: Jogador recebe idenização de R$ 60.000");
        cartas.add("Sorte: Silvio santos te deu R$ 10.000");
        cartas.add("Azar: Voce perdeu R$ 25.000");
        cartas.add("Azar: voce foi roubado em R$ 45.000");
        cartas.add("Azar: Perdeu tudo");
    }

    @Override

    public void ativaEfeito(Player player)
    {
        int cardPosition = (int)((Math.random() * (6 - 1)) + 1);
        System.out.println("Carta da sorte: "+ cartas.get(cardPosition));
        switch (cartas.get(cardPosition))
        {
            case "Sorte: Uma herança inesperada. Jogador recebe: R$ 75.000":
                player.setBalance(75000.00F);
                break;
            case "Sorte: Sua casa será desapropriada para a contrução de um metrô: Jogador recebe idenização de R$ 100.000":
                player.setBalance(100000.00F);
                break;
            case "Sorte: Você ganhou R$ 10.000":
                player.setBalance(10000.00F);
                break;
            case "Azar: Voce perdeu R$ 15.000":
                player.pagarTaxa(15000.00F);
                break;
            case "Azar: voce foi roubado em R$ 45.000":
                player.pagarTaxa(45000.00F);
                break;
            case "Azar: Perdeu tudo":
                player.pagarTaxa(player.getBalance());
                break;
        }

    }
}

