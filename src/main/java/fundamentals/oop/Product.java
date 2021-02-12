package fundamentals.oop;

import java.time.LocalDate;

public class Product {
    private String name;
    private double price;
    //    private Date expirationDate; - not so flexible
    private LocalDate expirationDate;

    public Product(String name, double price, LocalDate expirationDate) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    //The price of the product can be change but only with a difference of max 14% of the original price.
    public void setPrice(double price) {
        if (price < 0) {
            System.err.println("Error: The new price can not be negative");
            return;
        }
        double pricePercentage = 14.0 / 100 * this.price;
        double priceDifference = Math.abs(this.price - price);
        if (priceDifference > pricePercentage) {
            System.err.printf("Error: The price difference is: %.2f. The price can not be modified with a price difference bigger than 14%% = %.3f\n", priceDifference, pricePercentage);
            return;
        }
        this.price = price;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
