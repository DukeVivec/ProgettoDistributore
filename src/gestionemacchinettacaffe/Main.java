/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionemacchinettacaffe;

import gestionemacchinettacaffe.model.Bevanda;
import gestionemacchinettacaffe.model.Distributore;
import gestionemacchinettacaffe.model.enums.MoneyType;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            try {
                scelta = scanner.nextLine();
            } catch (NumberFormatException ex) {
                System.out.println("Sono ammessi solo numeri");
                continue;
            }
            if (scelta.equals("quit")) {
                return;
            }
            //</editor-fold>
            int sceltaInt = Integer.parseInt(scelta);
            if (sceltaInt > 7 || sceltaInt < 1) {
                System.out.println("scelta non valida");
                continue;
            }
            Bevanda bevanda = bevande[sceltaInt - 1];
            String nomeFinale = bevanda.getNome();
            System.out.println("hai selezionato " + nomeFinale);
            String[] tipologie = bevanda.getSottotipi();
            if (tipologie != null) {
                System.out.println("seleziona la tipologia ↓↓↓");
                System.out.println("-------------------------");
                int id = 1;
                for (String tipo : tipologie) {
                    System.out.println("\t" + id + ") " + tipo);
                    id++;
                }
                System.out.println("-------------------------");
                String sottoscelta = null;
                try{
                    sottoscelta = scanner.nextLine();
                } catch (NumberFormatException ex) {
                    System.out.println("Sono ammessi solo numeri");
                    continue;
                }
                int sottosceltaInt = Integer.parseInt(sottoscelta);
                if (sottosceltaInt < 1 || sottosceltaInt > tipologie.length) {
                    System.out.println("scelta non valida");
                    continue;
                }
                nomeFinale = tipologie[sottosceltaInt - 1];
                System.out.println("hai aggiornato la tua scelta con " + nomeFinale);
            }
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
                    System.out.println("Sono ammessi solo numeri");
                    continue;
                }
                if (soldiId <= 0 || soldiId > MoneyType.values().length) {
                    System.out.println("scelta non valida");
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
