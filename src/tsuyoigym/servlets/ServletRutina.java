package tsuyoigym.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import tsuyoigym.JDBC.RutinaDAO;
import tsuyoigym.JDBC.RutinaIF;

/**
 * Servlet implementation class ServletRutina
 */
public class ServletRutina extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cli=request.getParameter("cliente");
		String ins=request.getParameter("instructor");
		String sele=request.getParameter("tipohorario");
		String eje= request.getParameter("tipoejercicio"); 
		HttpSession se = request.getSession();
		System.out.println(sele);
		System.out.println(eje);
		int clie = Integer.parseInt(cli);
		int inst = Integer.parseInt(ins);
		int sel = Integer.parseInt(sele);
		int ejer = Integer.parseInt(eje);
		
		String re[] = request.getParameterValues("repeticiones");
		for(int i = 0; i<re.length; i++ ){
			System.out.println(re[i]);
		}
		String obs[] = request.getParameterValues("observaciones");
		for(int i = 0; i<re.length; i++ ){
			System.out.println(obs[i]);
		}
		
		RutinaIF rutina = new RutinaDAO();
		for(int i=0; i<re.length;i++){
		   int rep=Integer.parseInt(re[i]); 
			
			try{
				rutina.registrarRutina(clie,sel,ejer,rep,obs[i],inst);
			}catch (Exception e) {
				e.printStackTrace();
			 	se.setAttribute("error", "Introdusca valores validos" );
				RequestDispatcher rr = request.getRequestDispatcher("/RegistarRutina.jsp");
				
				rr.forward(request, response); 
		 }

		
	}
se.setAttribute("exito", "Registro Rutina Exitoso" );
		
		RequestDispatcher rr = request.getRequestDispatcher("/RegistarRutina.jsp");
		
		rr.forward(request, response);
	}
}
