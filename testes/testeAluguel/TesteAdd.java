package testeAluguel;

import Interacoes.Intaluguel;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import logico.VariaveisA;

public class TesteAdd {
    
  public static void main(String[] args) throws SQLException {
    
    //criando objeto do tipo contato.
VariaveisA conexao = new VariaveisA(); 
conexao.setNomeEmpresaC("Construções"); 
conexao.setLocalObra ("26262635");  
conexao.setValorAluguel(123); 
conexao.setCNPJ ("1234"); 
conexao.setCEP(637468463); 

Intaluguel comuni = new Intaluguel(); 
comuni.adiciona(conexao); 
     
JOptionPane.showMessageDialog(null, "Adicionado ao Banco de Dados");

    }
}

