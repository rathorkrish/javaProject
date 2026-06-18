import java.util.Scanner;

class LibraryBook {
    private String bookName;
    private int daysLate;
    private double finePerDay;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }

    public void setFinePerDay(double finePerDay) {
        this.finePerDay = finePerDay;
    }

    public double getTotalFine() {
        double totalFine = daysLate * finePerDay;

        if (daysLate > 10) {
            totalFine += 100;
        }

        return totalFine;
    }

    public void display() {
        System.out.println("\nBook Name  : " + bookName);
        System.out.println("Total Fine : " + getTotalFine());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryBook lb = new LibraryBook();

        System.out.print("Enter Book Name: ");
        lb.setBookName(sc.nextLine());

        System.out.print("Enter Days Late: ");
        lb.setDaysLate(sc.nextInt());

        System.out.print("Enter Fine Per Day: ");
        lb.setFinePerDay(sc.nextDouble());

        lb.display();
    }
}
