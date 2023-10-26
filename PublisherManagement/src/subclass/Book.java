package subclass;

import java.time.LocalDate;

public class Book extends Publications{
    private int pageCount;


    public Book(String text, Double price, LocalDate date, int rating,int pageCount) {
        super(text, price, date, rating);
        this.pageCount=pageCount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pageCount=" + pageCount +
                '}';
    }
}
