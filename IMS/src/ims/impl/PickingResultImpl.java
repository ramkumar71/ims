package ims.impl;

import ims.interfaces.PickingResult;
import ims.interfaces.Product;


public class PickingResultImpl extends InventoryManagementSystemImpl implements PickingResult{

    String productId;
    int level;
    int amountPicked;
    String location;

    public synchronized PickingResult pickProduct(PickingResult pickingResult, String productId, int amountToPick) throws Exception {
        Product product = findProduct(productId);
        if (product != null && InventoryManagementSystemImpl.productCount.get(productId) != null) {
            int amount = InventoryManagementSystemImpl.productCount.get(productId);
            /*
             * Remove the product from inventory if amount is 0 after picked
             * */
            if(amount-amountToPick==0)
            {
            	InventoryManagementSystemImpl.products.remove(productId);
            	InventoryManagementSystemImpl.productCount.remove(productId);
            }
            /*
             * If requested amount to pick is greater than the amount already present, throw error
             * */
            if (amount - amountToPick < 0)
                throw new Exception("Pickup amount is more than available amount");
            /*
             * Update the amount of product accordingly
             * */
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