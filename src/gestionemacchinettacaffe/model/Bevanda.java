/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

/**
 *
 * @author Megaport
 */
public class Bevanda {
    private final String nome;
    private final float prezzo;
    private final int id;
    private final String [] sottotipi;


    public Bevanda(String nome, float prezzo, int id, String ... sottotipi) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.id = id;
        this.sottotipi = sottotipi;
    }

    public String getNome() {
        return nome;
    }


    public float getPrezzo() {
        return prezzo;
    }


    public int getId() {
        return id;
    }

    
    //come classe astratta, tutte le classi che la estendono devono implementare questo metodo
    //e' la base per la stampa delle enum in array di stringe
    public String[] getSottotipi(){
        return this.sottotipi;
    }
}
