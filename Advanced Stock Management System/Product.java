import java.util.Scanner;

public class Product {
    String ProductID;
    String productName;
    String brand;
    String supplier;
    double stockquanity;
    
    public static void main(String[] args) {
        Scanner scan=new  Scanner(System.in);
        System.out.println("Enter product name");
        String productName=scan.next();
        if (!productName.contains(productName)) {
            System.out.println("product name accepted ");
         
         } else {
            
            System.out.println("Product name should be unique. Please enter a different name.");
        }
    
        System.out.println("Enter Stock quantity");
        double stockquanity=scan.nextDouble();
        if(stockquanity>0){
            System.out.println("valid stock quanitu");
        }else{
            System.out.println("invalid stock quanity");
        }
        
        System.out.println("Enter brand");
        String brand=scan.next();

    }

    }
    

