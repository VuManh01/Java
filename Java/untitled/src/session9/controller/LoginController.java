package session9.controller;

import session9.entity.Users;
import session9.model.LoginDAOImpl;

import java.sql.SQLException;

public class LoginController {
    //Call instance of model
    LoginDAOImpl loginDAO = new LoginDAOImpl();

    public LoginController() throws SQLException {
    }

    public String loginStatementController(Users user) throws SQLException {
        String message = loginDAO.checkLoginStatement(user);
        return message;

    }
    public String loginPreparedStatementController(Users user) throws SQLException{
        return loginDAO.checkLoginPrepareStatement(user);
    }
}
