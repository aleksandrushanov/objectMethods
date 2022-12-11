public class Book {
    private String name;
    private Author authorName;
    private int yearOfPublication;

    public Book(String name, Author authorName, int yearOfPublication) {
        this.name = name;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }
    public String getName(){
        return name;
    }
    public Author getAuthorName() {
        return authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
