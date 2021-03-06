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
	public ObjectProperty<CargoEnum> getCargo() {
		return cargo;
	}
	public void setCargo(ObjectProperty<CargoEnum> cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
