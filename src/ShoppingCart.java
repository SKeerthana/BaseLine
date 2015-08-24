/**
 * Created by keerthas on 24/08/15.
 */
import java.util.*;

public class ShoppingCart {

    private List<Item> shoppingCartItems;
    private double salesTax;
    private double totalAmount;
    private SalesTaxCalculator taxCalculator;

    public double getSalesTax() {
        return salesTax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ShoppingCart()
    {
        shoppingCartItems = new LinkedList<>();
        taxCalculator = new SalesTaxCalculator();
    }
    public void addItemToShoppingCart(String inputString){
        Item item = generateItem(inputString);
        shoppingCartItems.add(item);
    }

    public void removeItemToShoppingCart(Item item){
        shoppingCartItems.remove(item);
    }

    public Item generateItem(String inputItem)
    {
        int numberOfItems = Integer.valueOf(inputItem.substring(0, inputItem.indexOf(" ")));
        String itemName = inputItem.substring(inputItem.indexOf(" ") + 1, inputItem.lastIndexOf(" "));
        double priceWithoutTax = Double.parseDouble(inputItem.substring(inputItem.lastIndexOf(" ") + 1));
        double priceWithTax = taxCalculator.calculateSalesTax(priceWithoutTax);
        Item item = new Item(itemName,priceWithoutTax, priceWithTax,numberOfItems);
        return item;
    }

    public void generateSalesTax()
    {

    }

    public void generateTotal()
    {

    }

}
