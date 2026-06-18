import java.util.Scanner;

class ShoppingCart {
    private String productName;
    private double price;
    private int quantity;

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getFinalAmount() {
        double total = price * quantity;

        if (total > 5000) {
            total -= total * 0.10;
        }

        return total;
    }

    public void display() {
        System.out.println("\nProduct Name : " + productName);
        System.out.println("Final Amount : " + getFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter Product Name: ");
        cart.setProductName(sc.nextLine());

        System.out.print("Enter Product Price: ");
        cart.setPrice(sc.nextDouble());

        System.out.print("Enter Quantity: ");
        cart.setQuantity(sc.nextInt());

        cart.display();
    }
}
