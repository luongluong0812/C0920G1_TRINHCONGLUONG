import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/sevlect")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int rate = Integer.parseInt(request.getParameter("rate"));
        int usd = Integer.parseInt(request.getParameter("usd"));
        int vnd = rate * usd;
        request.setAttribute("ket_qua", vnd);
        request.getRequestDispatcher("WEB-INF/res.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}