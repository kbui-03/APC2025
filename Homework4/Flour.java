package Homework4;

public class Flour extends PopularGrocery {

    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15; 
    }

    @Override
    public int getBulkDiscount() {
        return (quantity >= discountThreshold) ? 5 : 0;
    }
    
}
