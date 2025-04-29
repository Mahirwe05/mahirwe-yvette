import java.util.Date;
import java.util.Scanner;

public class StockManagement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the ItemId");
        String itemId = scan.nextLine();
        System.out.println("Enter the ItemName");
        String ItemName=scan.nextLine();
        System.out.println("Enter the quantityStock");
        int quantityStock=scan.nextInt();
        System.out.println("Enter the price per unit");
        double pricePerUnit=scan.nextDouble();
        System.out.println("Enter the supplier ");
        String supplier= scan.next();
        System.out.println("Enter category");
        String category=scan.next();
        System.out.println("Enter Warranty period");
        int warrantyPeriod= scan.nextInt();

        ElectronicsItem electronics=new ElectronicsItem(itemId,ItemName,quantityStock,pricePerUnit,supplier,warrantyPeriod);

       
        // Validate and generate reports
        electronics.validateStock();
        
        // Generate stock reports
        electronics.generateStockReport();
    }
}
    

