package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
		
		Text text = new Text();
		text.setText("SOY UN NODO HIJO");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Arial", 30));
		text.setFill(Color.BLACK);
		root.getChildren().add(text);
		
		Button boton = new Button();
		boton.setText("PRESS");
		root.getChildren().add(boton);
		
//		stage.setFullScreen(true);
//		stage.setFullScreenExitHint("PULSE q PARA SALIR");
//		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
				
		
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
