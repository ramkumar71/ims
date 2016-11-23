package ims;

import ims.impl.InventoryManagementSystemImpl;
import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.RestockingResult;


public class Main {

    public static void main(String args[]){

        try
        {
    	InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystemImpl();
        inventoryManagementSystem.addingNewProduct("ABC",1,"AZ",23);
        inventoryManagementSystem.addingNewProduct("BCD",1,"CO",67);
        inventoryManagementSystem.addingNewProduct("DEF",1,"MN",66);
        inventoryManagementSystem.addingNewProduct("ABC",2,"CA",10);
        RestockingResult restockingResult = inventoryManagementSystem.restockProduct("ABC", 10);
        PickingResult pickingResult = inventoryManagementSystem.pickProduct("ABC", 10);
        PickingResult pickingResult2 = inventoryManagementSystem.pickProduct("ABC", 23);
        PickingResult pickingResult3 = inventoryManagementSystem.pickProduct("ABC", 10);
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }

    }
}