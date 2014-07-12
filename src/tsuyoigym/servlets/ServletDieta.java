package tsuyoigym.servlets;

import java.io.IOException;  
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tsuyoigym.JDBC.DietaDAO;
import tsuyoigym.JDBC.DietaIF;

/**
 * Servlet implementation class ServletDieta
 */
public class ServletDieta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cl=request.getParameter("cliente");
		String nu=request.getParameter("nutricionista");
		String sel = request.getParameter("tipohorario");
		HttpSession se = request.getSession();
		System.out.println(sel);
		int cli = Integer.parseInt(cl);
		int nut = Integer.parseInt(nu);
		int sele = Integer.parseInt(sel);
		String ta[] = request.getParameterValues("tipoalimento");
		for(int i = 0; i<ta.length; i++ ){
			System.out.println(ta[i]);
		}
		String ca[] = request.getParameterValues("cantidadalimento");
		for(int i = 0; i<ta.length; i++ ){
			System.out.println(ca[i]);
		}
		String obs[] = request.getParameterValues("observaciones");
		for(int i = 0; i<ta.length; i++ ){
			System.out.println(obs[i]);
		}
		
		DietaIF dieta = new DietaDAO();
		for(int i=0; i<ta.length;i++){
		 float cant=Float.parseFloat(ca[i]);
		 try{
		 //System.out.println("id cli= "+ cli + "_ tipohorario= " + sele + "  tipo aliment= " + ta[i] + "  cantidad alim = " + cant + "  observaciones = " + obs[i] + " __ innudtricionsita= " + nut);
		 dieta.insertardieta(cli, sele, ta[i], cant, obs[i], nut);
		 }catch (Exception e) {
				e.printStackTrace();
			 	se.setAttribute("error", "Introdusca valores validos" );
				RequestDispatcher rd = request.getRequestDispatcher("/RegistrarDieta.jsp");
				
				rd.forward(request, response);
		 }
		}
				
		se.setAttribute("exito", "Registro Dieta Exitoso" );
		
		RequestDispatcher rd = request.getRequestDispatcher("/RegistrarDieta.jsp");
		
		rd.forward(request, response);
	}

}
