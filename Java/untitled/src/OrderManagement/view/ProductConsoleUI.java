package OrderManagement.view;

import OrderManagement.controller.ProductController;
import OrderManagement.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductConsoleUI {
    ProductController productController = new ProductController();
    private final Scanner sc;

    public ProductConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }

    private int menu(){
        System.out.println("====Product Management====");
        System.out.println("1: All products");
        System.out.println("2: Create product");
        System.out.println("0: Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public void getAllProductUI() throws SQLException{
        ArrayList<Product> allProducts = productController.getAllProductController();
        allProducts.forEach(product -> {
            System.out.println("====Product Details====");
            System.out.println(product.getProductId());
            System.out.println(product.getProductName());
            System.out.println(product.getProductPrice());
            System.out.println(product.getProductQuantity());
        });

    }

    public void createProductUI() throws SQLException{
        System.out.println("Enter id: ");
        int prd_id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product price: ");
        Double price = Double.parseDouble(sc.nextLine());
        System.out.println("Enter product quantity: ");
        int quantity = Integer.parseInt(sc.nextLine());
        Product product = new Product(prd_id, name, price, quantity);
        productController.createProductController(product);
    }

    public void start() throws SQLException{
        while (true){
            int choice = menu();
            switch (choice){
                case 1:
                    getAllProductUI();
                    break;
                case 2:
                    createProductUI();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
