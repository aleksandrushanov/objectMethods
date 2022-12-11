public class Main {
    public static void main(String[] args) {
        Author author = new Author("Рональд", "Толкин");
        Author author1 = new Author("Джоан", "Роулинг");
        Book book = new Book("Властелин коллец Браство кольца", author, 1941);
        Book book1 = new Book("Гарри Поттер и филосовский камень", author1, 1997);

        System.out.println(author.getFirstName() + " " +author.getLastName() + " " + book.getName() + " " + book.getYearOfPublication());
        System.out.println(author1.getFirstName() + " " + author1.getLastName() + " " + book1.getName() + " " + book1.getYearOfPublication());
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book.equals(book1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());

    }
}