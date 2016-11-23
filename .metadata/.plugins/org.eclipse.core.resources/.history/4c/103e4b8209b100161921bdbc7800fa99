package ims.impl;

import ims.interfaces.PickingResult;
import ims.interfaces.Product;

/**
 * Created by k on 11/21/16.
 */
public class PickingResultImpl extends InventoryManagementSystemImpl implements PickingResult{

    String productId;
    int level;
    int amountPicked;
    String location;

    public PickingResult pickProduct(String productId, int amountToPick) throws Exception {
        Product product = findProduct(productId);
        PickingResult pickingResult = new PickingResultImpl();
        if (product != null && InventoryManagementSystemImpl.productCount.get(productId) != null) {
            int amount = InventoryManagementSystemImpl.productCount.get(productId);
            if (amount - amountToPick < 0)
                throw new Exception("Pickup amount is more than available amount");
            InventoryManagementSystemImpl.productCount.put(productId, amount - amountToPick);
            pickingResult.setAmountPicked(amountToPick);
            pickingResult.setProductId(productId);
            pickingResult.setLevel(product.getLevel());
            pickingResult.setLocation(product.getLocation());
            return pickingResult;
        } else {
            throw new Exception("Product not found");
        }
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
    public int getAmountPicked() {
        return amountPicked;
    }

    @Override
    public void setAmountPicked(int amountPicked) {
        this.amountPicked = amountPicked;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

}
