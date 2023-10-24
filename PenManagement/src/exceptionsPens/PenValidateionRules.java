package exceptionsPens;

import penClass.Pen;
import penClass.PenBrand;

import java.time.LocalDate;
import java.util.Map;
import java.util.zip.DataFormatException;

public class PenValidateionRules {

    private static PenBrand checkBrand(String brand) throws IllegalArgumentException {
        return PenBrand.valueOf(brand.toUpperCase());
    }
    private static LocalDate checkDate(String dates)throws DataFormatException{
        return LocalDate.parse(dates);
    }

    public static Pen isDiscount(Pen get) throws PenExceptionHandeling{
        if(get.getStockListingDate().isBefore(LocalDate.now().minusMonths(6))){
            get.setDiscount(20);
            return get;
        }
        else throw new PenExceptionHandeling("Date Not Prior to 6M ");
    }
    public static Boolean checkDel(Pen get) throws PenExceptionHandeling{
        return get.getStockListingDate().isBefore(LocalDate.now().minusMonths(9));

    }
    public static Pen validateInput(String brand, String material, int stock,
                                    double price,String stockListingDate, Map<Integer,Pen> penMapValid)
            throws PenExceptionHandeling, IllegalArgumentException, DataFormatException {
    PenBrand penEnum = checkBrand(brand);
    LocalDate newStockListingDate = checkDate(stockListingDate);

    return new Pen(penEnum,material,stock,price,newStockListingDate);
    }
}
