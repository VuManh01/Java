//package session9.view;
//
//import session9.entity.Customers;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class CustomerConsoleUI {
//    private Scanner sc;
//    Customers customer = new Customers();
//    private int menu(){
//        System.out.println("====Customers Manager====");
//        System.out.println("1. Get All Customers");
//        System.out.println("2. Get Customer By Id");
//        System.out.println("0. Exit");
//        int choice = Integer.parseInt(sc.nextLine());
//        return choice;
//    }
//
////    private void GetAllCustomerUI() throws SQLException {
//        System.out.println("Enter Cu: ");
//        String username = sc.nextLine();
//        System.out.println("Enter password: ");
//        String password = sc.nextLine();
//        customer.setCustomer_id(username);
//        user.setPassword(password);
//        String result = loginController.loginStatementController(user);
//        System.out.println(result);
//    }
//    private void GetCustomerByIdUI() throws SQLException {
//        System.out.println("Enter Id: ");
//        String customer_id = sc.nextLine();
//        customer.setCustomer_id(customer_id);
//        String result = loginController.loginPreparedStatementController(user);
//        System.out.println(result);
//    }
//    public void start() throws SQLException {
//        while (true){
//            int choice = menu();
//            switch (choice){
//                case 0:
//                    System.exit(0);
//                    break;
//                case 1:
//                    GetAllCustomerUI();
//                    break;
//                case 2:
//                    loginPreparedStatementUI();
//                    break;
//                default:
//                    throw new AssertionError();
//            }
//        }
//    }
//
//
//}
