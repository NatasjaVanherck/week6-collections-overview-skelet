package be.pxl.collections.linkedhashset;

import java.util.LinkedHashSet;

public class LoyaltyApp {

    public static void main(String[] args) {
        LinkedHashSet<Customer> myCustomers = new LinkedHashSet<>();

        myCustomers.add(new Customer(101, "Alice"));
        myCustomers.add(new Customer(103, "Peter"));
        myCustomers.add(new Customer(105, "Tim"));
        myCustomers.add(new Customer(108, "Bea"));
        myCustomers.add(new Customer(105, "Sam"));
        myCustomers.add(new Customer(102, "Vera"));
        
        // Hoe zorg je ervoor dat de klantnummers uniek zijn

        System.out.println("Number of customers: " + myCustomers.size());

        for (Customer customer : myCustomers) {
            System.out.println(customer);
        }

        // voeg nog 100 klanten toe in de lijst 201 customer1, 202 customer2,...
        
        // zoek de klant met klantnummer 101 en ken 10 punten toe
        // geef klant met klantnummer 300 20 punten
        // toon ook hoeveel tijd het kost om de klanten te zoeken adhv het klantnummer

        
        // maak een lambda expressie om totaal gespaarde punten te tonen
    }

    private static Customer findCustomerByCustomerNumber(int customerNumber, LinkedHashSet<Customer> customers) {
        for (Customer customer : customers) {
            if (customer.getCustomerNumber() == customerNumber) {
                return customer;
            }
        }
        return null;
    }
}
