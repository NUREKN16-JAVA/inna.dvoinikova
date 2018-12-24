package ua.nure.kn.dvoinikova.usermanagement.web;


import ua.nure.kn.dvoinikova.usermanagement.User;
import ua.nure.kn.dvoinikova.usermanagement.db.DaoFactory;
import ua.nure.kn.dvoinikova.usermanagement.db.DatabaseException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddServlet extends EditServlet {
    public AddServlet() {
    }

    @Override
    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

    @Override
    protected void processUser(User user) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }
}