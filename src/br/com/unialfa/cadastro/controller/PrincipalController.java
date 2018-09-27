package br.com.unialfa.cadastro.controller;

import br.com.unialfa.cadastro.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class PrincipalController {
	
	@FXML
	private TableView<Usuario> tblUsuario;

	@FXML
	private Button btnNovo;
	
	@FXML
	private Button btnEditar;
	
	@FXML
	private Button btnSalvar;
	
	private ObservableList<Usuario> usuarios = FXCollections.observableArrayList();
}
