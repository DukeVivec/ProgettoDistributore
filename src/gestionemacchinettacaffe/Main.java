/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionemacchinettacaffe;

import gestionemacchinettacaffe.model.Bevanda;
import gestionemacchinettacaffe.model.Distributore;
import gestionemacchinettacaffe.model.enums.MoneyType;
import gestionemacchinettacaffe.model.enums.SugarQuantity;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Megaport
 */
public class Main {

    public static void main(String[] args) {
        Distributore distributore = new Distributore();
        System.out.println("Il distributore e' attivo e tutte le bevande sono cariche");
        Bevanda[] bevande = distributore.getBevande();
        Scanner scanner = new Scanner(System.in);
        do {
            //<editor-fold defaultstate="collapsed" desc="MENU PRINCIPALE">
            System.out.println("Selezionare la bevanda desiderata ↓↓↓");
            System.out.println(" - digita quit per uscire -");
            System.out.println("-------------------------");
            for (Bevanda bevanda : bevande) {
                System.out.printf("" + bevanda.getId() + ") " + bevanda.getNome() + "\t" + "%.2f\n", bevanda.getPrezzo());
            }
            System.out.println("-------------------------");
            String scelta = null;

            scelta = scanner.nextLine();

            if (scelta.equals("quit")) {
                return;
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="SELEZIONE BEVANDE">
            int sceltaInt = -1;
            try {
                sceltaInt = Integer.parseInt(scelta);
            } catch (NumberFormatException ex) {
                System.err.println("[ERRORE] Sono ammessi solo numeri");
                continue;
            }
            if (sceltaInt > bevande.length || sceltaInt < 1) {
                System.err.println("scelta non valida");
                continue;
            }
            Bevanda bevanda = distributore.seleziona(sceltaInt);
            String nomeFinale = bevanda.getNome();
            System.out.println("hai selezionato " + nomeFinale);
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="SOTTOTIPOLOGIE">
            String[] tipologie = bevanda.getSottotipi();
            if (tipologie != null && tipologie.length != 0) {//se è stata inserita qualche sottotipo
                while (true) {
                    System.out.println("seleziona la tipologia ↓↓↓");
                    System.out.println("-------------------------");
                    int id = 1;
                    for (String tipo : tipologie) {
                        System.out.println("\t" + id + ") " + tipo);
                        id++;
                    }
                    System.out.println("-------------------------");
                    int sottosceltaInt = -1;
                    try {
                        String sottoscelta = scanner.nextLine();
                        sottosceltaInt = Integer.parseInt(sottoscelta);

                    } catch (NumberFormatException ex) {
                        System.err.println("Sono ammessi solo numeri");
                        continue;
                    }

                    if (sottosceltaInt < 1 || sottosceltaInt > tipologie.length) {
                        System.err.println("scelta non valida");
                        continue;
                    }
                    nomeFinale = tipologie[sottosceltaInt - 1];
                    System.out.println("hai aggiornato la tua scelta con " + nomeFinale);
                    break;
                }
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="ZUCCHERO">
            while(true){
                System.out.println("Selezionare la quantita' di zucchero desiderata");
                System.out.println(" 1) " + SugarQuantity.NONE.getPaint());
                System.out.println(" 2) " + SugarQuantity.LOW.getPaint());
                System.out.println(" 3) " + SugarQuantity.MEDIUM.getPaint());
                System.out.println(" 4) " + SugarQuantity.HIGH.getPaint());
                String zucchero = scanner.nextLine();
                int zuccheroInt = -1;
                    try {                       
                        zuccheroInt = Integer.parseInt(zucchero);

                    } catch (NumberFormatException ex) {
                        System.err.println("Sono ammessi solo numeri");
                        continue;
                    }
                    if(zuccheroInt < 1 || zuccheroInt > 4){
                        System.out.println("Scelta invalida");
                        continue;
                    }
                    System.out.println("Zucchero selezionato: " + SugarQuantity.of(zuccheroInt).getPaint() );
                    break;
            }
            //</editor-fold>
            //<editor-fold defaultstate="collapsed" desc="SOLDI">
            System.out.printf("inserire il seguente importo di € %.2f\n", bevanda.getPrezzo());
            System.out.println("-------------------------");
            int id2 = 1;
            for (MoneyType money : MoneyType.values()) {
                System.out.printf("\t> " + id2 + ") € %.2f\n", money.getValue());
                id2++;
            }
            float soldiInseriti = 0;
            float resto = 0;
            while (true) {
                int soldiId = -1;
                try {
                    soldiId = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException ex) {
                    System.err.println("Sono ammessi solo numeri");
                    continue;
                }
                if (soldiId <= 0 || soldiId > MoneyType.values().length) {
                    System.err.println("scelta non valida");
                    continue;
                }
                MoneyType money = MoneyType.values()[soldiId - 1];
                System.out.println("hai inserito " + money.getPrintableValue());
                soldiInseriti += money.getValue();
                if (soldiInseriti >= bevanda.getPrezzo()) {
                    resto = soldiInseriti - bevanda.getPrezzo();
                    if (resto != 0) {
                        System.out.printf("Hai inserito € %.2f e il resto dovuto e' di € %.2f\n ", soldiInseriti, resto);
                    }
                    break;
                } else {
                    System.out.printf("totale inserito: € %.2f\n ", soldiInseriti);
                }
            }
            //</editor-fold>
            System.out.println("La bevanda: " + nomeFinale + " e' in preparazione");
            for (int i = 0; i < 10; i++) {
                System.out.print("#");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            System.out.println("\nLa bevanda e pronta, premere un tasto per continuare");
            scanner.nextLine();
        } while (true);

    }

}
