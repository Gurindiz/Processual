package br.com.unialfa.cadastro.controller;

import br.com.unialfa.cadastro.enumerator.CargoEnum;
import br.com.unialfa.cadastro.model.Usuario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class UsuarioController {

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

}
