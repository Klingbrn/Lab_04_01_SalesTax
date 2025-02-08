//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SalesTax {
    public static void main(String[] args) {
       int purPrice = 20;
       double SALES_TAX = .05;
       double total;
       double salesTax;

       salesTax = (purPrice * SALES_TAX);
       total = purPrice + (purPrice * SALES_TAX);

       System.out.println("your purchase price is: " + purPrice);
       System.out.println("your sales tax is: " + salesTax);
       System.out.println("your total is: " + total);
        }
    }