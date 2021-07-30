import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response){
        response.setHeader("content-type","text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try {
            String message = "<h1>Hello Servlet!</h1>";
            response.getWriter().println(message);
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
