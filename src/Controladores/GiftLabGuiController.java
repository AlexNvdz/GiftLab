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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
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
    private AnchorPane zonaCarrito;
    @FXML
    private Button btnCarrito;
    @FXML
    private Spinner<Integer> spiner1;
    @FXML
    private Spinner<Integer> spiner2;
    @FXML
    private Spinner<Integer> spiner3;
    @FXML
    private Spinner<Integer> spiner4;
    @FXML
    private Spinner<Integer> spiner5;
    @FXML
    private Spinner<Integer> spiner6;
    @FXML
    private Button btnHistorial;
    @FXML
    private Button btnTIenda;
    @FXML
    private AnchorPane fondo2;
    @FXML
    private ImageView menu1;
    @FXML
    private ImageView logo;
    @FXML
    private ImageView menu2;
    @FXML
    private AnchorPane paneSlide;
    @FXML
    private VBox vbox1;
    @FXML
    private AnchorPane zonaMenu;
    @FXML
    private AnchorPane zonaTienda;
    @FXML
    private ImageView menulogo;
    @FXML
    private SpinnerValueFactory<Integer> spinner;
    
    
    @FXML
    private TableColumn<?, ?> tablaCarrito;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        logo.setVisible(true);
        zonaTienda.setVisible(false);
        zonaCarrito.setVisible(false);
        zonaMenu.setTranslateX(-90);
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

        btnTIenda.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow = new DropShadow();
        glow.setColor(Color.rgb(86, 38, 106));
        glow.setWidth(50);
        glow.setHeight(50);
        btnTIenda.setEffect(glow);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnTIenda.setStyle(estiloBoton);

        btnCarrito.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow1 = new DropShadow();
        glow1.setColor(Color.rgb(86, 38, 106));
        glow1.setWidth(50);
        glow1.setHeight(50);
        btnCarrito.setEffect(glow1);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton1 = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnCarrito.setStyle(estiloBoton1);

        btnHistorial.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow2 = new DropShadow();
        glow2.setColor(Color.rgb(86, 38, 106));
        glow2.setWidth(50);
        glow2.setHeight(50);
        btnHistorial.setEffect(glow2);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton2 = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnHistorial.setStyle(estiloBoton2);
        
        spinner = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spiner1.setValueFactory(spinner);
        spiner2.setValueFactory(spinner);
        spiner3.setValueFactory(spinner);
        spiner4.setValueFactory(spinner);
        spiner5.setValueFactory(spinner);
        spiner6.setValueFactory(spinner);
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

        TranslateTransition slide2 = new TranslateTransition();
        slide2.setDuration(Duration.seconds(0.4));
        slide2.setNode(zonaMenu);

        slide2.setToX(0);
        slide2.play();

        zonaMenu.setTranslateX(-90);
    }

    @FXML
    public void run2(MouseEvent event) {
        TranslateTransition slide = new TranslateTransition();
        slide.setDuration(Duration.seconds(0.4));
        slide.setNode(paneSlide);

        slide.setToX(-200);
        slide.play();

        paneSlide.setTranslateX(0);
        slide.setOnFinished((ActionEvent e) -> {
            menu1.setVisible(true);
            menu2.setVisible(false);
        });

        TranslateTransition slide2 = new TranslateTransition();
        slide2.setDuration(Duration.seconds(0.4));
        slide2.setNode(zonaMenu);

        slide2.setToX(-90);
        slide2.play();

        zonaMenu.setTranslateX(0);
    }

    @FXML
    void eventoTienda(MouseEvent event) {
        logo.setVisible(false);
        zonaTienda.setVisible(true);
        zonaCarrito.setVisible(false);
    }

    @FXML
    void eventoMenu(MouseEvent event) {
        logo.setVisible(true);
        zonaTienda.setVisible(false);
        zonaCarrito.setVisible(false);
    }
    
    @FXML
    void eventoCarrito(MouseEvent event) {
        zonaCarrito.setVisible(true);
        zonaTienda.setVisible(false);
        logo.setVisible(false);
    }
    
       @FXML
    void add1(ActionEvent event) {

    }

    @FXML
    void add2(ActionEvent event) {

    }

    @FXML
    void add3(ActionEvent event) {

    }

    @FXML
    void add4(ActionEvent event) {

    }

    @FXML
    void add5(ActionEvent event) {

    }

    @FXML
    void add6(ActionEvent event) {

    }
}
