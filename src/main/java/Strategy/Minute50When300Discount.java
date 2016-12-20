package Strategy;

/**
 * Created by hjing on 12/18/16.
 */
public class Minute50When300Discount extends DiscountStrategy {
    public Double getDiscountCash(double originCash) {
        return originCash - (int)(originCash/300) * 50;
    }
}
