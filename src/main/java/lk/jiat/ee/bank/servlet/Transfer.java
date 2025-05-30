package lk.jiat.ee.bank.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.bank.ejb.remote.TransferService;

import java.io.IOException;

@WebServlet("/transfer")
public class Transfer extends HttpServlet {

    @EJB
    private TransferService transferService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String sourceAccountNumber = req.getParameter("sourceAccountNumber");
        String destinationAccountNumber = req.getParameter("destinationAccountNumber");
        String amount = req.getParameter("amount");

        transferService.transferAmount(sourceAccountNumber, destinationAccountNumber, Double.parseDouble(amount));

        resp.sendRedirect("home.jsp");
    }
}
