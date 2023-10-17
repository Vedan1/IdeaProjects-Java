package enumsTest;

public enum brands {

    CIROC(5000), GOLDLBL(10000), BLUELBL(25000), HIBIKI(30000);

    private int price;
    private brands(int price){
        this.price = price;
    }

    @Override
    public String toString() {
        return "brands{" +
                "price=" + price +
                '}';
    }
}
