package br.com.cliente.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.model.Cliente;

public class buscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes = clienteDao.obterTodosClientes();
		
		writer.write("<ul>");
		for(int indice= 0; indice < clientes.size();indice++) {
			
			writer.write("<li>");
			writer.write("Cliente: "+clientes.get(indice));
			writer.write("</li>");
		
		}
		writer.write("</ul>");
		
		writer.write("</body></html>");
	}


}
