package org.example;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {

    private String nome;
    private String ultimaNotificacao;

    public User(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void entrar(Game game) {
        game.addObserver(this);
    }

    public void update(Observable game, Object arg1) {
        this.ultimaNotificacao = this.nome + ", seus status são " + game.toString();
        // System.out.println(this.ultimaNotificacao);
    }
}