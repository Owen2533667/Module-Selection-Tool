package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Module;

public class SelectModulePane extends HBox{
	
	private ListView<Module> unselectedTermOneListView, unselectedTermTwoListView,selectedYearLongListView, selectedTermOneListView, selectedTermTwoListView;
	private Button btnReset, btnSubmit, btnTermOneAdd, btnTermOneRemove, btnTermTwoAdd, btnTermTwoRemove;
	private TextArea termOneCredits, termTwoCredit;
	
	public SelectModulePane() {
		this.autosize();
		this.setPadding(new Insets(15, 12, 15, 12));
		this.setSpacing(30);
		//this.setAlignment(Pos.CENTER);
		
		VBox left = new VBox();
		left.autosize();
		left.setSpacing(10);
		//left.setAlignment(Pos.CENTER_LEFT);
		Label lblUnselectedTermOneModules = new Label("Unselected Term 1 Modules:");
		unselectedTermOneListView = new ListView<Module>();
		unselectedTermOneListView.setPrefSize(400, 200);
		Label lblUnselectedTermTwoModules = new Label("Unselected Term 2 Modules:");
		unselectedTermTwoListView = new ListView<Module>();
		unselectedTermTwoListView.setPrefSize(400, 200);
		
		
		HBox termOneButtons = new HBox();
		termOneButtons.autosize();
		termOneButtons.setSpacing(10);
		termOneButtons.setAlignment(Pos.CENTER);
		Label lblTermOneButtons = new Label("Term 1");
		btnTermOneAdd = new Button("Add");
		btnTermOneRemove = new Button("Remove");
		termOneButtons.getChildren().addAll(lblTermOneButtons, btnTermOneAdd, btnTermOneRemove);
		
		HBox termTwoButtons = new HBox();
		termTwoButtons.autosize();
		termTwoButtons.setSpacing(10);
		termTwoButtons.setAlignment(Pos.CENTER);
		Label lblTermTwoButton = new Label("Term 2");
		btnTermTwoAdd = new Button("Add");
		btnTermTwoRemove = new Button("Remove");
		termTwoButtons.getChildren().addAll(lblTermTwoButton, btnTermTwoAdd, btnTermTwoRemove);
		
		HBox credits = new HBox();
		credits.autosize();
		credits.setPadding(new Insets(15,15,15,15));
		credits.setSpacing(10);
		credits.setAlignment(Pos.CENTER_RIGHT);
		Label lblTermOneCredits = new Label("Current term 1 credits: ");
		termOneCredits = new TextArea("60");
		termOneCredits.setPrefSize(10, 2);
		Label lblTermTwoCredits = new Label("Current term 2 credits: ");
		termTwoCredit = new TextArea("60");
		termTwoCredit.setPrefSize(10, 1);
		credits.getChildren().addAll(lblTermOneCredits, termOneCredits, lblTermTwoCredits, termTwoCredit);
		
		
		
		left.getChildren().addAll(lblUnselectedTermOneModules, unselectedTermOneListView, termOneButtons, lblUnselectedTermTwoModules, unselectedTermTwoListView, termTwoButtons, credits);	
		
		VBox right = new VBox();
		right.autosize();
		right.setSpacing(10);
		//right.setAlignment(Pos.CENTER_LEFT);
		Label lblSlectedYearLongModules = new Label("Selected Year Long Modules:");
		selectedYearLongListView = new ListView<Module>();
		selectedYearLongListView.setPrefSize(500, 100);
		selectedYearLongListView.setMaxSize(1000, 200);
		Label lblSlectedTermOneModules = new Label("Selected Term 1 Modules:");
		selectedTermOneListView = new ListView<Module>();
		selectedTermOneListView.setPrefSize(500, 200);
		selectedTermOneListView.setMaxSize(1000, 400);
		Label lblSlectedTermTwoModules = new Label("Selected Term 2 Modules:");
		selectedTermTwoListView = new ListView<Module>();
		selectedTermTwoListView.setPrefSize(500, 200);
		selectedTermTwoListView.setMaxSize(1000, 400);
		
		HBox buttonSubAndReset = new HBox();
		buttonSubAndReset.autosize();
		buttonSubAndReset.setPadding(new Insets(15,15,15,15));
		buttonSubAndReset.setSpacing(10);
		buttonSubAndReset.setAlignment(Pos.CENTER_LEFT);
		btnReset = new Button("Reset");
		btnSubmit = new Button("Submit");
		buttonSubAndReset.getChildren().addAll(btnReset, btnSubmit);
		
		right.getChildren().addAll(lblSlectedYearLongModules, selectedYearLongListView, lblSlectedTermOneModules, selectedTermOneListView, lblSlectedTermTwoModules, selectedTermTwoListView, buttonSubAndReset);
		
		this.getChildren().addAll(left,right);
	}
	
	//method to allow the controller to add modules to the list views
	public void addUnselectedTermOneModulesToListView(Module[] module) {
		unselectedTermOneListView.getItems().addAll(module);
		unselectedTermOneListView.getSelectionModel().select(0);
	}
	
	//method to attach the event handler to buttons
	public void addTermOneAddHandler(EventHandler<ActionEvent> handler) {
			btnTermOneAdd.setOnAction(handler);
	}
		
	public void addTermTwoAddHandler(EventHandler<ActionEvent> handler) {
			btnTermTwoAdd.setOnAction(handler);
	}
		
	public void addTermOneRemoveHandler(EventHandler<ActionEvent> handler) {
			btnTermOneRemove.setOnAction(handler);
	}
		
	public void addTermTwoRemoveHandler(EventHandler<ActionEvent> handler) {
			btnTermTwoRemove.setOnAction(handler);
	}
	
	public void addSubmitHandler(EventHandler<ActionEvent> handler) {
			btnSubmit.setOnAction(handler);
	}
		
	public void addResetHandler(EventHandler<ActionEvent> handler) {
			btnReset.setOnAction(handler);
	}
}
