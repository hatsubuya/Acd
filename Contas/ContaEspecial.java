public class ContaEspecial extends ContaBancaria {
    
    private double taxaJuros;

    public void creditaJuros() {
        
        saldo += saldo * 0.07;
        
    }

    public void debitaTaxa() {
        
        saldo -= 2;
        
    }

    public double valorEmprestimo() {
        
        return saldo * 2;
    }

    public void setNumConta(int numConta) {
        
        this.numConta = numConta;
        
    }

    public void deposita(double valor) {
        
        saldo += valor;
    }

    public double retornaSaldo() {
        
        return saldo;
    }

    public int retornaNumConta() {
        
        return numConta;
    }

    public String toString() {
        
        return "Conta Especial [Número: " + numConta + ", Saldo: " + saldo + "]";
    }
}