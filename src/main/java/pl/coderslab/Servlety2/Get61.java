package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get61")
public class Get61 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        for (int i = 1980; i <= 2010 ; i++) {
            response.getWriter().append("<br><a href=\"/Get62?year=" + i +"\">Link do roku " + i + "</a>");
        }
    }
}
