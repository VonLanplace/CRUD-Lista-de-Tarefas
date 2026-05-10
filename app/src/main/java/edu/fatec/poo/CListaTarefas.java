package edu.fatec.poo;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;


public class CListaTarefas {

    private ObservableList<Tarefa> tarefas = FXCollections.observableArrayList();

    private SimpleStringProperty nome = new SimpleStringProperty();
    private SimpleStringProperty descricao = new SimpleStringProperty();

    public void criarTarefa(Pane paneTarefas) {
        System.out.println("ADICIONAR");
        Tarefa novaTarefa = toEntity();

        if (novaTarefa != null) {
            tarefas.add(novaTarefa);

            UITarefa novaTarefaUI = new UITarefa(novaTarefa);
            paneTarefas.getChildren().add(novaTarefaUI);
            novaTarefaUI.setOnDeleteAction(() -> {
                tarefas.remove(novaTarefa);
                paneTarefas.getChildren().remove(novaTarefaUI);
            });
        }
    }

    public Tarefa toEntity() {
        try {
            Tarefa tarefa = new Tarefa();
            tarefa.setNome(nome.getValue().isEmpty() ? null : nome.getValue());
            tarefa.setDescricao(descricao.getValue().isEmpty() ? null : descricao.getValue());
            return tarefa;
        } catch (Exception e) {
            return null;
        }
    }

    public ObservableList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ObservableList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public String getNome() {
        return nome.get();
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public SimpleStringProperty nomeProperty() {
        return nome;
    }

    public String getDescricao() {
        return descricao.get();
    }

    public void setDescricao(String descricao) {
        this.descricao.set(descricao);
    }

    public SimpleStringProperty descricaoProperty() {
        return descricao;
    }
}
