package Banco.Conta;

public abstract class Conta {
    //------------------------Atributos-----------------------------
    private String Numero_Conta;
    private float Saldo;
    //-----------------------Fim dos Atributos--------------------
    
    //-----------------------Metodos SET-------------------------

    public void setNumero_Conta(String Numero_Conta) {
        this.Numero_Conta = Numero_Conta;
    }

    public void setSaldo(float Saldo) {
        this.Saldo = Saldo;
    }
    //-----------------------Fim dos metodos SET---------------
    
    //-------------------Metodos GET------------------------------

    public String getNumero_Conta() {
        return Numero_Conta;
    }

    public float getSaldo() {
        return Saldo;
    }
    //-----------------Fim dos Metodos GET-----------------------
    
    //----------------Construtor-------------------------------------

    public Conta(String Numero_Conta, float Saldo) {
        this.Numero_Conta = Numero_Conta;
        this.Saldo = Saldo;
    }
    //------------------------------------------------------------------
}
