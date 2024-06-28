package javaPracticalTest.View;


import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.start();
    }
}