package br.com.unialfa.cadastro.controller;

import java.awt.event.ActionEvent;

import br.com.unialfa.cadastro.enumerator.CargoEnum;
import br.com.unialfa.cadastro.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class UsuarioController {

		@FXML
		private Pane paneCadastro;
	
		@FXML
		private TableColumn<Usuario, Number> clnId;

		@FXML
		private TableColumn<Usuario, String> lblUsuario;
		
		@FXML
		private TableColumn<Usuario, String> clnEmail;

		@FXML
		private TableColumn<CargoEnum, String> lblCargo;
		
		@FXML
		private TableColumn<Usuario, String> lblSenha;

		@FXML
		private TextField txtId;

		@FXML
		private TextField txtUsuario;

		@FXML
		private TextField txtEmail;
		
		@FXML
		private ComboBox<CargoEnum> cboCargo;
		
		@FXML
		private TextField txtSenha;

		@FXML
		private Button btnSalvar;

		@FXML
		private Button btnLimpar;
		
		private ObservableList<Usuario> usuarios = FXCollections.observableArrayList();
		
		@FXML
		void salvar(ActionEvent event) {
		
			Usuario usuario = new Usuario();
			
			usuarios.add(usuario);
			limpar(paneCadastro);
		}

		@SuppressWarnings("rawtypes")
		private void limpar(Pane pane) {
			ObservableList<Node> nodes = pane.getChildren();
			for (Node node : nodes) {
				if (node instanceof TextField) {
					((TextField) node).setText("");
				}
				if (node instanceof ComboBox) {
					((ComboBox) node).getSelectionModel().select(0);
				}
			}

		}

}
