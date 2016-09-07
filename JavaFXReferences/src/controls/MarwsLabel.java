package controls;

import java.util.List;
import java.util.Random;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public class MarwsLabel extends Pane {
	Pane pane;

	public static void main(String[] args) {

	}

	public Pane init() {
		pane = new Pane();
		Label firstLabel = new Label("Hallo Welt als neues Label");
		/**
		 * Der erste Parameter muss ein String sein.
		 */
		Label myLabel = new Label("Hallo Welt", firstLabel);
		pane.getChildren().add(myLabel);
		return pane;
	}

	public Pane initWithIcon() {
		pane = new Pane();
		// image ist an sich noch keine Node, aufpassen auf rictigen Pfad
		Image image = new Image(getClass().getResourceAsStream("/controls/iMac-icon.png"));
		ImageView imageView = new ImageView(image);

		// Anpassung der Abmessungen
		imageView.setFitHeight(40);
		imageView.setFitWidth(40);

		Label myLabel = new Label("Hallo Welt", imageView);
		pane.getChildren().add(myLabel);
		return pane;
	}

	public Pane initWithRandomFont() {
		pane = new Pane();
		Random rand = new Random();
		Label myLabel = new Label("Hallo Welt in einem anderen Font");

		List<String> fonts = getAllAvailableFonts();

		int n = rand.nextInt(fonts.size());
		for (String font : fonts) {
			System.out.println(font);
		}

		myLabel.setFont(new Font(fonts.get(n), 20));
		pane.getChildren().add(myLabel);
		return pane;

	}

	public Pane initWithRotationgLabel(int degree) {
		pane = new Pane();
		Label myLabel = new Label("Yippie");
		myLabel.setOnMouseExited(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				myLabel.setRotate(degree);
			}
		});

		myLabel.setOnMouseEntered(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				myLabel.setRotate(0);
			}
		});
		pane.getChildren().add(myLabel);
		return pane;
	}

	// funktioniert nicht???
	public Pane initWithVeryLongText() {
		pane = new Pane();
		Label myLabel = new Label(
				"ölaskidföl kakjsdfohijsölaksdfölk jasdfölkjasdölkjaslökdfjaö lksdjflökasjdfö lkajs dflökjasödlkjasöldkfjaölskdjflökasjd flökajsölkdaföilkjansdfölkajsdölfkjaslökdfjaölksdjflök asjdflöasjdlfjaslkdfjalksdjflköasjdklf");
		myLabel.setWrapText(true);
		myLabel.setFont(new Font(30));
		pane.getChildren().add(myLabel);
		return pane;
	}

	private List<String> getAllAvailableFonts() {
		return Font.getFontNames();
	}
}
