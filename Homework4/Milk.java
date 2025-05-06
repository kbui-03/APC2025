package Homework4;

public class Milk extends PopularGrocery {

    public Milk(int quantity, int discountThreshold, int popularityLevel){
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 20;
    }
    
    @Override
    public int getBulkDiscount() {
        return (quantity >= discountThreshold) ? 12 : 0;
    }
}
