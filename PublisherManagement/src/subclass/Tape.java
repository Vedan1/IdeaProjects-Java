package subclass;

import java.time.LocalDate;

public class Tape extends Publications{

    private int timePlayed;


    public Tape(String text, Double price, LocalDate date, int rating,int timePlayed) {
        super(text, price, date, rating);
        this.timePlayed=timePlayed;
    }

    @Override
    public String toString() {
        return super.toString() +  "Tape{" +
                "timePlayed=" + timePlayed +
                '}';
    }
}
