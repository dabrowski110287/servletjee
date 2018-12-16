package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer start = null;
        Integer end = null;

        try {
            start = Integer.parseInt(request.getParameter("start"));
            end = Integer.parseInt(request.getParameter("end"));

            for (int i = start; i <= end; i++) {
                    response.getWriter().append("" + i + " ");
            }
        } catch (NumberFormatException e) {
                response.getWriter().append("Niepoprawne dane wejsciowe.");
            }
        }
    }

