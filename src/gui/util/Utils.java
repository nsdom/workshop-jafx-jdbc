package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;
import model.entities.Department;

public class Utils {
	
	public static Stage currentStage(ActionEvent event) {
		return (Stage)((Node)event.getSource()).getScene().getWindow();
	}
	
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);	
		}
		catch (NumberFormatException e) {
			return null;
		}
	}
	
	public Department setSellerDepartmentId(Department id, String name) {
		if (id == null) {
			throw new IllegalStateException("U must enter a valid Id");
		}
			
		
		return null;
		
	}

}
