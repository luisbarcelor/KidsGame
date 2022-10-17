package org.game;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.game.controllers.GameController;
import org.game.items.MainCharacter;

import java.io.IOException;

public class Game extends Application {
    private static Scene scene;
    public static GameController controller;
    public static Canvas canvas;
    public static GraphicsContext gc;


    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(getParent("game_view"), 720, 420);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();

        canvas = controller.canvas;
        gc = canvas.getGraphicsContext2D();
    }

    public static void drawCanvas() {
        setCanvasBounds();
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
        new MainCharacter(50, 50).drawMainCharacter();
    }

    public static void setCanvasBounds() {
        canvas.setHeight(controller.root.getHeight() - controller.topbar.getMinHeight());
        canvas.setWidth(controller.root.getWidth());
    }






    public static void setParent(String fxml) throws IOException {
        scene.setRoot(getParent(fxml));
    }
    private static Parent getParent(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(Game.class.getResource(fxml + ".fxml"));
        Parent parent = loader.load();
        controller = loader.getController();
        return parent;
    }

    public static void main(String[] args) {
        launch();
    }

}