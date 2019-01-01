package gui;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Utils;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Department;
import model.entities.Seller;
import model.services.DepartmentService;
import model.services.SellerService;

public class SellerListController {
	
	private SellerService service;
	
	@FXML
	private TableView<Seller> tableViewSeller;

	@FXML
	private TableColumn<Seller, Integer> tableColumnId;

	@FXML
	private TableColumn<Seller, String> tableColumnName;
	
	@FXML
	private TableColumn<Seller, String> tableColumnEmail;
	
	@FXML
	private TableColumn<Seller, Date> tableColumnDate;
	
	@FXML
	private TableColumn<Seller, Double> tableColumnBaseSalary;
	
	@FXML
	private TableColumn<Seller, Integer> tableColumnDepartmentId;

	@FXML
	private Button btNew;
	
	private ObservableList<Seller> obsList;

	@FXML
	public void onBtNewAction(ActionEvent event) {
		System.out.println("onBtNewAction");
		/*Stage parentStage = Utils.currentStage(event);
		Department obj = new Department();
		createDialogForm(obj, "/gui/DepartmentForm.fxml", parentStage);*/
	}

	public void setDepartmentService(SellerService service) {
		this.service = service;
	}

	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
		tableColumnDate.setCellValueFactory(new PropertyValueFactory<>("birth date"));
		tableColumnBaseSalary.setCellValueFactory(new PropertyValueFactory<>("base salary"));
		tableColumnDepartmentId.setCellValueFactory(new PropertyValueFactory<>("department id"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSeller.prefHeightProperty().bind(stage.heightProperty());
	}
}
