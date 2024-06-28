package ordermanager.view;

import ordermanager.controller.Controller;
import ordermanager.entity.*;
import ordermanager.model.Model;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class View {

    Model<Customer> customerModel = new Model<>();
    Model<Product> productModel = new Model<>();
    Model<Orders> ordersModel = new Model<>();
    Model<OrderDetail> orderDetailModel = new Model<>();
    private Controller<Customer> customerController = new Controller<>(customerModel);
    private Controller<Product> productController = new Controller<>(productModel);
    private Controller<Orders> ordersController = new Controller<>(ordersModel);
    private Controller<OrderDetail> orderDetailController = new Controller<>(orderDetailModel);
    private Scanner scanner = new Scanner(System.in);

    public View(Controller<Customer> customerController) {
        this.customerController = customerController;
        this.scanner = new Scanner(System.in);
    }

    public View() {

    }



    public void addCustomer() throws SQLException {
        try {
            System.out.println("Enter customer details:");
            System.out.print("Customer ID: ");
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Clear the newline character from the buffer
            System.out.print("First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Phone: ");
            int phone = scanner.nextInt();
            Customer customer = new Customer(customerId, firstName, lastName, email, phone);
            customerController.addEntity(customer);
            System.out.println("Customer added successfully!");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine(); // Clear the buffer
        }
    }
    public void addProduct() throws SQLException {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Nhap vao product id:");
        int id = scanner1.nextInt();
        scanner1.nextLine();
        System.out.println("nhap ten san pham:");
        String name = scanner1.nextLine();
        System.out.println("Nhap desc: ");
        String desc = scanner1.nextLine();
        System.out.println("Nhap vao gia:");
        int price = scanner1.nextInt();
        Product product = new Product(id,name,desc,price);
        productController.addEntity(product);
    }
    public void getAll() throws SQLException {
        System.out.println(customerController.getAllEntity());
    }
    public void getAll1(){
        System.out.println(customerController.getAll());
        System.out.println(productController.getAll());
    }
}
