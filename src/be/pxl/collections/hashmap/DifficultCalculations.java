package be.pxl.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DifficultCalculations {

    public static void main(String[] args) {
        HashMap<Integer, Long> cache = new HashMap<>();
        // onze berekening faculteit duurt erg lang
        // daarom gaan we, wanneer we een waarde hebben berekend,
        // het resultaat bijhouden in een cache 
        Scanner scanner = new Scanner(System.in);
        int aantal = 0;
        
        // kan je het berekende resultaat bijhouden in een cache?
        // wanneer je dan hetzelfde getal later nog eens tegenkomt,
        //hoef je het niet opnieuw te berekenen
        while (aantal < 5) {
            System.out.println("Geef een getal: ");
            int getal = scanner.nextInt();
            if (cache.containsKey(getal)) {
                System.out.println("Faculteit: " + cache.get(getal));
            } else {
                long result = faculteit(getal);
                cache.put(getal, result);
                System.out.println("Faculteit: " + cache.get(getal));
            }
            aantal++;
        }

        // wat krijg je als je de waarden van de cache in een TreeMap steekt?
        TreeMap<Integer, Long> sortedCache = new TreeMap<>(cache);
        sortedCache.forEach((key, value) -> System.out.println("Faculteit van " + key + " is " + value));
        scanner.close();
    }


    private static long faculteit (int waarde){
        long result = 1;
        for(int cnt = 1; cnt < waarde; cnt++){
            result *= cnt;
            try {
                Thread.sleep(500); // hiermee vertragen we de berekening
            } catch (InterruptedException e) {
            }
        }
        return result;
    }

}
