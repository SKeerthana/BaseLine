/**
 * Created by keerthas on 24/08/15.
 */
public class Item {

    private String itemName;
    private double priceWithoutTax;
    private double priceWithTax;
    private int numberofItems;

    public Item(String itemName, double price, int numberofItems) {
        this.itemName = itemName;
        this.priceWithoutTax = price;
        this.numberofItems = numberofItems;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPriceWithoutTax(){
        return priceWithoutTax;
    }

    public double getPriceWithTax(){
        return priceWithTax;
    }

    public int getNumberOfItems(){
        return numberofItems;
    }

}
