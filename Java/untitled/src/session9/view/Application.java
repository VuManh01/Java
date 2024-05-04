package session9.view;

import session9.view.LoginConsoleUI;

import java.sql.SQLException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws SQLException {
        LoginConsoleUI ui = new LoginConsoleUI();
        ui.start();
    }
}
