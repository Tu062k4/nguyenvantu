package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String input = request.getParameter("inputString");
        int count = input.length();

        request.setAttribute("inputString", input);
        request.setAttribute("count", count);

        HttpSession session = request.getSession();
        session.setAttribute("inputString", input);

        request.getRequestDispatcher("count.jsp").forward(request, response);
    }
}
