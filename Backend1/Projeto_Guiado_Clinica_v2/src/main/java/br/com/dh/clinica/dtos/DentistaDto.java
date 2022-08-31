package br.com.dh.clinica.dtos;

//Service seria a cozinha
//DentistaRepository é o chefe de cozinha
//entities são os ingredientes que os chefes usam p. fazer comida (se comunicar com o BD)
//Dto é o garçom que vai levar a comida
// O service é o restaurante
//E nós somos os clientes (controllers)

// repository - chef de cozinha
// entities ingredientes da comida
// dto - garçom
// service - restaurante
// controller - cliente

import br.com.dh.clinica.entities.Dentista;

import java.io.Serializable;

public class DentistaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String email;
    private Integer cro;
    private boolean atendeconvenio;

    public DentistaDto() {
    }

    public DentistaDto(Integer id, String nome, String email, Integer cro, boolean atendeconvenio) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cro = cro;
        this.atendeconvenio = atendeconvenio;
    }

    public DentistaDto(Dentista dentista) {
        this.id = dentista.getId();
        this.nome = dentista.getNome();
        this.email = dentista.getEmail();
        this.cro = dentista.getCro();
        this.atendeconvenio = dentista.isAtendeconvenio();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCro() {
        return cro;
    }

    public void setCro(Integer cro) {
        this.cro = cro;
    }

    public boolean isAtendeconvenio() {
        return atendeconvenio;
    }

    public void setAtendeconvenio(boolean atendeconvenio) {
        this.atendeconvenio = atendeconvenio;
    }
}
