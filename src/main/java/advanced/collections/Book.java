package advanced.collections;

public class Book implements Comparable<Book>{
    int year;
    String title;
    Genre genre;

    public Book(int year, String title, Genre genre) {
        this.year = year;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                '}';
    }
}
