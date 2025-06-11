package lk.jiat.ee.bank.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.bank.ejb.BeanA;

import java.io.IOException;

@WebServlet("/test")
public class Test extends HttpServlet {

    @EJB
    private BeanA beanA;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        beanA.doAction();
    }
}
