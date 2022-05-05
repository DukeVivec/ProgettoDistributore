/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.CoffeeType;

/**
 *
 * @author Megaport
 */
public class Cappuccino extends Bevanda{
    private boolean schiuma;

    //inizializziamo il cappuccino con la schiuma a true che pero' sara' possibile cambiare successivamente dal main
    public Cappuccino(String nome, float prezzo, int id) {
        super(nome, prezzo, id);
        this.schiuma = true;
    }

    public boolean isSchiuma() {
        return schiuma;
    }

    public void setSchiuma(boolean schiuma) {
        this.schiuma = schiuma;
    }

    //qui ritorna null inquanto cappuccino non ha tipologie
    @Override
    public String[] getTipologie() {
        return null;
    }

    

    

     
}
