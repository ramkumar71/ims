package ims.impl;

import ims.interfaces.InventoryManagementSystem;
import ims.interfaces.PickingResult;
import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by k on 11/21/16.
 */
public abstract class InventoryManagementSystemImpl implements InventoryManagementSystem{


    static List<Product> products = new ArrayList<Product>();
    static Map<String, Integer> productCount = new HashMap<String, Integer>();

    public PickingResult pickProduct(String productId, int amountToPick) throws Exception{
        return null;
    }

    public RestockingResult restockProduct(String productId, int amountToRestock) {
        return null;
    }

    public Product findProduct(String productId) {
            for (Product product : products) {
                if (product.getProductId().equals(productId)) {
                    return product;
                }
            }
        return null;
    }

    public void addProduct(Product product, int amount) {
        products.add(product);
        if (productCount.get(product.getProductId()) == null)
            productCount.put(product.getProductId(), productCount.get(product.getProductId()) + amount);
        else
            productCount.put(product.getProductId(), amount);
    }

}
