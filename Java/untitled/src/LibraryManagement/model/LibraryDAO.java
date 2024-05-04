package LibraryManagement.model;

import LibraryManagement.entity.Book;
import LibraryManagement.entity.Librarian;
import LibraryManagement.entity.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public interface LibraryDAO {


    public void createLibrarian(Librarian librarian) throws SQLException;
    public ArrayList<Librarian> getAllLibrarian() throws SQLException;
    public Librarian getLibrarianById(int id) throws SQLException;
    public void updateLibrarian(Librarian librarian) throws SQLException;
    public boolean deleteLibrarian(int id) throws SQLException;

}
