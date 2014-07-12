package tsuyoigym.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tsuyoigym.JDBC.Cliente;
import tsuyoigym.JDBC.ClienteDAO;
import tsuyoigym.JDBC.ClienteIF;



/**
 * Servlet implementation class ServletPerfil
 */
public class ServletPerfil extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		HttpSession ses = request.getSession();
		
		ClienteIF cl = new ClienteDAO();
		
		//List<Cliente> lc = cl.perfil();
		//ses.setAttribute("listac", lc);
		//System.out.println(lc);
	
		
		RequestDispatcher rd = request.getRequestDispatcher("/Perfil.jsp");
		rd.forward(request, response);
	}



}
