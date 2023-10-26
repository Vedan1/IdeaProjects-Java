package subclass;

import java.time.LocalDate;

public class Publications {
    private static int idgen;
    private int c_id;
    private String text;
    private Double price;
    LocalDate date;
    private int rating;

    public Publications(String text, Double price, LocalDate date, int rating) {
        this.c_id = ++this.idgen;
        this.text = text;
        this.price = price;
        this.date = date;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Publications{" +
                "C_id=" + c_id +
                ", text='" + text + '\'' +
                ", price=" + price +
                ", date=" + date +
                ", rating=" + rating +
                '}';
    }

    public String getTitle() {
        return text;
    }

    public LocalDate getDatePublising() {
        return date;
    }
}
