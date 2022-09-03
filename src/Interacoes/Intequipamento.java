
package Interacoes;

import conexao.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logico.VariaveisE;

public class Intequipamento {
    
 
private Connection conexao;

//Criar um método construtor para classe ContatoCadastro
public Intequipamento() throws SQLException {

//Adicionar um conexão.
this.conexao = Conector.getConexao();
 }

//Metodos de rotina para o banco de dados.

//1º Adicionar contato.
public void adiciona(VariaveisE v1) throws SQLException{

    String sql = "Insert into equipamento (equipamentoE, descE, precoE" 
            + "values (?, ?, ?, ?, ?, ?)";

//Executar este código dentro do banco de dados.    
    PreparedStatement stmt = conexao.prepareStatement(sql);

//Agora iremos informar os valores em nosso Statement.
stmt.setString (1,v1.getequipamentoE());
stmt.setString (2,v1.getdescE());
stmt.setInt (3,v1.getprecoE());
stmt.execute (); //Executa o código sql.
stmt.close();
}


/*-------------------------------------------------------------------*/

//2º Método Listar para podermos pesquisar os contatos
public List <VariaveisE> getLista () throws SQLException {
 String sql= "select * from equipamento";
 
 PreparedStatement stmt= this.conexao.prepareStatement (sql);
 ResultSet rs= stmt.executeQuery();
 
 List <VariaveisE> minhaLista= new ArrayList <VariaveisE> ();
 
 while (rs.next()){
     VariaveisE v1= new VariaveisE ();
     
     v1.setequipamentoE(rs.getString ("equipamentoE"));
     v1.setdescE (rs.getString ("descE"));
     v1.setprecoE (rs.getInt ("precoE"));
     v1.setporteE(rs.getString ("porteE"));  

     minhaLista.add (v1);
     
    
     
  }
 rs.close();
 stmt.close();
 return minhaLista;
}



//3º Método Altera contatos
public void altera(VariaveisE v1) throws SQLException{
String sql = "update aluguel set equipamentoE = ?, descE = ?, precoE = ?, tipoE = ?, porteE = ?,quantidadeE = ? "+" where idAluguel = ?";

PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setString (1,v1.getequipamentoE());
stmt.setString (2,v1.getdescE());
stmt.setInt (3,v1.getprecoE());
stmt.setString (5,v1.getporteE()); 
stmt.execute (); //Executa o código sql.
stmt.close(); //Fecha banco.

}

   
//4º Método Remove contatos
public void remove(VariaveisE v1) throws SQLException {
String sql = "delete from aluguel where idEquipamento=?";
PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setInt(1,v1.getidEquipamento());
stmt.execute();
stmt.close();
}  
 } 
    

