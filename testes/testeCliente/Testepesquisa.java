
package testeCliente;

import Interacoes.Intclient;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import logico.VariaveisC;


public class Testepesquisa {
    
  
   
 public static void main(String[] args) throws SQLException {
    //1º TIPO DE PESQUISA
Intclient dao = new Intclient();
List<VariaveisC> minhaLista = dao.getLista();
for (VariaveisC contato : minhaLista) {
JOptionPane.showMessageDialog(null, " nome: "+ contato.getnomeC()+"\n rg: "+contato.getrgC()+"\n cpf: " +contato.getcpfC()+" email: "+ contato.getemailC()+"\n senha: "+contato.getsenhaC()+"\n telefone: " +contato.gettelefoneC());
} 

 }
}

