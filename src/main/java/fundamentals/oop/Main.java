package fundamentals.oop;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //store

        Store auchanStore = new Store();

        //products

//        Date date1 = new Date(2021, 2, 22); //deprecated = nu se mai foloseste dar nu e gresit
        LocalDate date2 = LocalDate.of(2021, 2, 13);
        Product ceapa = new Product("ceapa", 2.99, date2);
        Product detergent = new Product("detergent", 19.99, LocalDate.of(2021, 8, 8));
        Product lapte = new Product("lapte", 13.99, LocalDate.of(2021, 8, 10));
        Product branza = new Product("branza", 11.99, LocalDate.of(2021, 1, 8));
        Product[] auchanProducts = {ceapa, detergent, lapte, branza};

        //set store attributes

        auchanStore.setName("Auchan");
        auchanStore.setProducts(auchanProducts);

        //which is the list of products that have the expiration date the next day
        Product[] productsWithExpirationDateNextDay = auchanStore.getProductsWithExpirationDateNextDay();
        displayProducts(auchanStore.getProductsWithExpirationDateNextDay());

        //rename  a specific product that has a certain name, from the list
        System.out.println("Product before change: " + auchanStore.getProductByName("detergent"));
        auchanStore.renameProduct("detergent", "dero");
        System.out.println(auchanStore.getProductByName("detergent"));
        System.out.println("Product after change: " + auchanStore.getProductByName("dero"));

        //or it can be interpreted this way
        Product productByName = auchanStore.getProductByName("branza");
        System.out.println("Product before change: " + productByName);
        productByName.setName("telemea");
        System.out.println("Product after change: " + productByName);

        //all the names of the products that have already expired
        System.out.println(auchanStore.getExpiredProductsName());

        //change price
        productByName.setPrice(productByName.getPrice() * 0.15);

    }

    public static void displayProducts(Product[] products) {
        for (int i = 0; products[i] != null; i++) {
            System.out.println(products[i]);
        }
    }


}
