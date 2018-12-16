package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get5")
public class Get5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        String company = request.getParameter("company");
        response.getWriter().append("company: <br>&nbsp-&nbsp" + company + "<br>learn: <br>");

        String[] lang = request.getParameterValues("learn");
        for (int i = 0; i < lang.length ; i++) {
            response.getWriter().append("&nbsp-&nbsp" + lang[i] + "<br>");
        }

    }
}
