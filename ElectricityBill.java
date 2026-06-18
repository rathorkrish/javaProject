import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalBill() {
        double bill = unitsConsumed * pricePerUnit;

        if (unitsConsumed > 500) {
            bill += bill * 0.10;
        }

        return bill;
    }

    public void display() {
        System.out.println("\nCustomer Name : " + customerName);
        System.out.println("Final Bill    : " + getTotalBill());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ElectricityBill eb = new ElectricityBill();

        System.out.print("Enter Customer Name: ");
        eb.setCustomerName(sc.nextLine());

        System.out.print("Enter Units Consumed: ");
        eb.setUnitsConsumed(sc.nextInt());

        System.out.print("Enter Price Per Unit: ");
        eb.setPricePerUnit(sc.nextDouble());

        eb.display();
    }
}
