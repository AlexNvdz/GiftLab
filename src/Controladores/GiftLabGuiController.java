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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

/**
 *
 * @author Alex Nvdz
 */
public class GiftLabGuiController implements Initializable {
    
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
