public class ClothingItem extends StockItem{

    String size;
    String color;
    boolean hasDiscount;

public ClothingItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String supplier, String size, String color, boolean hasDiscount) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantityStock = quantityStock;
        this.pricePerUnit = pricePerUnit;
        this.supplier = supplier;
        this.category = "Clothing";
        this.size = size;
        this.color = color;
        this.hasDiscount = hasDiscount;
    }
    @Override
    public double  calculateStockValue() {
        return pricePerUnit * quantityStock;

        
    }
    @Override
    public void updateStock() {
        
    }

    @Override
    public void generateStockReport() {
        System.out.println("Item: " + itemName + " | Category: " + category + " | Quantity: " + quantityStock +
                " | Stock Value: " + calculateStockValue());

        
    }

    @Override
    public void validateStock() {
        
      
    }

} 
    
