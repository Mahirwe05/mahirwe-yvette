import java.util.Date;

public class PerishableItem extends StockItem {
    Date expirationDate;

    public PerishableItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String supplier, Date expirationDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantityStock = quantityInStock;
        this.pricePerUnit = pricePerUnit;
        this.supplier = supplier;
        this.category = "Perishable";
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
    public void generateStockReport() {
        System.out.println("Item: " + itemName + " | Category: " + category + " | Quantity: " + quantityStock +
        " | Stock Value: " + calculateStockValue() + " | Expiration Date: " + warrantyPeriod);
    }

    @Override
    public void validateStock() {
        
            validatePriceAndStock();
            if (quantityStock <= 0) {
                System.out.println("Stock quantity for Perishable items must be above zero.");
            }
            if (expirationDate.before(new Date())) {
                System.out.println("This perishable item is expired.");
            }
        }
    }
    
    
