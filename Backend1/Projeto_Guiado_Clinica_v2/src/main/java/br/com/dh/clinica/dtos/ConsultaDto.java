package br.com.dh.clinica.dtos;

import br.com.dh.clinica.entities.Consulta;
import br.com.dh.clinica.entities.Dentista;
import br.com.dh.clinica.entities.Paciente;
import br.com.dh.clinica.entities.Usuario;

import java.io.Serializable;
import java.time.LocalDate;

public class ConsultaDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private LocalDate datacadastro;
    private LocalDate dataatendimento;
    private Paciente paciente;
    private Dentista dentista;
    private Usuario usuario;

    public ConsultaDto() {
    }

    public ConsultaDto(Integer id, LocalDate datacadastro, LocalDate dataatendimento, Paciente paciente, Dentista dentista, Usuario usuario) {
        this.id = id;
        this.datacadastro = datacadastro;
        this.dataatendimento = dataatendimento;
        this.paciente = paciente;
        this.dentista = dentista;
        this.usuario = usuario;
    }

    public ConsultaDto(Consulta consulta) {
        this.id = consulta.getId();
        this.datacadastro = consulta.getDatacadastro();
        this.dataatendimento = consulta.getDatacadastro();
        this.paciente = consulta.getPaciente();
        this.dentista = consulta.getDentista();
        this.usuario = consulta.getUsuario();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(LocalDate datacadastro) {
        this.datacadastro = datacadastro;
    }

    public LocalDate getDataatendimento() {
        return dataatendimento;
    }

    public void setDataatendimento(LocalDate dataatendimento) {
        this.dataatendimento = dataatendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
