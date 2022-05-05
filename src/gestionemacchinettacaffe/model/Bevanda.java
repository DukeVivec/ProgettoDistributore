/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

/**
 *
 * @author Megaport
 */
public abstract class Bevanda {
    private String nome;
    private float prezzo;
    private int id;

    public Bevanda() {
    }

    public Bevanda(String nome, float prezzo, int id) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //come classe astratta, tutte le classi che la estendono devono implementare questo metodo
    //e' la base per la stampa delle enum in array di stringe
    public abstract String[] getTipologie(); 
}
