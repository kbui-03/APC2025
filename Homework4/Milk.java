package Homework4;

public class Milk extends PopularGrocery {

    public Milk(int quantity, int discountThreshold, int popularityLevel){
        super(popularityLevel, true);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 20;
    }
    
    @Override
    public int getBulkDiscount() {
        if (quantity >= discountThreshold) {
            return 12; 
        } else {
            return 0; 
        }
    }
}
