package testeCliente;

import Interacoes.Intclient;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logico.VariaveisC;

public class Testeedita {
  public static void main(String[] args) throws SQLException {
    
 VariaveisC conexao = new VariaveisC();

conexao.setidCliente(Integer.valueOf(1));
conexao.setnomeC("best");
conexao.setrgC("724657");
conexao.setcpfC("837465739");
conexao.setemailC("12345");
conexao.setsenhaC("eaimano");
conexao.settelefoneC("7346573");


Intclient dao = new Intclient();
dao.altera(conexao);
JOptionPane.showMessageDialog(null,"Item Alterado com Sucesso");   
    
       
}
}
