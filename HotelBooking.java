import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private double roomPricePerNight;
    private int numberOfNights;

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public void setRoomPricePerNight(double roomPricePerNight) {
        this.roomPricePerNight = roomPricePerNight;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getFinalBill() {
        double total = roomPricePerNight * numberOfNights;

        if (numberOfNights >= 7) {
            total -= total * 0.15;
        }

        return total;
    }

    public void display() {
        System.out.println("\nGuest Name : " + guestName);
        System.out.println("Final Bill : " + getFinalBill());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking hb = new HotelBooking();

        System.out.print("Enter Guest Name: ");
        hb.setGuestName(sc.nextLine());

        System.out.print("Enter Room Price Per Night: ");
        hb.setRoomPricePerNight(sc.nextDouble());

        System.out.print("Enter Number Of Nights: ");
        hb.setNumberOfNights(sc.nextInt());

        hb.display();
    }
}
