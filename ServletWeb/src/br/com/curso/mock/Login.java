package br.com.curso.mock;

public class Login {	
	
	private String usuario;
	
	private String senha;
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}	
	
	public boolean autenticar() {		
		boolean autenticado = false;
		if(this.usuario.equals("alduarte")) {
			if(senha.equals("123456")) {
				autenticado = true;
			}
		}		
		return autenticado;		
	}

}
