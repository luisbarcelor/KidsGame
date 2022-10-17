module org.game {
    requires javafx.controls;
    requires javafx.fxml;

    exports org.game;
    opens org.game to javafx.fxml;

    exports org.game.controllers;
    opens org.game.controllers to javafx.fxml;

    exports org.game.items;
    opens org.game.items to javafx.fxml;

    exports org.game.helpers;
    opens org.game.helpers to javafx.fxml;
}
