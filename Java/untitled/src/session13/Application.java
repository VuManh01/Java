package session13;

import session13.view.ConsoleUI;

import java.io.IOException;
import java.sql.SQLException;

public class Application {

    public static void main(String[] args) throws SQLException, IOException, IllegalAccessException {
        ConsoleUI ui = new ConsoleUI();
        ui.start();

    }
}