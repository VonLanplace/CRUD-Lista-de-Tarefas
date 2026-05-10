package edu.fatec.poo;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class CTarefa {
    SimpleObjectProperty<Tarefa> tarefa = new SimpleObjectProperty<>();

    SimpleBooleanProperty completa = new SimpleBooleanProperty();
    SimpleObjectProperty<LocalDate> dataFim = new SimpleObjectProperty<>();
    SimpleStringProperty nome = new SimpleStringProperty();
    SimpleStringProperty descricao = new SimpleStringProperty();

    public void deletar() {
        try {
            tarefa.getValue().clear();
            System.out.println("DELETADO");
        } catch (Exception e) {
            System.out.println("NAO DELETADO");
            System.err.println(e.getMessage());
        }
    }

    public void atualizar() {
        toEntity();
    }

    public Tarefa toEntity() {
        if (tarefa.getValue() != null) {
            tarefa.getValue().setCompleta(completa.getValue() != null ? completa.getValue() : false);
            tarefa.getValue().setNome(nome.getValue() != null ? nome.getValue() : "");
            tarefa.getValue().setDescricao(descricao.getValue() != null ? descricao.getValue() : "");
            tarefa.getValue().setDataFim(dataFim.getValue() != null ? (completa.getValue() ? dataFim.getValue() : null) : null);
            System.out.println(tarefa.getValue());
        }
        return tarefa.getValue();
    }

    public void fromEntity() {
        Tarefa oldTarefa = tarefa.getValue();
        completa.setValue(oldTarefa.isCompleta());
        nome.setValue(oldTarefa.getNome() == null ? "" : oldTarefa.getNome());
        descricao.setValue(oldTarefa.getDescricao() == null ? "" : oldTarefa.getDescricao());
        dataFim.setValue(oldTarefa.getDataFim() == null ? LocalDate.now() : oldTarefa.getDataFim());
    }

    public Tarefa getTarefa() {
        return tarefa.get();
    }

    public SimpleObjectProperty<Tarefa> tarefaProperty() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa.set(tarefa);
    }

    public boolean isCompleta() {
        return completa.get();
    }

    public SimpleBooleanProperty completaProperty() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa.set(completa);
    }

    public LocalDate getDataFim() {
        return dataFim.get();
    }

    public SimpleObjectProperty<LocalDate> dataFimProperty() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim.set(dataFim);
    }

    public String getNome() {
        return nome.get();
    }

    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public String getDescricao() {
        return descricao.get();
    }

    public SimpleStringProperty descricaoProperty() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao.set(descricao);
    }

}
