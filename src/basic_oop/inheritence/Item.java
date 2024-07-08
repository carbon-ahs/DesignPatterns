package basic_oop.inheritence;

public class Item {
    private String title;
    private String author;
    private Integer year;

    public Item(String title, String author, Integer year) { // __init__ in python
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String get_info() {
        return "BaseItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public String toString() { // __str__
        return "BaseItem{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getYear() {
        return year;
    }
}
