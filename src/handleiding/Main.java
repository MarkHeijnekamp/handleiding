//dit staat er omdat ik src/handleiding heb staan en niet meteen in de src
package handleiding;
//import van spullen
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
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



// een groep maken waar alles instaat wat laat zien wordt
        Group groep = new Group();
    // een lijst aanmaken in de groep
        // in een lijst zet je de dingen die laten zien wordt
        ObservableList list = groep.getChildren();

        list.add(letters);
        //dat houdt hier op
        // een window maken
        Scene scene = new Scene(groep, 600, 300);
        // de title van de window
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