/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.paint.Color;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Alex Nvdz
 */
public class LoginController implements Initializable {

    StackUsuario pilaU = new StackUsuario();

    private Stage stage;

    // Este método se llama para establecer la instancia de Stage
    public void setPrimaryStage(Stage primaryStage) {
        stage = primaryStage;
    }

    private ObservableList<Persona> ListaUsuarios;
    @FXML
    private AnchorPane Fondo;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegister;

    @FXML
    private ToggleButton btnVer;

    @FXML
    private PasswordField txtContraseña;

    @FXML
    private TextField txtUsuario;

    @FXML
    private void llamarGUI() throws IOException {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/giftlab/GiftLabGui.fxml"));
        Parent root = loader.load();
        GiftLabGuiController controller = loader.getController();

        Scene scene = new Scene(root);
        Stage Stage2 = new Stage();
        Stage2.setTitle("Tienda GiftLab");
        Stage2.setResizable(false);
        Stage2.setScene(scene);
        Stage2.show();
        Stage2.centerOnScreen();
        this.stage.close();
    }

    private void ImagenBotones() {
        URL linkVer = getClass().getResource("/Img/Eye.png");
        Image imagenVer = new Image(linkVer.toString(), 16, 16, false, true);
        btnVer.setGraphic(new ImageView(imagenVer));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        ListaUsuarios = FXCollections.observableArrayList();
        // FONDO Y TEXTFIELDS

        // Crear un gradiente morado oscuro a negro
        Stop[] stops = new Stop[]{new Stop(0, Color.rgb(86, 38, 106)), new Stop(1, Color.BLACK)};
        LinearGradient linearGradient = new LinearGradient(0, 0, 1, 0, true, javafx.scene.paint.CycleMethod.NO_CYCLE, stops);

        // Crear un BackgroundFill con el gradiente
        BackgroundFill backgroundFill = new BackgroundFill(linearGradient, null, null);

        // Crear un Background con el BackgroundFill
        Background background = new Background(backgroundFill);

        // Establecer el Background en el AnchorPane
        Fondo.setBackground(background);

        // Establecer el color de fondo morado oscuro transparente para el TextField
        BackgroundFill backgroundText1 = new BackgroundFill(Color.rgb(86, 38, 106, 0.7), null, null);
        Background background1 = new Background(backgroundText1);
        txtUsuario.setBackground(background1);

        // Establecer el borde con color morado claro
        BorderStroke borderStroke1 = new BorderStroke(
                Color.rgb(149, 125, 173), BorderStrokeStyle.SOLID,
                null, new javafx.scene.layout.BorderWidths(2)
        );
        Border border1 = new Border(borderStroke1);
        txtUsuario.setBorder(border1);

        txtUsuario.setStyle("-fx-background-radius: 10;");
        // Establecer el color del texto a blanco
        txtUsuario.setStyle("-fx-text-fill: white;");

        BackgroundFill backgroundText2 = new BackgroundFill(Color.rgb(86, 38, 106, 0.7), null, null);
        Background background2 = new Background(backgroundText2);
        txtContraseña.setBackground(background2);

        BorderStroke borderStroke2 = new BorderStroke(
                Color.rgb(149, 125, 173), BorderStrokeStyle.SOLID,
                null, new javafx.scene.layout.BorderWidths(2)
        );
        Border border2 = new Border(borderStroke2);
        txtContraseña.setBorder(border2);

        txtContraseña.setStyle("-fx-text-fill: white;");

        // BOTONES
        ImagenBotones();
        // Establecer el texto del botón a morado
        btnLogin.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow = new DropShadow();
        glow.setColor(Color.rgb(86, 38, 106));
        glow.setWidth(50);
        glow.setHeight(50);
        btnLogin.setEffect(glow);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnLogin.setStyle(estiloBoton);

        btnRegister.setTextFill(Color.rgb(253, 254, 254));

        // Establecer el efecto glow en el texto
        DropShadow glow2 = new DropShadow();
        glow.setColor(Color.rgb(86, 38, 106));
        glow.setWidth(50);
        glow.setHeight(50);
        btnLogin.setEffect(glow2);

        // Establecer el color de fondo morado oscuro transparente para el botón y bordes negros
        String estiloBoton2 = "-fx-background-color: rgba(86, 38, 106, 0.7);"
                + "-fx-border-color: purple;";
        btnRegister.setStyle(estiloBoton2);

        btnVer.setOnAction(event -> {
            if (btnVer.isSelected()) {
                txtContraseña.setPromptText(txtContraseña.getText());
                txtContraseña.setText("");
                txtContraseña.setDisable(true);
            } else if (btnVer.isSelected() == false) {
                txtContraseña.setText(txtContraseña.getPromptText());
                txtContraseña.setPromptText("");
                txtContraseña.setDisable(false);
            }
        });

    }

    @FXML
    void eventoLogin(ActionEvent event) throws IOException {

        if (ListaUsuarios.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado por favor Registrese!!");
            return;
        } else {

            for (Persona persona : ListaUsuarios) {

                if (txtUsuario.getText().equals(persona.getUsuario())) {

                    if (txtUsuario.getText().equals(persona.getUsuario()) && txtContraseña.getText().equals(persona.getContraseña())) {
                        llamarGUI();
                    } else {
                        JOptionPane.showMessageDialog(null, "La Contraseña es incorrecta");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado por favor Registrese!!");
                }

            }
        }

    }

    @FXML
    void eventoRegistrar(ActionEvent event) {
        String ValUsuario = txtUsuario.getText();
        String ValContra = txtContraseña.getText();

        for (Persona persona : ListaUsuarios) {
            if (persona.getUsuario().equals(ValUsuario)) {
                JOptionPane.showMessageDialog(null, "El Usuario se encuentra registrado!!! "
                        + "Intente nuevamente.");
                return;
            }
        }

        if (btnVer.isSelected()) {
            ValContra = txtContraseña.getPromptText();
        }

        Persona persona = new Persona(ValUsuario, ValContra);
        pilaU.setPushPersona(persona);
        ListaUsuarios.add(persona);
        txtContraseña.clear();
        txtContraseña.setPromptText(null);
        txtUsuario.requestFocus();

    }

}
