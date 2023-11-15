/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package Controladores;

import javafx.scene.input.MouseEvent;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Nvdz
 */
public class GiftLabGuiController implements Initializable {
    
    StackProductos pilaProductos = new StackProductos();
    private ObservableList<Productos> ListaCarrito;
    @FXML
    private TableColumn<Productos, String> NombreP;
    @FXML
    private TableColumn<Productos, String> CantidadP;
    @FXML
    private TableColumn<Productos, String> PrecioP;
    
    @FXML
    private AnchorPane zonaHistorial;
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
    private SpinnerValueFactory<Integer> spinner1;
    @FXML
    private SpinnerValueFactory<Integer> spinner2;
    @FXML
    private SpinnerValueFactory<Integer> spinner3;
    @FXML
    private SpinnerValueFactory<Integer> spinner4;
    @FXML
    private SpinnerValueFactory<Integer> spinner5;
    @FXML
    private SpinnerValueFactory<Integer> spinner6;
    
    @FXML
    private TableView<Productos> tablaCarrito;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        NombreP.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        CantidadP.setCellValueFactory(new PropertyValueFactory<>("cantidad"));
        PrecioP.setCellValueFactory(new PropertyValueFactory<>("precio"));

        // Inicializa la lista observable de productos
        ListaCarrito = FXCollections.observableArrayList();

        // Asocia la lista de productos a la tabla
        tablaCarrito.setItems(ListaCarrito);
        // TODO
        logo.setVisible(true);
        zonaHistorial.setVisible(false);
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
        
        spinner1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spinner2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spinner3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spinner4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spinner5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        spinner6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 0);
        
        spiner1.setValueFactory(spinner1);
        spiner2.setValueFactory(spinner2);
        spiner3.setValueFactory(spinner3);
        spiner4.setValueFactory(spinner4);
        spiner5.setValueFactory(spinner5);
        spiner6.setValueFactory(spinner6);
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
        zonaHistorial.setVisible(false);
    }

    @FXML
    void eventoMenu(MouseEvent event) {
        logo.setVisible(true);
        zonaTienda.setVisible(false);
        zonaCarrito.setVisible(false);
        zonaHistorial.setVisible(false);
    }
    
    @FXML
    void eventoCarrito(MouseEvent event) {
        zonaCarrito.setVisible(true);
        zonaTienda.setVisible(false);
        logo.setVisible(false);
        zonaHistorial.setVisible(false);
    }
    
    
    
       @FXML
    void add1(ActionEvent event) {
         int precio = 10;
         LocalDateTime fecha = LocalDateTime.now();
          for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Spotify Card 10$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
         Productos producto = new Productos("Spotify Card 10$ USD", spiner1.getValue(), spiner1.getValue()*precio, fecha);
            pilaProductos.setPushProducto(producto);
            ListaCarrito.add(producto);
    }

    @FXML
    void add2(ActionEvent event) {
        int precio = 10;
        LocalDateTime fecha = LocalDateTime.now();
        for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Netflix Card 10$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
        Productos producto = new Productos("Netflix Card 10$ USD", spiner2.getValue(), spiner2.getValue()*precio, fecha);
        pilaProductos.setPushProducto(producto);
        ListaCarrito.add(producto);
    }

    @FXML
    void add3(ActionEvent event) {
        int precio = 10;
        LocalDateTime fecha = LocalDateTime.now();
        for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Steam Card 10$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
        Productos producto = new Productos("Steam Card 10$ USD", spiner3.getValue(), spiner3.getValue()*precio, fecha);
        pilaProductos.setPushProducto(producto);
        ListaCarrito.add(producto);
    }

    @FXML
    void add4(ActionEvent event) {
        int precio = 10;
        LocalDateTime fecha = LocalDateTime.now();
         for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Crunchyroll Card 10$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
        Productos producto = new Productos("Crunchyroll Card 10$ USD", spiner4.getValue(), spiner4.getValue()*precio, fecha);
        pilaProductos.setPushProducto(producto);
        ListaCarrito.add(producto);
    }

    @FXML
    void add5(ActionEvent event) {
        int precio = 25;
        LocalDateTime fecha = LocalDateTime.now();
        for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Pubg Credit Card 25$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
        Productos producto = new Productos("Pubg Credit Card 25$ USD", spiner5.getValue(), spiner5.getValue()*precio, fecha);
        pilaProductos.setPushProducto(producto);
        ListaCarrito.add(producto);
    }

    @FXML
    void add6(ActionEvent event) {
        int precio = 9;
        LocalDateTime fecha = LocalDateTime.now();
         for (Productos producto : ListaCarrito) {
            if (producto.getNombre().equals("Free Fire Credit Card 9$ USD") ) {
                JOptionPane.showMessageDialog(null, "El Producto ya fue agregado al carrito!! "
                        + "Eliminelo si desea hacer cambios.");
                return;
            }
        }
        Productos producto = new Productos("Free Fire Credit Card 9$ USD", spiner6.getValue(), spiner6.getValue()*precio, fecha);
        pilaProductos.setPushProducto(producto);
        ListaCarrito.add(producto);
    }
    
    @FXML
    void eventoComprar(ActionEvent event) {
        
    }

    @FXML
    void eventoEliminar(ActionEvent event) {

    }

    @FXML
    void eventoHistorial(ActionEvent event) {
        logo.setVisible(false);
        zonaTienda.setVisible(false);
        zonaCarrito.setVisible(false);
        zonaHistorial.setVisible(true);
    }
}
