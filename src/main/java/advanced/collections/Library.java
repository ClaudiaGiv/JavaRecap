package advanced.collections;

import com.google.common.collect.Sets;
import advanced.collections.Genre;

import java.util.*;

public class Library {
    Map<Genre, HashSet<Book>> booksByGenre;

    public void initWithDefaultValues() {
//        booksByGenre = Collections.singletonMap(Genre.LITERATURE,
//                new HashSet<Book>() {{
//                    add(new Book(2000, "A", Genre.LITERATURE));
//                }});
        booksByGenre = Map.of(Genre.LITERATURE,
                new HashSet<Book>() {{
                    add(new Book(2000, "A", Genre.LITERATURE));
                }});
    }

    public void addBook(Book b) {
        if (booksByGenre.containsKey(b.genre)) {
//            booksByGenre.put(b.genre, Collections.singleton(b));
            booksByGenre.put(b.genre, new HashSet<Book>(Arrays.asList(b)));
//            booksByGenre.put(b.genre, new HashSet<Book>() {{add(b);}});
//            booksByGenre.put(b.genre, Stream.of(b).collect(Collectors.toCollection(HashSet::new)));
//            booksByGenre.put(b.genre, Sets.newHashSet(b));
        } else {
            booksByGenre.get(b.genre).add(b);
        }
    }

    public Set<Book> getBooksByGenre(Genre g) {
        return booksByGenre.get(g);
    }

    public Set<Genre> getAllGenres() {
        return booksByGenre.keySet();
    }

//    public Set<Genre> getAllGenresWithNoOfBooks() {
//        return booksByGenre.compute()
//    }

    public void borrowBook(Book b) {
        booksByGenre.get(b.genre).remove(b);
    }
}
