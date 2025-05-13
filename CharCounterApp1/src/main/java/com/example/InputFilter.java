package com.example;

import java.io.IOException;
import javax.servlet.*;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String input = request.getParameter("inputString");
        if (input == null || input.trim().isEmpty()) {
            request.setAttribute("error", "Chuỗi không được để trống!");
            request.getRequestDispatcher("count.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response);
        }
    }
}
