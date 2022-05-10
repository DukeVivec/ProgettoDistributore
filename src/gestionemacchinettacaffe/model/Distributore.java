/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

import gestionemacchinettacaffe.model.enums.ChocoType;
import gestionemacchinettacaffe.model.enums.CoffeeType;
import gestionemacchinettacaffe.model.enums.MilkType;
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
        this.bevande[0] = new Bevanda<CoffeeType>("Caffe", 0.60f, 1, CoffeeType.CORTO);
        this.bevande[1] = new Bevanda<CoffeeType>("Caffe deca", 0.70f, 2, CoffeeType.CORTO);
        this.bevande[2] = new Bevanda("Cappuccino", 1.10f, 3, null);
        this.bevande[3] = new Bevanda<ChocoType>("Cioccolata", 1.40f, 4, ChocoType.FONDENTE);
        this.bevande[4] = new Bevanda<MilkType>("Latte", 0.80f, 5, MilkType.SEMPLICE);
        this.bevande[5] = new Bevanda<TeaType>("Te caldo", 1.0f, 6, TeaType.LIMONE);
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
