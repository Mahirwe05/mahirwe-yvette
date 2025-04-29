abstract class StockItem{
    public String itemId;
    public String itemName;
    public int quantityStock;
    public double pricePerUnit;
    public String category;
    public String supplier;
    public int warrantyPeriod;

    abstract public void  updateStock();

    abstract public double calculateStockValue();

    abstract public void generateStockReport();

   abstract public void validateStock();

   protected void validatePriceAndStock() {
    if (pricePerUnit <= 0) {
        System.out.println("Price per unit must be above zero.");
    }
    
}
}

