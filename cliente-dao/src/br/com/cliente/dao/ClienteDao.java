package br.com.cliente.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.model.Cliente;

public class ClienteDao {

	private List<Cliente> clientes;
	
	public ClienteDao() {
		
		initMock();
	
	}
	
	private void initMock() {
		
	clientes = new ArrayList<Cliente>();
	clientes.add(new Cliente(1, "Allan", "Duarte", 25, "988888888"));
		
	}
	
	public List<Cliente> obterTodosClientes(){
		return this.clientes;
		
	}
}
