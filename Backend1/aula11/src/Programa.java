import org.h2.Driver;

import java.sql.*;

public class Programa {
    //antes do método main,  criar as  instrução (scrips) SQL para executar dentro do bloco try /catch

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; CREATE TABLE animal (id INT PRIMARY KEY, nome VARCHAR(64), tipo VARCHAR(32))";

    private static final String sqlInsert1 = "INSERT INTO animal (id, nome, tipo) VALUES (1, 'Meg', 'Cachorro')";

    private static final String sqlInsert2 = "INSERT INTO animal (id, nome, tipo) VALUES (2, 'Mingau', 'Gato')";

    private static final String sqlInsert3 = "INSERT INTO animal (id, nome, tipo) VALUES (3, 'Dumbo', 'Elefante')";

    private static final String sqlInsert4 = "INSERT INTO animal (id, nome, tipo) VALUES (4, 'Pup', 'Cachorro')";

    private static final String sqlInsert5 = "INSERT INTO animal (id, nome, tipo) VALUES (5, 'Pé de pano', 'Cavalo')";

    private static final String sqlDelete = "DELETE FROM animal WHERE id=2";


    public static void main(String[] args) throws SQLException {
        Connection connection = null;

        try {
            connection = conectarBD();
            System.out.println("conexão efetuada com sucesso..");

            Statement preparacao = conectarBD().createStatement();

            preparacao.execute(sqlCreateTable);

            preparacao.execute(sqlInsert1);
            preparacao.execute(sqlInsert2);
            preparacao.execute(sqlInsert3);
            preparacao.execute(sqlInsert4);
            preparacao.execute(sqlInsert5);
            listarTodos(connection);
            preparacao.execute(sqlDelete);
            listarTodos(connection);
        }

        catch (Exception err){
            err.printStackTrace();

        }
        finally {
            System.out.println("Programa encerradao");
            connection.close();
        }


    }
    // Aqui vamos criar um método de conexão com banco de dados h2( fora do metodo main)

    public static Connection conectarBD() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/aula11-2.2","sa","");

    }
    //user:"sa"  pw:"" , são valores padrão do h2 driver, nao é possivel usar senhas diferentes


    public static void listarTodos(Connection minhaConexao) throws SQLException {
        String sqlQuery = "SELECT * FROM  animal";
        Statement preparaConsulta = minhaConexao.createStatement();

        ResultSet rs = preparaConsulta.executeQuery(sqlQuery);

        while (rs.next()){
            System.out.println(
                    "ID: " + rs.getInt(1) + " - "
                    +"nome: " +rs.getString(2) + " - "
                    + "Tipo: " +rs.getString(3));
        }
    }
}
