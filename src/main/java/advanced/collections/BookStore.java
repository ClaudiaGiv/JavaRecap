package advanced.collections;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    TreeSet<Book> booksOrderedByYear;

    public void initWithDefaultValues() {
//        booksOrderedByYear = new TreeSet<Book>( new YearComparator()) {{
        booksOrderedByYear = new TreeSet<Book>() {{
            add(new Book(2001, "A", Genre.LITERATURE));
            add(new Book(2003, "B", Genre.LITERATURE));
            add(new Book(1990, "C", Genre.PSHYCHOLOGY));
        }};
    }

    public void addBook(Book b) {
        booksOrderedByYear.add(b);
    }

    public Set<Book> getBooksByYear(int year) {
        return booksOrderedByYear.stream().filter(b -> b.year == year).collect(Collectors.toSet());
    }

//    public Set<Genre> getAllSortedByYear() {
//        return booksOrderedByYear
//    }
//
//    public void borrowBook(Book b) {
//        booksByGenre.get(b.genre).remove(b);
//    }
}
