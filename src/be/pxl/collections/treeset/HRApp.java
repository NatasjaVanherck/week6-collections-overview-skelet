package be.pxl.collections.treeset;

import java.util.TreeSet;

public class HRApp {
    public static void main(String[] args) {
        TreeSet<Employee> ourEmployees = new TreeSet<>();

        ourEmployees.add(new Employee("Tom", 80000));
        ourEmployees.add(new Employee("Jack", 35000));
        ourEmployees.add(new Employee("Jim", 62500));
        ourEmployees.add(new Employee("Peter", 58200));
        ourEmployees.add(new Employee("Mary", 77000));
        ourEmployees.add(new Employee("Jane", 69500));
        ourEmployees.add(new Employee("David", 54000));
        ourEmployees.add(new Employee("Sam", 82000));

        ourEmployees.stream().forEach(System.out::println);

        System.out.println("Employee with salary > 70000");
        // toon de eerste employee die meer dan 70000 heeft

        // wat is de betekenis van de volgende methoden
        // geef ook telkens een voorbeeld
        // lower, ceiling, floor, tailSet, headSet, subSet
        
        

    }
}
