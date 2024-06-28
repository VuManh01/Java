package javaPracticalTest.Model;

import javaPracticalTest.Entity.Contact;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ContactDAO {
    public void addContact(Contact contact) throws SQLException;
    public void updateContact(Contact contact) throws SQLException;
    public boolean deleteContact(int contactId) throws SQLException;
    public Contact getContactById(int contactId) throws SQLException;
    public ArrayList<Contact> getAllContacts() throws SQLException;
}
