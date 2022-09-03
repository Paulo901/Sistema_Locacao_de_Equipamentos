package testeAluguel;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import Interacoes.Intaluguel;
import logico.VariaveisA;

public class CancelaAluguel {

	
    public static void main(String[] args) throws SQLException {
        
VariaveisA v1 = new VariaveisA();
v1.setIdAluguel(Integer.valueOf(2)); //id é o que irei tomar como referencia.
Intaluguel dao = new Intaluguel();
dao.remove(v1);
JOptionPane.showMessageDialog(null,"Item Excluido com Sucesso");

    }
}
