package web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import org.eclipse.jdt.internal.compiler.ast.TryStatement;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			out.println("<html>");
			out.println("<body>");
			out.println("doGet method not supported in the Servlet");
			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//lee parametros del fromulario
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		System.out.println("your user:" + user);
		System.out.println("your password:"+pass );
		
		try(PrintWriter out = response.getWriter()){
			out.println("<html>");
			out.println("<body>");
			out.println("The User is: "+ user);
			out.println("<br>");
			out.println("The password is: "+ pass);
			out.println("</body>");
			out.println("</html>");
		}
	}

}
