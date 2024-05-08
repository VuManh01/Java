package ShoppingManagement.controller;

import ShoppingManagement.entity.Product;
import ShoppingManagement.model.ProductDAOImpl;

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

    public Product findProductByNameController(String name) throws SQLException{
        return productDAOImpl.findProductByName(name);
    }

    public void updateProductController(Product product) throws SQLException{
        productDAOImpl.updateProduct(product);
    }

    public boolean deleteProductController(int proId) throws SQLException{
        return productDAOImpl.deleteProduct(proId);
    }
}
