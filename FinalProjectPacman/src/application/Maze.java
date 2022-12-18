package application;

import javafx.scene.Group;

import java.util.HashSet;
import java.util.Set;

public class Maze {

    public Set<BarObstacle> obstacles;

    Maze() {
        obstacles = new HashSet<>();
    }

    /**
     * Checks if point is touching obstacles
     * @param x
     * @param y
     * @return
     */
    public Boolean isTouching(double x, double y, double padding) {
        for (BarObstacle barObstacle:obstacles) {
            if (
                    x >= barObstacle.getX() - padding &&
                            x <= barObstacle.getX() + padding + barObstacle.getWidth() &&
                            y >= barObstacle.getY() - padding &&
                            y <= barObstacle.getY() + padding + barObstacle.getHeight())
            {
                return true;
            }
        }
        return false;
    }

}
