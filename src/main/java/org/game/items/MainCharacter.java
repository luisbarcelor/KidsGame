package org.game.items;

import javafx.scene.image.Image;
import org.game.Game;
import org.game.helpers.CharacterStatus;
import org.game.helpers.Point;

public class MainCharacter {
    private Image body;
    public final Point characterPoint;
    public CharacterStatus status = CharacterStatus.STANDING_STILL;


    public MainCharacter(double x, double y) {
        characterPoint = new Point(x, y);
    }

    public void drawMainCharacter() {
        switch (status) {
            case STANDING_STILL:
                body = new Image(String.valueOf(Game.class.getResource("img/runningSoldier/1.png")));
                break;
            case JUMPING:
                body = new Image(String.valueOf(Game.class.getResource("img/jumpingSoldier/1.png")));
        }
        Game.gc.drawImage(body, characterPoint.x, characterPoint.y);
    }
}
