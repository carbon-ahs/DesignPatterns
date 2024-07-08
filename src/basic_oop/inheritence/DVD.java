package basic_oop.inheritence;

public class DVD extends Item{
    private Integer duration;
    private Integer region_code;

    public DVD(String title, String author, Integer year, Integer duration, Integer region_code) { // init
        super(title, author, year);
        this.duration = duration;
        this.region_code = region_code;
    }

    @Override
    public String get_info() {
        return "DVD{" +
                "title='" + getTitle() + '\'' +
                "author='" + getAuthor() + '\'' +
                "year='" + getYear() + '\'' +
                "duration=" + duration +
                ", region_code=" + region_code +
                '}';
    }

}
