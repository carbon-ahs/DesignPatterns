package basic_oop.inheritence;

public class Book extends Item{
    private String publisher;
    private String isbn;

    public Book(String title, String author, Integer year, String publisher, String isbn) { // init
        super(title, author, year);
        this.publisher = publisher;
        this.isbn = isbn;
    }



    @Override
    public String get_info() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                "author='" + getAuthor() + '\'' +
                "year='" + getYear() + '\'' +
                "publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
