package be.pxl.collections.theatre;

public class Reservation {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Ethias Arena", 15, 20);
        theatre.displayMap();
        theatre.reservateSeat("B12");
        theatre.reservateSeat("B12");
        theatre.displayMap();
    }
}
