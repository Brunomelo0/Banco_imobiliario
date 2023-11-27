package com.example.policia;

import com.example.jogador.JogadorUm;

//package com.example.bancoimobiliario.Policia;

//import com.example.bancoimobiliario.Player.Player;

public interface IObserver {
    public void update(JogadorUm player);
    public void presos();
}
