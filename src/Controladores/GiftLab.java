/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package Controladores;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Alex Nvdz
 */
public class GiftLab extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/giftlab/Login.fxml"));
        Parent root = loader.load();

        // Obtén el controlador de la primera escena
        LoginController controller = loader.getController();

        // Establece la instancia de Stage en el controlador
        controller.setPrimaryStage(stage);
        
        stage.setTitle("GIFTLAB LOGIN");
        stage.setResizable(false);
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
