package pl.coderslab.Servlety1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@WebServlet("/Servlet16")
public class Servlet16 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String ip = request.getHeader("X-FORWARDED-FOR");
        if (ip == null) {
            ip = request.getRemoteAddr();
        }
        String browser = request.getHeader("User-Agent");
      String time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

      response.getWriter().append("<P><B>Browser: </B>" + browser + "</P>" +
              "<P><B>IP address: </B>" + ip + "</P>" +
              "<P><B>Time: </B>" + time + "</P>");
    }
}
