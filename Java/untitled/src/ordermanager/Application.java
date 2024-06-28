package ordermanager;

import ordermanager.entity.Customer;
import ordermanager.view.View;

import java.sql.SQLException;



public class Application {
    public static void main(String[] args) throws SQLException {
        View view = new View();
        view.addCustomer();
        view.addProduct();
        view.getAll();
        view.getAll1();
    }
}
