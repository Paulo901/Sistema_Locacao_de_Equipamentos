package testeCliente;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interacoes.Intclient;
import logico.VariaveisC;

public class AdicionaCliente {

	 public static void main(String[] args) throws SQLException {
		    
		    //criando objeto do tipo contato.
		VariaveisC conexao = new VariaveisC(); 
		conexao.setnomeC ("26262635");  
		conexao.setrgC("123"); 
		conexao.setcpfC ("1234"); 
		conexao.setemailC("emat"); 
		conexao.setsenhaC("68463");
		conexao.settelefoneC("637468463");

		Intclient comuni = new Intclient(); 
		comuni.adiciona(conexao); 
		     
		JOptionPane.showMessageDialog(null, "Adicionado ao Banco de Dados");

		    }
		}