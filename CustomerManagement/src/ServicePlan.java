public enum ServicePlan {

    SILVER(1000), GOLD(5000), DIAMOND(10000), PLATINUM(20000);

    private int price;
    private ServicePlan(int price){
        this.price=price;
    }


}
