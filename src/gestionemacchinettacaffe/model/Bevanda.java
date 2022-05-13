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

    //il varargs permette di passare in argomento al metodo che lo utilizza
    //0 o più oggetti dello stesso tipo, i quali poi verranno automaticamente
    //immagazzinati in un array con il nome scelto nella dichiarazione del
    //varargs. 
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

    
    public String[] getSottotipi(){
        return this.sottotipi;
    }
}
