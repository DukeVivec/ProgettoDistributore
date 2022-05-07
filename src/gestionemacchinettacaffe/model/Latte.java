/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.CoffeeType;
import gestionemacchinettacaffe.model.enums.MilkType;

/**
 *
 * @author Megaport
 */
public class Latte extends Bevanda{
    private MilkType tipologia;

    public Latte(String nome, float prezzo, int id) {
        super(nome, prezzo, id);
        this.tipologia = MilkType.SEMPLICE;
    }

    public MilkType getTipologia() {
        return tipologia;
    }

    public void setTipologia(MilkType tipologia) {
        this.tipologia = tipologia;
    }

    //Questo metodo trasforma i nomi delle enum in array di string per essere facilmente visualizzato nel menu'
    //Enumconstants e il primo array che contiene tutti i valori delle enum
    //vengono copiate in un ciclo for nell'array di stringe valori
    //la trasformazione in stringe viene fatta dal metodo .name() che ritorna come stringa il nome del singolon valore dell'enum
    @Override
    public String[] getTipologie() {
        MilkType[] enumConstants = tipologia.getDeclaringClass().getEnumConstants();
        String[] valori = new String[enumConstants.length];
        for (int i = 0; i < valori.length; i++) {
            valori[i] = enumConstants[i].getNiceName();
        }
        return valori;
    }
    
    
}
