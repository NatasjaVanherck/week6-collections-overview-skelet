package be.pxl.collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class DifficultCalculations {

    public static void main(String[] args) {
        HashMap<Integer, Long> cache = new HashMap<>();
        // onze berekening faculteit duurt erg lang
        // daarom gaan we, wanneer we een waarde hebben berekend,
        // het resultaat bijhouden in een cache 
        Scanner scanner = new Scanner(System.in);
        int aantal = 0;
        while (aantal < 5) {
            System.out.println("Geef een getal: ");
            int getal = scanner.nextInt();
            long result = faculteit(getal);
            // kan je het berekende resultaat bijhouden in een cache?
            // wanneer je dan hetzelfde getal later nog eens tegenkomt,
            // hoef je het niet opnieuw te berekenen!
            System.out.println("Faculteit: " + result);
            aantal++;
        }

        // wat krijg je als je de waarden van de cache in een TreeMap steekt?
    
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
