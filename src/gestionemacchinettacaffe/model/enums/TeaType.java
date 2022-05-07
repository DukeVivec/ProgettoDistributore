/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum TeaType {
    LIMONE("Te al limone"),
    PESCA("Te alla pesca"),
    VERDE("Te verde");
    
    private String niceName;

    private TeaType(String niceName) {
        this.niceName = niceName;
    }

    public String getNiceName() {
        return niceName;
    }
}
