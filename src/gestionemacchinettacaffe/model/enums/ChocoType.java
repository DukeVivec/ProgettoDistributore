/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

import gestionemacchinettacaffe.model.NicelyPrintable;

/**
 *
 * @author Megaport
 */
public enum ChocoType implements NicelyPrintable, SubType{
    FONDENTE("Cioccolato fondente"),
    AL_LATTE("Cioccolato al latte");
    
    private String niceName;

    private ChocoType(String niceName) {
        this.niceName = niceName;
    }

    @Override
    public String getNiceName() {
        return niceName;
    }
    
    @Override
    public String[] getTipologie() {
        String[] valori = new String[ChocoType.values().length];
        for (int i = 0; i < valori.length; i++) {
             valori[i] = ChocoType.values()[i].getNiceName();
         }
        return valori;
    }
    
    
}