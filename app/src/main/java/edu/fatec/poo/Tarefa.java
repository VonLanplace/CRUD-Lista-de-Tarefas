package edu.fatec.poo;

public class Tarefa {
    private String nome;
    private String descricao;
    private boolean completa;


    public Tarefa() {
    }

    public Tarefa(String nome, String descricao, boolean completa) {
        this.nome = nome;
        this.descricao = descricao;
        this.completa = completa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }
}
