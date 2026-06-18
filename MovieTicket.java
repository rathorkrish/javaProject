import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalCost() {
        double total = ticketPrice * numberOfTickets;

        if (numberOfTickets >= 5) {
            total -= total * 0.05;
        }

        return total;
    }

    public void display() {
        System.out.println("\nMovie Name  : " + movieName);
        System.out.println("Total Price : " + getTotalCost());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket mt = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        mt.setMovieName(sc.nextLine());

        System.out.print("Enter Ticket Price: ");
        mt.setTicketPrice(sc.nextDouble());

        System.out.print("Enter Number Of Tickets: ");
        mt.setNumberOfTickets(sc.nextInt());

        mt.display();
    }
}
