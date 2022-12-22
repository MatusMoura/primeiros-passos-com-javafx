package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartament;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void menuItemSellerAction() {
		System.out.println("menuItemSellerAction");
	}
	@FXML
	public void menuItemDepartamentAction() {
		System.out.println("menuItemDepartamentAction");
	}
	@FXML
	public void menuItemAboutAction() {
		System.out.println("menuItemAboutAction");
	}
	@Override
	public void initialize(URL ari, ResourceBundle rb) {
		
		
	}

}
