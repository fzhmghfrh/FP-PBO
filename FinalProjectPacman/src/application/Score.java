package application;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Score {
    public Text score;
    public Text lifes;
    public Text topscore;

    Score(Group root) {
        this.score = new Text(BarObstacle.THICKNESS * 4, BarObstacle.THICKNESS * 26.5, "Score: ");
        this.lifes = new Text(BarObstacle.THICKNESS * 20, BarObstacle.THICKNESS * 26.5,"Lifes: 3");
        this.topscore = new Text(BarObstacle.THICKNESS * 35, BarObstacle.THICKNESS * 26.5,"Top Score: 0");
        
        score.setFill(Color.MAROON);
        score.setFont(Font.font("Arial", 30));
        
        lifes.setFill(Color.MAROON);
        lifes.setFont(Font.font("Arial", 30));
        
        topscore.setFill(Color.MAROON);
        topscore.setFont(Font.font("Arial", 30));

        root.getChildren().add(score);
        root.getChildren().add(lifes);
        root.getChildren().add(topscore);
    }
}
