package org.game.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import org.game.Game;

public class GameController {
    @FXML
    public AnchorPane root;
    public AnchorPane topbar;
    public Canvas canvas;

    public void reDraw() {
        Game.drawCanvas();
    }
}
