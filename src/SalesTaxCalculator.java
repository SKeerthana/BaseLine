/**
 * Created by keerthas on 24/08/15.
 */
public class SalesTaxCalculator {

    private double roundOffValue = 0.05f;

    public double calculateSalesTax(double price)
    {
        double result = 0.0;
        roundoffSalesTax(result);
        return 0.0;
    }

    public double roundoffSalesTax(double taxAmount)
    {
        return Math.ceil(taxAmount / roundOffValue) * roundOffValue;
    }

}
