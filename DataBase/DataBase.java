package DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // define o driver
            Connection conn = DriverManager.getConnection("","",""); // interface de conexao [url - user - password]

            System.out.println("CONECTADO!");

            Statement stmt = new conn.createStatement();
            stmt.executeUpdate("INSERT INTO <tabela>(<colunas>) VALUES (<valore>)");
            String sqlUpdate = "UPDATE <tabela> SET <colunas> = <valores> WHERE <<condicao>>";
            stmt.executeUpdate(sqlUpdate);

            ResultSet result = stmt.executeQuery("SELECT  * FROM <tabela>");

            conn.close();
        } catch(SQLException e) {
            System.err.println("NÃO FOI CONECTADO!");
            e.printStackTrace();
        } catch(ClassNotFoundException e){
            System.err.println("O DRIVER NÃO FOI ENCONTRADO!");
            e.printStackTrace();
        }
    }
}
