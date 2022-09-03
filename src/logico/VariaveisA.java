package logico;

public class VariaveisA {

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

//    public int getCadastroC_idCliente() {
//        return CadastroC_idCliente;
//    }
//
//    public void setCadastroC_idCliente(int CadastroC_idCliente) {
//        this.CadastroC_idCliente = CadastroC_idCliente;
//    }
//
//    public int getEquipamento_idEquipamento() {
//        return Equipamento_idEquipamento;
//    }
//
//    public void setEquipamento_idEquipamento(int Equipamento_idEquipamento) {
//        this.Equipamento_idEquipamento = Equipamento_idEquipamento;
//    }

    public String getLocalObra() {
        return LocalObra;
    }

    public void setLocalObra(String LocalObra) {
        this.LocalObra = LocalObra;
    }

    public String getNomeEmpresaC() {
        return NomeEmpresaC;
    }

    public void setNomeEmpresaC(String NomeEmpresaC) {
        this.NomeEmpresaC = NomeEmpresaC;
    }

    public int getValorAluguel() {
        return ValorAluguel;
    }

    public void setValorAluguel(int ValorAluguel) {
        this.ValorAluguel = ValorAluguel;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }


     private int idAluguel;
     private String NomeEmpresaC;
//     private int CadastroC_idCliente;
//     private int Equipamento_idEquipamento;
     private String LocalObra;
     private int ValorAluguel;
     private String CNPJ;
     private int CEP;
}