
package conexao;

    
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logico.VariaveisA;

public class Conector {

    public static Connection getConexao() throws SQLException{
        
try {
Class.forName("com.mysql.jdbc.Driver");
JOptionPane.showMessageDialog(null, "Conectando ao bancos");
return DriverManager.getConnection("jdbc:mysql://localhost/"
    + "dbalocequip", "root", "admin");
    } catch (ClassNotFoundException e) {
      throw new SQLException(e.getMessage());
        }
    
    }
    
}
