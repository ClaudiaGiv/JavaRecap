package fundamentals.oop;

import java.time.LocalDate;
import java.util.Arrays;

public class Store {
    private Product[] products;

    private String name;

    public Store(Product[] products, String name) {
        this.products = products;
        this.name = name;
    }

    public Store() {
        //suppose there a limit of 100 products in the store
        products = new Product[100];
        name = "38 plus";
    }

    public Product[] getProductsWithExpirationDateNextDay() {
        Product[] productsWithExpirationDateNextDay = new Product[this.products.length];
        int counter = 0;
        for (int i = 0; i < this.products.length; i++) {
            LocalDate tomorrrow = LocalDate.now().plusDays(1);
            if (tomorrrow.equals(this.products[i].getExpirationDate()))
                productsWithExpirationDateNextDay[counter++] = this.products[i];
        }
        return productsWithExpirationDateNextDay;
    }

    public Product getProductByName(String name) {
        for (int i = 0; i < this.products.length; i++) {
            if (name.equals(this.products[i].getName())) {
                return this.products[i];
            }
        }
        return null;
    }

    public void renameProduct(String productName, String newName) {
        Product productByName = getProductByName(productName);
        if (productByName == null) {
            System.err.printf("Error: The product with name: %s, does not exist in the store");
            return;
        }
        productByName.setName(newName);
    }

    public String getExpiredProductsName() {
        StringBuilder expiredProductsNames = new StringBuilder("{");
        for (int i = 0; i < this.products.length; i++) {
            if (this.products[i].getExpirationDate().isAfter(LocalDate.now())) {
                expiredProductsNames.append(this.products[i].getName() + ", ");
            }
        }
        return expiredProductsNames.substring(0, expiredProductsNames.length() - 2).concat("}");
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Store{" +
                "products=" + Arrays.toString(products) +
                ", name='" + name + '\'' +
                '}';
    }
}
