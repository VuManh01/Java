package javaPracticalTest.Controller;

import javaPracticalTest.Entity.Contact;
import javaPracticalTest.Model.ContactDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ContactController {
    ContactDAOImpl contactDAOImpl = new ContactDAOImpl();

    public ContactController() throws SQLException {
    }
    public ArrayList<Contact> getAllContactsController() throws SQLException{
        ArrayList<Contact> contacts = contactDAOImpl.getAllContacts();
        return contacts;
    }

    public void addContactController(Contact contact) throws SQLException{
        contactDAOImpl.addContact(contact);
    }

    public Contact getContactByIdController(int contactId) throws SQLException{
        return contactDAOImpl.getContactById(contactId);
    }

    public void updateContactController(Contact contact) throws SQLException{
        contactDAOImpl.updateContact(contact);
    }
    public boolean deleteContactController(int contactId) throws SQLException{
        return contactDAOImpl.deleteContact(contactId);
    }
}
