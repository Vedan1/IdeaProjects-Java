package penClass;

import java.time.LocalDate;

public class Pen {

    PenBrand brand; // from enum
    private String material; // ctor
    private int stock; // ctor
    private double price; //ctor
    private int discount = 0; // ctor
    LocalDate stockUpdateDate; // stockdate .. .now preferable
    LocalDate stockListingDate; // ctor

    public Pen(PenBrand brand, String material, int stock, double price, LocalDate stockListingDate) {
        this.brand = brand;
        this.material = material;
        this.stock = stock;
        this.price = price;
        this.stockUpdateDate = LocalDate.now();
        this.stockListingDate = stockListingDate;
    }
    public void setDiscount(int discounts){
        this.discount = discounts;
        this.price-=(this.price*.20);
        System.out.println("Applied Discount Sucessfully");
    }

    public LocalDate getStockListingDate() {
        return stockListingDate;
    }



    public void setStock(int stock){
        this.stock = stock;
        stockUpdateDate = LocalDate.now();
    }
    @Override
    public String toString() {
        return "Pen{" +
                "brand=" + brand +
                ", material='" + material + '\'' +
                ", stock=" + stock +
                ", price=" + price +
                ", discount=" + discount +
                ", stockUpdateDate=" + stockUpdateDate +
                ", stockListingDate=" + stockListingDate +
                '}';
    }
}
