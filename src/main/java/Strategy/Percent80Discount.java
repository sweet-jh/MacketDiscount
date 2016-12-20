package Strategy;

/**
 * Created by hjing on 12/18/16.
 */
public class Percent80Discount extends DiscountStrategy{
    public Double getDiscountCash(double originCash)
    {
        return originCash * 0.8;
    }
}
