/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionemacchinettacaffe.model;

/**
 *
 * @author Megaport
 */
public class Distributore {

    private Bevanda[] bevande;

    public Distributore() {
        this.bevande = new Bevanda[6];
        this.bevande[0] = new Bevanda("Caffe", 0.60f, 1, "Caffé corto", "Caffé lungo", "Caffé macchiato");
        this.bevande[1] = new Bevanda("Caffe deca", 0.70f, 2, "Caffé corto", "Caffé lungo", "Caffé macchiato");
        this.bevande[2] = new Bevanda("Cappuccino", 1.10f, 3, "Con schiuma", "Senza schiuma");
        this.bevande[3] = new Bevanda("Cioccolata", 1.40f, 4, "Al latte", "Fondente");
        this.bevande[4] = new Bevanda("Latte", 0.80f, 5, "Semplice", "Macchiato");
        this.bevande[5] = new Bevanda("Te caldo", 1.0f, 6, "Al limone", "Alla pesca", "Te verde"); 

    }

    public Bevanda[] getBevande() {
        return bevande;
    }

    public Bevanda seleziona(int id) {
        if (id > 0 && id < bevande.length) { //validazione dell'id
            return this.bevande[id - 1];
        } else {
            return null;
        }
    }

}
