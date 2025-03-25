package Shipping;

import java.util.ArrayList;

public class runner {
    public static void main(String[] args) {
        ArrayList<ShippingItem> itemList = new ArrayList<>();
        itemList.add(new ShippingItem(10));
        itemList.add(new InsuredShippingItem(20, 50));
        itemList.add(new ShippingItem(30));
        itemList.add(new InsuredShippingItem(50, 70));
    
    
        /* MISSING CODE */
        // use a for loop to determine the total cost of all 4 items
        // in itemList; if the item is an InsuredShippingItem, add an
        // additional 30 dollars of insurance BEFORE adding its costs to
        // the total (use the addMoreInsurance method for this purpose)
        double totalCost = 0;
    
        // write your code here
    
        for(ShippingItem ship : itemList) {
            if(ship instanceof InsuredShippingItem) {
                ((InsuredShippingItem)ship).addMoreInsurance(30);;
            }
            totalCost += ship.getCost();
        }
    
    
        System.out.println(totalCost);  // should print 345.0
    }
}
