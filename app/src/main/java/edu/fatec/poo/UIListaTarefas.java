package edu.fatec.poo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static edu.fatec.poo.Format.*;

public class UIListaTarefas extends Application {

    private CListaTarefas control = new CListaTarefas();

    private BorderPane borderPane = new BorderPane();

    private GridPane paneTop = new GridPane();

    private Label lblNova = new Label("Digite uma nova Tarefa...");
    private Label lblDesc = new Label("Descrição (opicional)");

    private TextField txtNome = new TextField();

    private TextArea txaDesc = new TextArea();

    private Button btnAdicionar = new Button("Adicionar");

    private ScrollPane paneCenter = new ScrollPane();
    private VBox paneTarefas = new VBox();

    private HBox paneBottom = new HBox();

    private Label lblTotal = new Label("Total");
    private Label lblPendente = new Label("Pendente");
    private Label lblConcluida = new Label("Concluída");

    @Override
    public void start(Stage stage) throws Exception {
        txtNome.textProperty().bindBidirectional(control.nomeProperty());
        txaDesc.textProperty().bindBidirectional(control.descricaoProperty());

        paneCenter.setContent(paneTarefas);
        paneCenter.setFitToWidth(true);
        paneCenter.setPadding(PADING);

        borderPane.setTop(paneTop);
        borderPane.setCenter(paneCenter);
        borderPane.setBottom(paneBottom);

        paneTop.setPadding(PADING);
        paneTop.setVgap(SPACING);
        paneTop.setHgap(SPACING);
        paneTop.setAlignment(Pos.CENTER);

        paneTop.add(lblNova, 0, 0);
        paneTop.add(txtNome, 1, 0);
        paneTop.add(btnAdicionar, 2, 0);
        paneTop.add(lblDesc, 0, 1);
        paneTop.add(txaDesc, 1, 1);

        txaDesc.setPrefRowCount(3);
        txaDesc.setPrefColumnCount(30);
        txaDesc.setWrapText(true);

        btnAdicionar.addEventHandler(MouseEvent.MOUSE_CLICKED, (event -> {
            control.criarTarefa(paneTarefas);
            stage.show();
        }));

        paneBottom.setSpacing(SPACING);
        paneBottom.setPadding(PADING);
        paneBottom.setAlignment(Pos.CENTER);
        paneBottom.getChildren().addAll(lblTotal, lblPendente, lblConcluida);

        Scene scene = new Scene(borderPane, WIDTH, HEIGHT);
        stage.setScene(scene);
        stage.show();
    }

}
