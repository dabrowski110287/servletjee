package pl.coderslab.Servlety2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/Get2")
public class Get2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        Map<String, String[]> parameters = request.getParameterMap();

        for (String key : parameters.keySet()){

            response.getWriter().append("</P><B>" + key + "</B> = " + Arrays.toString(parameters.get(key)) + "</P>");
        }
    }
}
