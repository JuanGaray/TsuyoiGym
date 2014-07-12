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

public class ServletRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession se = request.getSession();
		
		String tu = request.getParameter("tipousuario");
		String us = request.getParameter("usuario");
		String co = request.getParameter("correo");
		String con = request.getParameter("password");
		String dn = request.getParameter("dni");
		String nom= request.getParameter("nombres");
		String ape= request.getParameter("apellidos");
		String dis= request.getParameter("distrito");
		String dir= request.getParameter("direccion");
		String pe= request.getParameter("peso");
		String al= request.getParameter("altura");
		String ed = request.getParameter("edad");
		int tusuario = Integer.parseInt(tu);
		int dni = Integer.parseInt(dn);
		float peso = Float.parseFloat(pe);
		float altura = Float.parseFloat(al);
		int edad = Integer.parseInt(ed);
		UsuarioIF usu = new UsuarioDAO();
		usu.insertarusuario(dni,tusuario, us, con);
		ClienteIF cl = new ClienteDAO();
		
		
		cl.registrarCliente(dni,co, dni, nom, ape, dis, dir, peso, altura,edad);

		
		

		RequestDispatcher rd = request.getRequestDispatcher("/Registro.jsp");
		rd.forward(request, response);
	}

}


