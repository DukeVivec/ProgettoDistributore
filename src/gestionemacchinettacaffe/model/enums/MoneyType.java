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
    _10(0.1f),
    _20(0.2f),
    _50(0.5f),
    _1(1.0f),
    _2(2.0f);
    
    private float value;

    private MoneyType(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

}
