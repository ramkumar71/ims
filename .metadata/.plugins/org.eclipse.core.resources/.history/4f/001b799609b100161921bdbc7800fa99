package ims.impl;

import ims.interfaces.Product;
import ims.interfaces.RestockingResult;

/**
 * Created by k on 11/21/16.
 */
public class RestockingResultImpl extends InventoryManagementSystemImpl implements RestockingResult{


    String productId;
    int level;
    int amountAdded;
    String location;
    String defaultLocation = "";
    int defaultLevel = 0;

    public RestockingResult restockProduct(String productId, int amountToRestock) {
        Product product = findProduct(productId);
        if (product != null) {
            RestockingResult restockingResult = new RestockingResultImpl();
            restockingResult.setAmountAdded(amountToRestock);
            restockingResult.setProductId(productId);
            restockingResult.setLevel(product.getLevel());
            return restockingResult;
        } else {
            product = new ProductImpl(productId, defaultLocation, defaultLevel);
        }
        addProduct(product, amountToRestock);
        return null;
    }

    @Override
    public String getProductId() {
        return productId;
    }

    @Override
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void setAmountAdded(int amountAdded) {
        this.amountAdded = amountAdded;
    }

    @Override
    public int getAmountAdded() {
        return this.amountAdded;
    }
}
