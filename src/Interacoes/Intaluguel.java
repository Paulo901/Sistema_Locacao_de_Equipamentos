package Interacoes;

import conexao.Conector;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import logico.VariaveisA;

public class Intaluguel {

 
private Connection conexao;

//Criar um método construtor para classe ContatoCadastro
public Intaluguel() throws SQLException {

//Adicionar um conexão.
this.conexao = Conector.getConexao();
 }

//Metodos de rotina para o banco de dados.

//1º Adicionar contato.
public void adiciona(VariaveisA v1) throws SQLException{

    String sql = "Insert into aluguel (NomeEmpresaC, LocalObra, ValorAluguel, CNPJ, CEP)" 
            + "values (?, ?, ?, ?, ?)";

//Executar este código dentro do banco de dados.    
    PreparedStatement stmt = conexao.prepareStatement(sql);

//Agora iremos informar os valores em nosso Statement.
stmt.setString (1,v1.getNomeEmpresaC());
stmt.setString (2,v1.getLocalObra());
stmt.setInt (3,v1.getValorAluguel());
stmt.setString (4,v1.getCNPJ());
stmt.setInt (5,v1.getCEP());
stmt.execute (); //Executa o código sql.
stmt.close();
}


/*-------------------------------------------------------------------*/

//2º Método Listar para podermos pesquisar os contatos
public List <VariaveisA> getLista () throws SQLException {
 String sql= "select * from aluguel";
 
 PreparedStatement stmt= this.conexao.prepareStatement (sql);
 ResultSet rs= stmt.executeQuery();
 
 List <VariaveisA> minhaLista= new ArrayList <VariaveisA> ();
 
 while (rs.next()){
     VariaveisA v1= new VariaveisA ();
     
     v1.setNomeEmpresaC(rs.getString ("NomeEmpresaC"));
     v1.setLocalObra (rs.getString ("LocalObra"));
     v1.setValorAluguel (rs.getInt ("ValorAluguel"));
     v1.setCNPJ(rs.getString ("CNPJ"));
     v1.setCEP(rs.getInt ("CEP"));     
     minhaLista.add (v1);
  }
 rs.close();
 stmt.close();
 return minhaLista;
}



//3º Método Altera contatos
public void altera(VariaveisA v1) throws SQLException{
String sql = "update aluguel set NomeEmpresaC = ?, LocalObra = ?, Valor Aluguel = ?, CNPJ = ?, CEP = ?"+" where idAluguel = ?";

PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setString (1,v1.getNomeEmpresaC());
stmt.setString (2,v1.getLocalObra());
stmt.setInt (3,v1.getValorAluguel());
stmt.setString (4,v1.getCNPJ());
stmt.setInt (5,v1.getCEP()); 
stmt.execute (); //Executa o código sql.
stmt.close(); //Fecha banco.

}

   
//4º Método Remove contatos
public void remove(VariaveisA v1) throws SQLException {
String sql = "delete from aluguel where idAluguel=?";
PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setInt(1,v1.getIdAluguel());
stmt.execute();
stmt.close();
}  
 } 
   
