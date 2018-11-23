import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class HelloWordJavaFX extends Application{
    public static void main (String[]args){

        launch();
        
   }   
    
   
    
    public void start(Stage palco){
             //Personagem
        Rectangle ceu = new Rectangle(900,450);
        Rectangle mar = new Rectangle(900,450);
        Circle sol = new Circle(90);
      //Historia
      StackPane historia = new StackPane();
      historia.getChildren().addAll(ceu , sol , mar);
      //Cena
      Scene cena = new Scene ( historia , 300, 300);
      //colocando a cena do palco
      palco.setScene(cena);
      palco.show();
     
 }
}
