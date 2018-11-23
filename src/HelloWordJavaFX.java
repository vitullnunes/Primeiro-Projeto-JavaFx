import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWordJavaFX extends Application{
    public static void main (String[]args){

        launch();
        
   }    
    
    public void start(Stage palco){
             //Personagem
      Label texto = new Label("Ultimo dia de aula");
      //Historia
      StackPane historia = new StackPane();
      historia.getChildren().add(texto);
      //Cena
      Scene cena = new Scene ( historia , 300, 300);
      //colocando a cena do palco
      palco.setScene(cena);
      palco.shows();
     
 }
}
