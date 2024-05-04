package OrderManagement.model;

import OrderManagement.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    public void createProduct(Product product) throws SQLException;
    Product getProductById(int proId) throws SQLException;
    ArrayList<Product> getAllProduct() throws SQLException;
    void updateProduct(Product product) throws SQLException;
    boolean deleteProduct(int proId) throws SQLException;
    ArrayList<Product> findProductByName(String name) throws SQLException;
}
