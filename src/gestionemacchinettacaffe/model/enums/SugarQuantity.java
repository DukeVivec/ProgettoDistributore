/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model.enums;

/**
 *
 * @author Megaport
 */
public enum SugarQuantity {
    NONE("□□□"),
    LOW("■□□"),
    MEDIUM("■■□"),
    HIGH("■■■");
    
    private String paint;

    private SugarQuantity(String paint) {
        this.paint = paint;
    }

    public String getPaint() {
        return paint;
    }
    
    public static SugarQuantity of(int choice){
        switch(choice){
            case 1: return NONE;
            case 2: return LOW;
            case 3: return MEDIUM;
            case 4: return HIGH;
            default: return LOW;
        }
    }
}
