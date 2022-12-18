package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage theStage) throws Exception{

        theStage.setTitle( "Pacman" );

        Group root = new Group();
        Scene theScene = new Scene( root );
        theStage.setScene( theScene );
        
    }


}
