package net.Airlineticket.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginUI extends Application{
		
	Button button;

	public static void main(String[] args) {
		
		launch(args);
	}

	@Override
	public void start(Stage arg0) throws Exception {
		arg0.setTitle("Title of the window");
		button = new Button();
		button.setText("Click me");
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		
		Scene scene = new Scene(layout, 300, 250);
		arg0.setScene(scene);
		arg0.show();
	}
	
	


}
