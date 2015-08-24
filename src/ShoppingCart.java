/**
 * Created by keerthas on 24/08/15.
 */
import java.util.*;

public class ShoppingCart {
    private List<Item> shoppingCartItems;

    public ShoppingCart()
    {
        shoppingCartItems = new LinkedList<>();
    }
    public void addItemToShoppingCart(String inputString){
        Item item = generateItem(inputString);
        shoppingCartItems.add(item);
    }

    public void removeItemToShoppingCart(Item item){
        shoppingCartItems.remove(item);
    }

    public static Item generateItem(String inputItem)
    {
        int numberOfItems = Integer.valueOf(inputItem.substring(0, inputItem.indexOf(" ")));
        String itemName = inputItem.substring(inputItem.indexOf(" ") + 1, inputItem.lastIndexOf(" "));
        double price = Double.parseDouble(inputItem.substring(inputItem.lastIndexOf(" ") + 1));
        Item item = new Item(itemName,price,numberOfItems);
        return item;
    }

}
