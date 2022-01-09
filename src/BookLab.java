import java.util.Objects;

public class BookLab {
    private String title;
    private String author;
    private String publisher;
    private int year;

    public BookLab(String title, String author, String publisher, int year) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookLab bookLab = (BookLab) o;
        return year == bookLab.year && Objects.equals(title, bookLab.title) && Objects.equals(author, bookLab.author) && Objects.equals(publisher, bookLab.publisher);
    }

    @Override
    public String toString() {
        return "BookLab{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                '}';
    }
}
