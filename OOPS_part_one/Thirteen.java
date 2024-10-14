/*13. Introduce multiple constructors in Product class.*/

class Product {
    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    // Constructor 1: Initialize with prod_id, prod_name, price, quantity_on_hand = 0
    public Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = 0; // Default value
    }

    // Constructor 2: Initialize with prod_id, prod_name, price, and quantity_on_hand
    public Product(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = quantity_on_hand;
    }

    // Constructor 3: Initialize with prod_id and prod_name, set price and quantity_on_hand to defaults
    public Product(int prod_id, String prod_name) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = 0.0; // Default price
        this.quantity_on_hand = 0; // Default quantity
    }

    public double getNetPrice() {
        return price + (price * 0.12);
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            quantity_on_hand += quantity;
            System.out.println("Purchased " + quantity + " units of " + prod_name);
        } else {
            System.out.println("Invalid quantity. Purchase amount must be greater than zero.");
        }
    }

    public void sell(int quantity) {
        if (quantity <= quantity_on_hand && quantity > 0) {
            quantity_on_hand -= quantity;
            System.out.println("Sold " + quantity + " units of " + prod_name);
        } else if (quantity > quantity_on_hand) {
            System.out.println("Not enough stock to sell. Available stock: " + quantity_on_hand);
        } else {
            System.out.println("Invalid quantity. Sale amount must be greater than zero.");
        }
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + prod_id);
        System.out.println("Product Name: " + prod_name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity on Hand: " + quantity_on_hand);
    }

    public static void main(String[] args) {
        Product prod;

        // Using constructor 1
        prod = new Product(101, "ChromeBook", 28000.00);
        System.out.println("Using Constructor 1:");
        prod.displayProductDetails();

        // Using constructor 2
        prod = new Product(102, "Smartphone", 15000.00, 50);
        System.out.println("\nUsing Constructor 2:");
        prod.displayProductDetails();

        // Using constructor 3
        prod = new Product(103, "Tablet");
        System.out.println("\nUsing Constructor 3:");
        prod.displayProductDetails();

        // Demonstrating purchase and sell with the last created product (Tablet)
        prod.purchase(10);
        prod.sell(5);
        prod.displayProductDetails();

        System.out.println("Net price of Tablet (including 12% tax): $" + prod.getNetPrice());
    }
}
