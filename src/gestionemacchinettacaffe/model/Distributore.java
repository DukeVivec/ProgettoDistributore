/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.CoffeeType;
import gestionemacchinettacaffe.model.enums.TeaType;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Megaport
 */
public class Distributore {
    private Bevanda[] bevande;

    public Distributore() {
        this.bevande = new Bevanda[6];
        this.bevande[0] = new Caffe(true, "Caffe", 0.60f, 1);
        this.bevande[1] = new Caffe(false, "Caffe deca", 0.70f, 2);
        this.bevande[2] = new Cappuccino("Cappuccino", 1.10f, 3);
        this.bevande[3] = new Cioccolata("Cioccolata", 1.40f, 4);
        this.bevande[4] = new Latte("Latte", 0.80f, 5);
        this.bevande[5] = new Te(true, "Te caldo", 1.0f, 6);
        //this.bevande[6] = new Te(false, "Te freddo", 1.0f, 7);  
    }

    public Bevanda[] getBevande() {
        return bevande;
    }

    public Bevanda seleziona(int id) {
        if(id > 0 && id < 7){
            return this.bevande[id-1];
        }else{
            return null;
        }
    }
 
}
