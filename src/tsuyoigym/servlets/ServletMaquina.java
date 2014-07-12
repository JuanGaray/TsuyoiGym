package tsuyoigym.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tsuyoigym.JDBC.MaquinaDAO;
import tsuyoigym.JDBC.MaquinaIF;

/**
 * Servlet implementation class ServletMaquina
 */
public class ServletMaquina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clien = request.getParameter("cliente");
		String ma = request.getParameter("idmaquina");
		String ho = request.getParameter("tipohorario");
		HttpSession se = request.getSession();
		System.out.println(ho);
		int c = Integer.parseInt(clien);
		int m = Integer.parseInt(ma);
		int h = Integer.parseInt(ho);
		
		String tipo[] = request.getParameterValues("tipomaquina");
		for (int i=0; i<tipo.length;i++){
			System.out.println(tipo[i]);
		}
		
		String hora[] = request.getParameterValues("hora");
		for (int i=0; i<tipo.length;i++){
			System.out.println(hora[i]);
		}
		
		String tiempo[] = request.getParameterValues("tiempo");
		for (int i=0; i<tipo.length; i++){
			System.out.println(tiempo[i]);
		}
		
		MaquinaIF maquina = new MaquinaDAO();
		for (int i=0; i<tipo.length;i++){
			int hor = Integer.parseInt(hora[i]);
			int tiem = Integer.parseInt(tiempo[i]);
			try{
			maquina.registarMaquina(c, tipo[i], h, hor, tiem, m);
			
			}catch(Exception e){
				e.printStackTrace();
				se.setAttribute("error", "Introdusca valores validos");
				RequestDispatcher rm = request.getRequestDispatcher("/RegistrarMaquina.jsp");
				rm.forward(request, response);
		}
			
		}
		se.setAttribute("exito", "Registro de maquina Exitosa");
		RequestDispatcher rm = request.getRequestDispatcher("/RegistrarMaquina.jsp");
		rm.forward(request, response);
	}

}
