package br.com.login.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.cliente.dao.iDefaultDao;
import br.com.login.model.Login;

public class LoginDao  implements iDefaultDao{

	private List<Login> mockUsuarios;
	
	public LoginDao() {
		mockUsuarios = new ArrayList<Login>();
		mockUsuarios.add(new Login("Allan","123456"));
		mockUsuarios.add(new Login("Ismael", "123"));
	}
	
	@Override
	public void insert() {
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public List<?> select() {

		return this.mockUsuarios;
	}

	@Override
	public boolean delete() {

		return false;
	}

}
