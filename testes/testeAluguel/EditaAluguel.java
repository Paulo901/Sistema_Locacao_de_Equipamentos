package testeAluguel;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import Interacoes.Intaluguel;
import logico.VariaveisA;

public class EditaAluguel {

	public static void main(String[] args) throws SQLException {
	    
		 VariaveisA conexao = new VariaveisA();

		conexao.setIdAluguel(Integer.valueOf(1));
		conexao.setNomeEmpresaC("Francisco"); 
		conexao.setLocalObra ("26262635");  
		conexao.setValorAluguel(123); 
		conexao.setCNPJ ("1234"); 
		conexao.setCEP(637468463); 

		Intaluguel dao = new Intaluguel();
		dao.altera(conexao);
		JOptionPane.showMessageDialog(null,"Item Alterado com Sucesso");   
		    
		       
		}
}
