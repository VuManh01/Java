package javaPracticalTest.Model;

import javaPracticalTest.Model.MySqlConnect;
import javaPracticalTest.Entity.Contact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ContactDAOImpl implements ContactDAO {

    private final Connection conn = MySqlConnect.getMySQLConnection();
    private final String ADD_CONTACT = "INSERT INTO Contacts VALUES(?,?,?,?,?)";
    private final String GET_CONTACT_BY_ID = "SELECT * FROM Contacts WHERE id = ?";
    private final String GET_ALL_CONTACTS = "SELECT * FROM Contacts";
    private final String UPDATE_CONTACT = "UPDATE Contacts SET name = ?,  company = ?, email = ?, phone = ? WHERE id = ?";
    private final String DELETE_CONTACT = "DELETE FROM Contacts WHERE id = ?";

    PreparedStatement pstm = null;

    public ContactDAOImpl() throws SQLException {
    }

    @Override
    public void addContact(Contact contact) throws SQLException {
        pstm = conn.prepareStatement(ADD_CONTACT);
        pstm.setInt(1, contact.getId());
        pstm.setString(2, contact.getName());
        pstm.setString(3, contact.getCompany());
        pstm.setString(4, contact.getEmail());
        pstm.setInt(5, contact.getPhone());
        pstm.executeUpdate();
        System.out.println("Add successfully");

    }

    @Override
    public void updateContact(Contact contact) throws SQLException {
        pstm = conn.prepareStatement(UPDATE_CONTACT);
        pstm.setInt(1,contact.getId());
        pstm.setString(2,contact.getName());
        pstm.setString(3,contact.getCompany());
        pstm.setString(4,contact.getEmail());
        pstm.setInt(5,contact.getPhone());
        pstm.executeUpdate();
        System.out.println("Update successfully");

    }

    @Override
    public boolean deleteContact(int contactId) throws SQLException {
        pstm = conn.prepareStatement(DELETE_CONTACT);
        pstm.setInt(1,contactId);
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
    public Contact getContactById(int contactId) throws SQLException {
        Contact contact = new Contact();
        pstm = conn.prepareStatement(GET_CONTACT_BY_ID);
        pstm.setInt(1, contactId);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            System.out.println("====Contact Information====");
            System.out.println("Contact Id: " + rs.getInt(1));
            System.out.println("Contact Name: " + rs.getString(2));
            System.out.println("Contact Company: " + rs.getString(3));
            System.out.println("Contact Email: " + rs.getString(4));
            System.out.println("Customer Phone: " + rs.getInt(5));
            System.out.println("================================");
        }
        return contact;
    }

    @Override
    public ArrayList<Contact> getAllContacts() throws SQLException {
        ArrayList<Contact> allContacts = new ArrayList<>();
        pstm = conn.prepareStatement(GET_ALL_CONTACTS);
        ResultSet rs = pstm.executeQuery();
        while (rs.next()) {
            Contact contact = new Contact();
            contact.setId(rs.getInt(1));
            contact.setName(rs.getString(2));
            contact.setCompany(rs.getString(3));
            contact.setEmail(rs.getString(4));
            contact.setPhone(rs.getInt(5));
            allContacts.add(contact);
        }
        return allContacts;
    }
}
