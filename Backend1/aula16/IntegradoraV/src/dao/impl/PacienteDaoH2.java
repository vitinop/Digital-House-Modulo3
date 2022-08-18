package dao.impl;

import dao.IDao;
import dao.config.ConfigJDBC;
import entities.Pacientes;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.Statement;

public class PacienteDaoH2 implements IDao<Pacientes> {
    private ConfigJDBC configJDBC;

    final static Logger logger = Logger.getLogger(PacienteDaoH2.class);

    public PacienteDaoH2(ConfigJDBC configJDBC){
        this.configJDBC = configJDBC;
    }


    @Override
    public Pacientes salvar(Pacientes pacientes) {
        Connection conexao = configJDBC.conectarComBancoDeDados();

        Statement statement = null;

        String queryInsert = String.format("INSERT INTO pacientes (nome, sobrenome, rg, datacadastro, endereco) VALUES ('%s','%s','%s','%s')", pacientes.getNome(), pacientes.getSobrenome(),pacientes.getRg(),pacientes.getDataCadastro(), pacientes.getEndereco());



        return null;
    }
}
