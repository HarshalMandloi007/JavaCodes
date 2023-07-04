package multiThreading;
class BookTheaterApp {
    int total_seats = 10;

    void bookSeat(int seats){
        System.out.println("Hi : " +Thread.currentThread().getName());
        System.out.println("Hi : " +Thread.currentThread().getName());

        synchronized (this){
            if (total_seats >= seats) {
                System.out.println(seats + " seats booked successfully");
                total_seats = total_seats - seats;
                System.out.println("Seats left: " + total_seats);
            } else {
                System.out.println("Sorry can't be booked for all");
                System.out.println("Seats left: " + total_seats);
            }
        }
        System.out.println("Hi : " +Thread.currentThread().getName());
        System.out.println("Hi : " +Thread.currentThread().getName());
    }
}
public class MovieBookAppUsingStaticBlock extends Thread {
    static BookTheaterApp b;
    int seats;

    public void run() {
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b = new BookTheaterApp();
        MovieBookAppUsingStaticMethod jay = new MovieBookAppUsingStaticMethod();
        jay.seats = 8;
        jay.start();

        MovieBookAppUsingStaticMethod raj = new MovieBookAppUsingStaticMethod();
        raj.seats = 3;
        raj.start();
    }
}