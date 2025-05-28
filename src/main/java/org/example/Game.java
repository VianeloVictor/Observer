package org.example;

import java.util.Observable;

public class Game extends Observable {

    private Integer nivel;
    private Integer poder;
    private String classe;
    private String guilda;

    public Game(Integer nivel, Integer poder, String classe, String guilda) {
        this.nivel = nivel;
        this.poder = poder;
        this.classe = classe;
        this.guilda = guilda;
    }

    public void entrarGuilda() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "{" +
                "nivel=" + nivel +
                ", poder=" + poder +
                ", classe='" + classe + '\'' +
                ", guilda='" + guilda + '\'' +
                '}';
    }
}