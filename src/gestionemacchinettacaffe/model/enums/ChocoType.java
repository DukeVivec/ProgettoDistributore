/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum ChocoType {
    FONDENTE("Cioccolato fondente"),
    AL_LATTE("Cioccolato al latte");
    
    private String niceName;

    private ChocoType(String niceName) {
        this.niceName = niceName;
    }

    public String getNiceName() {
        return niceName;
    }
    
    
}