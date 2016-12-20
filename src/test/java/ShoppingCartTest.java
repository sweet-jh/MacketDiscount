import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

/**
 * Created by hjing on 12/20/16.
 */
public class ShoppingCartTest {
    @Test
    public void testGetSumCash()
    {
        Goods pen = new Goods(1, "pen", 2.0);
        Goods flower = new Goods(2, "flower", 5.0);
        Goods book = new Goods(3, "book", 3.0);

        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addCart(pen,2);
        shoppingCart.addCart(flower,1);
        shoppingCart.addCart(book,3);

        assertEquals(18.0,shoppingCart.getSumCash());
    }
}
