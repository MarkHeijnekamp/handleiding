//dit staat er omdat ik src/handleiding heb staan en niet meteen in de src
package handleiding;
//import van spullen
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.event.*;

import javax.print.attribute.standard.Media;

public class Main extends Application {
    boolean num = true;
    String yet = "Yeet";
    String del = "Deletus";
    @Override
    public void start(Stage primaryStage) {
      /*
      Code for JavaFX application.
      (Stage, scene, scene graph)
      */
      // tekst variable maken
      Text letters = new Text();
      // tekst font instellen
      letters.setFont(new Font(45));
      //tekst hoogte en breedte instellen
      letters.setX(50);
      letters.setY(50);
      //tekst waarde instellen
letters.setText("hallo jij daar");
//knop aanmaken
Button knop = new Button();
//de text wat er in de knop staat
knop.setText("KNOP");
//hier maak ik nog een knop
Button knop2 = new Button();
knop2.setText("DIT IS KNOP 2");
//een TextField toevoegen
        TextField inputveld1 = new TextField();
        Button knop3 = new Button();
        knop3.setText("I maak de title de input die jij geeft");

        knop3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {





                String value1 = String.valueOf(inputveld1.getText());
                 primaryStage.setTitle(value1);
            }


            });





//een eventhandler toevogen
        knop2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //als num de default waarde heeft doe dan dit
                if (num){
                    knop.setText("DEPRESSED");
                    letters.setText("BEDRUKT");
                    num = false;
                    primaryStage.setTitle(yet);


                }
                //anders doe dit
                else{
                    knop.setText("KNOP");
                    letters.setText("hallo jij daar");
                    num = true;
                    primaryStage.setTitle(del);


                }


        }});
        //eventhandler voor knop
        knop.setOnAction(new EventHandler<ActionEvent>() {


            @Override
            public void handle(ActionEvent event) {

if (num){
    knop.setText("DEPRESSED");
    letters.setText("BEDRUKT");
num = false;


}
else{
    knop.setText("KNOP");
    letters.setText("hallo jij daar");
    num = true;

}
            }});






            // een groep maken waar alles instaat wat laat zien wordt
        Group groep = new Group();
    // een lijst aanmaken in de groep
        // in een lijst zet je de dingen die laten zien wordt je kan geen dingen dubbel toevogen
        ObservableList list = groep.getChildren();
        list.add(knop);
        list.add(letters);
        list.add(knop2);
        list.add(inputveld1);
        list.add(knop3);

        //dat houdt hier op
        // een window maken
        Scene scene = new Scene(groep, 600, 300);
        // de title van de window
        knop3.setLayoutY(200);
        knop.setLayoutX(300);
        knop.setLayoutY(150);
        letters.setLayoutX(150);
        letters.setLayoutY(50);
        primaryStage.setTitle("IK BEN EEN PROGRAMMA");
        //declaratie dat primaryStage een scene heeft die in dit geval scene wordt genoemt
        primaryStage.setScene(scene);
        //zegt die de primaryStage moet laten zien
        primaryStage.show();


    }
    public static void main(String args[]){
        //de applicatie openen
        launch(args);
    }
}