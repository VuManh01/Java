package javaPracticalTest.View;

import javaPracticalTest.Controller.ContactController;
import javaPracticalTest.Entity.Contact;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleUI {
    private static Scanner scanner = new Scanner(System.in);
    private static Contact contact = new Contact();
    private static ContactController contactController;

    static {
        try {
            contactController = new ContactController();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void menu(){
        System.out.println("1.Add Contact");
        System.out.println("2.Get Contact By ID");
        System.out.println("3.Get ALl Contact");
        System.out.println("4.Update Contact");
        System.out.println("5.Delete Contact");
        System.out.println("0.Exit");
        System.out.println("Enter your choice: ");
    }

    public static void addContactUI() throws SQLException {
        System.out.println("Enter the new contact id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the new contact company: ");
        String company = scanner.nextLine();
        System.out.println("Enter the new contact email: ");
        String email = scanner.nextLine();
        System.out.println("Enter the new contact phone: ");
        int phone = scanner.nextInt();
        contact.setId(id);
        contact.setName(name);
        contact.setCompany(company);
        contact.setEmail(email);
        contact.setPhone(phone);
        contactController.addContactController(contact);
    }

    public static void getContactByIdUI() throws SQLException {

        System.out.println("Enter the contact id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        contactController.getContactByIdController(id);
    }

    public void getAllContactsUI() throws SQLException{
        ArrayList<Contact> allContacts = contactController.getAllContactsController();
        System.out.println("====All Contact====");
        allContacts.forEach(contact -> {
            System.out.println("Contact ID: " + contact.getId());
            System.out.println("Contact Name: " + contact.getName());
            System.out.println("Contact Company: " + contact.getCompany());
            System.out.println("Contact Email: " + contact.getEmail());
            System.out.println("Contact Phone: " + contact.getPhone());
            System.out.println("================================");
        });
    }
    public void updateContactUI() throws SQLException{
        System.out.println("Enter contact id: ");
        int contactId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter contact company: ");
        String company = scanner.nextLine();
        System.out.println("Enter contact email: ");
        String email = scanner.nextLine();
        System.out.println("Enter contact phone: ");
        int phone = scanner.nextInt();
        Contact contact = new Contact(contactId, name, company, email, phone);
        contactController.updateContactController(contact);
    }

    public void deleteContactUI() throws SQLException{
        System.out.println("Enter contact id: ");
        int contactId = scanner.nextInt();
        contactController.deleteContactController(contactId);
    }

    public void start() throws SQLException{
        while (true){
            menu();
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    addContactUI();
                    break;
                case 2:
                    getContactByIdUI();
                    break;
                case 3:
                    getAllContactsUI();
                    break;
                case 4:
                    updateContactUI();
                    break;
                case 5:
                    deleteContactUI();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
