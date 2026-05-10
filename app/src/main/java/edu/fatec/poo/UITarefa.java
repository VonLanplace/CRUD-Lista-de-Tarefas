package edu.fatec.poo;

import javafx.beans.binding.Bindings;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

import static edu.fatec.poo.Format.PADING;
import static edu.fatec.poo.Format.SPACING;


public class UITarefa extends GridPane {
    private Runnable onDeleteAction;
    private Tarefa tarefa;
    private CTarefa controll;

    private CheckBox checkBox;
    private DatePicker datePicker;
    private Button btnDeletar;
    private Button btnAtualizar;
    private TextArea txaDesc;

    public UITarefa(Tarefa tarefa) {
        super();
        setPadding(PADING);
        setVgap(SPACING);
        setHgap(SPACING);
        setAlignment(Pos.CENTER);
        scaleShapeProperty().set(true);

        this.tarefa = tarefa;
        checkBox = new CheckBox();
        datePicker = new DatePicker();
        btnAtualizar = new Button("Atualizar");
        btnDeletar = new Button("Deletar");
        txaDesc = new TextArea();

        this.controll = new CTarefa();
        controll.setTarefa(tarefa);
        Bindings.bindBidirectional(checkBox.selectedProperty(), controll.completaProperty());
        Bindings.bindBidirectional(datePicker.valueProperty(), controll.dataFimProperty());
        Bindings.bindBidirectional(txaDesc.textProperty(), controll.descricaoProperty());
        Bindings.bindBidirectional(checkBox.textProperty(), controll.nomeProperty());

        datePicker.setPrefWidth(110);
        datePicker.visibleProperty().bindBidirectional(checkBox.selectedProperty());

        btnAtualizar.setOnAction(event -> {
            controll.atualizar();
        });

        btnDeletar.setOnAction(event -> {
            controll.deletar();
            if (onDeleteAction != null) {
                onDeleteAction.run();
            }
        });

        txaDesc.setPrefRowCount(2);
        txaDesc.setPrefColumnCount(30);
        txaDesc.setWrapText(true);

        add(checkBox, 0, 0);
        GridPane.setHalignment(checkBox, HPos.LEFT);
        add(datePicker, 1, 0);
        GridPane.setHalignment(datePicker, HPos.RIGHT);

        add(btnDeletar, 2, 0);
        GridPane.setHalignment(btnDeletar, HPos.CENTER);
        add(txaDesc, 0, 1, 2, 1);
        GridPane.setHalignment(txaDesc, HPos.LEFT);
        add(btnAtualizar, 2, 1);
        GridPane.setHalignment(btnAtualizar, HPos.CENTER);
        controll.fromEntity();
    }

    public Runnable getOnDeleteAction() {
        return onDeleteAction;
    }

    public void setOnDeleteAction(Runnable onDeleteAction) {
        this.onDeleteAction = onDeleteAction;
    }

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public CTarefa getControll() {
        return controll;
    }

    public void setControll(CTarefa controll) {
        this.controll = controll;
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public Button getBtnDeletar() {
        return btnDeletar;
    }

    public void setBtnDeletar(Button btnDeletar) {
        this.btnDeletar = btnDeletar;
    }

    public Button getBtnAtualizar() {
        return btnAtualizar;
    }

    public void setBtnAtualizar(Button btnAtualizar) {
        this.btnAtualizar = btnAtualizar;
    }

    public TextArea getTxaDesc() {
        return txaDesc;
    }

    public void setTxaDesc(TextArea txaDesc) {
        this.txaDesc = txaDesc;
    }
}
