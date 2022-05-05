/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionemacchinettacaffe;

import gestionemacchinettacaffe.model.Bevanda;
import gestionemacchinettacaffe.model.Distributore;
import java.util.Scanner;

/**
 *
 * @author Megaport
 */
public class Main {

    private static Distributore distributore = null;
    
    public static void main(String[] args) {
        distributore = new Distributore();
        System.out.println("Il distributore e' attivo e tutte le bevande sono cariche");
        Bevanda[] bevande = distributore.getBevande();
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Selezionare la bevanda desiderata ↓↓↓"); 
            System.out.println(" - digita quit per uscire -");
            System.out.println("------------------------------------");
            for (Bevanda bevanda : bevande) {
                System.out.printf("" + bevanda.getId() + ") " + bevanda.getNome() + "\t" + "%.2f\n", bevanda.getPrezzo());
            }
            System.out.println("------------------------------------");
            String scelta = scanner.nextLine();
            if(scelta.equals("quit")){
                return;
            }
        }while(true);
        
    }
    
}
