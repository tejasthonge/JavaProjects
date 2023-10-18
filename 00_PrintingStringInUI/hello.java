import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class hello extends Application{

    @Override
    public void start(Stage primaryStage){
        Button c2w_btn=new Button();
        c2w_btn.setText("Say Hello Core2Web");
        c2w_btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle (ActionEvent event){
                System.out.println("Hello core2web");

            }
        });

        StackPane c2w_root=new StackPane();
        c2w_root.getChildren().add(c2w_btn);
        Scene c2w_Scene=new Scene(c2w_root,300,250); 
    
        primaryStage.setTitle("Hello Core2Web!");
        primaryStage.setScene(c2w_Scene);
        primaryStage.show();
    
    }

    public static void main(String[] args) {
        launch(args);
    }

   }