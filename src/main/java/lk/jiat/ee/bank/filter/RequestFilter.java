package lk.jiat.ee.bank.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebFilter(urlPatterns = {"/home.jsp"})
public class RequestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization logic if needed
        System.out.println("RequestFilter initialized");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        if (request.getSession().getAttribute("user") != null){
            filterChain.doFilter(request, servletResponse);
        }else {
            response.sendRedirect("logIn.jsp");
        }

    }

    @Override
    public void destroy() {
        // Cleanup logic if needed
        System.out.println("RequestFilter destroyed");
    }
}
