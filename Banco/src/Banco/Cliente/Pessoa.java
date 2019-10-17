package Banco.Cliente;

public class Pessoa {
    //-------------------------------Atributos---------------------------------
    private String Nome;
    private String CPF;
    private int Idade;
    private String RG;
   //------------------------------Fim dos Atributos------------------------
        
    //--------------------------Metodos SET------------------------------

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
//----------------------------Fim dos metodos SET---------------------------
    
//----------------------------Metodos GET------------------------------------
    public String getNome() {
        return Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return Idade;
    }

    public String getRG() {
        return RG;
    }
//-------------------------Fim dos metodos GET-------------------------------
   
//--------------------------Construtor Preenchido-----------------------------

    public Pessoa(String Nome, String CPF, int Idade, String RG) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Idade = Idade;
        this.RG = RG;
    }
//-----------------------------------------------------------------------------------

//------------------------Construtor Vazio---------------------------------------
    public Pessoa() {
    }
//-----------------------------------------------------------------------------------
    
    
    
            
        
        
}
