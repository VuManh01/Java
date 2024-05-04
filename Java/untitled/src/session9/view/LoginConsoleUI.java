package session9.view;

import session9.controller.LoginController;
import session9.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsoleUI {
    private Scanner sc;
    public LoginConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }
    LoginController loginController = new LoginController();

    Users user = new Users();
    private int menu(){
        System.out.println("====Admin zone====");
        System.out.println("1. Login Statement");
        System.out.println("2. Login PreparedStatement");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    private void loginStatementUI() throws SQLException {
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        String result = loginController.loginStatementController(user);
        System.out.println(result);
    }
    private void loginPreparedStatementUI() throws SQLException {
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        String result = loginController.loginPreparedStatementController(user);
        System.out.println(result);
    }
    public void start() throws SQLException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginStatementUI();
                    break;
                case 2:
                    loginPreparedStatementUI();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }


}
