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
public enum CoffeeType implements NicelyPrintable, SubType {
    MACCHIATO("Caffe' macchiato"),
    LUNGO("Caffe' lungo"),
    CORTO("Caffe' corto");
    
    private String niceName;

    private CoffeeType(String niceName) {
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
