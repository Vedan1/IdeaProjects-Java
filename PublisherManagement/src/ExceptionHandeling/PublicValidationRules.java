package ExceptionHandeling;


import subclass.Book;
import subclass.Publications;
import subclass.Tape;

import java.time.LocalDate;
import java.util.Map;

public class PublicValidationRules {




    public static Publications validateAllTapes(String text,
                                           Double price, String date, int rating, int timePlayed, Map<String, Tape> tapeList){
        LocalDate newdate = LocalDate.parse(date);

        return new Tape(text,price,newdate,rating,timePlayed);
    }





    public static Publications validateAll(String text,
                                           Double price, String date, int rating, int pageavail, Map<String,Book> bookList){
        LocalDate newdate = LocalDate.parse(date);

    return new Book(text,price,newdate,rating,pageavail);
    }
}
