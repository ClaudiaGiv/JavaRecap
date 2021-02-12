package advanced.collections;

import java.util.*;
import java.util.stream.Collectors;

public class BookStore {
    TreeSet<Book> booksOrderedByYear;
    List<Student> students;

    public void initWithDefaultValues() {
        booksOrderedByYear = new TreeSet<Book>() {{
            add(new Book("Scott Fitzgerald", "Great Gatsby", Genre.DRAMA, 2001));
            add(new Book("Dzenisa Jas", "Taken", Genre.DRAMA, 1989));
            add(new Book("Frank Herbert", "Dune", Genre.SCIFI, 1996));
            add(new Book("Margaret Cavendish", "The Blazing World", Genre.SCIFI, 1666));
            add(new Book("Isaac Asimov", "Foundation", Genre.SCIFI, 1951));
            add(new Book("Stanislaw Lem", "Solaris", Genre.SCIFI, 1961));

            add(new Book("Mary Shelley", "Frankenstein", Genre.HORROR, 1897));
        }};
        booksOrderedByYear = new TreeSet<>((b1, b2) -> b1.getYear() - b2.getYear());
        booksOrderedByYear = new TreeSet<>(Comparator.comparingInt(Book::getYear));
//                new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.year - o2.year;
//            }
//        })

//        booksOrderedByYear = new TreeSet<Book>( new YearComparator()) {{
//

//        booksOrderedByYear = new TreeSet<Book>((o1, o2) -> o1.year-o2.year){{
//            add(new Book(2001, "A", Genre.LITERATURE));
//            add(new Book(2003, "B", Genre.LITERATURE));
//            add(new Book(1990, "C", Genre.PSHYCHOLOGY));
//        }};;
    }


    public void addBook(Book b) {
        booksOrderedByYear.add(b);
    }

    public Set<Book> getBooksByYear(int year) {
        return booksOrderedByYear.stream().filter(b -> b.year == year).collect(Collectors.toSet());
    }

    public int getTotalPriceOfAllBoks() {
        return booksOrderedByYear.stream().map(Book::getPrice).reduce(0, (x1, x2) -> x1+x2);
    }

    public Book getBooksByTitle(String title) {
        Optional<Book> book = booksOrderedByYear.stream().filter(b -> b.getTitle().equals(title)).findFirst();
        book.orElseGet(Book::new);
//        return booksOrderedByYear.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElse(new Book());
        return booksOrderedByYear.stream().filter(b -> b.getTitle().equals(title)).findFirst().orElseThrow();
    }

    public Map<Integer, List<Book>> groupBooksByYear() {
        return booksOrderedByYear.stream().collect(Collectors.groupingBy(b -> b.year));
    }

    public Map<Genre, Long> groupBooksByGenreAndNoOfBooks() {
        return booksOrderedByYear.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
    }

    public Map<Genre, Integer> groupBooksByGenreAndTotalPrice() {
//        return booksOrderedByYear.stream().collect(Collectors.groupingBy(b -> b.getGenre(), Collectors.summingInt(b->b.getPrice())));
        return booksOrderedByYear.stream().collect(Collectors.groupingBy(Book::getGenre, Collectors.summingInt(Book::getPrice)));
    }

    public Set<String> getAuthorsFromAllStudents() {
        return students.stream().map(Student::getBooks).flatMap(x -> x.stream()).map(Book::getAuthor).distinct().collect(Collectors.toSet());
    }


    public void borrowBook(Book b) {
//        booksByGenre.get(b.genre).remove(b);
    }
}
