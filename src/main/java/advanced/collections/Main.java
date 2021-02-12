package advanced.collections;

import advanced.exceptions.BooksSizeLimitExceededException;

public class Main {

    public static void main(String[] args) throws BooksSizeLimitExceededException {

        BookStore bookStore = new BookStore();
        bookStore.initWithDefaultValues();
//        System.out.println(bookStore.booksOrderedByYear.descendingSet());
//        System.out.println(bookStore.booksOrderedByYear.first());
        Library library = new Library();
//        System.out.println(library.getAllGenresWithNoOfBooks());
//        System.out.println(library.getBooksWithYearGraterThan(1990));
        library.addBook(new Book("Frank", "Dooh", Genre.SCIFI, 1996));
        library.printAllBooksWithYearBetween(1990, 2001);
        System.out.println(library.getAllBooksTitle());
        System.out.println(library.getNoOfAllBooks1());
        System.out.println(library.getNoOfAllBooks2());
        System.out.println(library.areBooksWithYearLessThan(1600));

    }
}
