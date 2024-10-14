/*
12. Create a class(Product) to store details of a product and provide required methods with the details prod_id, prod_name, price,quantity_on_hand
Methods are:  init(prod_id,prod_name, price)
                 getNetPrice() (returns the price after adding 12% tax)
                 purchase()
                sell() 
*/

class Product {
    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;

    public Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = 0;
    }

    public double getNetPrice() {
        return price + (price * 0.12);
    }

    public void purchase(int quantity) {
        if (quantity > 0) {
            quantity_on_hand += quantity_on_hand;
            System.out.println("Purchased " + quantity + " units of " + prod_name);
        } else {
            System.out.println("Invalid quantity. Purchase amount must be greater than zero.");
        }
    }

    public void sell(int quantity) {
        if (quantity <= quantity_on_hand && quantity > 0) {
            quantity_on_hand -= quantity_on_hand;
            System.out.println("Sold " + quantity + "units of " + prod_name);
        } else if (quantity > quantity_on_hand) {
            System.out.println("Not enough stock to sell. Available stock: " + quantity_on_hand);
        } else {
            System.out.println("Invalid quantity. Sale amount must be greater than zero.");
        }
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + prod_id);
        System.out.println("Product Name: " + prod_name);
        System.out.println("Product {Price$}: " + price);
        System.out.println("Quantity on Hand: " + quantity_on_hand);
    }

    public static void main(String[] args) {
        Product prod = new Product(101, "ChromeBook", 28000.00);

        // Displaying initial product details
        prod.displayProductDetails();

        prod.purchase(20);
        prod.sell(1);
        prod.sell(4);

        // Displaying updated product details
        prod.displayProductDetails();

        System.out.println("Net price (included 12% tax): $" + prod.getNetPrice());
    }

}
