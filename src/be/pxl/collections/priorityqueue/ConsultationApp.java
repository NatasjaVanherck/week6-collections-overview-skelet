package be.pxl.collections.priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ConsultationApp {

    public static void main(String[] args) {
        Customer alice = new Customer(101, "Alice");
        alice.addPoints(22);

        Customer peter = new Customer(102, "Peter");
        peter.addPoints(15);

        Customer sofie = new Customer(105, "Sofie");
        sofie.addPoints(33);

        Customer bea = new Customer(108, "Bea");
        bea.addPoints(12);
        
        // gebruik een PriorityQueue om de klanten te sorteren voor hun consultatie
        // de volgorde van de klanten wordt bepaald door hun punten
        // de klant met de meeste punten mag als eerste
        

        

    }
}
