public class ElectronicsItem extends StockItem{

 int warrantyPeriod;
 public ElectronicsItem(String itemId, String itemName, int quantityInStock, double pricePerUnit, String supplier, int warrantyPeriod) {
    this.itemId = itemId;
    this.itemName = itemName;
    this.quantityStock = quantityStock;
    this.pricePerUnit = pricePerUnit;
    this.supplier = supplier;
    this.category = "Electronics";
    this.warrantyPeriod = warrantyPeriod;
}

    @Override
    public void validateStock() {
        if(this.quantityStock>0){
            System.out.println("valid stock quantity");

        }else{
            System.out.println("Invalid dtock quantity");
        }
        if (warrantyPeriod < 6 || warrantyPeriod > 36) {
            System.out.println("Warranty period for Electronics must be between 6 and 36 months.");
        }

        }
    public void applyDiscout(){
       double discountPercentage=this.pricePerUnit*0.5;

        }


    @Override
    public void  updateStock() {
        
        
    }

    @Override
    public double  calculateStockValue() {
        return pricePerUnit * quantityStock;
        
    }

    @Override
    public void generateStockReport() {
        System.out.println("Item: " + itemName + " | Category: " + category + " | Quantity: " + quantityStock +
        " | Stock Value: " + calculateStockValue() + " | Expiration Date: " + warrantyPeriod);
       
    }
    } 

    
    

