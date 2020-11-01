package advanced.collections;

public class Main {

    public static void main(String[] args) {

        BookStore bookStore = new BookStore();
        bookStore.initWithDefaultValues();
        System.out.println(bookStore.booksOrderedByYear.descendingSet());
        System.out.println(bookStore.booksOrderedByYear.first());
    }
}
