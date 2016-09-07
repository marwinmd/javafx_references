package controls;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.ComboBoxListCell;
import javafx.scene.layout.VBox;

public class MarwsCellFactoryElementInPane extends VBox {

	VBox box;

	public static void main(String[] args) {

	}

	public VBox getVBox() {
		initVBox();
		return box;
	}

	private void initVBox() {
		box = new VBox();

		ObservableList<String> data = FXCollections.observableArrayList();

		for (int i = 0; i < 18; i++) {
			data.add("Undefined");
		}

		ListView<String> list = new ListView<String>();
		list.setItems(data);
		list.setEditable(true);
		// list.setPrefHeight(100);

		ObservableList<String> selections = FXCollections.observableArrayList("Meer", "Berg", "Plattes Land");
		list.setCellFactory(ComboBoxListCell.forListView(selections));
		box.getChildren().add(list);
	}

}
