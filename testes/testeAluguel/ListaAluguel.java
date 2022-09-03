package testeAluguel;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import Interacoes.Intaluguel;
import logico.VariaveisA;

public class ListaAluguel {

	  
	 public static void main(String[] args) throws SQLException {
	    //1º TIPO DE PESQUISA
		 Intaluguel dao = new Intaluguel();
	List<VariaveisA> minhaLista = dao.getLista();
	for (VariaveisA contato : minhaLista) {
	JOptionPane.showMessageDialog(null, " nome da Empresa: "+ contato.getNomeEmpresaC()+"\n Local: "+contato.getLocalObra()+"\n Valor: " +contato.getValorAluguel()+" CNPJ: "+ contato.getCNPJ());
	} 

}
}