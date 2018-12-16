package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet("/Get62")
public class Get62 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String year = request.getParameter("year");
        Random rand = new Random();

        for (int i = 0; i < 5; i++) {
            int mix = rand.nextInt(10);
            response.getWriter().append("<br><a href=\"/Get63?year=" + year +"&mix=" + mix + "\">Rok " + year + ", mix " + mix + "</a>");
        }
    }
}
