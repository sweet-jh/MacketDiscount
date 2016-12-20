import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Created by hjing on 12/18/16.
 */
public class ShoppingCart {
    private Map<Goods, Integer> cart = new HashMap<Goods, Integer>();

    public void addCart(Goods goods,int number)
    {
        cart.put(goods,number);
    }

    public double getSumCash()
    {
        double totalPrice = 0;
        for(Map.Entry<Goods,Integer> entry : cart.entrySet())///不懂entry什么鬼?
        {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }

        return totalPrice;
    }
}
