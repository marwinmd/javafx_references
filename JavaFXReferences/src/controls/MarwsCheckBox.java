package controls;

/*
 * Tipp: Events nicht unbedingt an das Changedproperty binden, da der User es nicht gewohnt ist, dass sich die Checkbox ver�ndert sobald er diese anlickt.
 * Besser am Ende mit einem Button das Event triggern.
 *
 * **/
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

public class MarwsCheckBox extends VBox {

	VBox vBox = new VBox();

	public VBox initCheckBox() {
		CheckBox checkBox = new CheckBox("Unsere Box");
		// BooleanProperty checkBoxState = Bindings.createBooleanBinding(func,
		// dependencies)checkBox.selectedProperty();

		vBox.getChildren().add(checkBox);
		return vBox;
	}
}
