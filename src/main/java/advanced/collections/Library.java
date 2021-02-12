package advanced.collections;

import advanced.exceptions.BooksSizeLimitExceededException;
import com.google.common.collect.Sets;
import advanced.collections.Genre;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Library {
    private Map<Genre, HashSet<Book>> booksByGenre;
    public static final short MAX_NO_OF_BOOKS = 5;

    public void initWithDefaultValues() {
        booksByGenre = Map.of(
                Genre.DRAMA,
                new HashSet<Book>() {{
                    add(new Book("Scott Fitzgerald", "Great Gatsby", Genre.DRAMA, 2001));
                    add(new Book("Dzenisa Jas", "Taken", Genre.DRAMA, 1989));
                }},
                Genre.SCIFI,
                new HashSet<Book>() {{
                    add(new Book("Frank Herbert", "Dune", Genre.SCIFI, 1996));
                    add(new Book("Margaret Cavendish", "The Blazing World", Genre.SCIFI, 1666));
                    add(new Book("Isaac Asimov", "Foundation", Genre.SCIFI, 1951));
                    add(new Book("Stanislaw Lem", "Solaris", Genre.SCIFI, 1961));
                }},
                Genre.HORROR,
                new HashSet<Book>() {{
                    add(new Book("Mary Shelley", "Frankenstein", Genre.HORROR, 1897));
                }}
        );
        //        booksByGenre = Collections.singletonMap(Genre.LITERATURE,
//                new HashSet<Book>() {{
//                    add(new Book(2000, "A", Genre.LITERATURE));
//                }});
    }

    public Library(Map<Genre, HashSet<Book>> booksByGenre) {
        this.booksByGenre = booksByGenre;
    }

    public Library() {
        initWithDefaultValues();
    }

    public void addBook1(Book b) throws BooksSizeLimitExceededException {
        HashSet<Book> currentBooks = booksByGenre.putIfAbsent(b.genre, new HashSet<>() {{
            add(b);
        }});
        if (currentBooks != null && currentBooks.size() >= MAX_NO_OF_BOOKS) {
            throw new BooksSizeLimitExceededException();
        } else {
            booksByGenre.put(b.genre, new HashSet<Book>(Arrays.asList(b)));
        }
//            booksByGenre.put(b.genre, Collections.singleton(b));
//            booksByGenre.put(b.genre, new HashSet<Book>() {{add(b);}});
//            booksByGenre.put(b.genre, Stream.of(b).collect(Collectors.toCollection(HashSet::new)));
//            booksByGenre.put(b.genre, Sets.newHashSet(b));
    }

    public void addBook(Book b) throws BooksSizeLimitExceededException {
        HashSet<Book> books = booksByGenre.get(b.genre);
        if (booksByGenre.containsKey(b.genre)) {
            if (booksByGenre.get(b.genre).size() >= MAX_NO_OF_BOOKS) {
                throw new BooksSizeLimitExceededException();
            }
//            booksByGenre.get(b.genre).add(b);
            books.add(b);
//            booksByGenre.put(b.genre, Collections.singleton(b));
//            booksByGenre.put(b.genre, new HashSet<Book>() {{add(b);}});
//            booksByGenre.put(b.genre, Stream.of(b).collect(Collectors.toCollection(HashSet::new)));
//            booksByGenre.put(b.genre, Sets.newHashSet(b));
        } else {
            booksByGenre.put(b.genre, new HashSet<Book>(Arrays.asList(b)));

        }
    }

    public Set<Book> getBooksByGenre(Genre g) {
        return booksByGenre.get(g);
    }

    public Set<Genre> getAllGenres() {
//        new ArrayList<S>
        return booksByGenre.keySet();
    }

    public Map<Genre, Integer> getAllGenresWithNoOfBooks() {
        System.out.println("Map");
        System.out.println(booksByGenre);
        System.out.println("Entry set");
        System.out.println(booksByGenre.entrySet());
        System.out.println("Key set");
        System.out.println(booksByGenre.keySet());
        System.out.println();
        return booksByGenre.entrySet().stream().collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue().size()));
    }

    public int getNoOfAllBooks1() {
        booksByGenre.values().stream().mapToInt(Collection::size).sum();
        booksByGenre.values().stream().map(x -> x.size()).reduce(0, (x1, x2) -> x1 + x2);
        booksByGenre.values().stream().reduce(0, (acc, val) -> acc + val.size(), Integer::sum);
        return booksByGenre.values().stream().reduce(0, (acc, val) -> acc + val.size(), (acc, val) -> acc + val);
    }

    public long getNoOfAllBooks2() {
//        return booksByGenre.values().stream().mapToInt(Collection::size).sum();
//        return booksByGenre.values().stream().reduce(0, (acc, val) -> acc+val.size(), Integer::sum);
        return booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream()).count();
    }

    public Set<Book> getBooksWithYearGraterThan(int year) {

        return booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream())
                .filter(book -> book.year > year)
                .collect(Collectors.toSet());

    }

    public boolean areBooksWithYearLessThan(int year) {
        return booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream())
                .anyMatch(book -> book.year < year);
    }

    public void printAllBooksWithYearBetween(int year1, int year2) {
        booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream())
                .filter(book -> book.year > year1 && book.year < year2)
                .forEach(System.out::println);

    }

    public String getAllBooksTitle() {
        return booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream())
                .map(book -> book.title)
                .collect(Collectors.joining(",", "(", ")"));
    }

    public String getAllBooksTitleByGenre() {
        return booksByGenre.entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(books -> books.stream())
                .map(book -> book.title)
                .collect(Collectors.joining(",", "(", ")"));
    }

    public Book getRandomBook() {
        Supplier<Integer> randomIndex;
        return null;
    }

    public void borrowBook(Book b) {
        booksByGenre.get(b.genre).remove(b);
    }
}
