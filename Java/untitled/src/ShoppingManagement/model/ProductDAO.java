package ShoppingManagement.model;

import ShoppingManagement.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    public void createProduct(Product product) throws SQLException;
    ArrayList<Product> getAllProduct() throws SQLException;
    void updateProduct(Product product) throws SQLException;
    boolean deleteProduct(int proId) throws SQLException;
    Product findProductByName(String name) throws SQLException;
}
