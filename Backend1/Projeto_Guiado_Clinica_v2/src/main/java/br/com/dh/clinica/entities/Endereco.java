package br.com.dh.clinica.entities;

import java.io.Serializable;

public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public Endereco() {
    }

    public Endereco(Integer id, String rua, String numero, String bairro, String cidade, String estado) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
