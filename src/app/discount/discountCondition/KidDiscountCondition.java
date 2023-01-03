package app.discount.discountCondition;

import app.discount.discountPolicy.FixedAmountDiscountPolicy;

import java.util.Scanner;

public class KidDiscountCondition {
    private boolean isSatisfied;
    private FixedAmountDiscountPolicy fixedAmountDiscountPolicy =new FixedAmountDiscountPolicy(500);

    public boolean isSatisfied(){
        return isSatisfied;
    }

    public void setSatisfied(boolean satisfied) {
        isSatisfied = satisfied;
    }

    public void checkDiscountCondition(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("나이가 어떻게 되십니까?");
        int input = Integer.parseInt(scanner.nextLine());
        // scanner.nextInt로 받지 않고 문자로 받아서 숫자로 변형시키는 이유?
        setSatisfied(input<20);
    }
    public int applyDiscount(int price){
        return fixedAmountDiscountPolicy.calculateDiscountedPrice(price);
    }
}
