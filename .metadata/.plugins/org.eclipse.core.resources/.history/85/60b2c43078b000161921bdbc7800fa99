package ims;

import ims.impl.PickingResultImpl;
import ims.impl.RestockingResultImpl;
import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class Main {

    public static void main(String args[]) {

        InventoryManagementSystem pickup = new PickingResultImpl();
        InventoryManagementSystem restore = new RestockingResultImpl();

        RestockingResult restockingResult = restore.restockProduct("ABC", 10);
        PickingResult pickingResult = pickup.pickProduct("ABC", 10);

    }
}
