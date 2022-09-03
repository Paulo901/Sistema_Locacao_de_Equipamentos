package testeCliente;

import Interacoes.Intclient;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logico.VariaveisC;

public class Testeremover {
    
     public static void main(String[] args) throws SQLException {
    
VariaveisC v1 = new VariaveisC();
v1.setidCliente(Integer.valueOf(2)); //id é o que irei tomar como referencia.
Intclient dao = new Intclient();
dao.remove(v1);
JOptionPane.showMessageDialog(null,"Item Excluido com Sucesso");
    
     }
}
