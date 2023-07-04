package multiThreading;

class BookTheatreSeat {
    int total_seats = 10;

    synchronized void bookSeat(int seats) {
        if (total_seats >= seats) {
            System.out.println(seats + " seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("Seats left: " + total_seats);
        } else {
            System.out.println("Sorry can't be booked for all");
            System.out.println("Seats left: " + total_seats);
        }
    }
}

public class MovieBookAppUsingStaticMethod extends Thread {
    static BookTheatreSeat b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheatreSeat();
        MovieBookAppUsingStaticMethod jay = new MovieBookAppUsingStaticMethod();
        jay.seats = 8;
        jay.start();

        MovieBookAppUsingStaticMethod raj = new MovieBookAppUsingStaticMethod();
        raj.seats = 3;
        raj.start();
    }
}