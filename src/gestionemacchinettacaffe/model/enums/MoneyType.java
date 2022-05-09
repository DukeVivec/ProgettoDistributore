/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum MoneyType {
    _10(0.1f,"10 centesimi"),
    _20(0.2f,"20 centesimi"),
    _50(0.5f,"50 centesimi"),
    _1(1.0f,"1 euro"),
    _2(2.0f,"2 euro");
    
    private float value;
    private String printableValue;

    private MoneyType(float value, String printableValue) {
        this.value = value;
        this.printableValue = printableValue;
    }

    public float getValue() {
        return value;
    }

    public String getPrintableValue() {
        return printableValue;
    }

    
    
}
