package controls;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MarwsButton extends VBox {
	VBox vBox;

	public VBox initButton() {
		vBox = new VBox();
		Button myButton = new Button("Click me");
		Label myLabel = new Label("Hallo Welt!");

		vBox.getChildren().add(myLabel);
		vBox.getChildren().add(myButton);

		myButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				myLabel.setText("button was clicked!");
			}
		});

		myLabel.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				System.out.println("id value is: " + arg0 + " .");
				System.out.println("old value was: " + arg1 + " .");
				System.out.println("new value is: " + arg2 + " .");
			}
		});

		return vBox;

	}

}
