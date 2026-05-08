package edu.fatec.poo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UIListaTarefas extends Application {

    public static final double WHIDITH = 720;
    public static final double HEIGTH = 420;
    public static final double SPACING = 10;
    public static final Insets INSETS = new Insets(10);

    private CListaTarefas control = new CListaTarefas();

    private BorderPane borderPane = new BorderPane();

    private GridPane paneTop = new GridPane();

    private Label lblNova = new Label("Digite uma nova Tarefa...");
    private Label lblDesc = new Label("Descrição (opicional)");

    private TextField txtNova = new TextField();
    private TextField txtDesc = new TextField();

    private Button btnAdicionar = new Button("Adicionar");

    private ScrollPane paneCenter = new ScrollPane();
    private VBox paneTarefas = new VBox();

    private HBox paneBottom = new HBox();

    private Label lblTotal = new Label("Total");
    private Label lblPendente = new Label("Pendente");
    private Label lblConcluida = new Label("Concluída");

    @Override
    public void start(Stage stage) throws Exception {
        paneCenter.setContent(paneTarefas);
        paneCenter.setFitToWidth(true);
        paneCenter.setPadding(INSETS);

        borderPane.setTop(paneTop);
        borderPane.setCenter(paneCenter);
        borderPane.setBottom(paneBottom);

        paneTop.setPadding(INSETS);
        paneTop.setVgap(SPACING);
        paneTop.setHgap(SPACING);
        paneTop.setAlignment(Pos.CENTER);

        paneTop.add(lblNova, 0, 0);
        paneTop.add(txtNova, 1, 0);
        paneTop.add(btnAdicionar, 2, 0);
        paneTop.add(lblDesc, 0, 1);
        paneTop.add(txtDesc, 1, 1);

        btnAdicionar.addEventHandler(MouseEvent.MOUSE_CLICKED, (event -> {
            System.out.println("ADICIONAR");
            paneTarefas.getChildren().add(new UITarefa(
                    new Tarefa("pau", "pedra", false),
                    SPACING, INSETS
            ));
            stage.show();
            // TODO
            //paneBottom.getChildren().add(control.criarTarefa());
        }));

        paneBottom.setSpacing(SPACING);
        paneBottom.setPadding(INSETS);
        paneBottom.setAlignment(Pos.CENTER);
        paneBottom.getChildren().addAll(lblTotal, lblPendente, lblConcluida);

        Scene scene = new Scene(borderPane, WHIDITH, HEIGTH);
        stage.setScene(scene);
        stage.show();
    }

}
