import Strategy.DiscountStrategy;
import Strategy.Percent80Discount;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hjing on 12/18/16.
 */
public class DiscountStrategyTest {
    @Test
    public void shouldReturn8WhenGive10()
    {
        DiscountStrategy discountStrategy;
        discountStrategy = new Percent80Discount();
        assertEquals(8.0, discountStrategy.getDiscountCash(10));
    }
}
