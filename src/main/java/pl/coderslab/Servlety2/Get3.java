package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get3")
public class Get3 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer height = 5;
        Integer width = 10;

        try {
            if (request.getParameter("height") != null && request.getParameter("width") != null) {
                height = Integer.parseInt(request.getParameter("height"));
                width = Integer.parseInt(request.getParameter("width"));
            }

            for (int i = 1; i <= height ; i++) {
                response.getWriter().append("<P>");

                for (int j = 1; j <= width ; j++) {
                    response.getWriter().append(i + " x " + j + " = " + i*j + "&nbsp&nbsp&nbsp");
                }
            }
        }catch (NumberFormatException e) {
            response.getWriter().append("Niepoprawne dane wejsciowe.");
        }
    }
}

