/**
 * Created by keerthas on 24/08/15.
 */
public class Item {

    private String itemName;
    private double price;
    private int numberofItems;

    public Item(String itemName, double price, int numberofItems) {
        this.itemName = itemName;
        this.price = price;
        this.numberofItems = numberofItems;
    }

    public String getItemName(){
        return itemName;
    }

    public double getPrice(){
        return price;
    }

    public int getNumberOfItems(){
        return numberofItems;
    }

}
