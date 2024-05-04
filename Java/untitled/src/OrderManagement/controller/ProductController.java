package OrderManagement.controller;

import OrderManagement.entity.Product;
import OrderManagement.model.ProductDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDAOImpl productDAOImpl = new ProductDAOImpl();


    public ProductController() throws SQLException {
    }

    public ArrayList<Product> getAllProductController() throws SQLException{
        ArrayList<Product> products = productDAOImpl.getAllProduct();
        return products;
    }

    public void createProductController(Product product) throws SQLException{
        productDAOImpl.createProduct(product);
    }
}
