/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controladores;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.util.Duration;

/**
 *
 * @author Alex Nvdz
 */
public class GiftLabGuiController implements Initializable {
    @FXML
    private VBox vbox1;
    
    @FXML
    private Button btnMo;

    @FXML
    private Button btnPC;

    @FXML
    private Button btnSe;

    @FXML
    private AnchorPane fondo2;
    
    @FXML
    private ImageView menu1;

    @FXML
    private ImageView menu2;
    
    @FXML
    private AnchorPane paneSlide;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        paneSlide.setTranslateX(-200);
        menu1.setVisible(true);
        menu2.setVisible(false);
        
         // Crear un gradiente morado oscuro a negro
        Stop[] stops = new Stop[]{new Stop(0, Color.rgb(86, 38, 106)), new Stop(1, Color.BLACK)};
        LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, javafx.scene.paint.CycleMethod.NO_CYCLE, stops);

        // Crear un BackgroundFill con el gradiente
        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, null, null);

        // Crear un Background con el BackgroundFill
        Background background = new Background(backgroundFill);

        // Establecer el Background en el AnchorPane
        fondo2.setBackground(background);
        vbox1.setBackground(background);
        
        
        btnMo.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow = new DropShadow();
        glow.setColor(Color.rgb(86, 38, 106));
        glow.setWidth(50);
        glow.setHeight(50);
        btnMo.setEffect(glow);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnMo.setStyle(estiloBoton);
        
        
        
        btnPC.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow1 = new DropShadow();
        glow1.setColor(Color.rgb(86, 38, 106));
        glow1.setWidth(50);
        glow1.setHeight(50);
        btnPC.setEffect(glow1);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton1 = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnPC.setStyle(estiloBoton1);
        
        
        
        btnSe.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow2 = new DropShadow();
        glow2.setColor(Color.rgb(86, 38, 106));
        glow2.setWidth(50);
        glow2.setHeight(50);
        btnSe.setEffect(glow2);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton2 = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnSe.setStyle(estiloBoton2);
    }    
    
    @FXML
    public void run1(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(paneSlide);
        
        slide.setToX(0);
        slide.play();
        
        paneSlide.setTranslateX(-200);
        slide.setOnFinished((ActionEvent e) -> {
            menu1.setVisible(false);
            menu2.setVisible(true);
        });
    }

    @FXML
    public void run2(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(paneSlide);
        
        slide.setToX(-200);
        slide.play();
        
        paneSlide.setTranslateX(-0);
        slide.setOnFinished((ActionEvent e) -> {
            menu1.setVisible(true);
            menu2.setVisible(false);
        });
    }
}
