package br.com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.mock.Login;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>Fiz um Get</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuário = (String) request.getParameter("Usuário");
		String senha = (String) request.getParameter("Senha");
		
		Login login = new Login();
				
		if(usuário = login.getUsuario()) {
			if(senha = login.getSenha()) {
				
				PrintWriter writer = response.getWriter();
				writer.write("<html><body>Fiz um Post</body></html>");				
			}
		}
		
			
//			login.setUsuario("jbnascimento");
//			login.setSenha("123456");		
//			System.out.println(login.autenticar() ? "Autenticado" : "Nao autenticado");		

		
		
	}

}
