package Esercizio3;

import java.util.HashMap;

public class Esercizio3 {
    public static void main(String[] args) {

        HashMap<String, String> contattiMap = new HashMap<>();


        contattiMap.put("Maurel", "34521788");
        contattiMap.put("Ines", "34556775");
        contattiMap.put("Lea", "34526534");
        contattiMap.put("Michel", "3455648");
        contattiMap.put("Ludovic", "34576875");


        System.out.println("Contatti iniziali:");
        for (String nome : contattiMap.keySet()) {
            System.out.println("Nome: " + nome + ", Telefono: " + contattiMap.get(nome));
        }


        contattiMap.remove("Maurel");


        System.out.println("Contatti dopo la rimozione di Maurel:");
        for (String nome : contattiMap.keySet()) {
            System.out.println("Nome: " + nome + ", Telefono: " + contattiMap.get(nome));
        }


        String numeroTelefonoLea = contattiMap.get("Lea");
        if (numeroTelefonoLea != null) {
            System.out.println("Telefono di Lea: " + numeroTelefonoLea);
        } else {
            System.out.println("Contatto Lea non trovato.");
        }


        String numeroDaCercare = "34526534";
        String nomeTrovato = null;


        for (String nome : contattiMap.keySet()) {
            if (contattiMap.get(nome).equals(numeroDaCercare)) {
                nomeTrovato = nome;
                break;
            }
        }


        if (nomeTrovato != null) {
            System.out.println("Il contatto con numero " + numeroDaCercare + " è: " + nomeTrovato);
        }
    }
}
