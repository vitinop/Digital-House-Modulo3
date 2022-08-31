package br.com.dh.clinica.dtos;

import br.com.dh.clinica.entities.Endereco;
import br.com.dh.clinica.entities.Paciente;

import java.io.Serializable;
import java.time.LocalDate;

public class PacienteDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;
    private String email;
    private String cpf;
    private LocalDate datacadastro;
    private Endereco endereco;

    public PacienteDto() {
    }

    public PacienteDto(Integer id, String nome, String email, String cpf, LocalDate datacadastro, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.datacadastro = datacadastro;
        this.endereco = endereco;
    }

    // Por que usar get aqui? Perguntar...
    public PacienteDto(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.email = paciente.getEmail();
        this.cpf = paciente.getCpf();
        this.datacadastro = paciente.getDatacadastro();
        this.endereco = paciente.getEndereco();
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
