package br.com.dh.a22.padraomvc.entities;

public class Trainer{
    private String nome;

    public Trainer(String nome) {
        this.nome = nome;
    }

    public Trainer() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
