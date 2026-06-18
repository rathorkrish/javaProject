import java.util.Scanner;

class Ride {
    private String customerName;
    private double distanceTravelled;
    private double pricePerKm;
    private double surgeMultiplier;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setDistanceTravelled(double distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public void setPricePerKm(double pricePerKm) {
        this.pricePerKm = pricePerKm;
    }

    public void setSurgeMultiplier(double surgeMultiplier) {
        this.surgeMultiplier = surgeMultiplier;
    }

    public double getFinalFare() {
        double baseFare = distanceTravelled * pricePerKm;
        double finalFare = baseFare * surgeMultiplier;

        if (distanceTravelled > 20) {
            finalFare -= finalFare * 0.10;
        }

        if (surgeMultiplier > 1.5) {
            finalFare += 50;
        }

        return finalFare;
    }

    public void display() {
        System.out.println("\nCustomer Name : " + customerName);
        System.out.println("Final Fare    : " + getFinalFare());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ride ride = new Ride();

        System.out.print("Enter Customer Name: ");
        ride.setCustomerName(sc.nextLine());

        System.out.print("Enter Distance Travelled (km): ");
        ride.setDistanceTravelled(sc.nextDouble());

        System.out.print("Enter Price Per Km: ");
        ride.setPricePerKm(sc.nextDouble());

        System.out.print("Enter Surge Multiplier: ");
        ride.setSurgeMultiplier(sc.nextDouble());

        ride.display();
    }
}
