package Homework4;

abstract class PopularGrocery extends GroceryItem {
   int popularityLevel;
   int quantity;

   public PopularGrocery(int popularityLevel, boolean isPopular) {
        isPopular = true;
        this.popularityLevel = popularityLevel;
   }

    @Override
    public boolean showWarning() {
        if (quantity > householdLimit) {
            return true;
        } else {
            return false;
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}