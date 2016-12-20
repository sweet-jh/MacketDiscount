import Strategy.DiscountStrategy;
import Strategy.Minute50When300Discount;
import Strategy.NormalDiscount;
import Strategy.Percent80Discount;

/**
 * Created by hjing on 12/18/16.
 */
public class CashCaculator {
    private DiscountStrategy discountStrategy;

    private void chooseStragety(String stragety)
    {
        if(stragety.equals("Minute"))
            discountStrategy = new Minute50When300Discount();
        else if(stragety.equals("Percent"))
            discountStrategy = new Percent80Discount();
        else
            discountStrategy = new NormalDiscount();
    }

    public double getDiscountResult(String stragety,double cash)
    {
        this.chooseStragety(stragety);
        return discountStrategy.getDiscountCash(cash);
    }
}
