package advanced.collections;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.year - o2.year;
    }
}
