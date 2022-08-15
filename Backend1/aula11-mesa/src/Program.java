import org.h2.Driver;
import java.sql.*;

public class Program {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figuras; CREATE TABLE figuras (id INT PRIMARY KEY, formaGeometrica VARCHAR(32), cor VARCHAR(32))";

    private static final String sqlInsert1 = "INSERT INTO figuras (id, formaGeometrica, cor) VALUES (1, 'Circulo', 'Cinza')";
    private static final String sqlInsert2 = "INSERT INTO figuras (id, formaGeometrica, cor) VALUES (2, 'Circulo', 'Vermelho')";
    private static final String sqlInsert3 = "INSERT INTO figuras (id, formaGeometrica, cor) VALUES (3, 'Quadrado', 'Rosa')";
    private static final String sqlInsert4 = "INSERT INTO figuras (id, formaGeometrica, cor) VALUES (4, 'Quadrado', 'Azul')";
    private static final String sqlInsert5 = "INSERT INTO figuras (id, formaGeometrica, cor) VALUES (5, 'Quadrado', 'Roxo')";

    public static void main(String[] args) throws SQLException {
        Connection minhaconexao = null;

        try{
            minhaconexao = conectarBD();
            System.out.println("conexão efetuada com sucesso..");

            Statement criacaoBancoH2 = conectarBD().createStatement();
            criacaoBancoH2.execute(sqlCreateTable);

            criacaoBancoH2.execute(sqlInsert1);
            criacaoBancoH2.execute(sqlInsert2);
            criacaoBancoH2.execute(sqlInsert3);
            criacaoBancoH2.execute(sqlInsert4);
            criacaoBancoH2.execute(sqlInsert5);
            listarTodos(minhaconexao);
            listarCirculosVermelhos(minhaconexao);




        }
        catch (Exception err) {
            err.printStackTrace();
        }
        finally {
            System.out.println("Programa Encerrado");
            minhaconexao.close();
        }
    }

    public static Connection conectarBD() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/aula11-MEST","sa","");

    }

    public static void listarTodos(Connection minhaConexao) throws SQLException {
        String sqlQuery = "SELECT * FROM  FIGURAS";
        Statement preparaConsulta = minhaConexao.createStatement();

        ResultSet rs = preparaConsulta.executeQuery(sqlQuery);

        while (rs.next()){
            System.out.println(
                    "ID: " + rs.getInt(1) + " - "
                            +"Forma Geométrica: " +rs.getString(2) + " - "
                            + "Cor: " +rs.getString(3));
        }
    }

    public static void listarCirculosVermelhos(Connection minhaConexao) throws SQLException {
        String sqlQuery = "SELECT * FROM figuras WHERE COR LIKE 'Vermelho' and FORMAGEOMETRICA LIKE 'Circulo' ";

        Statement preparaConsulta = minhaConexao.createStatement();

        ResultSet rs = preparaConsulta.executeQuery(sqlQuery);

        System.out.println("Lista de circulos Vermelhos: ");
        while (rs.next()){
            System.out.println(

                    "ID: " + rs.getInt(1) + " - "
                            +"Forma Geométrica: " +rs.getString(2) + " - "
                            + "Cor: " +rs.getString(3));
        }
    }
}
