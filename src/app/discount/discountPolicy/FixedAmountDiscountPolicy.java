package app.discount.discountPolicy;

import javax.swing.*;

public class FixedAmountDiscountPolicy {

    private int discountAmount;

    public FixedAmountDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int calculateDiscountedPrice(int price){
        return price- discountAmount;
    }
}
