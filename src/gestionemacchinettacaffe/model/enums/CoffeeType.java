/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum CoffeeType {
    MACCHIATO("Caffe' macchiato"),
    LUNGO("Caffe' lungo"),
    CORTO("Caffe' corto");
    
    private String niceName;

    private CoffeeType(String niceName) {
        this.niceName = niceName;
    }

    public String getNiceName() {
        return niceName;
    } 
}
