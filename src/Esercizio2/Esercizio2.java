package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Esercizio2 {
    public static void main(String[] args) {
        List<Integer> numeri = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 10; i++) {
            numeri.add(random.nextInt(100));
        }


        Collections.sort(numeri);
        System.out.println("Numeri in ordine crescente: " + numeri);


        Collections.reverse(numeri);
        System.out.println("Numeri in ordine decrescente: " + numeri);


        List<Integer> elementiPari = new ArrayList<>();
        List<Integer> elementiDispari = new ArrayList<>();

        for (int i = 0; i < numeri.size(); i++) {
            if (i % 2 == 0) {
                elementiPari.add(numeri.get(i));
            } else {
                elementiDispari.add(numeri.get(i));
            }
        }


        System.out.println("Numer con indice pari: " + elementiPari);
        System.out.println("Numeri con indice dispari: " + elementiDispari);
    }
}


