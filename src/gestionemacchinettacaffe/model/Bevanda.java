/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.SubType;

/**
 *
 * @author Megaport
 */
public class Bevanda<T extends Enum<T>> {
    private Enum<T> subType;
    private final String nome;
    private final float prezzo;
    private final int id;

    public Bevanda(String nome, float prezzo, int id) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.id = id;
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

    public Enum<T> getSubType() {
        return subType;
    }
    
//    //come classe astratta, tutte le classi che la estendono devono implementare questo metodo
//    //e' la base per la stampa delle enum in array di stringe
//    public String[] getTipologie(); 
}
