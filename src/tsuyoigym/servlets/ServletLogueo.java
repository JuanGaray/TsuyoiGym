package tsuyoigym.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tsuyoigym.JDBC.ClienteDAO;
import tsuyoigym.JDBC.ClienteIF;
import tsuyoigym.JDBC.UsuarioDAO;
import tsuyoigym.JDBC.UsuarioIF;


public class ServletLogueo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String us = request.getParameter("usuario");
		
		String pa = request.getParameter("password");
		
		HttpSession se = request.getSession();
		
		
		
		UsuarioIF usu = new UsuarioDAO();
		int valor= usu.validar(us, pa);
		int valor1 = usu.obtenusuario(us);
		System.out.println(valor);
		System.out.println(valor1);
		if (valor == 1) {
			
			se.setAttribute("usuario", us);
			
			if( valor1==1){
			RequestDispatcher rd = request.getRequestDispatcher("/MenuAdm.jsp");
			
			rd.forward(request, response);
			}else if(valor1==2){
				RequestDispatcher rd = request.getRequestDispatcher("/MenuP.jsp");
				
				rd.forward(request, response);
			}
			
				
			
		}else{
			se.setAttribute("error", "Usuario o contraseña erronea" );
			
			RequestDispatcher rd = request.getRequestDispatcher("/Principal.jsp");
			
			rd.forward(request, response);
			
		
		
	
		
		
	}

	}
}
