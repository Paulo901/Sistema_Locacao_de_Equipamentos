
package testeCliente;

import conexao.Conector;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {


        Connection conexao = Conector.getConexao();
        conexao.close();
        JOptionPane.showMessageDialog(null, "banco desconectado");



    }
    
}
