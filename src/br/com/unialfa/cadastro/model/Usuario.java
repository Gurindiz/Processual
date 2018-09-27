package br.com.unialfa.cadastro.model;

import br.com.unialfa.cadastro.enumerator.CargoEnum;
import javafx.beans.property.ObjectProperty;

public class Usuario {
	
	public int id;
	public String usuario;
	public String email;
	private ObjectProperty<CargoEnum> cargo;
	public String senha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
