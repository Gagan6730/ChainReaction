import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainPage extends Application {

    public Scene scene1;
    public static Stage window;
    public static void main(String[] args)
    {
        initColours();
        launch(args);
    }
    public static Color[] colours=new Color[8];

    public static Color[] getColours() {

        print();
        return colours;
    }
    public static void print()
    {
        for(int i=0;i<8;i++)
        {
            System.out.println(colours[i]);
        }
    }
    public static void initColours()
    {
        MainPage.colours[0]=Color.web("#42f4d7");
        MainPage.colours[1]=Color.web("#FA8072");
        MainPage.colours[2]=Color.web("#f44168");
        MainPage.colours[3]=Color.web("#c7f441");
        MainPage.colours[4]=Color.web("#b541f4");
        MainPage.colours[5]=Color.web("#40E0D0");
        MainPage.colours[6]=Color.web("#f5f900");
        MainPage.colours[7]=Color.web("#000");
    }

    @Override
    public void start(Stage primaryStage) throws IOException {


        window=primaryStage;
        window.setTitle("Chain Reaction");//set the title as "CHAIN_REACTION"
        //loading the fxml file from scene builder
        AnchorPane pane=FXMLLoader.load(getClass().getResource("fxml_files/sample_main.fxml"));
        String image= GamePage.class.getResource("images/gamepage.png").toExternalForm();
        pane.setStyle("-fx-background-image: url('"+ image +"')");
        scene1=new Scene(pane);
        window.setScene(scene1);
        // Display the stage
        window.show();
    }
}
