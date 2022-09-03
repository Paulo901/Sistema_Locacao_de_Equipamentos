package Interacoes;

import conexao.Conector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import logico.VariaveisC;

public class Intclient {

 
//Criar Conexão com Banco de Dados. 
private Connection conexao;

//Criar um método construtor para classe ContatoCadastro
public Intclient() throws SQLException {

//Adicionar um conexão.
this.conexao = Conector.getConexao();
 }

//Metodos de rotina para o banco de dados.

//1º Adicionar contato.
public void adiciona(VariaveisC v1) throws SQLException{

//Prepara a conexão p enviar o código sql para o banco de dados.
    String sql = "Insert into cliente (nomeC, rgC, cpfC, emailC, senhaC, telefoneC)" 
            + "values (?, ?, ?, ?, ?, ?)";

//Executar este código dentro do banco de dados.    
    PreparedStatement stmt = conexao.prepareStatement(sql);

//Agora iremos informar os valores em nosso Statement.
stmt.setString (1,v1.getnomeC());
stmt.setString (2,v1.getrgC());
stmt.setString (3,v1.getcpfC());
stmt.setString (4,v1.getemailC());
stmt.setString (5,v1.getsenhaC());
stmt.setString (6,v1.gettelefoneC());
stmt.execute (); //Executa o código sql.
stmt.close();   //Fecha banco.
           
}


//2º Método Listar para podermos pesquisar os contatos
public List <VariaveisC> getLista (String f1) throws SQLException {

    String sql= "select * from cliente where nomeC like ?";
 
 PreparedStatement stmt= this.conexao.prepareStatement (sql);
 stmt.setString(1, f1);
 ResultSet rs= stmt.executeQuery();
 
 List <VariaveisC> minhaLista= new ArrayList <VariaveisC> ();
 
 while (rs.next()){
     VariaveisC v1= new VariaveisC ();
     
     v1.setnomeC(rs.getString ("nomeC"));
     v1.setrgC (rs.getString ("rgC"));
     v1.setcpfC (rs.getString ("cpfC"));
     v1.setemailC(rs.getString ("emailC"));
     v1.setsenhaC(rs.getString ("senhaC"));
     v1.settelefoneC(rs.getString ("telefoneC"));
     
     minhaLista.add(v1);
  } 
 rs.close();
 stmt.close();
 return minhaLista;
}

/*-------------------------------------------------------------------*/

//2º Método Listar para podermos pesquisar os contatos
public List <VariaveisC> getLista () throws SQLException {
 String sql= "select * from cliente";
 
 PreparedStatement stmt= this.conexao.prepareStatement (sql);
 ResultSet rs= stmt.executeQuery();
 
 List <VariaveisC> minhaLista= new ArrayList <VariaveisC> ();
 
 while (rs.next()){
     VariaveisC v1= new VariaveisC ();
     
     v1.setnomeC(rs.getString ("nomeC"));
     v1.setrgC (rs.getString ("rgC"));
     v1.setcpfC (rs.getString ("cpfC"));
     v1.setemailC(rs.getString ("emailC"));
     v1.setsenhaC(rs.getString ("senhaC"));
     v1.settelefoneC(rs.getString ("telefoneC"));
     
     minhaLista.add (v1);
  }
 rs.close();
 stmt.close();
 return minhaLista;
}



//3º Método Altera contatos
public void altera(VariaveisC v1) throws SQLException{
String sql = "update cliente set nomeC = ?, rgC = ?, cpfC = ?, emailC = ?, senhaC = ?, telefoneC = ?"+" where idCliente = ?";

PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setString (1,v1.getnomeC());
stmt.setString (2,v1.getrgC());
stmt.setString (3,v1.getcpfC());
stmt.setString (4,v1.getemailC());
stmt.setString (5,v1.getsenhaC());
stmt.setString (6,v1.gettelefoneC());
stmt.setInt(7,v1.getidCliente()); 
stmt.execute (); //Executa o código sql.
stmt.close(); //Fecha banco.

}

   
//4º Método Remove contatos
public void remove(VariaveisC v1) throws SQLException {
String sql = "delete from cliente where idCliente=?";
PreparedStatement stmt = conexao.prepareStatement(sql);
stmt.setInt(1,v1.getidCliente());
stmt.execute();
stmt.close();
}  
 } 