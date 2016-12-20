import com.sun.xml.internal.bind.v2.model.core.ID;

/**
 * Created by hjing on 12/20/16.
 */
public class Goods {
    private int ID;
    private String name;
    private double price;

    Goods(int ID, String name, double price)
    {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
