public class ContaCorrente extends ContaBancaria {
    
    private double taxaJuros;

    public void creditaJuros() {
        
        if (saldo < 400) {
            
            saldo += saldo * 0.05;
        } 
        
        else {
            saldo += saldo * 0.03;
            
        }
    }

    public void debitaTaxa() {
        
        if (saldo < 400) {
            
            saldo -= 5;
        }
        else {
            
            saldo -= 3;
            
        }
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
        
        return "Conta Corrente [Número: " + numConta + ", Saldo: " + saldo + "]";
        
    }
}