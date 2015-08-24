/**
 * Created by keerthas on 24/08/15.
 */
import java.util.*;

public class ShoppingCart {
    private List<Item> shoppingCartItems;

    public void addItemToShoppingCart(Item item){
        shoppingCartItems.add(item);
    }

    public void removeItemToShoppingCart(Item item){
        shoppingCartItems.remove(item);
    }

}
