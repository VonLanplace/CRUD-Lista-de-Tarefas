package edu.fatec.poo;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class UITarefa extends GridPane {
    private Tarefa tarefa;

    private CheckBox checkBox;
    private DatePicker datePicker;
    private Button btnDeletar;
    private Button btnAtualizar;
    private TextField txtTarefa;

    public UITarefa(Tarefa tarefa, double SPACING, Insets PADING) {
        super();
        setPadding(PADING);
        setVgap(SPACING);
        setHgap(SPACING);
        setAlignment(Pos.CENTER);
        this.tarefa = tarefa;

        checkBox = new CheckBox("");
        datePicker = new DatePicker();
        btnAtualizar = new Button("Atualizar");
        btnDeletar = new Button("Deletar");
        txtTarefa = new TextField();

        add(checkBox, 0, 0);
        add(datePicker, 1, 0);
        add(btnDeletar, 2, 0);
        add(txtTarefa, 0, 1, 2, 1);
        add(btnAtualizar, 2, 1);

        scaleShapeProperty().set(true);
    }

}
