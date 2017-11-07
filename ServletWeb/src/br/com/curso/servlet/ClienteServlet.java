package br.com.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClienteServlet
 */
public class ClienteServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String filtro = request.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);
				
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write("<ul>");
		
		for (String item : resultado) {
			writer.write("<li>"+ item + "</li>" );
		}
		writer.write("</ul>");
		writer.write("</body></html>");
	}
	
	private List<String> filtrarClientes(String filtro){
		List<String> clientes = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();
		
		clientes.add("Alan Um");
		clientes.add("Alan Dois");
		clientes.add("Catia");
		clientes.add("Ismael Um");
		clientes.add("Jandeilson");
		
		if(filtro != null && !filtro.equals("")) {
			for(String cliente : clientes) {
				if(cliente.toUpperCase().contains(filtro.toUpperCase()))
					listaFiltrada.add(cliente);
			}
		} else {
			listaFiltrada = clientes;
		}
		
		return listaFiltrada;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}

}
