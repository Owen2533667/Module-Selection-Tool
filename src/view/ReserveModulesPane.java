package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import model.Module;

public class ReserveModulesPane extends HBox {
	
	private TitledPane t1, t2;
	private HBox termOne, termTwo;
	private Button btnReserveAddTermOne, btnReserveRemoveTermOne, btnReserveConfirmTermOne, btnReserveAddTermTwo, btnReserveRemoveTermTwo, btnReserveConfirmTermTwo;
	private ListView<Module> unselectedReserveTermOneModules, reservedTermOneModules, unselectedReserveTermTwoModules, reservedTermTwoModules;
	
	public ReserveModulesPane() {
		this.autosize();
		this.setSpacing(10);
		this.setPadding(new Insets(15, 12, 0, 12));
		this.setAlignment(Pos.TOP_LEFT);
		
		termOne = new HBox();
		VBox left = new VBox();
		left.autosize();
		left.setPadding(new Insets(15, 15, 15, 15));
		Label lblUnselectedTermOneReserveModules = new Label("Unselected Term 1 modules");
		unselectedReserveTermOneModules = new ListView<Module>();
		unselectedReserveTermOneModules.setPrefSize(600, 400);
		
		HBox termOneCreditInfo = new HBox();
		termOneCreditInfo.setPadding(new Insets(10,10,10,10));
		termOneCreditInfo.setAlignment(Pos.CENTER_RIGHT);
		Label lblTermOneCreditInfo = new Label("Reserve 30 credits worth of term 1 modules");
		termOneCreditInfo.getChildren().add(lblTermOneCreditInfo);
		
		left.getChildren().addAll(lblUnselectedTermOneReserveModules, unselectedReserveTermOneModules, termOneCreditInfo);
		
		VBox right = new VBox();
		right.autosize();
		right.setPadding(new Insets(15, 15, 15, 15));
		Label lblReservedTermOneModules = new Label("Reserved Term 1 modules");
		reservedTermOneModules = new ListView<Module>();
		reservedTermOneModules.setPrefSize(600, 400);
		
		HBox termOneButton = new HBox();
		termOneButton.setSpacing(10);
		termOneButton.setPadding(new Insets(10,10,10,10));
		btnReserveAddTermOne = new Button("Add");
		btnReserveRemoveTermOne = new Button("Remove");
		btnReserveConfirmTermOne = new Button("Confirm");
		termOneButton.getChildren().addAll(btnReserveAddTermOne, btnReserveRemoveTermOne, btnReserveConfirmTermOne);
		
		right.getChildren().addAll(lblReservedTermOneModules, reservedTermOneModules, termOneButton);	
		
		termOne.getChildren().addAll(left, right);
		
		//term two
		termTwo = new HBox();
		
		VBox leftTermTwo = new VBox();
		leftTermTwo.autosize();
		leftTermTwo.setPadding(new Insets(15, 15, 15, 15));
		Label lblUnselectedTermTwoReserveModules = new Label("Unselected Term 2 modules");
		unselectedReserveTermTwoModules = new ListView<Module>();
		unselectedReserveTermTwoModules.setPrefSize(600, 400);
		
		HBox termTwoCreditInfo = new HBox();
		termTwoCreditInfo.setPadding(new Insets(10,10,10,10));
		termTwoCreditInfo.setAlignment(Pos.CENTER_RIGHT);
		Label lblTermTwoCreditInfo = new Label("Reserve 30 credits worth of term 2 modules");
		termTwoCreditInfo.getChildren().add(lblTermTwoCreditInfo);
		
		leftTermTwo.getChildren().addAll(lblUnselectedTermTwoReserveModules, unselectedReserveTermTwoModules, termTwoCreditInfo);
		
		VBox rightTermTwo = new VBox();
		rightTermTwo.autosize();
		rightTermTwo.setPadding(new Insets(15, 15, 15, 15));
		Label lblReservedTermTwoModules = new Label("Reserved Term 2 modules");
		reservedTermTwoModules = new ListView<Module>();
		reservedTermTwoModules.setPrefSize(600, 400);
		
		HBox termTwoButton = new HBox();
		termTwoButton.setSpacing(10);
		termTwoButton.setPadding(new Insets(10,10,10,10));
		btnReserveAddTermTwo = new Button("Add");
		btnReserveRemoveTermTwo = new Button("Remove");
		btnReserveConfirmTermTwo = new Button("Confirm");
		termTwoButton.getChildren().addAll(btnReserveAddTermTwo, btnReserveRemoveTermTwo, btnReserveConfirmTermTwo);
		
		rightTermTwo.getChildren().addAll(lblReservedTermTwoModules, reservedTermTwoModules, termTwoButton);	
		
		termTwo.getChildren().addAll(leftTermTwo, rightTermTwo);
		
		
		t1 = new TitledPane("Term 1", termOne);
		t2 = new TitledPane("Term 2", termTwo);
		
		Accordion ac = new Accordion();
		ac.setMaxSize(1000, 620);
		
		ac.getPanes().addAll(t1, t2);
		ac.setExpandedPane(t1);
		
		this.getChildren().addAll(ac);

	}
	
}
