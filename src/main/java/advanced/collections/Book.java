package advanced.collections;

public class Book implements Comparable<Book>{
    String author;
    String title;
    Genre genre;
    int year;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    int price;

    public Book(String author, String title, Genre genre, int year) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.year = year;
    }
    public Book()
    {}


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre=" + genre +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.year - o.year;
    }


}
