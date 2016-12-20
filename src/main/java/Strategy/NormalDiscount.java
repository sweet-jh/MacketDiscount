package Strategy;

/**
 * Created by hjing on 12/18/16.
 */
public class NormalDiscount extends DiscountStrategy {
    public Double getDiscountCash(double originCash) {
        return originCash;
    }
}
