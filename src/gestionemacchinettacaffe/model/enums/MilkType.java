/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum MilkType {
    MACCHIATO("Latte macchiato"),
    CAFFELATTE("Caffelatte"),
    SEMPLICE("Latte bianco");
    
    private String niceName;

    private MilkType(String niceName) {
        this.niceName = niceName;
    }

    public String getNiceName() {
        return niceName;
    }
}
