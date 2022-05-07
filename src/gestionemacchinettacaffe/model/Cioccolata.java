/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.ChocoType;
import gestionemacchinettacaffe.model.enums.CoffeeType;

/**
 *
 * @author Megaport
 */
public class Cioccolata extends Bevanda{
    private ChocoType tipologia;

    public Cioccolata(String nome, float prezzo, int id) {
        super(nome, prezzo, id);
        this.tipologia = ChocoType.AL_LATTE;
    }

    public ChocoType getTipologia() {
        return tipologia;
    }

    public void setTipologia(ChocoType tipologia) {
        this.tipologia = tipologia;
    }

    //Questo metodo trasforma i nomi delle enum in array di string per essere facilmente visualizzato nel menu'
    //Enumconstants e il primo array che contiene tutti i valori delle enum
    //vengono copiate in un ciclo for nell'array di stringe valori
    //la trasformazione in stringe viene fatta dal metodo .name() che ritorna come stringa il nome del singolon valore dell'enum
    @Override
    public String[] getTipologie() {
        ChocoType[] enumConstants = tipologia.getDeclaringClass().getEnumConstants();
        String[] valori = new String[enumConstants.length];
        for (int i = 0; i < valori.length; i++) {
            valori[i] = enumConstants[i].getNiceName();
        }
        return valori;
    }
    
    
}
