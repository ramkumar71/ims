package ims.impl;

import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class InventoryManagementSystemImpl implements InventoryManagementSystem{


    /*
     * Stores the products in the inventory 
     * */
	static Map<String, Product> products = new HashMap<String,Product>();
	/*
	 * Stores the product count
	 */
    static Map<String, Integer> productCount = new HashMap<String, Integer>();

    public PickingResult pickProduct(String productId, int amountToPick) throws Exception{
        PickingResultImpl pickingResult = new PickingResultImpl();
        return pickingResult.pickProduct(pickingResult, productId, amountToPick);
    }

    public RestockingResult restockProduct(String productId, int amountToRestock) {
        RestockingResultImpl restockingResult = new RestockingResultImpl();
        return restockingResult.restockProduct(restockingResult, productId, amountToRestock);
    }

    public synchronized void addingNewProduct(String productId,int level,String location,int amount) throws Exception
    {
    	Product product= new ProductImpl(productId,location,level);
    	
    	/*
    	 * Product can be stored at one and only one location 
    	 */
    	if(products.containsKey(productId))
    	{
    		if(products.get(productId).getLocation().compareTo(location)!=0)
    			throw new Exception("Same product cannot be present in two locations");
    	}
    	else
    		products.put(productId, product);
    	if(productCount.containsKey(productId))
    	   productCount.put(productId, productCount.get(productId)+amount);
    	else
    		productCount.put(productId,amount);
    	
    }
    public Product findProduct(String productId) {
    	if(products.containsKey(productId)) return products.get(productId);
        return null;
    }

	


}