package Namaste;

import javax.script.ScriptContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/namsateworld")
public class NamasteWorldServlet extends HttpServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

        PrintWriter printWriter =response.getWriter();
       printWriter.write("Namaste World");
       printWriter.close();
    }
}
