package br.com.cliente.dao;

import java.util.List;

public interface iDefaultDao {

	public void insert();
	
	public void update();
	
	public List<?> select();
	
	public boolean delete();
	
}
