import java.util.Objects;

public class Book {
    private final String name;
    private final Author authorName;
    private final int  yearOfPublication;

    public Book(String name, Author authorName, int yearOfPublication) {
        this.name = name;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }
    public String getName(){
        return name;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Название " +
                "книги : " + name + " " +
                ", имя автора: " + authorName +
                ", год выпуска: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(name, book.name) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, yearOfPublication);
    }
}