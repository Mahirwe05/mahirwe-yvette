import java.util.Date;

class GroceryItem extends StockItem {
    Date expirationDate;

    public GroceryItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String supplier, Date expirationDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantityStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
        this.supplier = supplier;
        this.category = "Groceries";
        this.expirationDate = expirationDate;
    }
    @Override
    public void updateStock() {
    }

    @Override
     public double calculateStockValue() {
        return pricePerUnit * quantityStock;
    }
    @Override
    public void generateStockReport() {  System.out.println("Item: " + itemName + " | Category: " + category + " | Quantity: " + quantityStock +
    " | Stock Value: " + calculateStockValue() + " | Expiration Date: " + warrantyPeriod);
    }

    @Override
    public void validateStock() {
        if(this.quantityStock>0){
            System.out.println("valid stock quantity");

        }else{
            System.out.println("Invalid dtock quantity");
        }
    }
    
}
