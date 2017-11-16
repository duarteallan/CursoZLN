package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.login.dao.LoginDao;
import br.com.login.model.Login;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = request.getParameter("txtUsuario");
		String senha = request.getParameter("txtSenha");
		
		
		LoginDao daologin = new LoginDao();
		
		List<Login> lista = (List<Login>) daologin.select();
		
		boolean autenticado = false;
		
		for (Login item : lista) {
			if (item.getUsuario().equals(usuario) && item.getSenha().equals(senha)) {
				autenticado = true;
				break;
			}
		}

		RequestDispatcher dispatcher = null;
		if (autenticado)
			dispatcher = request.getRequestDispatcher("/index.jsp");
		else {
			dispatcher = request.getRequestDispatcher("/login.jsp");
			request.setAttribute("erroLogin", "Usuario ou senha informados incorretamente.");
		}
		
		dispatcher.forward(request, response);

	}

	
	private String getParameter(HttpServlet request, String parametro) {
		if(request != null && parametro != null && !parametro.equals(""))
			return request.getInitParameter(parametro);
		
		
		return "";
	}

}
