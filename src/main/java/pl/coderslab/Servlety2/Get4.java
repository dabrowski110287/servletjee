package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get4")
public class Get4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        String page = request.getParameter("page");
        response.getWriter().append("page = " + page);

        int pageNumber = Integer.parseInt(page);

        for (int i = 1; i < pageNumber ; i++) {
            if (pageNumber % i == 0) {
                response.getWriter().append("<P>" + i);
            }
        }
    }
}
