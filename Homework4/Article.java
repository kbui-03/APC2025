package Homework4;

abstract class Article {
    int discountThreshold;
    int householdLimit;

    abstract int getBulkDiscount();
    abstract boolean showWarning();
}