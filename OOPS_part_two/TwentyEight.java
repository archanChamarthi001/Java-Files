/*28. Design classes that need to sort a collection of Product objects either by product name or by price. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TwentyEight {

    // Product class with name and price attributes
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{name='" + name + "', price=" + price + "}";
        }
    }

    // Comparator for sorting by Product Name
    static class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

    // Comparator for sorting by Product Price
    static class ProductPriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return Double.compare(p1.getPrice(), p2.getPrice());
        }
    }

    // Main method to demonstrate sorting
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.99));
        products.add(new Product("Smartphone", 799.49));
        products.add(new Product("Tablet", 499.99));
        products.add(new Product("Monitor", 299.99));

        // Sort by Name
        System.out.println("Sorting by Product Name:");
        Collections.sort(products, new ProductNameComparator());
        products.forEach(System.out::println);

        // Sort by Price
        System.out.println("\nSorting by Product Price:");
        Collections.sort(products, new ProductPriceComparator());
        products.forEach(System.out::println);
    }
}
