package session9.model;

import session9.entity.Users;

import java.sql.SQLException;

public interface LoginDAO {
    public String checkLoginStatement(Users user) throws SQLException;
    public String checkLoginPrepareStatement(Users user) throws SQLException;
}
