package Esercizio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> parole = new ArrayList<>();
        boolean running = true;


        HashSet<String> paroleSet = new HashSet<>();
        paroleSet.add("hola");
        paroleSet.add("hello");
        paroleSet.add("essaie");
        paroleSet.add("prova");


        while (running) {
            System.out.println("Inserisci una parola o digita 'stop' per terminare:");
            String parola = scanner.nextLine();

            if (parola.equalsIgnoreCase("stop")) {
                System.out.println("Programma terminato.");
                running = false;
            } else {
                parole.add(parola);
            }
        }


        System.out.println("Parole inserite: " + parole);


        List<String> paroleDuplicate = new ArrayList<>();
        List<String> paroleDistinte = new ArrayList<>();

        for (String parola : parole) {
            if (paroleSet.contains(parola.toLowerCase())) {
                paroleDuplicate.add(parola);
            } else {
                paroleDistinte.add(parola);
            }
        }


        if (!paroleDuplicate.isEmpty()) {
            System.out.println("Parole duplicate: " + paroleDuplicate);
        } else {
            System.out.println("Nessuna corrispondenza trovata con il set predefinito.");
        }

        if (!paroleDistinte.isEmpty()) {
            System.out.println("Ci sono "+paroleDistinte.size() + " Parole distinte: " + paroleDistinte);
        } else {
            System.out.println("Nessuna parola distinta inserita.");
        }


        scanner.close();
    }
}
