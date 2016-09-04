package be.pho.manualservlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

	static String PAGE_HEADER = "<html><body>";
	static String PAGE_FOOTER = "</body></html>";

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter writer.getWriter();
		writer.println(PAGE_HEADER);
		writer.println("<h1>HELLO FUCKING JAVA WORLD.</h1>");
		writer.println(PAGE_FOOTER);
		writer.close();
	}
}