import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BallFX extends Application {
    public void start(Stage s){
        Pane p=new Pane();
        Circle c=new Circle(20);

        TranslateTransition t=new TranslateTransition(Duration.seconds(2),c);
        t.setByX(300);
        t.setAutoReverse(true);
        t.setCycleCount(Animation.INDEFINITE);

        Button start=new Button("Start");
        Button stop=new Button("Stop");

        start.setOnAction(e->t.play());
        stop.setOnAction(e->t.pause());

        VBox v=new VBox(start,stop);

        p.getChildren().addAll(c,v);

        s.setScene(new Scene(p,400,200));
        s.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
