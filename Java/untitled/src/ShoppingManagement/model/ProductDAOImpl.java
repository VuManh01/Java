package ShoppingManagement.model;

import ShoppingManagement.entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDAOImpl implements ProductDAO {
    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String SQL_CREATE_PRODUCT = "INSERT INTO Products VALUES(?,?,?,?)";
    private final String SQL_GET_PRODUCT_BY_NAME = "SELECT * FROM Products WHERE product_name = ?";
    private final String SQL_DELETE_PRODUCT = "DELETE  FROM Products WHERE product_id = ?";
    private final String SQL_GET_ALL_PRODUCT = "SELECT * FROM Products";
    private final String SQL_UPDATE_PRODUCT = "UPDATE Products SET product_name = ?, product_description = ?, product_price = ? WHERE product_id = ?";
    PreparedStatement pstm = null;
    public ProductDAOImpl() throws SQLException {
    }

    @Override
    public void createProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_CREATE_PRODUCT);
        pstm.setInt(1,product.getProductId());
        pstm.setString(2,product.getProductName());
        pstm.setString(3,product.getProductDescription());
        pstm.setDouble(4,product.getProductPrice());
        pstm.executeUpdate();
        System.out.println("Insert successfully");

    }

    @Override
    public ArrayList<Product> getAllProduct() throws SQLException {
        ArrayList<Product> allProducts = new ArrayList<>();
        pstm= conn.prepareStatement(SQL_GET_ALL_PRODUCT);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            Product product = new Product();
            product.setProductId(rs.getInt(1));
            product.setProductName(rs.getString(2));
            product.setProductDescription(rs.getString(3));
            product.setProductPrice(rs.getDouble(4));
            allProducts.add(product);
        }
        return allProducts;
    }

    @Override
    public void updateProduct(Product product) throws SQLException {
        pstm = conn.prepareStatement(SQL_UPDATE_PRODUCT);
        pstm.setString(1,product.getProductName());
        pstm.setDouble(2,product.getProductPrice());
        pstm.setString(3,product.getProductDescription());
        pstm.setInt(4,product.getProductId());
        pstm.executeUpdate();
        System.out.println("Update successfully");

    }

    @Override
    public boolean deleteProduct(int proId) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_PRODUCT);
        pstm.setInt(1,proId);
        int result = pstm.executeUpdate();
        if (result == 1) {
            System.out.println("Delete successfully");
            return true;
        } else {
            System.out.println("Delete failed");
            return false;
        }
    }

    @Override
    public Product findProductByName(String name) throws SQLException {
        Product product = new Product();
        pstm = conn.prepareStatement(SQL_GET_PRODUCT_BY_NAME);
        pstm.setString(1,name);

        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.println("====Product Information====");
            System.out.println("Product Id: " + rs.getInt("product_id"));
            System.out.println("Product Name: " + rs.getString("product_name"));
            System.out.println("Product Description: " + rs.getString("product_description"));
            System.out.println("Product Price: " + rs.getDouble("product_price"));
        }
        return product;
    }
}
