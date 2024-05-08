package ShoppingManagement.view;

import ShoppingManagement.controller.CustomerController;
import ShoppingManagement.controller.OrderController;
import ShoppingManagement.controller.ProductController;
import ShoppingManagement.entity.Customer;
import ShoppingManagement.entity.Order;
import ShoppingManagement.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    ProductController productController = new ProductController();
    CustomerController customerController = new CustomerController();
    OrderController orderController = new OrderController();
    private final Scanner sc;

    public ConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }

    public void menu(){
        System.out.println("====Product Management====");
        System.out.println("1: Product Manager");
        System.out.println("2: Customer Manager");
        System.out.println("3: Order Manager");
        System.out.println("0: Exit");
        System.out.println("Enter your choice: ");
    }

    public void menuProduct() throws SQLException{
        System.out.println("1.All Products");
        System.out.println("2.Add Product");
        System.out.println("3.Update Product");
        System.out.println("4.Find Product");
        System.out.println("5.Delete Product");
        System.out.println("0: Back");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                getAllProductUI();
                break;
            case 2:
                createProductUI();
                break;
            case 3:
                updateProductUI();
                break;
            case 4:
                findProductByNameUI();
                break;
            case 5:
                deleteProductUI();
                break;
            case 0:
                start();
                break;
            default:
                throw new AssertionError();

        }
    }

    public void menuCustomer() throws SQLException{
        System.out.println("1.All Customers");
        System.out.println("2.Add Customer");
        System.out.println("3.Update Customer");
        System.out.println("4.Search Customer");
        System.out.println("5.Delete Customer");
        System.out.println("0.Back");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                getAllCustomerUI();
                break;
            case 2:
                addCustomerUI();
                break;
            case 3:
                updateCustomerUI();
                break;
            case 4:
                getCustomerByIdUI();
                break;
            case 5:
                deleteCustomerUI();
                break;
            case 0:
                start();
                break;
            default:
                throw new AssertionError();

        }
    }

    public void menuOrder() throws SQLException{
        System.out.println("1.All Orders");
        System.out.println("2.Update Order Status");
        System.out.println("3.Create Order");
        System.out.println("0.Back");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                getAllOrderUI();
                break;
            case 2:
                updateOrderStatusUI();
                break;
            case 3:
                addCustomerUI();
                break;
            case 0:
                start();
                break;
            default:
                throw new AssertionError();

        }
    }

    public void getAllProductUI() throws SQLException{
        ArrayList<Product> allProducts = productController.getAllProductController();
        System.out.println("====All Product====");
        allProducts.forEach(product -> {
            System.out.println("================================");
            System.out.println("Product Id: " + product.getProductId());
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Product description: " + product.getProductDescription());
            System.out.println("Product price: " + product.getProductPrice());
        });

    }

    public void getAllCustomerUI() throws SQLException{
        ArrayList<Customer> allCustomers = customerController.getAllCustomerController();
        System.out.println("====All Customer====");
        allCustomers.forEach(customer -> {
            System.out.println("================================");
            System.out.println("Customer Id: " + customer.getCustomerId());
            System.out.println("Customer name: " + customer.getName());
            System.out.println("Customer address: " + customer.getAddress());
            System.out.println("Customer phone: " + customer.getPhone());
            System.out.println("Customer email: " + customer.getEmail());
        });

    }

    public void getAllOrderUI() throws SQLException{
        ArrayList<Order> allOrders = orderController.getAllOrderController();
        System.out.println("====All Orders====");
        allOrders.forEach(order -> {
            System.out.println("================================");
            System.out.println("Order Id: " + order.getOrderId());
            System.out.println("Customer Id: " + order.getCustomerId());
            System.out.println("Order Status: " + order.getOrderStatus());
        });

    }

    public void updateProductUI() throws SQLException{
        System.out.println("Enter product id: ");
        int prd_id = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi nhập id
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product description: ");
        String description = sc.nextLine();
        System.out.println("Enter product price: ");
        double price = sc.nextDouble();

        Product product = new Product(prd_id, name, description, price);
        productController.updateProductController(product);
    }

    public void updateCustomerUI() throws SQLException{
        System.out.println("Enter customer id: ");
        int cus_id = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi nhập id
        System.out.println("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("Enter customer address: ");
        String address = sc.nextLine();
        System.out.println("Enter customer phone: ");
        int phone = sc.nextInt();
        System.out.println("Enter customer email: ");
        String email = sc.nextLine();
        Customer customer = new Customer(cus_id, name, address, phone, email);
        customerController.updateCustomerController(customer);
    }

    public void updateOrderStatusUI() throws SQLException{
        System.out.println("Enter order id: ");
        int oId = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi nhập id
        System.out.println("Enter order status: ");
        String status = sc.nextLine();
        Order order = new Order(oId,status);
        orderController.updateOrderStatusController(order);
    }

    public void deleteProductUI() throws SQLException{
        System.out.println("Enter product id: ");
        int prd_id = sc.nextInt();
        productController.deleteProductController(prd_id);
    }

    public void deleteCustomerUI() throws SQLException{
        System.out.println("Enter customer id: ");
        int cus_id = sc.nextInt();
        customerController.deleteCustomerController(cus_id);
    }

    public void findProductByNameUI() throws SQLException{
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        productController.findProductByNameController(name);
    }

    public void getCustomerByIdUI() throws SQLException{
        System.out.println("Enter customer id: ");
        int cus_id = sc.nextInt();
        customerController.getCustomerByIdController(cus_id);
    }

    public void createProductUI() throws SQLException{
        System.out.println("Enter product id: ");
        int prd_id = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi nhập id
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product description: ");
        String description = sc.nextLine();
        System.out.println("Enter product price: ");
        double price = sc.nextDouble();
        Product product = new Product(prd_id, name, description, price);
        productController.createProductController(product);
    }

    public void addCustomerUI() throws SQLException{
        System.out.println("Enter customer id: ");
        int cus_id = sc.nextInt();
        sc.nextLine(); // Đọc ký tự xuống dòng sau khi nhập id
        System.out.println("Enter customer name: ");
        String name = sc.nextLine();
        System.out.println("Enter customer address: ");
        String address = sc.nextLine();
        System.out.println("Enter customer phone: ");
        int phone = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter customer email: ");
        String email = sc.nextLine();
        Customer customer = new Customer(cus_id, name, address, phone, email);
        customerController.addCustomerController(customer);
    }

    public void createOrderUI() throws SQLException{
        System.out.println("Enter customer id: ");
        int cus_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter order id");
        int oId = sc.nextInt();
        System.out.println("Enter order status: ");
        String status = sc.nextLine();
        System.out.println("Enter total price");
        double totalPrice = sc.nextDouble();
        Order order = new Order(cus_id,oId,status,totalPrice);
        orderController.addOrderController(order);
    }

    public void start() throws SQLException{
        while (true){
            menu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    menuProduct();
                    break;
                case 2:
                    menuCustomer();
                    break;
                case 3:
                    menuOrder();
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
