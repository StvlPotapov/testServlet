import repositories.UserRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {

    UserRepository rep;  //тестовая строка
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doGet(req, resp);

        PrintWriter out = resp.getWriter();
        out.print("<h1>hello world </h1>");
        out.print(rep.findUserByLastName("sdfghj"));  //еще одна тестовая строка
        out.print(req.getPathInfo());
        out.print(req.getMethod());
        out.print(req.getQueryString());


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
