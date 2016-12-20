import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by hjing on 12/20/16.
 */
public class CashCaculatorTest {
    @Test
    public void shouldReturn270WhenGiven320AndMinut()
    {
        CashCaculator cashCaculator = new CashCaculator();
        double result = cashCaculator.getDiscountResult("Minute",320.0);
        assertEquals(270.0, result);
    }
}
