/**
 * Created by keerthas on 24/08/15.
 */
public class Item {

    private String itemName;
    private double priceWithoutTax;
    private double priceWithTax;
    private int numberofItems;

    public Item(String itemName, double priceWithoutTax, double priceWithTax, int numberofItems) {
        this.itemName = itemName;
        this.priceWithoutTax = priceWithoutTax;
        this.priceWithTax = priceWithTax;
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
