import java.util.Scanner;

/**
 * Created by keerthas on 24/08/15.
 */
public class Client {

    public static void main(String[] args)
    {
        String endInputString;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of input's");
        int noOfInputs = sc.nextInt();
        String inputItem;
        while(noOfInputs-- > 0 )
        {
            ShoppingCart shoppingCart = new ShoppingCart();
            while (!(inputItem = sc.nextLine()).equals("")){
                Item item = generateItem(inputItem);
                shoppingCart.addItemToShoppingCart(item);
            }
        }
    }

    public static Item generateItem(String inputItem)
    {
        
    }

}
