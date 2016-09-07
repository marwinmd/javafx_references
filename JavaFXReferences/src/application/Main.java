package application;

import controls.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.web.HTMLEditor;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {

			VBox root = new VBox();

			MarwsLabel myLabel = new MarwsLabel();
			MarwsButton myButton = new MarwsButton();
			MarwsCheckBox myCheckbox = new MarwsCheckBox();
			ToggleButton myToggleButton = new MarwsToggleButton();
			RadioButton myRadioButton = new MarwsRadioButton();
			ChoiceBox<String> myChoiceBox = new MarwsChoiceBox<String>();
			Tooltip myTooltip = new MarwsTooltip();
			TextField myTextfield = new MarwsTextfield();
			PasswordField myPasswordfield = new MarwsPasswordField();
			TextArea myTextarea = new MarwsTextarea();
			ScrollBar myScrollBar = new MarwsScrollBar();
			ScrollPane myScrollPane = new MarwsScrollPane();
			Slider mySlider = new MarwsSlider();
			ComboBox<String> myComboBox = new MarwsComboBox<String>();
			ProgressBar myProgressBar = new MarwsProgressBar();
			ProgressIndicator myProgressIndicator = new MarwsProgressIndicator();
			Hyperlink myHyperlink = new MarwsHyperlink();
			Separator mySeperator = new MarwsSeperator();
			TitledPane myTitledPane = new MarwsTitledPane();
			Accordion myAccordion = new MarwsAccordion();
			Menu myMenue = new MarwsMenue();
			ListView<String> myListView = new MarwsListView<String>();
			MarwsCellFactoryElementInPane myCellFactory = new MarwsCellFactoryElementInPane();

			TableView<String> myTableView = new MarwsTableView<String>();
			TreeView<String> myTreeView = new MarwsTreeView<String>();
			ButtonBar myButtonBar = new MarwsButtonBar();
			TabPane myTabPane = new MarwsTabPane();
			SplitPane mySplitPane = new MarwsSplitPane();
			Spinner<String> mySpinner = new MarwsSpinner<String>();
			ToolBar myToolBar = new MarwsToolBar();
			Pagination myPagination = new MarwsPagination();
			HTMLEditor myHTMLEditor = new MarwsHTMLEditor();
			ColorPicker myColorPicker = new MarwsColorPicker();

			// final
			FileChooser myFileChooser = new FileChooser();

			/**
			 * Aufruf der einzelnen Elemente
			 */

			// labelHandling(root, myLabel);
			// root.getChildren().add(myButton.initButton());
			root.getChildren().add(myCheckbox.initCheckBox());

			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void labelHandling(VBox root, MarwsLabel myLabel) {
		// root.getChildren().add(myCellFactory.getVBox());
		// root.getChildren().add((myLabel.initWithIcon()));
		// root.getChildren().add((myLabel.initWithRandomFont()));
		// root.getChildren().add((myLabel.initWithRotationgLabel(180)));
		// root.getChildren().add(myLabel.initWithVeryLongText());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
