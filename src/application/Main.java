package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public Main() {
		System.out.println("Spy el constructor");
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Soy init");
	}

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("soy start");

		Group root = new Group();
		Scene scene = new Scene(root, Color.ALICEBLUE);
		stage.setTitle("Hello FX");
		stage.setHeight(400);
		stage.setWidth(400);
		stage.setResizable(false);
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("PULSE q PARA SALIR");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		stage.setScene(scene);

		stage.show();

	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		super.stop();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
