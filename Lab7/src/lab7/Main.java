package lab7;
/*
 * https://maxsite.org/page/java-mvc
 * https://maxsite.org/page/java-mvc-observer
 * https://docs.oracle.com/javase/8/javafx/get-started-tutorial/get_start_apps.htm
 * https://o7planning.org/ru/10623/javafx-tutorial-for-beginners#a2746282
 * https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html#introscenegraph
 * //https://metanit.com/java/javafx/1.3.php
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Lab7");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
