package web;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		try(PrintWriter o = response.getWriter()){
			String user = request.getParameter("user");
			String pass = request.getParameter("pass");
			
			String[] tech = request.getParameterValues("tech");
			String gender = request.getParameter("gender");
			String occupation = request.getParameter("occupation");
			
			String [] music = request.getParameterValues("music");
			String comments = request.getParameter("comments");
			
			o.println("<html>");
			o.println("<head>");
			o.println("<title> Resultado Servlet</title>");
			o.println("</head>");
			o.println("<body>");
			o.println("<h1> Parametros procesados por el Servlet:</h1>");
			o.println("<table border='1'>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Usuario");
			o.println("</td>");
			o.println("<td>");
			o.println(user);
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Password");
			o.println("</td>");
			o.println("<td>");
			o.println(pass);
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Tecnologías");
			o.println("</td>");
			o.println("<td>");
			for(String techno : tech) {
				o.println(techno);
				o.println("/");
			}
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Genero");
			o.println("</td>");
			o.println("<td>");
			o.println(gender);
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Ocupación");
			o.println("</td>");
			o.println("<td>");
			o.println(occupation);
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Música Favorita");
			o.println("</td>");
			o.println("<td>");
			if(music != null) {
				for(String m : music) {
					o.println(m);
					o.println("/");
				}
			}
			o.println("</td>");
			o.println("</tr>");
			
			o.println("<tr>");
			o.println("<td>");
			o.println("Comentarios");
			o.println("</td>");
			o.println("<td>");
			o.println(comments);
			o.println("</td>");
			o.println("</tr>");
			
			o.println("</table>");
			
			o.println("</body>");
			o.println("</html>");
		}
	}

}
