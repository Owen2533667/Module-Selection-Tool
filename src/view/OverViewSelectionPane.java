package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class OverViewSelectionPane extends VBox {
	
	private TextArea txtAreaStudentProfile, txtAreaSlectedModules, txtAreaReservedModules;
	private Button btnSaveOverView;
	
	public OverViewSelectionPane() {
		this.autosize();
		this.setPadding(new Insets(15,15,15,15));
		
		txtAreaStudentProfile = new TextArea();
		
		HBox modulesTextAreas = new HBox();
		modulesTextAreas.setPadding(new Insets(15,0,15,0));
		modulesTextAreas.setSpacing(40);
		modulesTextAreas.setPrefSize(500, 500);
		txtAreaSlectedModules = new TextArea();
		txtAreaReservedModules = new TextArea();
		modulesTextAreas.getChildren().addAll(txtAreaSlectedModules, txtAreaReservedModules);
		
		HBox SaveOverView = new HBox();
		SaveOverView.setAlignment(Pos.CENTER);
		SaveOverView.setPadding(new Insets(10,10,10,10));
		btnSaveOverView = new Button("Save Overview");
		SaveOverView.getChildren().add(btnSaveOverView);
		
		this.getChildren().addAll(txtAreaStudentProfile, modulesTextAreas, SaveOverView);
	}
}
